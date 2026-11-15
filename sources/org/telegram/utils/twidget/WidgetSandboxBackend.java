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
import org.json.JSONArray;
import org.json.JSONObject;
public final class WidgetSandboxBackend implements b1, g {
    private static final int MAX_CANVAS_WORDS = 2097152;
    private static final int MAX_DISPLAY_OPS = 200000;
    private static final int MAX_FONTS = 4096;
    private static final int MAX_FRAMES_PER_SECOND = 240;
    static final long MAX_IMAGE_BYTES = 33554432;
    static final long MAX_IMAGE_PIXELS = 4194304;
    static final int MAX_JSON_DEPTH = 32;
    private static final int MAX_LAYERS = 256;
    private static final long MAX_LIST_BYTES = 8388608;
    private static final long MAX_PENDING_LAYER_BYTES = 16777216;
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private long layerParseNanos;
    private int nextFont;
    private int nextRecord;
    private final l1 owner;
    private long pendingLayerBytes;
    private q1 text;
    private final Object recordLock = new Object();
    private final long[] recordTimes = new long[240];
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, h> canvases = new ConcurrentHashMap<>();
    private final HashMap<Integer, i> pendingLayers = new HashMap<>();
    private HashMap<Long, v0> layerContents = new HashMap<>();
    private final c1 painter = new c1();

    public WidgetSandboxBackend(l1 l1Var) {
        this.owner = l1Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Native layout and recording must run off UI");
    }

    private void checkCanvasSize(int i7, int i10, int i11) {
        long width;
        long j3 = i10 * i11;
        if (j3 <= 4194304) {
            long imageBytes = (j3 * 8) + imageBytes();
            for (Map.Entry<Integer, h> entry : this.canvases.entrySet()) {
                if (entry.getKey().intValue() != i7) {
                    h value = entry.getValue();
                    Bitmap bitmap = value.f54232o;
                    if (bitmap == null) {
                        width = 0;
                    } else {
                        width = bitmap.getWidth() * value.f54232o.getHeight() * 8;
                    }
                    imageBytes += width;
                }
            }
            if (imageBytes <= 33554432) {
                return;
            }
            throw new IllegalArgumentException("Canvas memory budget");
        }
        throw new IllegalArgumentException("Canvas dimensions");
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
                if (charAt == ']' || charAt == '}') {
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

    private k1[] layers(JSONObject jSONObject, float f10) {
        int length;
        int i7;
        JSONArray jSONArray;
        int i10;
        long j3;
        float[] fArr;
        float[] fArr2;
        int length2;
        boolean z10;
        int i11;
        int i12;
        c0 b0Var;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int i13 = 0;
        if (optJSONArray == null) {
            length = 0;
        } else {
            length = optJSONArray.length();
        }
        HashMap<Long, v0> hashMap = new HashMap<>();
        k1[] k1VarArr = new k1[length];
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i14);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("b");
                if (optJSONArray2 != null) {
                    double optDouble = optJSONArray2.optDouble(i13);
                    i7 = length;
                    double d = f10;
                    jSONArray = optJSONArray;
                    int floor = (int) Math.floor(optDouble * d);
                    int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                    int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                    int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                    v0 v0Var = this.layerContents.get(Long.valueOf(optLong));
                    i iVar = this.pendingLayers.get(Integer.valueOf(i14));
                    if (iVar != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            c0 a0Var = new a0("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                            i12 = floor;
                            i11 = floor2;
                            i10 = i14;
                            j3 = optLong;
                            b0Var = a0Var;
                        } else {
                            i10 = i14;
                            j3 = optLong;
                            i11 = floor2;
                            i12 = floor;
                            b0Var = new b0(i12, i11, ceil, ceil2);
                        }
                        Canvas a10 = b0Var.a();
                        try {
                            a10.translate(-i12, -i11);
                            a10.scale(f10, f10);
                            this.painter.e(a10, iVar, this, f10);
                            b0Var.d();
                            v0Var = new v0(b0Var, (int) optLong2);
                        } catch (Throwable th2) {
                            b0Var.d();
                            throw th2;
                        }
                    } else {
                        i10 = i14;
                        j3 = optLong;
                        if (v0Var != null) {
                            if (v0Var.f54419b != ((int) optLong2)) {
                            }
                        }
                        i14 = i10 + 1;
                        length = i7;
                        optJSONArray = jSONArray;
                        i13 = 0;
                    }
                    hashMap.put(Long.valueOf(j3), v0Var);
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("l");
                    float[] fArr3 = null;
                    if (optJSONArray3 != null) {
                        float[] fArr4 = new float[4];
                        c1.c(optJSONArray3, fArr4, 4, new float[0]);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("q");
                        if (optJSONArray4 != null) {
                            fArr3 = new float[8];
                            c1.c(optJSONArray4, fArr3, 8, new float[0]);
                        }
                        fArr2 = fArr3;
                        fArr = fArr4;
                    } else {
                        fArr = null;
                        fArr2 = null;
                    }
                    JSONArray optJSONArray5 = optJSONObject.optJSONArray("k");
                    if (optJSONArray5 == null) {
                        length2 = 0;
                    } else {
                        length2 = (optJSONArray5.length() / 8) * 8;
                    }
                    float[] fArr5 = new float[length2];
                    c1.c(optJSONArray5, fArr5, length2, new float[0]);
                    int i16 = i15 + 1;
                    c0 c0Var = v0Var.f54418a;
                    double optDouble2 = optJSONObject.optDouble("ts");
                    double optDouble3 = optJSONObject.optDouble("td");
                    if (optJSONObject.optInt("tr") != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k1VarArr[i15] = new k1(c0Var, fArr, fArr2, optDouble2, optDouble3, z10, fArr5);
                    i15 = i16;
                    i14 = i10 + 1;
                    length = i7;
                    optJSONArray = jSONArray;
                    i13 = 0;
                }
            }
            jSONArray = optJSONArray;
            i7 = length;
            i10 = i14;
            i14 = i10 + 1;
            length = i7;
            optJSONArray = jSONArray;
            i13 = 0;
        }
        int i17 = length;
        this.layerContents = hashMap;
        if (i15 == i17) {
            return k1VarArr;
        }
        k1[] k1VarArr2 = new k1[i15];
        System.arraycopy(k1VarArr, 0, k1VarArr2, 0, i15);
        return k1VarArr2;
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
        c0 b0Var;
        int i13;
        int i14;
        if (bArr.length <= 8388608) {
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
                b0Var = new a0("widget-sandbox-content", 0, 0, i7, i10);
                i13 = i7;
                i14 = i10;
            } else {
                i13 = i7;
                i14 = i10;
                b0Var = new b0(0, 0, i13, i14);
            }
            c0 c0Var = b0Var;
            try {
                try {
                    i b10 = i.b(bArr);
                    String text = text(bArr2);
                    checkJsonDepth(text);
                    JSONObject jSONObject = new JSONObject(text);
                    System.nanoTime();
                    c1 c1Var = this.painter;
                    c1Var.v = 0;
                    c1Var.f54191w = 0;
                    c1Var.f54192x = 0L;
                    Canvas a10 = c0Var.a();
                    try {
                        a10.scale(f10, f10);
                        this.painter.e(a10, b10, this, f10);
                        c0Var.d();
                        k1[] layers = layers(jSONObject, f10);
                        l1 l1Var = this.owner;
                        System.nanoTime();
                        l1Var.getClass();
                        this.owner.b(c0Var, layers, d2, i13, i14, f11, ((float) (System.nanoTime() - nanoTime)) / 1000000.0f, i11, i12, b10.f54248b, this.text);
                        return;
                    } catch (Throwable th2) {
                        c0Var.d();
                        throw th2;
                    }
                } catch (Exception e10) {
                    c0Var.b();
                    throw e10;
                }
            } finally {
                clearPendingLayers();
                Trace.endSection();
            }
        }
        clearPendingLayers();
        throw new IllegalArgumentException("Display list");
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
        h hVar = this.canvases.get(Integer.valueOf(i7));
        if (hVar == null) {
            return null;
        }
        return hVar.i();
    }

    @Override
    public Bitmap canvasBitmap(int i7) {
        h hVar = this.canvases.get(Integer.valueOf(i7));
        if (hVar == null) {
            return null;
        }
        return hVar.i();
    }

    public byte[] canvasRead(int i7, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        assertWorker();
        if (i12 > 0 && i13 > 0 && i12 * i13 <= 4194304) {
            h hVar = this.canvases.get(Integer.valueOf(i7));
            if (hVar == null) {
                return new byte[i12 * i13 * 4];
            }
            synchronized (hVar) {
                byte[] bArr = new byte[Math.max(i12, 0) * Math.max(i13, 0) * 4];
                if (hVar.f54232o == null) {
                    return bArr;
                }
                int max = Math.max(0, i14);
                int max2 = Math.max(0, i11);
                int min = Math.min(hVar.f54232o.getWidth(), i14 + i12);
                int min2 = Math.min(hVar.f54232o.getHeight(), i13 + i11);
                if (min > max && min2 > max2) {
                    int i15 = min - max;
                    int i16 = min2 - max2;
                    int[] iArr = new int[i15 * i16];
                    hVar.f54232o.getPixels(iArr, 0, i15, max, max2, i15, i16);
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
        assertWorker();
        h remove = this.canvases.remove(Integer.valueOf(i7));
        if (remove != null) {
            synchronized (remove) {
                try {
                    Bitmap bitmap = remove.f54232o;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    remove.f54232o = null;
                    remove.f54234q = null;
                    remove.f54233p = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
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
        Paint[] paints = paints(text(bArr), f10, i10, z10, text(bArr2), this.owner.f54308l);
        this.fonts.put(Integer.valueOf(i7), paints[0]);
        this.deviceFonts.put(Integer.valueOf(i7), paints[1]);
        return metrics(i7, paints[1], this.owner.f54308l, new Rect());
    }

    public void defineImage(int i7, int i10, int i11, byte[] bArr) {
        if (bArr != null && i10 > 0 && i11 > 0) {
            long j3 = i10 * i11;
            if (j3 <= 4194304 && bArr.length == j3 * 4) {
                synchronized (this.images) {
                    try {
                        if (this.imageBytes + bArr.length > 33554432) {
                            return;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                        putImage(i7, createBitmap);
                    } catch (Throwable th2) {
                        throw th2;
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
        return w0.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
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
            i b10 = i.b(bArr);
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
        q1 q1Var;
        assertWorker();
        String text = text(bArr);
        checkJsonDepth(text);
        try {
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            q1Var = q1.a(text, new o(concurrentHashMap), this.owner.f54308l);
        } catch (Exception unused) {
            q1Var = null;
        }
        synchronized (this.recordLock) {
            this.text = q1Var;
        }
    }

    public l1 session() {
        return this.owner;
    }

    public void signal(final int r19, byte[] r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.signal(int, byte[]):void");
    }

    public float textWidth(int i7, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i7));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.f54308l;
    }
}
