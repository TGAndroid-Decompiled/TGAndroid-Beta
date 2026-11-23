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
import android.text.TextUtils;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.zy;
import org.telegram.ui.LaunchActivity;
public final class WidgetSandboxBackend implements g1, h {
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
    private final p1 owner;
    private long pendingLayerBytes;
    private v1 text;
    private final Object recordLock = new Object();
    private final long[] recordTimes = new long[240];
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, i> canvases = new ConcurrentHashMap<>();
    private final Object canvasLock = new Object();
    private final HashMap<Integer, j> pendingLayers = new HashMap<>();
    private HashMap<Long, a1> layerContents = new HashMap<>();
    private final h1 painter = new h1();

    public WidgetSandboxBackend(p1 p1Var) {
        this.owner = p1Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Native layout and recording must run off UI");
    }

    public static void checkJsonDepth(String str) {
        int length = str.length();
        int i7 = 0;
        boolean z10 = false;
        int i10 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (z10) {
                if (charAt == '\\') {
                    i7++;
                } else if (charAt == '\"') {
                    z10 = false;
                }
            } else if (charAt == '\"') {
                z10 = true;
            } else if (charAt != '[' && charAt != '{') {
                if (charAt != ']' && charAt != '}') {
                    if (charAt == '\'' || charAt == '/' || charAt == '#') {
                        throw new IllegalArgumentException("Not JSON");
                    }
                } else if (i10 > 0) {
                    i10--;
                }
            } else {
                i10++;
                if (i10 > 32) {
                    throw new IllegalArgumentException("JSON nests too deep");
                }
            }
            i7++;
        }
    }

    private void clearPendingLayers() {
        this.pendingLayers.clear();
        this.pendingLayerBytes = 0L;
        this.layerParseNanos = 0L;
    }

    public static android.graphics.Bitmap decodeImage(java.lang.String r40, long r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.decodeImage(java.lang.String, long):android.graphics.Bitmap");
    }

    public static String featureSettings(String str) {
        String[] split;
        if (str.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (str2.indexOf(61) == 4) {
                String substring = str2.substring(0, 4);
                String substring2 = str2.substring(5);
                if (substring.matches("[\\x20-\\x7e]{4}") && substring.indexOf(34) < 0 && substring2.matches("\\d{1,5}")) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append('\"');
                    sb2.append(substring);
                    sb2.append("\" ");
                    sb2.append(substring2);
                }
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    private long imageBytes() {
        long j3;
        synchronized (this.images) {
            j3 = this.imageBytes;
        }
        return j3;
    }

    private static boolean jsonSignal(int i7) {
        if (i7 != 3 && i7 != 4 && i7 != 5 && i7 != 8 && i7 != 12 && i7 != 18 && i7 != 19) {
            return false;
        }
        return true;
    }

    private org.telegram.utils.twidget.o1[] layers(org.json.JSONObject r41, float r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.layers(org.json.JSONObject, float):org.telegram.utils.twidget.o1[]");
    }

    public static float[] metrics(int i7, Paint paint, float f10, Rect rect) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.getTextBounds("x", 0, 1, rect);
        float f11 = fontMetrics.ascent;
        float f12 = fontMetrics.descent;
        return new float[]{i7, (-f11) / f10, f12 / f10, ((f12 - f11) + fontMetrics.leading) / f10, rect.height() / f10, paint.measureText("0") / f10};
    }

    public static Paint[] paints(String str, float f10, int i7, boolean z10, String str2, float f11) {
        f10 = (f10 <= 0.0f || f10 > 10000.0f) ? 16.0f : 16.0f;
        Paint paint = new Paint(129);
        paint.setTextSize(f10);
        paint.setTypeface(typeface(str, i7, z10));
        String featureSettings = featureSettings(str2);
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f10 * f11);
        return new Paint[]{paint, paint2};
    }

    private void putImage(int i7, Bitmap bitmap) {
        synchronized (this.images) {
            try {
                Bitmap put = this.images.put(Integer.valueOf(i7), bitmap);
                long allocationByteCount = this.imageBytes + bitmap.getAllocationByteCount();
                this.imageBytes = allocationByteCount;
                if (put != null) {
                    this.imageBytes = allocationByteCount - put.getAllocationByteCount();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void recordLocked(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        int i13;
        int i14;
        d0 c0Var;
        ?? r12 = bArr;
        if (r12.length <= 8388608) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long[] jArr = this.recordTimes;
            int i15 = this.nextRecord;
            if (elapsedRealtime - jArr[i15] < 1000) {
                clearPendingLayers();
                return;
            }
            jArr[i15] = elapsedRealtime;
            this.nextRecord = (i15 + 1) % jArr.length;
            this.owner.getClass();
            this.owner.getClass();
            Trace.beginSection("WidgetSandbox:Record");
            long nanoTime = System.nanoTime();
            double d2 = d - (nanoTime / 1.0E9d);
            if (Build.VERSION.SDK_INT >= 29) {
                c0Var = new b0("widget-sandbox-content", 0, 0, i7, i10);
                i14 = i10;
                i13 = i7;
            } else {
                i13 = i7;
                i14 = i10;
                c0Var = new c0(0, 0, i13, i14);
            }
            d0 d0Var = c0Var;
            try {
                try {
                    try {
                        j b10 = j.b(r12);
                        String text = text(bArr2);
                        checkJsonDepth(text);
                        JSONObject jSONObject = new JSONObject(text);
                        System.nanoTime();
                        this.painter.b(i13, i14);
                        Canvas a10 = d0Var.a();
                        try {
                            a10.scale(f10, f10);
                            this.painter.f(a10, b10, this, f10, 0.0f, 0.0f, i13 / f10, i14 / f10);
                            d0Var.d();
                            o1[] layers = layers(jSONObject, f10);
                            p1 p1Var = this.owner;
                            System.nanoTime();
                            p1Var.getClass();
                            p1Var.S = null;
                            this.owner.c(d0Var, layers, d2, i7, i14, f11, ((float) (System.nanoTime() - nanoTime)) / 1000000.0f, i11, i12, b10.f54917b, this.text);
                            return;
                        } catch (Throwable th2) {
                            d0Var.d();
                            throw th2;
                        }
                    } finally {
                        clearPendingLayers();
                        Trace.endSection();
                    }
                } catch (Exception e10) {
                    e = e10;
                    r12 = d0Var;
                    r12.b();
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
                r12.b();
                throw e;
            }
        }
        clearPendingLayers();
        throw new IllegalArgumentException("Display list");
    }

    private i reserveCanvas(int i7, int i10, int i11) {
        i iVar;
        long j3 = i10 * i11;
        if (j3 <= 4194304) {
            synchronized (this.canvasLock) {
                long j10 = j3 * 8;
                try {
                    long imageBytes = imageBytes() + j10;
                    for (Map.Entry<Integer, i> entry : this.canvases.entrySet()) {
                        if (entry.getKey().intValue() != i7) {
                            imageBytes += entry.getValue().W;
                        }
                    }
                    if (imageBytes <= 33554432) {
                        iVar = this.canvases.get(Integer.valueOf(i7));
                        if (iVar == null) {
                            iVar = new i(i7);
                            this.canvases.put(Integer.valueOf(i7), iVar);
                        }
                        iVar.W = j10;
                    } else {
                        throw new IllegalArgumentException("Canvas memory budget");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iVar;
        }
        throw new IllegalArgumentException("Canvas dimensions");
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
    public Bitmap canvas(int i7) {
        i iVar = this.canvases.get(Integer.valueOf(i7));
        if (iVar == null) {
            return null;
        }
        return iVar.j();
    }

    @Override
    public Bitmap canvasBitmap(int i7) {
        i iVar = this.canvases.get(Integer.valueOf(i7));
        if (iVar == null) {
            return null;
        }
        return iVar.j();
    }

    public byte[] canvasRead(int i7, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        assertWorker();
        if (i12 > 0 && i13 > 0 && i12 * i13 <= 4194304) {
            i iVar = this.canvases.get(Integer.valueOf(i7));
            if (iVar == null) {
                return new byte[i12 * i13 * 4];
            }
            synchronized (iVar) {
                byte[] bArr = new byte[Math.max(i12, 0) * Math.max(i13, 0) * 4];
                if (iVar.f54900o == null) {
                    return bArr;
                }
                int max = Math.max(0, i14);
                int max2 = Math.max(0, i11);
                int min = Math.min(iVar.f54900o.getWidth(), i14 + i12);
                int min2 = Math.min(iVar.f54900o.getHeight(), i13 + i11);
                if (min > max && min2 > max2) {
                    int i15 = min - max;
                    int i16 = min2 - max2;
                    int[] iArr = new int[i15 * i16];
                    iVar.f54900o.getPixels(iArr, 0, i15, max, max2, i15, i16);
                    int i17 = max2;
                    while (i17 < min2) {
                        int i18 = max;
                        while (i18 < min) {
                            int i19 = iArr[(i18 - max) + ((i17 - max2) * i15)];
                            int i20 = ((i18 - i14) + ((i17 - i11) * i12)) * 4;
                            bArr[i20] = (byte) Color.red(i19);
                            bArr[i20 + 1] = (byte) Color.green(i19);
                            bArr[i20 + 2] = (byte) Color.blue(i19);
                            bArr[i20 + 3] = (byte) Color.alpha(i19);
                            i18++;
                            i14 = i10;
                        }
                        i17++;
                        i14 = i10;
                    }
                    return bArr;
                }
                return bArr;
            }
        }
        return null;
    }

    public void canvasRelease(int i7) {
        i remove;
        assertWorker();
        synchronized (this.canvasLock) {
            remove = this.canvases.remove(Integer.valueOf(i7));
        }
        if (remove != null) {
            remove.i();
        }
    }

    public void canvasRun(int r4, int r5, int r6, int[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.canvasRun(int, int, int, int[]):void");
    }

    public float[] createFont(byte[] bArr, float f10, int i7, boolean z10, byte[] bArr2) {
        assertWorker();
        int i10 = this.nextFont + 1;
        this.nextFont = i10;
        return defineFont(i10, bArr, f10, i7, z10, bArr2);
    }

    public float[] defineFont(int i7, byte[] bArr, float f10, int i10, boolean z10, byte[] bArr2) {
        if (this.fonts.size() >= 4096 && !this.fonts.containsKey(Integer.valueOf(i7))) {
            throw new IllegalArgumentException("Too many fonts");
        }
        Paint[] paints = paints(text(bArr), f10, i10, z10, text(bArr2), this.owner.f55020l);
        this.fonts.put(Integer.valueOf(i7), paints[0]);
        this.deviceFonts.put(Integer.valueOf(i7), paints[1]);
        return metrics(i7, paints[1], this.owner.f55020l, new Rect());
    }

    public void defineImage(int i7, int i10, int i11, byte[] bArr) {
        Bitmap put;
        if (bArr != null && i10 > 0 && i11 > 0) {
            long j3 = i10 * i11;
            if (j3 <= 4194304 && bArr.length == j3 * 4) {
                synchronized (this.images) {
                    try {
                        long j10 = this.imageBytes;
                        if (bArr.length + j10 > 33554432) {
                            return;
                        }
                        this.imageBytes = j10 + bArr.length;
                        try {
                            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                            synchronized (this.images) {
                                try {
                                    if (this.images.put(Integer.valueOf(i7), createBitmap) != null) {
                                        this.imageBytes -= put.getAllocationByteCount();
                                    }
                                } finally {
                                }
                            }
                        } catch (Throwable th2) {
                            synchronized (this.images) {
                                this.imageBytes -= bArr.length;
                                throw th2;
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public void deleteFont(int i7) {
        this.fonts.remove(Integer.valueOf(i7));
        this.deviceFonts.remove(Integer.valueOf(i7));
    }

    @Override
    public Paint deviceFont(int i7) {
        return this.deviceFonts.get(Integer.valueOf(i7));
    }

    @Override
    public Paint font(int i7) {
        return this.fonts.get(Integer.valueOf(i7));
    }

    public byte[] formatIntl(byte[] bArr) {
        return b1.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public Bitmap image(int i7) {
        return this.images.get(Integer.valueOf(i7));
    }

    public float[] loadImage(int i7, byte[] bArr) {
        Bitmap decodeImage = decodeImage(text(bArr), imageBytes());
        if (decodeImage == null) {
            return null;
        }
        putImage(i7, decodeImage);
        return new float[]{decodeImage.getWidth(), decodeImage.getHeight()};
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        assertWorker();
        synchronized (this.recordLock) {
            recordLocked(bArr, bArr2, d, i7, i10, f10, f11, i11, i12);
        }
    }

    public void recordLayer(int i7, int i10, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        if (i7 >= 0 && i7 < 256 && bArr.length <= 8388608) {
            j b10 = j.b(bArr);
            synchronized (this.recordLock) {
                try {
                    long j3 = this.pendingLayerBytes;
                    if (bArr.length + j3 <= 16777216) {
                        this.pendingLayerBytes = j3 + bArr.length;
                        this.pendingLayers.put(Integer.valueOf(i7), b10);
                        this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
                    } else {
                        clearPendingLayers();
                        throw new IllegalArgumentException("Layers");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Layer");
    }

    public void selectableText(byte[] bArr) {
        v1 v1Var;
        assertWorker();
        String text = text(bArr);
        checkJsonDepth(text);
        try {
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            v1Var = v1.a(text, new q(concurrentHashMap, 4), this.owner.f55020l);
        } catch (Exception unused) {
            v1Var = null;
        }
        synchronized (this.recordLock) {
            this.text = v1Var;
        }
    }

    public p1 session() {
        return this.owner;
    }

    public void signal(final int i7, byte[] bArr) {
        boolean optBoolean;
        JSONObject jSONObject;
        String str;
        boolean d;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean isEmpty;
        final String text = text(bArr);
        if (jsonSignal(i7)) {
            checkJsonDepth(text);
        }
        final p1 p1Var = this.owner;
        try {
            if (i7 == 8) {
                p1Var.getClass();
                if (text != null && text.length() <= 98368) {
                    JSONObject jSONObject2 = new JSONObject(text);
                    String optString = jSONObject2.optString("area");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("values");
                    if ("local".equals(optString) || "session".equals(optString)) {
                        synchronized (p1Var.f55030w) {
                            try {
                                isEmpty = p1Var.f55030w.isEmpty();
                                HashMap hashMap = p1Var.f55030w;
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                }
                                hashMap.put(optString, optJSONObject);
                            } finally {
                            }
                        }
                        if (isEmpty) {
                            p1Var.f55007a.post(new j1(p1Var, 6));
                        }
                    }
                }
            } else if (i7 == 10) {
                p1Var.getClass();
            } else if (!p1Var.A) {
                if (i7 != 12 && i7 != 19) {
                    if (i7 != 13 && i7 != 14) {
                        if (i7 == 11) {
                            p1Var.f55007a.post(new g0(5, p1Var, text));
                            return;
                        } else if (i7 == 18) {
                            JSONObject jSONObject3 = new JSONObject(text);
                            p1Var.S = new float[]{(float) jSONObject3.optDouble("receive"), (float) jSONObject3.optDouble("animate"), (float) jSONObject3.optDouble("paint"), (float) jSONObject3.optDouble("serialize"), 0.0f, 0.0f, (float) jSONObject3.optDouble("ticks"), (float) jSONObject3.optDouble("framesSent"), (float) jSONObject3.optDouble("opsLatency"), (float) jSONObject3.optDouble("validate", -1.0d), (float) jSONObject3.optDouble("hop", -1.0d)};
                            return;
                        } else {
                            if (i7 != 16 && i7 != 17 && i7 != 9) {
                                if (i7 == 3) {
                                    JSONObject jSONObject4 = new JSONObject(text);
                                    p1Var.f55007a.post(new zy(p1Var, jSONObject4.optBoolean("x"), jSONObject4.optBoolean("y"), jSONObject4.optBoolean("hold"), 2));
                                    return;
                                } else if (i7 == 4) {
                                    JSONObject jSONObject5 = new JSONObject(text);
                                    if (jSONObject5.optBoolean("loaded")) {
                                        p1Var.B = true;
                                    }
                                    p1Var.G = "bottom".equals(jSONObject5.optString("resizeAnchor"));
                                    if (jSONObject5.optBoolean("rendered") && !p1Var.E) {
                                        double optDouble = jSONObject5.optDouble("height", -1.0d);
                                        double min = Math.min(600.0f, Math.max(50.0f, p1Var.f55028t / p1Var.f55020l));
                                        if (p1Var.f55029u && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                                            p1Var.F = true;
                                            if (p1Var.D == 0) {
                                                p1Var.D = SystemClock.uptimeMillis();
                                            }
                                        }
                                        p1Var.E = true;
                                    }
                                    synchronized (p1Var.f55027s) {
                                        if (p1Var.A) {
                                            return;
                                        }
                                        p1Var.P = jSONObject5;
                                        if (!p1Var.Q) {
                                            p1Var.Q = true;
                                            p1Var.f55007a.post(p1Var.V);
                                        }
                                        return;
                                    }
                                } else if (i7 == 5) {
                                    JSONObject jSONObject6 = new JSONObject(text);
                                    String optString2 = jSONObject6.optString("kind");
                                    if (!"openLink".equals(optString2) && !"openTelegramLink".equals(optString2)) {
                                        if ("haptic".equals(optString2)) {
                                            z13 = p1Var.d.a(p1Var.L);
                                        } else {
                                            z13 = "ready".equals(optString2);
                                        }
                                    } else {
                                        String optString3 = jSONObject6.optString("url");
                                        boolean equals = "openTelegramLink".equals(optString2);
                                        if (optString3 != null && optString3.length() <= 256 && optString3.length() >= 9 && optString3.regionMatches(true, 0, "https://", 0, 8)) {
                                            int i10 = 8;
                                            while (i10 < optString3.length() && "/?#".indexOf(optString3.charAt(i10)) < 0) {
                                                i10++;
                                            }
                                            String substring = optString3.substring(8, i10);
                                            if (substring.indexOf(64) < 0) {
                                                int indexOf = substring.indexOf(58);
                                                if (indexOf >= 0) {
                                                    substring = substring.substring(0, indexOf);
                                                }
                                                if (!substring.isEmpty() && substring.length() <= 253) {
                                                    String[] split = substring.split("\\.", -1);
                                                    int length = split.length;
                                                    int i11 = 0;
                                                    loop1: while (true) {
                                                        if (i11 < length) {
                                                            String str2 = split[i11];
                                                            if (str2.isEmpty() || str2.length() > 63) {
                                                                break;
                                                            }
                                                            z11 = false;
                                                            if (str2.charAt(0) == '-' || str2.charAt(str2.length() - 1) == '-') {
                                                                break;
                                                            }
                                                            for (int i12 = 0; i12 < str2.length(); i12++) {
                                                                char charAt = str2.charAt(i12);
                                                                if ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '-')) {
                                                                    break loop1;
                                                                }
                                                            }
                                                            i11++;
                                                        } else {
                                                            z11 = false;
                                                            String[] strArr = e0.f54840m;
                                                            boolean z15 = false;
                                                            for (int i13 = 0; i13 < 3; i13++) {
                                                                String str3 = strArr[i13];
                                                                if (!substring.equals(str3)) {
                                                                    if (!substring.endsWith("." + str3)) {
                                                                        z14 = false;
                                                                        z15 |= z14;
                                                                    }
                                                                }
                                                                z14 = true;
                                                                z15 |= z14;
                                                            }
                                                            if (z15 == equals && p1Var.d.c(p1Var.L)) {
                                                                z12 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                z12 = z11;
                                                z13 = z12;
                                            }
                                        }
                                        z11 = false;
                                        z12 = z11;
                                        z13 = z12;
                                    }
                                    if (z13) {
                                        p1Var.f55007a.post(new g0(7, p1Var, jSONObject6));
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    if (i7 == 13) {
                        if (text != null && text.length() <= 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10 || !p1Var.d.c(p1Var.L)) {
                            return;
                        }
                    }
                    p1Var.f55007a.post(new Runnable() {
                        @Override
                        public final void run() {
                            d1 d1Var;
                            g2 g2Var;
                            p1 p1Var2 = p1.this;
                            int i14 = i7;
                            String str4 = text;
                            if (!p1Var2.A && (d1Var = p1Var2.R) != null) {
                                if (i14 == 13) {
                                    if (d1Var.f54820e != null && !TextUtils.isEmpty(str4)) {
                                        org.telegram.messenger.g0.g(str4);
                                        if (org.telegram.messenger.g0.G3()) {
                                            g2Var = LaunchActivity.T();
                                        } else {
                                            g2Var = null;
                                        }
                                        if (g2Var != null) {
                                            if (str4.length() > 80) {
                                                str4 = str4.substring(0, 80) + "…";
                                            }
                                            kc.b0(g2Var).Q(2131623994, 36, gd.a0(null, null, 2131742595, str4)).j();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                boolean equals2 = "1".equals(str4);
                                if (d1Var.A != equals2) {
                                    d1Var.A = equals2;
                                    sa.d dVar = d1Var.f54820e;
                                    if (dVar != null) {
                                        dVar.getClass();
                                        n0.E();
                                    }
                                }
                            }
                        }
                    });
                    return;
                }
                JSONObject jSONObject7 = new JSONObject(text);
                long j3 = jSONObject7.getLong("id");
                if (i7 == 19) {
                    str = null;
                    jSONObject = jSONObject7.getJSONObject("call");
                    optBoolean = false;
                } else {
                    String string = jSONObject7.getString("data");
                    optBoolean = jSONObject7.optBoolean("wallet");
                    jSONObject = null;
                    str = string;
                }
                e0 e0Var = p1Var.d;
                if (i7 == 19) {
                    d = e0Var.e(jSONObject.toString(), p1Var.L);
                } else {
                    d = e0Var.d(str, optBoolean, p1Var.L);
                }
                if (!d) {
                    long j10 = p1Var.v;
                    if (j10 != 0) {
                        p1Var.f55011c.a(j10, j3, 3, null);
                        return;
                    }
                    return;
                }
                p1Var.f55007a.post(new org.telegram.messenger.voip.p(p1Var, i7, j3, jSONObject, str, optBoolean));
            }
        } catch (Exception unused) {
        }
    }

    public void state(int i7, float f10) {
        boolean z10;
        p1 p1Var = this.owner;
        if (!p1Var.A) {
            if ((i7 & 8) != 0 && f10 == f10) {
                AtomicBoolean atomicBoolean = p1Var.f55025q;
                if (f10 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                atomicBoolean.set(z10);
                p1Var.f55031x = f10;
                if (p1Var.f55032y.compareAndSet(false, true)) {
                    p1Var.f55007a.post(new j1(p1Var, 5));
                }
            }
            if ((i7 & 4) != 0) {
                p1Var.f55023o.set(false);
            }
            if ((i7 & 2) != 0) {
                p1Var.f55022n.set(true);
            }
            if ((i7 & 6) != 0) {
                p1Var.f55007a.removeCallbacks(p1Var.W);
                p1Var.f55007a.post(p1Var.W);
            }
            if ((i7 & 1) != 0) {
                p1Var.f55024p.set(true);
                p1Var.f55007a.post(p1Var.f55013d0);
            }
        }
    }

    public float textWidth(int i7, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i7));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.f55020l;
    }
}
