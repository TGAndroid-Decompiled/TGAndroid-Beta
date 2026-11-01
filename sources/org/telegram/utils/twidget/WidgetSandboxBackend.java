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
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Wallet.x0;
final class WidgetSandboxBackend implements z, c {
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private long layerParseNanos;
    private int nextFont;
    private final k0 owner;
    private q0 text;
    private final ConcurrentHashMap<Integer, Paint> fonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Bitmap> images = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, d> canvases = new ConcurrentHashMap<>();
    private final HashMap<Integer, JSONArray> pendingLayers = new HashMap<>();
    private HashMap<Long, s> layerContents = new HashMap<>();
    private final a0 painter = new a0();
    private final Rect bounds = new Rect();

    public WidgetSandboxBackend(k0 k0Var) {
        this.owner = k0Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Native layout and recording must run off UI");
    }

    private void checkCanvasSize(int i10, int i11, int i12) {
        long width;
        long j10 = i11 * i12;
        if (j10 <= 4194304) {
            long j11 = (j10 * 8) + this.imageBytes;
            for (Map.Entry<Integer, d> entry : this.canvases.entrySet()) {
                if (entry.getKey().intValue() != i10) {
                    d value = entry.getValue();
                    Bitmap bitmap = value.f44335o;
                    if (bitmap == null) {
                        width = 0;
                    } else {
                        width = bitmap.getWidth() * value.f44335o.getHeight() * 8;
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

    private j0[] layers(JSONObject jSONObject, float f7) {
        int length;
        int i10;
        JSONArray jSONArray;
        int i11;
        long j10;
        float[] fArr;
        float[] fArr2;
        int length2;
        boolean z10;
        int i12;
        int i13;
        g fVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int i14 = 0;
        if (optJSONArray == null) {
            length = 0;
        } else {
            length = optJSONArray.length();
        }
        HashMap<Long, s> hashMap = new HashMap<>();
        j0[] j0VarArr = new j0[length];
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i15);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("b");
                if (optJSONArray2 != null) {
                    double optDouble = optJSONArray2.optDouble(i14);
                    i10 = length;
                    double d = f7;
                    jSONArray = optJSONArray;
                    int floor = (int) Math.floor(optDouble * d);
                    int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                    int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                    int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                    s sVar = this.layerContents.get(Long.valueOf(optLong));
                    JSONArray jSONArray2 = this.pendingLayers.get(Integer.valueOf(i15));
                    if (jSONArray2 != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            g eVar = new e("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                            i13 = floor;
                            i12 = floor2;
                            i11 = i15;
                            j10 = optLong;
                            fVar = eVar;
                        } else {
                            i11 = i15;
                            j10 = optLong;
                            i12 = floor2;
                            i13 = floor;
                            fVar = new f(i13, i12, ceil, ceil2);
                        }
                        Canvas a2 = fVar.a();
                        try {
                            a2.translate(-i13, -i12);
                            a2.scale(f7, f7);
                            this.painter.f(a2, jSONArray2, this, f7);
                            fVar.e();
                            sVar = new s(fVar, (int) optLong2);
                        } catch (Throwable th2) {
                            fVar.e();
                            throw th2;
                        }
                    } else {
                        i11 = i15;
                        j10 = optLong;
                        if (sVar != null) {
                            if (sVar.f44457b != ((int) optLong2)) {
                            }
                        }
                        i15 = i11 + 1;
                        length = i10;
                        optJSONArray = jSONArray;
                        i14 = 0;
                    }
                    hashMap.put(Long.valueOf(j10), sVar);
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("l");
                    float[] fArr3 = null;
                    if (optJSONArray3 != null) {
                        float[] fArr4 = new float[4];
                        a0.d(optJSONArray3, fArr4, 4, new float[0]);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("q");
                        if (optJSONArray4 != null) {
                            fArr3 = new float[8];
                            a0.d(optJSONArray4, fArr3, 8, new float[0]);
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
                    a0.d(optJSONArray5, fArr5, length2, new float[0]);
                    int i17 = i16 + 1;
                    g gVar = sVar.f44456a;
                    double optDouble2 = optJSONObject.optDouble("ts");
                    double optDouble3 = optJSONObject.optDouble("td");
                    if (optJSONObject.optInt("tr") != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j0VarArr[i16] = new j0(gVar, fArr, fArr2, optDouble2, optDouble3, z10, fArr5);
                    i16 = i17;
                    i15 = i11 + 1;
                    length = i10;
                    optJSONArray = jSONArray;
                    i14 = 0;
                }
            }
            jSONArray = optJSONArray;
            i10 = length;
            i11 = i15;
            i15 = i11 + 1;
            length = i10;
            optJSONArray = jSONArray;
            i14 = 0;
        }
        int i18 = length;
        this.layerContents = hashMap;
        if (i16 == i18) {
            return j0VarArr;
        }
        j0[] j0VarArr2 = new j0[i16];
        System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i16);
        return j0VarArr2;
    }

    private static String text(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static android.graphics.Typeface typeface(java.lang.String r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.typeface(java.lang.String, int, boolean):android.graphics.Typeface");
    }

    @Override
    public Bitmap canvas(int i10) {
        d dVar = this.canvases.get(Integer.valueOf(i10));
        if (dVar == null) {
            return null;
        }
        synchronized (dVar) {
            try {
                Bitmap bitmap = dVar.f44335o;
                if (bitmap == null) {
                    return null;
                }
                if (dVar.f44339s == dVar.f44338r) {
                    if (dVar.f44336p == null) {
                    }
                    return dVar.f44336p;
                }
                dVar.f44336p = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                dVar.f44339s = dVar.f44338r;
                return dVar.f44336p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public Bitmap canvasBitmap(int i10) {
        d dVar = this.canvases.get(Integer.valueOf(i10));
        if (dVar == null) {
            return null;
        }
        return dVar.f44335o;
    }

    public byte[] canvasRead(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i11;
        assertWorker();
        if (i13 > 0 && i14 > 0 && i13 * i14 <= 4194304) {
            d dVar = this.canvases.get(Integer.valueOf(i10));
            if (dVar == null) {
                return new byte[i13 * i14 * 4];
            }
            byte[] bArr = new byte[Math.max(i14, 0) * Math.max(i13, 0) * 4];
            if (dVar.f44335o != null) {
                int max = Math.max(0, i15);
                int max2 = Math.max(0, i12);
                int min = Math.min(dVar.f44335o.getWidth(), i15 + i13);
                int min2 = Math.min(dVar.f44335o.getHeight(), i14 + i12);
                if (min > max && min2 > max2) {
                    int i16 = min - max;
                    int i17 = min2 - max2;
                    int[] iArr = new int[i16 * i17];
                    dVar.f44335o.getPixels(iArr, 0, i16, max, max2, i16, i17);
                    int i18 = max2;
                    while (i18 < min2) {
                        int i19 = max;
                        while (i19 < min) {
                            int i20 = iArr[(i19 - max) + ((i18 - max2) * i16)];
                            int i21 = ((i19 - i15) + ((i18 - i12) * i13)) * 4;
                            bArr[i21] = (byte) Color.red(i20);
                            bArr[i21 + 1] = (byte) Color.green(i20);
                            bArr[i21 + 2] = (byte) Color.blue(i20);
                            bArr[i21 + 3] = (byte) Color.alpha(i20);
                            i19++;
                            i15 = i11;
                        }
                        i18++;
                        i15 = i11;
                    }
                }
            }
            return bArr;
        }
        return null;
    }

    public void canvasRelease(int i10) {
        assertWorker();
        d remove = this.canvases.remove(Integer.valueOf(i10));
        if (remove != null) {
            synchronized (remove) {
                try {
                    Bitmap bitmap = remove.f44335o;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    remove.f44335o = null;
                    remove.f44337q = null;
                    remove.f44336p = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void canvasRun(int r3, int r4, int r5, int[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.canvasRun(int, int, int, int[]):void");
    }

    public float[] createFont(byte[] bArr, float f7, int i10, boolean z10, byte[] bArr2) {
        assertWorker();
        Paint paint = new Paint(129);
        paint.setTextSize(f7);
        paint.setTypeface(typeface(text(bArr), i10, z10));
        String featureSettings = featureSettings(text(bArr2));
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        float f10 = this.owner.f44385j;
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f7 * f10);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        int i11 = this.nextFont + 1;
        this.nextFont = i11;
        this.fonts.put(Integer.valueOf(i11), paint);
        this.deviceFonts.put(Integer.valueOf(i11), paint2);
        paint2.getTextBounds("x", 0, 1, this.bounds);
        float f11 = fontMetrics.ascent;
        float f12 = fontMetrics.descent;
        return new float[]{i11, (-f11) / f10, f12 / f10, ((f12 - f11) + fontMetrics.leading) / f10, this.bounds.height() / f10, paint2.measureText("0") / f10};
    }

    public void deleteFont(int i10) {
        this.fonts.remove(Integer.valueOf(i10));
        this.deviceFonts.remove(Integer.valueOf(i10));
    }

    @Override
    public Paint deviceFont(int i10) {
        return this.deviceFonts.get(Integer.valueOf(i10));
    }

    @Override
    public Paint font(int i10) {
        return this.fonts.get(Integer.valueOf(i10));
    }

    public byte[] formatIntl(byte[] bArr) {
        return u.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public Bitmap image(int i10) {
        return this.images.get(Integer.valueOf(i10));
    }

    public float[] loadImage(int r42, byte[] r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.WidgetSandboxBackend.loadImage(int, byte[]):float[]");
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i10, int i11, float f7, float f10, int i12, int i13) {
        g fVar;
        int i14;
        int i15;
        assertWorker();
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        long nanoTime = System.nanoTime();
        double d10 = d - (nanoTime / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = i10;
            fVar = new e("widget-sandbox-content", 0, 0, i14, i11);
            i15 = i11;
        } else {
            i14 = i10;
            i15 = i11;
            fVar = new f(0, 0, i14, i15);
        }
        g gVar = fVar;
        try {
            try {
                JSONArray jSONArray = new JSONArray(text(bArr));
                JSONObject jSONObject = new JSONObject(text(bArr2));
                System.nanoTime();
                Canvas a2 = gVar.a();
                try {
                    a2.scale(f7, f7);
                    this.painter.f(a2, jSONArray, this, f7);
                    gVar.e();
                    j0[] layers = layers(jSONObject, f7);
                    k0 k0Var = this.owner;
                    System.nanoTime();
                    k0Var.getClass();
                    k0Var.K = null;
                    this.owner.a(gVar, layers, d10, i14, i15, f10, ((float) (System.nanoTime() - nanoTime)) / 1000000.0f, i12, i13, jSONArray.length(), this.text);
                } catch (Throwable th2) {
                    gVar.e();
                    throw th2;
                }
            } finally {
                this.pendingLayers.clear();
                this.layerParseNanos = 0L;
                Trace.endSection();
            }
        } catch (Exception e) {
            gVar.c();
            throw e;
        }
    }

    public void recordLayer(int i10, int i11, byte[] bArr) {
        assertWorker();
        long nanoTime = System.nanoTime();
        this.pendingLayers.put(Integer.valueOf(i10), new JSONArray(text(bArr)));
        this.layerParseNanos = (System.nanoTime() - nanoTime) + this.layerParseNanos;
    }

    public void selectableText(byte[] bArr) {
        assertWorker();
        try {
            String text = text(bArr);
            ConcurrentHashMap<Integer, Paint> concurrentHashMap = this.deviceFonts;
            Objects.requireNonNull(concurrentHashMap);
            this.text = q0.a(text, new r(concurrentHashMap), this.owner.f44385j);
        } catch (Exception unused) {
            this.text = null;
        }
    }

    public void signal(int i10, byte[] bArr) {
        boolean z10;
        final k0 k0Var = this.owner;
        final String text = text(bArr);
        if (i10 == 8) {
            k0Var.f44379a.post(new Runnable() {
                @Override
                public final void run() {
                    w wVar;
                    w wVar2;
                    r81 r81Var;
                    switch (r3) {
                        case 0:
                            k0 k0Var2 = k0Var;
                            String str = text;
                            if (!k0Var2.f44396u && (wVar = k0Var2.J) != null) {
                                try {
                                    wVar.f(new JSONObject(str));
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            return;
                        case 1:
                            k0 k0Var3 = k0Var;
                            String str2 = text;
                            if (k0Var3.L != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    w wVar3 = k0Var3.L;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    wVar3.h(optString, optJSONObject);
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            return;
                        default:
                            k0 k0Var4 = k0Var;
                            String str3 = text;
                            if (!k0Var4.f44396u && (wVar2 = k0Var4.J) != null && (r81Var = wVar2.h) != null) {
                                if (r81Var.F || (r81Var.f29958w && r81Var.E)) {
                                    r81Var.f29940a.f(str3);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
        } else if (i10 == 10) {
            k0Var.getClass();
        } else if (!k0Var.f44396u) {
            if (i10 != 12 && i10 != 13 && i10 != 14 && i10 != 19) {
                if (i10 == 11) {
                    k0Var.f44379a.post(new Runnable() {
                        @Override
                        public final void run() {
                            w wVar;
                            w wVar2;
                            r81 r81Var;
                            switch (r3) {
                                case 0:
                                    k0 k0Var2 = k0Var;
                                    String str = text;
                                    if (!k0Var2.f44396u && (wVar = k0Var2.J) != null) {
                                        try {
                                            wVar.f(new JSONObject(str));
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    return;
                                case 1:
                                    k0 k0Var3 = k0Var;
                                    String str2 = text;
                                    if (k0Var3.L != null) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(str2);
                                            JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                            w wVar3 = k0Var3.L;
                                            String optString = jSONObject.optString("area");
                                            if (optJSONObject == null) {
                                                optJSONObject = new JSONObject();
                                            }
                                            wVar3.h(optString, optJSONObject);
                                        } catch (Exception unused2) {
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    k0 k0Var4 = k0Var;
                                    String str3 = text;
                                    if (!k0Var4.f44396u && (wVar2 = k0Var4.J) != null && (r81Var = wVar2.h) != null) {
                                        if (r81Var.F || (r81Var.f29958w && r81Var.E)) {
                                            r81Var.f29940a.f(str3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                try {
                    if (i10 == 18) {
                        JSONObject jSONObject = new JSONObject(text);
                        k0Var.K = new float[]{(float) jSONObject.optDouble("receive"), (float) jSONObject.optDouble("animate"), (float) jSONObject.optDouble("paint"), (float) jSONObject.optDouble("serialize"), 0.0f, 0.0f, (float) jSONObject.optDouble("ticks"), (float) jSONObject.optDouble("framesSent"), (float) jSONObject.optDouble("opsLatency"), (float) jSONObject.optDouble("validate", -1.0d), (float) jSONObject.optDouble("hop", -1.0d)};
                        return;
                    } else if (i10 != 16 && i10 != 17 && i10 != 9) {
                        if (i10 == 6) {
                            k0Var.f44388m.set(false);
                            k0Var.f44379a.post(k0Var.O);
                            return;
                        } else if (i10 == 1) {
                            k0Var.f44389n.set(true);
                            k0Var.f44379a.post(k0Var.S);
                            return;
                        } else if (i10 == 2) {
                            k0Var.f44387l.set(true);
                            k0Var.f44379a.removeCallbacks(k0Var.O);
                            k0Var.f44379a.post(k0Var.O);
                            return;
                        } else if (i10 == 3) {
                            JSONObject jSONObject2 = new JSONObject(text);
                            k0Var.f44379a.post(new ez(k0Var, jSONObject2.optBoolean("x"), jSONObject2.optBoolean("y"), jSONObject2.optBoolean("hold"), 2));
                            return;
                        } else if (i10 == 4) {
                            JSONObject jSONObject3 = new JSONObject(text);
                            if (jSONObject3.optBoolean("loaded")) {
                                k0Var.v = true;
                            }
                            k0Var.f44399y = "bottom".equals(jSONObject3.optString("resizeAnchor"));
                            if (jSONObject3.optBoolean("rendered") && !k0Var.f44397w) {
                                double optDouble = jSONObject3.optDouble("height", -1.0d);
                                double min = Math.min(600.0f, Math.max(50.0f, k0Var.f44393r / k0Var.f44385j));
                                if (k0Var.f44394s && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                                    z10 = true;
                                    k0Var.f44398x = true;
                                } else {
                                    z10 = true;
                                }
                                k0Var.f44397w = z10;
                            }
                            synchronized (k0Var.f44392q) {
                                if (k0Var.f44396u) {
                                    return;
                                }
                                k0Var.H = jSONObject3;
                                if (!k0Var.I) {
                                    k0Var.I = true;
                                    k0Var.f44379a.post(k0Var.N);
                                }
                                return;
                            }
                        } else {
                            boolean z11 = true;
                            if (i10 == 5) {
                                k0Var.f44379a.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        w wVar;
                                        w wVar2;
                                        r81 r81Var;
                                        switch (r3) {
                                            case 0:
                                                k0 k0Var2 = k0Var;
                                                String str = text;
                                                if (!k0Var2.f44396u && (wVar = k0Var2.J) != null) {
                                                    try {
                                                        wVar.f(new JSONObject(str));
                                                    } catch (Exception unused) {
                                                        return;
                                                    }
                                                }
                                                return;
                                            case 1:
                                                k0 k0Var3 = k0Var;
                                                String str2 = text;
                                                if (k0Var3.L != null) {
                                                    try {
                                                        JSONObject jSONObject4 = new JSONObject(str2);
                                                        JSONObject optJSONObject = jSONObject4.optJSONObject("values");
                                                        w wVar3 = k0Var3.L;
                                                        String optString = jSONObject4.optString("area");
                                                        if (optJSONObject == null) {
                                                            optJSONObject = new JSONObject();
                                                        }
                                                        wVar3.h(optString, optJSONObject);
                                                    } catch (Exception unused2) {
                                                        return;
                                                    }
                                                }
                                                return;
                                            default:
                                                k0 k0Var4 = k0Var;
                                                String str3 = text;
                                                if (!k0Var4.f44396u && (wVar2 = k0Var4.J) != null && (r81Var = wVar2.h) != null) {
                                                    if (r81Var.F || (r81Var.f29958w && r81Var.E)) {
                                                        r81Var.f29940a.f(str3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            } else if (i10 == 7) {
                                float parseFloat = Float.parseFloat(text);
                                AtomicBoolean atomicBoolean = k0Var.f44390o;
                                if (parseFloat != 0.0f) {
                                    z11 = false;
                                }
                                atomicBoolean.set(z11);
                                k0Var.f44379a.post(new org.telegram.ui.a0(k0Var, parseFloat, 4));
                                return;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } catch (NumberFormatException | Exception unused) {
                    return;
                }
            }
            k0Var.f44379a.post(new x0(k0Var, i10, text, 7));
        }
    }

    public float textWidth(int i10, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i10));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.f44385j;
    }
}
