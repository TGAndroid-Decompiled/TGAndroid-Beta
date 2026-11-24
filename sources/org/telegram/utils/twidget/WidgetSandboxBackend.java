package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
public final class WidgetSandboxBackend implements dwc, hvc {
    private static final int MAX_CANVAS_WORDS = 2097152;
    private static final int MAX_COMPOSITION_LAYERS = 256;
    private static final int MAX_DISPLAY_OPS = 200000;
    private static final int MAX_FONTS = 4096;
    private static final int MAX_FRAMES_PER_SECOND = 240;
    static final long MAX_IMAGE_BYTES = 33554432;
    static final long MAX_IMAGE_PIXELS = 4194304;
    static final int MAX_JSON_DEPTH = 32;
    private static final int MAX_LAYERS = 256;
    private static final int MAX_LAYER_KEYS = 1024;
    private static final long MAX_LAYER_PIXELS = 33554432;
    private static final long MAX_LIST_BYTES = 8388608;
    private static final long MAX_PENDING_LAYER_BYTES = 16777216;
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private long layerParseNanos;
    private int nextFont;
    private int nextRecord;
    private final z owner;
    private long pendingLayerBytes;
    private rwc text;
    private final Object recordLock = new Object();
    private final long[] recordTimes = new long[240];
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, ivc> canvases = new ConcurrentHashMap<>();
    private final Object canvasLock = new Object();
    private final HashMap<Integer, jvc> pendingLayers = new HashMap<>();
    private HashMap<Long, zvc> layerContents = new HashMap<>();
    private final y painter = new y();

    public WidgetSandboxBackend(z zVar) {
        this.owner = zVar;
    }

    private static void assertWorker() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        sc8.j("Native layout and recording must run off UI");
    }

    public static void checkJsonDepth(String str) {
        int length = str.length();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (z) {
                if (charAt == '\\') {
                    i++;
                } else if (charAt == '\"') {
                    z = false;
                }
            } else if (charAt == '\"') {
                z = true;
            } else if (charAt != '[' && charAt != '{') {
                if (charAt != ']' && charAt != '}') {
                    if (charAt == '\'' || charAt == '/' || charAt == '#') {
                        w26.j("Not JSON");
                        return;
                    }
                } else if (i2 > 0) {
                    i2--;
                }
            } else {
                i2++;
                if (i2 > 32) {
                    w26.j("JSON nests too deep");
                    return;
                }
            }
            i++;
        }
    }

    private void clearPendingLayers() {
        this.pendingLayers.clear();
        this.pendingLayerBytes = 0L;
        this.layerParseNanos = 0L;
    }

    public static android.graphics.Bitmap decodeImage(java.lang.String r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.decodeImage(java.lang.String, long):android.graphics.Bitmap");
    }

    public static String featureSettings(String str) {
        String[] split;
        if (str.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (str2.indexOf(61) == 4) {
                String substring = str2.substring(0, 4);
                String substring2 = str2.substring(5);
                if (substring.matches("[\\x20-\\x7e]{4}") && substring.indexOf(34) < 0 && substring2.matches("\\d{1,5}")) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append('\"');
                    sb.append(substring);
                    sb.append("\" ");
                    sb.append(substring2);
                }
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    private long imageBytes() {
        long j;
        synchronized (this.images) {
            j = this.imageBytes;
        }
        return j;
    }

    private static boolean jsonSignal(int i) {
        if (i != 3 && i != 4 && i != 5 && i != 8 && i != 12 && i != 18 && i != 19) {
            return false;
        }
        return true;
    }

    private defpackage.lwc[] layers(org.json.JSONObject r42, float r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.layers(org.json.JSONObject, float):lwc[]");
    }

    public static float[] metrics(int i, Paint paint, float f, Rect rect) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.getTextBounds("x", 0, 1, rect);
        float f2 = fontMetrics.ascent;
        float f3 = fontMetrics.descent;
        return new float[]{i, (-f2) / f, f3 / f, ((f3 - f2) + fontMetrics.leading) / f, rect.height() / f, paint.measureText("0") / f};
    }

    public static Paint[] paints(String str, float f, int i, boolean z, String str2, float f2) {
        f = (f <= 0.0f || f > 10000.0f) ? 16.0f : 16.0f;
        Paint paint = new Paint(129);
        paint.setTextSize(f);
        paint.setTypeface(typeface(str, i, z));
        String featureSettings = featureSettings(str2);
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f * f2);
        return new Paint[]{paint, paint2};
    }

    private void putImage(int i, Bitmap bitmap) {
        synchronized (this.images) {
            Bitmap put = this.images.put(Integer.valueOf(i), bitmap);
            long allocationByteCount = this.imageBytes + bitmap.getAllocationByteCount();
            this.imageBytes = allocationByteCount;
            if (put != null) {
                this.imageBytes = allocationByteCount - put.getAllocationByteCount();
            }
        }
    }

    private void recordLocked(byte[] bArr, byte[] bArr2, double d, int i, int i2, float f, float f2, int i3, int i4) {
        int i5;
        int i6;
        ovc nvcVar;
        ?? r1 = bArr;
        if (r1.length <= 8388608) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long[] jArr = this.recordTimes;
            int i7 = this.nextRecord;
            if (elapsedRealtime - jArr[i7] < 1000) {
                clearPendingLayers();
                return;
            }
            jArr[i7] = elapsedRealtime;
            this.nextRecord = (i7 + 1) % jArr.length;
            this.owner.getClass();
            this.owner.getClass();
            Trace.beginSection("WidgetSandbox:Record");
            long nanoTime = System.nanoTime();
            double d2 = d - (nanoTime / 1.0E9d);
            if (Build.VERSION.SDK_INT >= 29) {
                nvcVar = new mvc(0, 0, i, i2, "widget-sandbox-content");
                i5 = i;
                i6 = i2;
            } else {
                i5 = i;
                i6 = i2;
                nvcVar = new nvc(0, 0, i5, i6);
            }
            ovc ovcVar = nvcVar;
            try {
                try {
                    try {
                        jvc b = jvc.b(r1);
                        String text = text(bArr2);
                        checkJsonDepth(text);
                        JSONObject jSONObject = new JSONObject(text);
                        System.nanoTime();
                        this.painter.b(i5, i6);
                        Canvas a = ovcVar.a();
                        try {
                            a.scale(f, f);
                            this.painter.f(a, b, this, f, 0.0f, 0.0f, i5 / f, i6 / f);
                            ovcVar.d();
                            lwc[] layers = layers(jSONObject, f);
                            z zVar = this.owner;
                            System.nanoTime();
                            zVar.getClass();
                            zVar.S = null;
                            this.owner.c(ovcVar, layers, d2, i, i6, f2, ((float) (System.nanoTime() - nanoTime)) / 1000000.0f, i3, i4, b.b, this.text);
                            return;
                        } catch (Throwable th) {
                            ovcVar.d();
                            throw th;
                        }
                    } finally {
                        clearPendingLayers();
                        Trace.endSection();
                    }
                } catch (Exception e) {
                    e = e;
                    r1 = ovcVar;
                    r1.b();
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
                r1.b();
                throw e;
            }
        }
        clearPendingLayers();
        w26.j("Display list");
    }

    private ivc reserveCanvas(int i, int i2, int i3) {
        ivc ivcVar;
        long j = i2 * i3;
        if (j <= 4194304) {
            synchronized (this.canvasLock) {
                long j2 = j << 3;
                long imageBytes = imageBytes() + j2;
                for (Map.Entry<Integer, ivc> entry : this.canvases.entrySet()) {
                    if (entry.getKey().intValue() != i) {
                        imageBytes += entry.getValue().W;
                    }
                }
                if (imageBytes <= 33554432) {
                    ivcVar = this.canvases.get(Integer.valueOf(i));
                    if (ivcVar == null) {
                        ivcVar = new ivc(i);
                        this.canvases.put(Integer.valueOf(i), ivcVar);
                    }
                    ivcVar.W = j2;
                } else {
                    throw new IllegalArgumentException("Canvas memory budget");
                }
            }
            return ivcVar;
        }
        w26.j("Canvas dimensions");
        return null;
    }

    public static String text(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static android.graphics.Typeface typeface(java.lang.String r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.typeface(java.lang.String, int, boolean):android.graphics.Typeface");
    }

    @Override
    public Bitmap canvas(int i) {
        ivc ivcVar = this.canvases.get(Integer.valueOf(i));
        if (ivcVar == null) {
            return null;
        }
        return ivcVar.j();
    }

    @Override
    public Bitmap canvasBitmap(int i) {
        ivc ivcVar = this.canvases.get(Integer.valueOf(i));
        if (ivcVar == null) {
            return null;
        }
        return ivcVar.j();
    }

    public byte[] canvasRead(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        assertWorker();
        if (i4 > 0 && i5 > 0 && i4 * i5 <= 4194304) {
            ivc ivcVar = this.canvases.get(Integer.valueOf(i));
            if (ivcVar == null) {
                return new byte[(i4 * i5) << 2];
            }
            synchronized (ivcVar) {
                byte[] bArr = new byte[(Math.max(i4, 0) * Math.max(i5, 0)) << 2];
                if (ivcVar.o == null) {
                    return bArr;
                }
                int max = Math.max(0, i6);
                int max2 = Math.max(0, i3);
                int min = Math.min(ivcVar.o.getWidth(), i6 + i4);
                int min2 = Math.min(ivcVar.o.getHeight(), i5 + i3);
                if (min > max && min2 > max2) {
                    int i7 = min - max;
                    int i8 = min2 - max2;
                    int[] iArr = new int[i7 * i8];
                    ivcVar.o.getPixels(iArr, 0, i7, max, max2, i7, i8);
                    int i9 = max2;
                    while (i9 < min2) {
                        int i10 = max;
                        while (i10 < min) {
                            int i11 = iArr[(i10 - max) + ((i9 - max2) * i7)];
                            int i12 = ((i10 - i6) + ((i9 - i3) * i4)) << 2;
                            bArr[i12] = (byte) Color.red(i11);
                            bArr[i12 + 1] = (byte) Color.green(i11);
                            bArr[i12 + 2] = (byte) Color.blue(i11);
                            bArr[i12 + 3] = (byte) Color.alpha(i11);
                            i10++;
                            i6 = i2;
                        }
                        i9++;
                        i6 = i2;
                    }
                    return bArr;
                }
                return bArr;
            }
        }
        return null;
    }

    public void canvasRelease(int i) {
        ivc remove;
        assertWorker();
        synchronized (this.canvasLock) {
            remove = this.canvases.remove(Integer.valueOf(i));
        }
        if (remove != null) {
            remove.i();
        }
    }

    public void canvasRun(int i, int i2, int i3, int[] iArr) {
        assertWorker();
        if (i2 > 0 && i3 > 0) {
            if (iArr.length <= 2097152) {
                ivc reserveCanvas = reserveCanvas(i, i2, i3);
                synchronized (reserveCanvas) {
                    Bitmap bitmap = reserveCanvas.o;
                    if (bitmap == null || bitmap.getWidth() != i2 || reserveCanvas.o.getHeight() != i3) {
                        Bitmap bitmap2 = reserveCanvas.o;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        reserveCanvas.o = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                        reserveCanvas.q = new Canvas(reserveCanvas.o);
                    }
                    reserveCanvas.t = iArr;
                    reserveCanvas.u = 0;
                    reserveCanvas.X = 0L;
                    int saveCount = reserveCanvas.q.getSaveCount();
                    while (reserveCanvas.u < iArr.length) {
                        try {
                            reserveCanvas.h(this);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw new IllegalArgumentException("Canvas batch: truncated");
                        }
                    }
                    reserveCanvas.q.restoreToCount(saveCount);
                    reserveCanvas.t = null;
                    reserveCanvas.r++;
                }
                if (this.canvases.get(Integer.valueOf(i)) != reserveCanvas) {
                    reserveCanvas.i();
                    return;
                }
                return;
            }
            w26.j("Canvas batch");
            return;
        }
        canvasRelease(i);
    }

    public float[] createFont(byte[] bArr, float f, int i, boolean z, byte[] bArr2) {
        assertWorker();
        int i2 = this.nextFont + 1;
        this.nextFont = i2;
        return defineFont(i2, bArr, f, i, z, bArr2);
    }

    public float[] defineFont(int i, byte[] bArr, float f, int i2, boolean z, byte[] bArr2) {
        if (this.fonts.size() >= 4096 && !this.fonts.containsKey(Integer.valueOf(i))) {
            w26.j("Too many fonts");
            return null;
        }
        Paint[] paints = paints(text(bArr), f, i2, z, text(bArr2), this.owner.l);
        this.fonts.put(Integer.valueOf(i), paints[0]);
        this.deviceFonts.put(Integer.valueOf(i), paints[1]);
        return metrics(i, paints[1], this.owner.l, new Rect());
    }

    public void defineImage(int i, int i2, int i3, byte[] bArr) {
        Bitmap put;
        if (bArr != null && i2 > 0 && i3 > 0) {
            long j = i2 * i3;
            if (j <= 4194304 && bArr.length == (j << 2)) {
                synchronized (this.images) {
                    long j2 = this.imageBytes;
                    if (bArr.length + j2 > 33554432) {
                        return;
                    }
                    this.imageBytes = j2 + bArr.length;
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                        synchronized (this.images) {
                            if (this.images.put(Integer.valueOf(i), createBitmap) != null) {
                                this.imageBytes -= put.getAllocationByteCount();
                            }
                        }
                    } catch (Throwable th) {
                        synchronized (this.images) {
                            this.imageBytes -= bArr.length;
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public void deleteFont(int i) {
        this.fonts.remove(Integer.valueOf(i));
        this.deviceFonts.remove(Integer.valueOf(i));
    }

    @Override
    public Paint deviceFont(int i) {
        return this.deviceFonts.get(Integer.valueOf(i));
    }

    @Override
    public Paint font(int i) {
        return this.fonts.get(Integer.valueOf(i));
    }

    public byte[] formatIntl(byte[] bArr) {
        return i00.d(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public Bitmap image(int i) {
        return this.images.get(Integer.valueOf(i));
    }

    public float[] loadImage(int i, byte[] bArr) {
        Bitmap decodeImage = decodeImage(text(bArr), imageBytes());
        if (decodeImage == null) {
            return null;
        }
        putImage(i, decodeImage);
        return new float[]{decodeImage.getWidth(), decodeImage.getHeight()};
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i, int i2, float f, float f2, int i3, int i4) {
        assertWorker();
        synchronized (this.recordLock) {
            recordLocked(bArr, bArr2, d, i, i2, f, f2, i3, i4);
        }
    }

    public void recordLayer(int i, int i2, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        if (i >= 0 && i < 256 && bArr.length <= 8388608) {
            jvc b = jvc.b(bArr);
            synchronized (this.recordLock) {
                long j = this.pendingLayerBytes;
                if (bArr.length + j <= 16777216) {
                    this.pendingLayerBytes = j + bArr.length;
                    this.pendingLayers.put(Integer.valueOf(i), b);
                    this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
                } else {
                    clearPendingLayers();
                    throw new IllegalArgumentException("Layers");
                }
            }
            return;
        }
        w26.j("Layer");
    }

    public void selectableText(byte[] bArr) {
        rwc rwcVar;
        assertWorker();
        String text = text(bArr);
        checkJsonDepth(text);
        try {
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            rwcVar = rwc.a(text, new dkc(concurrentHashMap, (byte) 9), this.owner.l);
        } catch (Exception unused) {
            rwcVar = null;
        }
        synchronized (this.recordLock) {
            this.text = rwcVar;
        }
    }

    public z session() {
        return this.owner;
    }

    public void signal(int i, byte[] bArr) {
        JSONObject jSONObject;
        String string;
        boolean optBoolean;
        long j;
        boolean d;
        byte b;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean isEmpty;
        String text = text(bArr);
        if (jsonSignal(i)) {
            checkJsonDepth(text);
        }
        z zVar = this.owner;
        zVar.getClass();
        try {
            if (i == 8) {
                if (text != null && text.length() <= 98368) {
                    JSONObject jSONObject2 = new JSONObject(text);
                    String optString = jSONObject2.optString("area");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("values");
                    if ("local".equals(optString) || "session".equals(optString)) {
                        synchronized (zVar.w) {
                            isEmpty = zVar.w.isEmpty();
                            HashMap hashMap = zVar.w;
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            hashMap.put(optString, optJSONObject);
                        }
                        if (isEmpty) {
                            zVar.a.post(new iwc(zVar, (byte) 6));
                        }
                    }
                }
            } else if (i != 10 && !zVar.A) {
                if (i != 12 && i != 19) {
                    if (i != 13) {
                        if (i == 14) {
                            b = 6;
                        } else if (i == 11) {
                            zVar.a.post(new isc(zVar, text, (byte) 15));
                            return;
                        } else if (i == 18) {
                            JSONObject jSONObject3 = new JSONObject(text);
                            zVar.S = new float[]{(float) jSONObject3.optDouble("receive"), (float) jSONObject3.optDouble("animate"), (float) jSONObject3.optDouble("paint"), (float) jSONObject3.optDouble("serialize"), 0.0f, 0.0f, (float) jSONObject3.optDouble("ticks"), (float) jSONObject3.optDouble("framesSent"), (float) jSONObject3.optDouble("opsLatency"), (float) jSONObject3.optDouble("validate", -1.0d), (float) jSONObject3.optDouble("hop", -1.0d)};
                            return;
                        } else if (i != 16 && i != 17 && i != 9) {
                            if (i == 3) {
                                JSONObject jSONObject4 = new JSONObject(text);
                                zVar.a.post(new sd4(zVar, jSONObject4.optBoolean("x"), jSONObject4.optBoolean("y"), jSONObject4.optBoolean("hold"), (byte) 1));
                                return;
                            } else if (i == 4) {
                                JSONObject jSONObject5 = new JSONObject(text);
                                if (jSONObject5.optBoolean("loaded")) {
                                    zVar.B = true;
                                }
                                if (!zVar.e0 && jSONObject5.has("engine")) {
                                    zVar.e0 = true;
                                    if (w01.a) {
                                        fa4.b("widget engine: " + jSONObject5.optString("engine") + ", " + jSONObject5.optString("boot"));
                                    }
                                }
                                zVar.G = "bottom".equals(jSONObject5.optString("resizeAnchor"));
                                if (jSONObject5.optBoolean("rendered") && !zVar.E) {
                                    double optDouble = jSONObject5.optDouble("height", -1.0d);
                                    double min = Math.min(600.0f, Math.max(50.0f, zVar.t / zVar.l));
                                    if (zVar.u && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                                        zVar.F = true;
                                        if (zVar.D == 0) {
                                            zVar.D = SystemClock.uptimeMillis();
                                        }
                                    }
                                    zVar.E = true;
                                }
                                synchronized (zVar.s) {
                                    if (zVar.A) {
                                        return;
                                    }
                                    zVar.P = jSONObject5;
                                    if (!zVar.Q) {
                                        zVar.Q = true;
                                        zVar.a.post(zVar.V);
                                    }
                                    return;
                                }
                            } else if (i == 5) {
                                JSONObject jSONObject6 = new JSONObject(text);
                                String optString2 = jSONObject6.optString("kind");
                                if (!"openLink".equals(optString2) && !"openTelegramLink".equals(optString2)) {
                                    if ("haptic".equals(optString2)) {
                                        z3 = zVar.d.a(zVar.L);
                                    } else {
                                        z3 = "ready".equals(optString2);
                                    }
                                } else {
                                    String optString3 = jSONObject6.optString("url");
                                    boolean equals = "openTelegramLink".equals(optString2);
                                    if (optString3 != null && optString3.length() <= 256 && optString3.length() >= 9 && optString3.regionMatches(true, 0, "https://", 0, 8)) {
                                        int i2 = 8;
                                        while (i2 < optString3.length() && "/?#".indexOf(optString3.charAt(i2)) < 0) {
                                            i2++;
                                        }
                                        String substring = optString3.substring(8, i2);
                                        if (substring.indexOf(64) < 0) {
                                            int indexOf = substring.indexOf(58);
                                            if (indexOf >= 0) {
                                                substring = substring.substring(0, indexOf);
                                            }
                                            if (!substring.isEmpty() && substring.length() <= 253) {
                                                String[] split = substring.split("\\.", -1);
                                                int length = split.length;
                                                int i3 = 0;
                                                loop1: while (true) {
                                                    if (i3 < length) {
                                                        String str = split[i3];
                                                        if (str.isEmpty() || str.length() > 63) {
                                                            break;
                                                        }
                                                        z = false;
                                                        if (str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-') {
                                                            break;
                                                        }
                                                        for (int i4 = 0; i4 < str.length(); i4++) {
                                                            char charAt = str.charAt(i4);
                                                            if ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '-')) {
                                                                break loop1;
                                                            }
                                                        }
                                                        i3++;
                                                    } else {
                                                        z = false;
                                                        String[] strArr = pvc.m;
                                                        boolean z5 = false;
                                                        for (int i5 = 0; i5 < 3; i5++) {
                                                            String str2 = strArr[i5];
                                                            if (!substring.equals(str2)) {
                                                                if (!substring.endsWith("." + str2)) {
                                                                    z4 = false;
                                                                    z5 |= z4;
                                                                }
                                                            }
                                                            z4 = true;
                                                            z5 |= z4;
                                                        }
                                                        if (z5 == equals && zVar.d.c(zVar.L)) {
                                                            z2 = true;
                                                        }
                                                    }
                                                }
                                                z2 = z;
                                                z3 = z2;
                                            }
                                            z = false;
                                            z2 = z;
                                            z3 = z2;
                                        }
                                    }
                                    z = false;
                                    z2 = z;
                                    z3 = z2;
                                }
                                if (z3) {
                                    zVar.a.post(new isc(zVar, jSONObject6, (byte) 16));
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        b = 6;
                        if (text == null || text.length() > 256 || !zVar.d.c(zVar.L)) {
                            return;
                        }
                    }
                    zVar.a.post(new clc(zVar, i, text, b));
                    return;
                }
                JSONObject jSONObject7 = new JSONObject(text);
                long j2 = jSONObject7.getLong("id");
                if (i == 19) {
                    string = null;
                    jSONObject = jSONObject7.getJSONObject("call");
                    j = j2;
                    optBoolean = false;
                } else {
                    jSONObject = null;
                    string = jSONObject7.getString("data");
                    optBoolean = jSONObject7.optBoolean("wallet");
                    j = j2;
                }
                pvc pvcVar = zVar.d;
                if (i == 19) {
                    d = pvcVar.e(jSONObject.toString(), zVar.L);
                } else {
                    d = pvcVar.d(string, optBoolean, zVar.L);
                }
                if (!d) {
                    long j3 = zVar.v;
                    if (j3 != 0) {
                        zVar.c.a(j3, j, 3, null);
                        return;
                    }
                    return;
                }
                zVar.a.post(new gj2(zVar, i, j, jSONObject, string, optBoolean));
            }
        } catch (Exception unused) {
        }
    }

    public void state(int i, float f) {
        boolean z;
        z zVar = this.owner;
        if (!zVar.A) {
            if ((i & 8) != 0 && f == f) {
                AtomicBoolean atomicBoolean = zVar.q;
                if (f == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                atomicBoolean.set(z);
                zVar.x = f;
                if (zVar.y.compareAndSet(false, true)) {
                    zVar.a.post(new iwc(zVar, (byte) 5));
                }
            }
            if ((i & 4) != 0) {
                zVar.o.set(false);
            }
            if ((i & 2) != 0) {
                zVar.n.set(true);
            }
            if ((i & 6) != 0) {
                zVar.a.removeCallbacks(zVar.W);
                zVar.a.post(zVar.W);
            }
            if ((i & 1) != 0) {
                zVar.p.set(true);
                zVar.a.post(zVar.d0);
            }
        }
    }

    public float textWidth(int i, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.l;
    }
}
