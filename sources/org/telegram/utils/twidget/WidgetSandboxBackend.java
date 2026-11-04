package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ny;
import org.telegram.ui.rw;
final class WidgetSandboxBackend implements x, c {
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private long layerParseNanos;
    private int nextFont;
    private final h0 owner;
    private m0 text;
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, d> canvases = new ConcurrentHashMap<>();
    private final HashMap<Integer, JSONArray> pendingLayers = new HashMap<>();
    private HashMap<Long, s> layerContents = new HashMap<>();
    private final y painter = new y();
    private final Rect bounds = new Rect();

    public WidgetSandboxBackend(h0 h0Var) {
        this.owner = h0Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Native layout and recording must run off UI");
    }

    private void checkCanvasSize(int i3, int i10, int i11) {
        long width;
        long j10 = i10 * i11;
        if (j10 <= 4194304) {
            long j11 = (j10 * 8) + this.imageBytes;
            for (Map.Entry<Integer, d> entry : this.canvases.entrySet()) {
                if (entry.getKey().intValue() != i3) {
                    d value = entry.getValue();
                    Bitmap bitmap = value.f52829o;
                    if (bitmap == null) {
                        width = 0;
                    } else {
                        width = bitmap.getWidth() * value.f52829o.getHeight() * 8;
                    }
                    j11 += width;
                }
            }
            if (j11 <= 33554432) {
                return;
            }
            throw new IllegalArgumentException("Canvas memory budget");
        }
        throw new IllegalArgumentException("Canvas dimensions");
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

    private g0[] layers(JSONObject jSONObject, float f10) {
        int length;
        int i3;
        JSONArray jSONArray;
        int i10;
        long j10;
        float[] fArr;
        float[] fArr2;
        int length2;
        boolean z10;
        int i11;
        int i12;
        g fVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int i13 = 0;
        if (optJSONArray == null) {
            length = 0;
        } else {
            length = optJSONArray.length();
        }
        HashMap<Long, s> hashMap = new HashMap<>();
        g0[] g0VarArr = new g0[length];
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
                    i3 = length;
                    double d = f10;
                    jSONArray = optJSONArray;
                    int floor = (int) Math.floor(optDouble * d);
                    int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                    int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                    int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                    s sVar = this.layerContents.get(Long.valueOf(optLong));
                    JSONArray jSONArray2 = this.pendingLayers.get(Integer.valueOf(i14));
                    if (jSONArray2 != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            g eVar = new e("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                            i12 = floor;
                            i11 = floor2;
                            i10 = i14;
                            j10 = optLong;
                            fVar = eVar;
                        } else {
                            i10 = i14;
                            j10 = optLong;
                            i11 = floor2;
                            i12 = floor;
                            fVar = new f(i12, i11, ceil, ceil2);
                        }
                        Canvas a10 = fVar.a();
                        try {
                            a10.translate(-i12, -i11);
                            a10.scale(f10, f10);
                            this.painter.f(a10, jSONArray2, this, f10);
                            fVar.e();
                            sVar = new s(fVar, (int) optLong2);
                        } catch (Throwable th2) {
                            fVar.e();
                            throw th2;
                        }
                    } else {
                        i10 = i14;
                        j10 = optLong;
                        if (sVar != null) {
                            if (sVar.f52955b != ((int) optLong2)) {
                            }
                        }
                        i14 = i10 + 1;
                        length = i3;
                        optJSONArray = jSONArray;
                        i13 = 0;
                    }
                    hashMap.put(Long.valueOf(j10), sVar);
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("l");
                    float[] fArr3 = null;
                    if (optJSONArray3 != null) {
                        float[] fArr4 = new float[4];
                        y.d(optJSONArray3, fArr4, 4, new float[0]);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("q");
                        if (optJSONArray4 != null) {
                            fArr3 = new float[8];
                            y.d(optJSONArray4, fArr3, 8, new float[0]);
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
                    y.d(optJSONArray5, fArr5, length2, new float[0]);
                    int i16 = i15 + 1;
                    g gVar = sVar.f52954a;
                    double optDouble2 = optJSONObject.optDouble("ts");
                    double optDouble3 = optJSONObject.optDouble("td");
                    if (optJSONObject.optInt("tr") != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g0VarArr[i15] = new g0(gVar, fArr, fArr2, optDouble2, optDouble3, z10, fArr5);
                    i15 = i16;
                    i14 = i10 + 1;
                    length = i3;
                    optJSONArray = jSONArray;
                    i13 = 0;
                }
            }
            jSONArray = optJSONArray;
            i3 = length;
            i10 = i14;
            i14 = i10 + 1;
            length = i3;
            optJSONArray = jSONArray;
            i13 = 0;
        }
        int i17 = length;
        this.layerContents = hashMap;
        if (i15 == i17) {
            return g0VarArr;
        }
        g0[] g0VarArr2 = new g0[i15];
        System.arraycopy(g0VarArr, 0, g0VarArr2, 0, i15);
        return g0VarArr2;
    }

    private static String text(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static android.graphics.Typeface typeface(java.lang.String r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.typeface(java.lang.String, int, boolean):android.graphics.Typeface");
    }

    @Override
    public Bitmap canvas(int i3) {
        d dVar = this.canvases.get(Integer.valueOf(i3));
        if (dVar == null) {
            return null;
        }
        synchronized (dVar) {
            try {
                Bitmap bitmap = dVar.f52829o;
                if (bitmap == null) {
                    return null;
                }
                if (dVar.f52833s == dVar.f52832r) {
                    if (dVar.f52830p == null) {
                    }
                    return dVar.f52830p;
                }
                dVar.f52830p = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                dVar.f52833s = dVar.f52832r;
                return dVar.f52830p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public Bitmap canvasBitmap(int i3) {
        d dVar = this.canvases.get(Integer.valueOf(i3));
        if (dVar == null) {
            return null;
        }
        return dVar.f52829o;
    }

    public byte[] canvasRead(int i3, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        assertWorker();
        if (i12 > 0 && i13 > 0 && i12 * i13 <= 4194304) {
            d dVar = this.canvases.get(Integer.valueOf(i3));
            if (dVar == null) {
                return new byte[i12 * i13 * 4];
            }
            byte[] bArr = new byte[Math.max(i13, 0) * Math.max(i12, 0) * 4];
            if (dVar.f52829o != null) {
                int max = Math.max(0, i14);
                int max2 = Math.max(0, i11);
                int min = Math.min(dVar.f52829o.getWidth(), i14 + i12);
                int min2 = Math.min(dVar.f52829o.getHeight(), i13 + i11);
                if (min > max && min2 > max2) {
                    int i15 = min - max;
                    int i16 = min2 - max2;
                    int[] iArr = new int[i15 * i16];
                    dVar.f52829o.getPixels(iArr, 0, i15, max, max2, i15, i16);
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
                }
            }
            return bArr;
        }
        return null;
    }

    public void canvasRelease(int i3) {
        assertWorker();
        d remove = this.canvases.remove(Integer.valueOf(i3));
        if (remove != null) {
            synchronized (remove) {
                try {
                    Bitmap bitmap = remove.f52829o;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    remove.f52829o = null;
                    remove.f52831q = null;
                    remove.f52830p = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void canvasRun(int r3, int r4, int r5, int[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.canvasRun(int, int, int, int[]):void");
    }

    public float[] createFont(byte[] bArr, float f10, int i3, boolean z10, byte[] bArr2) {
        assertWorker();
        Paint paint = new Paint(129);
        paint.setTextSize(f10);
        paint.setTypeface(typeface(text(bArr), i3, z10));
        String featureSettings = featureSettings(text(bArr2));
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        float f11 = this.owner.f52871j;
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f10 * f11);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        int i10 = this.nextFont + 1;
        this.nextFont = i10;
        this.fonts.put(Integer.valueOf(i10), paint);
        this.deviceFonts.put(Integer.valueOf(i10), paint2);
        paint2.getTextBounds("x", 0, 1, this.bounds);
        float f12 = fontMetrics.ascent;
        float f13 = fontMetrics.descent;
        return new float[]{i10, (-f12) / f11, f13 / f11, ((f13 - f12) + fontMetrics.leading) / f11, this.bounds.height() / f11, paint2.measureText("0") / f11};
    }

    public void deleteFont(int i3) {
        this.fonts.remove(Integer.valueOf(i3));
        this.deviceFonts.remove(Integer.valueOf(i3));
    }

    @Override
    public Paint deviceFont(int i3) {
        return this.deviceFonts.get(Integer.valueOf(i3));
    }

    @Override
    public Paint font(int i3) {
        return this.fonts.get(Integer.valueOf(i3));
    }

    public byte[] formatIntl(byte[] bArr) {
        return t.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public Bitmap image(int i3) {
        return this.images.get(Integer.valueOf(i3));
    }

    public float[] loadImage(int r42, byte[] r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.loadImage(int, byte[]):float[]");
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i3, int i10, float f10, float f11, int i11, int i12) {
        g fVar;
        int i13;
        int i14;
        assertWorker();
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        long nanoTime = System.nanoTime();
        double d10 = d - (nanoTime / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            i13 = i3;
            fVar = new e("widget-sandbox-content", 0, 0, i13, i10);
            i14 = i10;
        } else {
            i13 = i3;
            i14 = i10;
            fVar = new f(0, 0, i13, i14);
        }
        g gVar = fVar;
        try {
            try {
                JSONArray jSONArray = new JSONArray(text(bArr));
                JSONObject jSONObject = new JSONObject(text(bArr2));
                System.nanoTime();
                Canvas a10 = gVar.a();
                try {
                    a10.scale(f10, f10);
                    this.painter.f(a10, jSONArray, this, f10);
                    gVar.e();
                    g0[] layers = layers(jSONObject, f10);
                    h0 h0Var = this.owner;
                    System.nanoTime();
                    h0Var.getClass();
                    this.owner.a(gVar, layers, d10, i13, i14, f11, ((float) (System.nanoTime() - nanoTime)) / 1000000.0f, i11, i12, jSONArray.length(), this.text);
                } catch (Throwable th2) {
                    gVar.e();
                    throw th2;
                }
            } finally {
                this.pendingLayers.clear();
                this.layerParseNanos = 0L;
                Trace.endSection();
            }
        } catch (Exception e10) {
            gVar.c();
            throw e10;
        }
    }

    public void recordLayer(int i3, int i10, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        this.pendingLayers.put(Integer.valueOf(i3), new JSONArray(text(bArr)));
        this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
    }

    public void selectableText(byte[] bArr) {
        assertWorker();
        try {
            String text = text(bArr);
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            this.text = m0.a(text, new r(concurrentHashMap), this.owner.f52871j);
        } catch (Exception unused) {
            this.text = null;
        }
    }

    public void signal(int i3, byte[] bArr) {
        final h0 h0Var = this.owner;
        final String text = text(bArr);
        if (i3 == 8) {
            h0Var.f52864a.post(new Runnable() {
                @Override
                public final void run() {
                    u uVar;
                    h71 h71Var;
                    u uVar2;
                    switch (r3) {
                        case 0:
                            h0 h0Var2 = h0Var;
                            String str = text;
                            if (h0Var2.K != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    u uVar3 = h0Var2.K;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    uVar3.h(optString, optJSONObject);
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            return;
                        case 1:
                            h0 h0Var3 = h0Var;
                            String str2 = text;
                            if (!h0Var3.f52882u && (uVar = h0Var3.J) != null && (h71Var = uVar.h) != null) {
                                if (h71Var.F || (h71Var.f34337w && h71Var.E)) {
                                    h71Var.f34318a.f(str2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            h0 h0Var4 = h0Var;
                            String str3 = text;
                            if (!h0Var4.f52882u && (uVar2 = h0Var4.J) != null) {
                                try {
                                    uVar2.f(new JSONObject(str3));
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            return;
                    }
                }
            });
        } else if (i3 == 10) {
            h0Var.getClass();
        } else if (!h0Var.f52882u) {
            if (i3 != 12 && i3 != 13 && i3 != 14 && i3 != 19) {
                if (i3 == 11) {
                    h0Var.f52864a.post(new Runnable() {
                        @Override
                        public final void run() {
                            u uVar;
                            h71 h71Var;
                            u uVar2;
                            switch (r3) {
                                case 0:
                                    h0 h0Var2 = h0Var;
                                    String str = text;
                                    if (h0Var2.K != null) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(str);
                                            JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                            u uVar3 = h0Var2.K;
                                            String optString = jSONObject.optString("area");
                                            if (optJSONObject == null) {
                                                optJSONObject = new JSONObject();
                                            }
                                            uVar3.h(optString, optJSONObject);
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    return;
                                case 1:
                                    h0 h0Var3 = h0Var;
                                    String str2 = text;
                                    if (!h0Var3.f52882u && (uVar = h0Var3.J) != null && (h71Var = uVar.h) != null) {
                                        if (h71Var.F || (h71Var.f34337w && h71Var.E)) {
                                            h71Var.f34318a.f(str2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    h0 h0Var4 = h0Var;
                                    String str3 = text;
                                    if (!h0Var4.f52882u && (uVar2 = h0Var4.J) != null) {
                                        try {
                                            uVar2.f(new JSONObject(str3));
                                        } catch (Exception unused2) {
                                            return;
                                        }
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                try {
                    if (i3 == 18) {
                        JSONObject jSONObject = new JSONObject(text);
                        jSONObject.optDouble("receive");
                        jSONObject.optDouble("animate");
                        jSONObject.optDouble("paint");
                        jSONObject.optDouble("serialize");
                        jSONObject.optDouble("ticks");
                        jSONObject.optDouble("framesSent");
                        jSONObject.optDouble("opsLatency");
                        jSONObject.optDouble("validate", -1.0d);
                        jSONObject.optDouble("hop", -1.0d);
                        return;
                    } else if (i3 != 16 && i3 != 17 && i3 != 9) {
                        boolean z10 = false;
                        if (i3 == 6) {
                            h0Var.f52874m.set(false);
                            h0Var.f52864a.post(h0Var.N);
                            return;
                        } else if (i3 == 1) {
                            h0Var.f52875n.set(true);
                            h0Var.f52864a.post(h0Var.R);
                            return;
                        } else if (i3 == 2) {
                            h0Var.f52873l.set(true);
                            h0Var.f52864a.removeCallbacks(h0Var.N);
                            h0Var.f52864a.post(h0Var.N);
                            return;
                        } else if (i3 == 3) {
                            JSONObject jSONObject2 = new JSONObject(text);
                            h0Var.f52864a.post(new ny(h0Var, jSONObject2.optBoolean("x"), jSONObject2.optBoolean("y"), jSONObject2.optBoolean("hold"), 2));
                            return;
                        } else if (i3 == 4) {
                            JSONObject jSONObject3 = new JSONObject(text);
                            if (jSONObject3.optBoolean("loaded")) {
                                h0Var.v = true;
                            }
                            h0Var.f52885y = "bottom".equals(jSONObject3.optString("resizeAnchor"));
                            if (jSONObject3.optBoolean("rendered") && !h0Var.f52883w) {
                                double optDouble = jSONObject3.optDouble("height", -1.0d);
                                double min = Math.min(600.0f, Math.max(50.0f, h0Var.f52879r / h0Var.f52871j));
                                if (h0Var.f52880s && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                                    h0Var.f52884x = true;
                                }
                                h0Var.f52883w = true;
                            }
                            synchronized (h0Var.f52878q) {
                                if (h0Var.f52882u) {
                                    return;
                                }
                                h0Var.H = jSONObject3;
                                if (!h0Var.I) {
                                    h0Var.I = true;
                                    h0Var.f52864a.post(h0Var.M);
                                }
                                return;
                            }
                        } else if (i3 == 5) {
                            h0Var.f52864a.post(new Runnable() {
                                @Override
                                public final void run() {
                                    u uVar;
                                    h71 h71Var;
                                    u uVar2;
                                    switch (r3) {
                                        case 0:
                                            h0 h0Var2 = h0Var;
                                            String str = text;
                                            if (h0Var2.K != null) {
                                                try {
                                                    JSONObject jSONObject4 = new JSONObject(str);
                                                    JSONObject optJSONObject = jSONObject4.optJSONObject("values");
                                                    u uVar3 = h0Var2.K;
                                                    String optString = jSONObject4.optString("area");
                                                    if (optJSONObject == null) {
                                                        optJSONObject = new JSONObject();
                                                    }
                                                    uVar3.h(optString, optJSONObject);
                                                } catch (Exception unused) {
                                                    return;
                                                }
                                            }
                                            return;
                                        case 1:
                                            h0 h0Var3 = h0Var;
                                            String str2 = text;
                                            if (!h0Var3.f52882u && (uVar = h0Var3.J) != null && (h71Var = uVar.h) != null) {
                                                if (h71Var.F || (h71Var.f34337w && h71Var.E)) {
                                                    h71Var.f34318a.f(str2);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            h0 h0Var4 = h0Var;
                                            String str3 = text;
                                            if (!h0Var4.f52882u && (uVar2 = h0Var4.J) != null) {
                                                try {
                                                    uVar2.f(new JSONObject(str3));
                                                } catch (Exception unused2) {
                                                    return;
                                                }
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        } else if (i3 == 7) {
                            float parseFloat = Float.parseFloat(text);
                            AtomicBoolean atomicBoolean = h0Var.f52876o;
                            if (parseFloat == 0.0f) {
                                z10 = true;
                            }
                            atomicBoolean.set(z10);
                            h0Var.f52864a.post(new org.telegram.ui.c0(h0Var, parseFloat, 4));
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (NumberFormatException | Exception unused) {
                    return;
                }
            }
            h0Var.f52864a.post(new rw(h0Var, i3, text, 21));
        }
    }

    public float textWidth(int i3, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i3));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.f52871j;
    }
}
