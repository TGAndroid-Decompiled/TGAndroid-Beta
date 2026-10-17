package zh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.internal.cast.a6;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.wh;
public final class h {
    public static final float U;
    public static final float V;
    public static Bitmap W;
    public long A;
    public float B;
    public float C;
    public long E;
    public boolean F;
    public boolean G;
    public Bitmap H;
    public BitmapShader J;
    public Bitmap K;
    public float[] N;
    public float[] O;
    public float[] P;
    public float[] Q;
    public int[] R;
    public int[] S;
    public short[] T;
    public int f52009l;
    public g f52010m;
    public g f52011n;
    public long f52013p;
    public boolean[] f52016s;
    public PorterDuffColorFilter f52022z;
    public final float[] f52001a = new float[2400];
    public final float[] f52002b = new float[2400];
    public final float[] f52003c = new float[2400];
    public final float[] d = new float[2400];
    public final float[] e = new float[2400];
    public final float[] f52004f = new float[2400];
    public final float[] f52005g = new float[2400];
    public final float[] h = new float[2400];
    public final float[] f52006i = new float[2400];
    public final float[] f52007j = new float[2400];
    public final byte[] f52008k = new byte[2400];
    public float f52012o = 1.0f;
    public int f52014q = 0;
    public final RectF f52015r = new RectF();
    public final Paint f52017t = new Paint(3);
    public final Paint f52018u = new Paint(1);
    public final Rect v = new Rect();
    public final RectF f52019w = new RectF();
    public final Random f52020x = new Random();
    public int f52021y = -16777216;
    public float D = -1.0f;
    public final Paint I = new Paint(3);
    public final Paint L = new Paint(3);
    public final Paint M = new Paint(3);

    static {
        float f7;
        float f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            f7 = 0.5f;
            if (i11 > 1000) {
                break;
            }
            float f11 = i11 / 1000.0f;
            if (m(f11 * 0.467f) >= 0.5f) {
                f7 = f11;
                break;
            }
            i11++;
        }
        while (true) {
            f10 = 0.8f;
            if (i10 > 1000) {
                break;
            }
            float f12 = i10 / 1000.0f;
            if (m(f12 * 0.467f) >= 0.8f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        U = f7;
        V = f10;
    }

    public static g a(int i10, String str) {
        try {
            HashMap hashMap = new HashMap();
            dc.b bVar = dc.b.f7923a;
            ic.c cVar = ic.c.M;
            hashMap.put(bVar, cVar);
            hashMap.put(dc.b.f7925c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            ?? obj = new Object();
            obj.f51988a = telegramQRCodeWriter.encode(str, i10, i10, hashMap, null, 0.75f, 0, -16777216);
            obj.f51989b = ((kc.b) kc.c.b(str, cVar, hashMap).f8099f).f15005b;
            float f7 = 16;
            int i11 = obj.f51989b;
            obj.f51990c = (obj.f51988a.getWidth() - (2.0f * f7)) / i11;
            int i12 = i11 * i11;
            obj.d = new boolean[i12];
            obj.e = new float[i12];
            Random random = new Random(str.hashCode());
            for (int i13 = 0; i13 < obj.f51989b; i13++) {
                for (int i14 = 0; i14 < obj.f51989b; i14++) {
                    float f10 = i14 + 0.5f;
                    float f11 = obj.f51990c;
                    int i15 = (int) ((f10 * f11) + f7);
                    int b10 = (int) wh.b(i13, 0.5f, f11, f7);
                    boolean z10 = false;
                    for (int i16 = -1; i16 <= 1 && !z10; i16++) {
                        if (Color.alpha(obj.f51988a.getPixel(Math.max(0, Math.min(obj.f51988a.getWidth() - 1, ((int) (i16 * obj.f51990c * 0.3f)) + i15)), b10)) > 40) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    boolean[] zArr = obj.d;
                    int i17 = (obj.f51989b * i13) + i14;
                    zArr[i17] = z10;
                    obj.e[i17] = random.nextFloat();
                }
            }
            obj.h = telegramQRCodeWriter.getImageSize();
            int round = Math.round(telegramQRCodeWriter.getImageSize() / obj.f51990c) + 2;
            int i18 = (obj.f51989b - round) / 2;
            obj.f51991f = i18;
            obj.f51992g = i18 + round;
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int b(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 255.0f)));
    }

    public static float f(g gVar, float f7) {
        float f10 = 1.0f - f7;
        float f11 = f10 * f10;
        return wh.b(gVar.f51989b, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * f11), -1.5f);
    }

    public static boolean g(g gVar, int i10, int i11) {
        if (i10 >= 7 || i11 >= 7) {
            int i12 = gVar.f51989b;
            if (i10 < i12 - 7 || i11 >= 7) {
                if (i10 < 7 && i11 >= i12 - 7) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static float h(float f7) {
        if (f7 <= 0.0031308f) {
            return f7 * 12.92f;
        }
        return (((float) Math.pow(f7, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int i(float f7, int i10, int i11) {
        if (f7 <= 0.0f) {
            return i10;
        }
        if (f7 >= 1.0f) {
            return i11;
        }
        float n10 = n(Color.red(i10) / 255.0f);
        float n11 = n(Color.green(i10) / 255.0f);
        float n12 = n(Color.blue(i10) / 255.0f);
        float n13 = n(Color.red(i11) / 255.0f);
        float n14 = n(Color.green(i11) / 255.0f);
        float n15 = n(Color.blue(i11) / 255.0f);
        float f10 = n12 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f10 + (n11 * 0.53633255f) + (n10 * 0.41222146f));
        float f11 = n12 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f11 + (n11 * 0.6806995f) + (n10 * 0.2119035f));
        float f12 = n12 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f12 + (n11 * 0.28171885f) + (n10 * 0.08830246f));
        float f13 = 0.051445995f * n15;
        float f14 = 0.6806995f * n14;
        float f15 = 0.10739696f * n15;
        float f16 = n15 * 0.6299787f;
        float x10 = a6.x((float) Math.cbrt(f13 + (0.53633255f * n14) + (0.41222146f * n13)), cbrt, f7, cbrt);
        float x11 = a6.x((float) Math.cbrt(f15 + f14 + (0.2119035f * n13)), cbrt2, f7, cbrt2);
        float x12 = a6.x((float) Math.cbrt(f16 + (n14 * 0.28171885f) + (n13 * 0.08830246f)), cbrt3, f7, cbrt3);
        float f17 = x10 * x10 * x10;
        float f18 = x11 * x11 * x11;
        float f19 = x12 * x12 * x12;
        float f20 = (0.23096994f * f19) + ((4.0767417f * f17) - (3.3077116f * f18));
        float f21 = ((2.6097574f * f18) + ((-1.268438f) * f17)) - (0.34131938f * f19);
        float f22 = (f19 * 1.7076147f) + ((f17 * (-0.0041960864f)) - (f18 * 0.7034186f));
        return Color.argb((int) (((Color.alpha(i11) - Color.alpha(i10)) * f7) + Color.alpha(i10)), b(h(f20)), b(h(f21)), b(h(f22)));
    }

    public static float j(float f7) {
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 < 0.6f) {
            float f10 = 1.0f - (f7 / 0.6f);
            return (1.0f - ((f10 * f10) * f10)) * 1.08f;
        }
        float f11 = (f7 - 0.6f) / 0.4f;
        return 1.08f - ((3.0f - (f11 * 2.0f)) * ((0.08f * f11) * f11));
    }

    public static void k(g gVar) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        if (gVar.f51994j == null) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= gVar.f51989b) {
                    break;
                }
                for (int i15 = 0; i15 < gVar.f51989b; i15++) {
                    int i16 = gVar.f51991f;
                    if (i15 < i16 || i15 >= (i12 = gVar.f51992g) || i13 < i16 || i13 >= i12) {
                        i14++;
                    }
                }
                i13++;
            }
            gVar.f51993i = i14;
            gVar.f51994j = new float[i14];
            gVar.f51995k = new float[i14];
            gVar.f51996l = new float[i14];
            gVar.f51997m = new boolean[i14];
            gVar.f51998n = new int[i14 * 4];
            float f13 = 1.4142f * ((i10 - 1) / 2.0f);
            int i17 = 0;
            for (int i18 = 0; i18 < gVar.f51989b; i18++) {
                int i19 = 0;
                while (true) {
                    int i20 = gVar.f51989b;
                    if (i19 < i20) {
                        int i21 = gVar.f51991f;
                        if (i19 < i21 || i19 >= (i11 = gVar.f51992g) || i18 < i21 || i18 >= i11) {
                            int i22 = (i20 * i18) + i19;
                            float f14 = gVar.e[i22] * 3.17f;
                            float floor = f14 - ((float) Math.floor(f14));
                            boolean g10 = g(gVar, i19, i18);
                            float[] fArr = gVar.f51994j;
                            float f15 = 16;
                            float f16 = gVar.f51990c;
                            fArr[i17] = ((i19 + 0.5f) * f16) + f15;
                            gVar.f51995k[i17] = wh.b(i18, 0.5f, f16, f15);
                            float[] fArr2 = gVar.f51996l;
                            float hypot = (((float) Math.hypot(f10 - f7, f11 - f7)) / f13) * 0.5f;
                            if (g10) {
                                f12 = hypot * 0.85f;
                            } else {
                                f12 = hypot + (floor * 0.06f);
                            }
                            fArr2[i17] = f12;
                            gVar.f51997m[i17] = gVar.d[i22];
                            int[] iArr = gVar.f51998n;
                            int i23 = i17 * 4;
                            iArr[i23] = i19;
                            iArr[i23 + 1] = i18;
                            i17++;
                        }
                        i19++;
                    }
                }
            }
        }
    }

    public static void l(float[] fArr, float[] fArr2, int[] iArr, int i10, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i11) {
        int i12 = i10 * 8;
        fArr[i12] = f7;
        int i13 = i12 + 1;
        fArr[i13] = f10;
        int i14 = i12 + 2;
        fArr[i14] = f11;
        int i15 = i12 + 3;
        fArr[i15] = f10;
        int i16 = i12 + 4;
        fArr[i16] = f11;
        int i17 = i12 + 5;
        fArr[i17] = f12;
        int i18 = i12 + 6;
        fArr[i18] = f7;
        int i19 = i12 + 7;
        fArr[i19] = f12;
        fArr2[i12] = f13;
        fArr2[i13] = f14;
        fArr2[i14] = f15;
        fArr2[i15] = f14;
        fArr2[i16] = f15;
        fArr2[i17] = f16;
        fArr2[i18] = f13;
        fArr2[i19] = f16;
        int i20 = i10 * 4;
        iArr[i20] = i11;
        iArr[i20 + 1] = i11;
        iArr[i20 + 2] = i11;
        iArr[i20 + 3] = i11;
    }

    public static float m(float f7) {
        double d = f7;
        double exp = Math.exp((-9.120752865260691d) * d);
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * exp)) * 1.02d);
    }

    public static float n(float f7) {
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void c(android.graphics.Canvas r84, float r85, float r86, float r87) {
        throw new UnsupportedOperationException("Method not decompiled: zh.h.c(android.graphics.Canvas, float, float, float):void");
    }

    public final void d(Canvas canvas, g gVar, float f7, float f10, float f11, float f12) {
        float f13;
        float f14;
        int i10;
        int i11;
        RectF rectF;
        float j10;
        int i12;
        boolean z10;
        float f15;
        Paint paint;
        float f16;
        float f17;
        float f18;
        float x10;
        float f19;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        float f20 = f12;
        int i16 = this.f52014q;
        Paint paint2 = this.f52017t;
        RectF rectF2 = this.f52019w;
        float f21 = 2.0f;
        float f22 = 0.05f;
        if (i16 == 2) {
            k(gVar);
            int i17 = gVar.f51993i;
            int i18 = gVar.f51989b;
            e((i18 * i18) + i17);
            BitmapShader bitmapShader = this.J;
            Paint paint3 = this.L;
            float f23 = 0.7f;
            if (bitmapShader == null) {
                if (W == null) {
                    W = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(W);
                    Paint paint4 = new Paint(1);
                    paint4.setColor(-1);
                    RectF rectF3 = new RectF();
                    z10 = true;
                    f15 = 1.0f;
                    for (int i19 = 0; i19 < 8; i19++) {
                        rectF3.set((i19 * 48) + 1.5f, 1.5f, (i15 + 48) - 1.5f, 46.5f);
                        float f24 = (1.0f - ((i19 * 0.7f) / 7.0f)) * 22.5f;
                        canvas2.drawRoundRect(rectF3, f24, f24, paint4);
                    }
                } else {
                    z10 = true;
                    f15 = 1.0f;
                }
                Bitmap bitmap = W;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap, tileMode, tileMode);
                this.J = bitmapShader2;
                paint3.setShader(bitmapShader2);
            } else {
                z10 = true;
                f15 = 1.0f;
            }
            Bitmap bitmap2 = this.K;
            Bitmap bitmap3 = gVar.f51988a;
            Paint paint5 = this.M;
            if (bitmap2 != bitmap3) {
                Bitmap bitmap4 = gVar.f51988a;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                paint5.setShader(new BitmapShader(bitmap4, tileMode2, tileMode2));
                this.K = gVar.f51988a;
            }
            paint3.setColorFilter(this.f52022z);
            paint5.setColorFilter(this.f52022z);
            float width = f11 / gVar.f51988a.getWidth();
            float min = Math.min(f15, Math.max(0.0f, f20) / 0.1f);
            float f25 = gVar.f51990c * 0.5f;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            boolean z11 = z10;
            while (i20 < gVar.f51993i) {
                float f26 = (f20 - gVar.f51996l[i20]) / 0.434f;
                if (f26 < 0.0f) {
                    f26 = 0.0f;
                } else if (f26 > 1.0f) {
                    f26 = 1.0f;
                }
                float f27 = width;
                if (f26 < 0.5f) {
                    f17 = a6.C(f26, 4.0f, f26, f26);
                } else {
                    float f28 = (f26 * (-2.0f)) + 2.0f;
                    f17 = 1.0f - (((f28 * f28) * f28) * 0.5f);
                }
                float f29 = (gVar.f51994j[i20] * f27) + f7;
                float f30 = (gVar.f51995k[i20] * f27) + f10;
                if (gVar.f51997m[i20]) {
                    if (f17 > 0.75f) {
                        f19 = 4.0f * (f17 - 0.75f);
                    } else {
                        f19 = 0.0f;
                    }
                    if (f19 < 1.0f) {
                        float A = a6.A(f17, 0.8f, 0.2f, f25 * f27);
                        int min2 = Math.min(7, (int) ((f17 * 7.0f) + 0.5f));
                        float f31 = (1.0f - f19) * min;
                        if (f31 > 0.004f) {
                            l(this.N, this.O, this.R, i22, f29 - A, f30 - A, f29 + A, f30 + A, min2 * 48, 0.0f, i14 + 48, 48.0f, (((int) (f31 * 255.0f)) << 24) | 16777215);
                            z11 = false;
                            i22++;
                        } else {
                            z11 = false;
                        }
                    }
                    if (f19 > 0.0f) {
                        float f32 = 16;
                        float f33 = gVar.f51998n[i20 * 4];
                        float f34 = gVar.f51990c;
                        float f35 = (f33 * f34) + f32;
                        float f36 = (iArr[i13 + 1] * f34) + f32;
                        float f37 = f35 + f34;
                        float f38 = f36 + f34;
                        l(this.P, this.Q, this.S, i21, (f35 * f27) + f7, (f36 * f27) + f10, (f37 * f27) + f7, (f38 * f27) + f10, f35, f36, f37, f38, (((int) (min * 255.0f)) << 24) | 16777215);
                        i21++;
                    }
                    f18 = f25;
                } else {
                    if (f17 < 1.0f) {
                        z11 = false;
                    }
                    float f39 = 0.2f * (1.0f - f17);
                    if (f17 < f23) {
                        x10 = 1.0f;
                        f18 = f25;
                    } else {
                        f18 = f25;
                        x10 = org.telegram.messenger.q.x(f17, f23, 0.3f, 1.0f);
                    }
                    float f40 = 0.9f * min * x10;
                    if (f39 > 0.01f && f40 > 0.004f) {
                        float f41 = f18 * f27 * f39;
                        l(this.N, this.O, this.R, i22, f29 - f41, f30 - f41, f29 + f41, f30 + f41, 0.0f, 0.0f, 48.0f, 48.0f, (((int) (f40 * 255.0f)) << 24) | 16777215);
                        i22++;
                    }
                }
                i20++;
                f20 = f12;
                f25 = f18;
                width = f27;
                f23 = 0.7f;
            }
            float f42 = width;
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f12 - 0.05f) / 0.45f));
            float z12 = org.telegram.ui.Cells.t0.z(max, max, max, 1.0f);
            if (z12 > 0.0f) {
                int i23 = gVar.f51991f;
                while (i23 < gVar.f51992g) {
                    int i24 = gVar.f51991f;
                    int i25 = i21;
                    while (i24 < gVar.f51992g) {
                        if (!gVar.d[(gVar.f51989b * i23) + i24]) {
                            f16 = z12;
                        } else {
                            float f43 = 16;
                            float f44 = gVar.f51990c;
                            float f45 = (i24 * f44) + f43;
                            float f46 = (i23 * f44) + f43;
                            f16 = z12;
                            float f47 = f45 + f44;
                            float f48 = f46 + f44;
                            l(this.P, this.Q, this.S, i25, (f45 * f42) + f7, (f46 * f42) + f10, (f47 * f42) + f7, (f48 * f42) + f10, f45, f46, f47, f48, (((int) ((min * 255.0f) * f16)) << 24) | 16777215);
                            i25++;
                        }
                        i24++;
                        z12 = f16;
                    }
                    i23++;
                    i21 = i25;
                }
            }
            if (z11 && min >= 1.0f) {
                rectF2.set(f7, f10, f7 + f11, f10 + f11);
                canvas.drawBitmap(gVar.f51988a, (Rect) null, rectF2, paint2);
                return;
            }
            if (i21 > 0) {
                paint = paint3;
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i21 * 8, this.P, 0, this.Q, 0, this.S, 0, this.T, 0, i21 * 6, paint5);
            } else {
                paint = paint3;
            }
            if (i22 > 0) {
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i22 * 8, this.N, 0, this.O, 0, this.R, 0, this.T, 0, i22 * 6, paint);
                return;
            }
            return;
        }
        int i26 = 1;
        float width2 = f11 / gVar.f51988a.getWidth();
        float f49 = (gVar.f51989b - 1) / 2.0f;
        float f50 = 1.4142f * f49;
        int i27 = 0;
        while (i27 < gVar.f51989b) {
            int i28 = 0;
            while (true) {
                int i29 = gVar.f51989b;
                if (i28 < i29) {
                    int i30 = (i29 * i27) + i28;
                    if (!gVar.d[i30] || g(gVar, i28, i27)) {
                        f13 = f49;
                        f14 = f50;
                        i10 = i27;
                        i11 = i28;
                        rectF = rectF2;
                    } else {
                        float f51 = i28;
                        float f52 = i27;
                        f13 = f49;
                        RectF rectF4 = rectF2;
                        float d = (f12 - ((gVar.e[i30] * 0.06f) + a1.g.d((float) Math.hypot(f51 - f49, f52 - f13), f50, 0.52f, f22))) / 0.367f;
                        if (d > 0.0f) {
                            float f53 = 1.0f;
                            if (d < 1.0f) {
                                float f54 = 1.0f - d;
                                f53 = org.telegram.ui.Cells.t0.z(f54, f54, f54, 1.0f);
                            }
                            if (this.f52014q == 2) {
                                j10 = (0.6f * f53) + 0.4f;
                            } else {
                                j10 = j(d);
                            }
                            if (this.f52014q != 2) {
                                f53 = Math.min(1.0f, d * 6.0f);
                            }
                            int i31 = gVar.f51991f;
                            if (i28 < i31 || i28 >= (i12 = gVar.f51992g) || i27 < i31 || i27 >= i12) {
                                float f55 = 16;
                                float f56 = gVar.f51990c;
                                int i32 = (int) ((f51 * f56) + f55);
                                int i33 = (int) ((f52 * f56) + f55);
                                f14 = f50;
                                int ceil = (int) Math.ceil(((i28 + 1) * f56) + f55);
                                float f57 = (gVar.f51990c * (i27 + 1)) + f55;
                                i10 = i27;
                                i11 = i28;
                                int ceil2 = (int) Math.ceil(f57);
                                Rect rect = this.v;
                                rect.set(i32, i33, ceil, ceil2);
                                float f58 = f21;
                                float d10 = a1.g.d(i32 + ceil, f58, width2, f7);
                                float d11 = a1.g.d(i33 + ceil2, f58, width2, f10);
                                float f59 = ((ceil - i32) / f58) * width2 * j10;
                                float f60 = ((ceil2 - i33) / f58) * width2 * j10;
                                float f61 = d11 + f60;
                                rectF = rectF4;
                                rectF.set(d10 - f59, d11 - f60, d10 + f59, f61);
                                paint2.setAlpha((int) (f53 * 255.0f));
                                g gVar2 = this.f52011n;
                                canvas.drawBitmap(gVar.f51988a, rect, rectF, paint2);
                                paint2.setAlpha(255);
                            }
                        }
                        f14 = f50;
                        i10 = i27;
                        i11 = i28;
                        rectF = rectF4;
                    }
                    i28 = i11 + 1;
                    rectF2 = rectF;
                    i27 = i10;
                    f50 = f14;
                    f49 = f13;
                    f21 = 2.0f;
                    f22 = 0.05f;
                }
            }
            i27++;
            f21 = 2.0f;
            f22 = 0.05f;
        }
        RectF rectF5 = rectF2;
        float width3 = f11 / gVar.f51988a.getWidth();
        int i34 = 0;
        while (i34 < 3) {
            int i35 = i34 == i26 ? gVar.f51989b - 7 : 0;
            int i36 = i34 == 2 ? gVar.f51989b - 7 : 0;
            float f62 = f12 / 0.32f;
            if (f62 > 0.0f) {
                float f63 = 16;
                float f64 = gVar.f51990c;
                float f65 = (((i35 * f64) + f63) * width3) + f7;
                float f66 = (((i36 * f64) + f63) * width3) + f10;
                float f67 = ((((i35 + 7) * f64) + f63) * width3) + f7;
                float f68 = ((((i36 + 7) * f64) + f63) * width3) + f10;
                float j11 = j(f62);
                canvas.save();
                canvas.scale(j11, j11, (f65 + f67) / 2.0f, (f66 + f68) / 2.0f);
                canvas.clipRect(f65 - 1.0f, f66 - 1.0f, f67 + 1.0f, f68 + 1.0f);
                rectF5.set(f7, f10, f7 + f11, f10 + f11);
                paint2.setAlpha(255);
                canvas.drawBitmap(gVar.f51988a, (Rect) null, rectF5, paint2);
                canvas.restore();
            }
            i34++;
            i26 = 1;
        }
        paint2.setAlpha(255);
    }

    public final void e(int i10) {
        float[] fArr = this.N;
        if (fArr == null || fArr.length < i10 * 8) {
            int i11 = i10 * 8;
            this.N = new float[i11];
            this.O = new float[i11];
            int i12 = i10 * 4;
            this.R = new int[i12];
            this.P = new float[i11];
            this.Q = new float[i11];
            this.S = new int[i12];
            this.T = new short[i10 * 6];
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 4;
                short[] sArr = this.T;
                int i15 = i13 * 6;
                short s10 = (short) i14;
                sArr[i15] = s10;
                sArr[i15 + 1] = (short) (i14 + 1);
                short s11 = (short) (i14 + 2);
                sArr[i15 + 2] = s11;
                sArr[i15 + 3] = s10;
                sArr[i15 + 4] = s11;
                sArr[i15 + 5] = (short) (i14 + 3);
            }
        }
    }
}
