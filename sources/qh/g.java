package qh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.i00;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.ui.Cells.f1;
public final class g {
    public static final float S;
    public static final float T;
    public static Bitmap U;
    public long A;
    public float B;
    public float C;
    public long E;
    public boolean F;
    public boolean G;
    public Bitmap H;
    public Bitmap J;
    public float[] L;
    public float[] M;
    public float[] N;
    public float[] O;
    public int[] P;
    public int[] Q;
    public short[] R;
    public int f45625l;
    public f f45626m;
    public f f45627n;
    public long f45629p;
    public boolean[] f45632s;
    public PorterDuffColorFilter f45638z;
    public final float[] f45617a = new float[2400];
    public final float[] f45618b = new float[2400];
    public final float[] f45619c = new float[2400];
    public final float[] d = new float[2400];
    public final float[] e = new float[2400];
    public final float[] f45620f = new float[2400];
    public final float[] f45621g = new float[2400];
    public final float[] h = new float[2400];
    public final float[] f45622i = new float[2400];
    public final float[] f45623j = new float[2400];
    public final byte[] f45624k = new byte[2400];
    public float f45628o = 1.0f;
    public int f45630q = 0;
    public final RectF f45631r = new RectF();
    public final Paint f45633t = new Paint(3);
    public final Paint f45634u = new Paint(1);
    public final Rect v = new Rect();
    public final RectF f45635w = new RectF();
    public final Random f45636x = new Random();
    public int f45637y = -16777216;
    public float D = -1.0f;
    public final Paint I = new Paint(3);
    public final Paint K = new Paint(3);

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
            if (p(f11 * 0.467f) >= 0.5f) {
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
            if (p(f12 * 0.467f) >= 0.8f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        S = f7;
        T = f10;
    }

    public static synchronized Bitmap b() {
        Bitmap bitmap;
        synchronized (g.class) {
            try {
                if (U == null) {
                    U = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(U);
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    RectF rectF = new RectF();
                    for (int i10 = 0; i10 < 8; i10++) {
                        int i11 = i10 * 48;
                        rectF.set(i11 + 1.5f, 1.5f, (i11 + 48) - 1.5f, 46.5f);
                        float f7 = (1.0f - ((i10 * 0.7f) / 7.0f)) * 22.5f;
                        canvas.drawRoundRect(rectF, f7, f7, paint);
                    }
                }
                bitmap = U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static f c(String str, int i10, ac.d dVar, float f7, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(vb.b.f50748a, dVar);
            hashMap.put(vb.b.f50750c, 0);
            i00 i00Var = new i00();
            if (colorDrawable != null) {
                i00Var.f16039g = colorDrawable;
            }
            f fVar = new f();
            Bitmap a2 = i00Var.a(str, i10, i10, hashMap, null, f7, 0, -1);
            fVar.f45602b = a2.getWidth();
            int i11 = ((b4.d) cc.b.b(str, dVar, hashMap).f4118f).f2458b;
            fVar.e = i11;
            fVar.f45604f = (fVar.f45602b - (fVar.f45605g * 2.0f)) / i11;
            int i12 = i11 * i11;
            fVar.h = new boolean[i12];
            fVar.f45606i = new float[i12];
            Random random = new Random(str.hashCode());
            for (int i13 = 0; i13 < fVar.e; i13++) {
                for (int i14 = 0; i14 < fVar.e; i14++) {
                    float f10 = fVar.f45605g;
                    float f11 = i14 + 0.5f;
                    float f12 = fVar.f45604f;
                    int i15 = (int) ((f11 * f12) + f10);
                    int b10 = (int) z20.b(i13, 0.5f, f12, f10);
                    boolean z10 = false;
                    for (int i16 = -1; i16 <= 1 && !z10; i16++) {
                        if (Color.alpha(a2.getPixel(Math.max(0, Math.min(fVar.f45602b - 1, ((int) (i16 * fVar.f45604f * 0.3f)) + i15)), b10)) > 40) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    boolean[] zArr = fVar.h;
                    int i17 = (fVar.e * i13) + i14;
                    zArr[i17] = z10;
                    fVar.f45606i[i17] = random.nextFloat();
                }
            }
            Bitmap b11 = b();
            int i18 = fVar.f45602b;
            fVar.d = i18 + 2;
            fVar.f45601a = Bitmap.createBitmap(Math.max(i18, b11.getWidth()), fVar.d + b11.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(fVar.f45601a);
            canvas.drawBitmap(a2, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b11, 0.0f, fVar.d, (Paint) null);
            a2.recycle();
            fVar.f45601a.prepareToDraw();
            Rect rect = fVar.f45603c;
            int i19 = fVar.f45602b;
            rect.set(0, 0, i19, i19);
            int i20 = i00Var.f16038f;
            fVar.f45609l = i20;
            int round = Math.round(i20 / fVar.f45604f) + 2;
            int i21 = (fVar.e - round) / 2;
            fVar.f45607j = i21;
            fVar.f45608k = i21 + round;
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 255.0f)));
    }

    public static float h(f fVar, float f7) {
        float f10 = 1.0f - f7;
        float f11 = f10 * f10;
        return z20.b(fVar.e, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * f11), -1.5f);
    }

    public static boolean i(f fVar, int i10, int i11) {
        if (i10 >= 7 || i11 >= 7) {
            int i12 = fVar.e;
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

    public static float j(float f7) {
        if (f7 <= 0.0031308f) {
            return f7 * 12.92f;
        }
        return (((float) Math.pow(f7, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f7, int i10, int i11) {
        if (f7 <= 0.0f) {
            return i10;
        }
        if (f7 >= 1.0f) {
            return i11;
        }
        float q6 = q(Color.red(i10) / 255.0f);
        float q10 = q(Color.green(i10) / 255.0f);
        float q11 = q(Color.blue(i10) / 255.0f);
        float q12 = q(Color.red(i11) / 255.0f);
        float q13 = q(Color.green(i11) / 255.0f);
        float q14 = q(Color.blue(i11) / 255.0f);
        float f10 = q11 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f10 + (q10 * 0.53633255f) + (q6 * 0.41222146f));
        float f11 = q11 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f11 + (q10 * 0.6806995f) + (q6 * 0.2119035f));
        float f12 = q11 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f12 + (q10 * 0.28171885f) + (q6 * 0.08830246f));
        float f13 = 0.051445995f * q14;
        float f14 = 0.6806995f * q13;
        float f15 = 0.10739696f * q14;
        float f16 = q14 * 0.6299787f;
        float z10 = c3.i0.z((float) Math.cbrt(f13 + (0.53633255f * q13) + (0.41222146f * q12)), cbrt, f7, cbrt);
        float z11 = c3.i0.z((float) Math.cbrt(f15 + f14 + (0.2119035f * q12)), cbrt2, f7, cbrt2);
        float z12 = c3.i0.z((float) Math.cbrt(f16 + (q13 * 0.28171885f) + (q12 * 0.08830246f)), cbrt3, f7, cbrt3);
        float f17 = z10 * z10 * z10;
        float f18 = z11 * z11 * z11;
        float f19 = z12 * z12 * z12;
        float f20 = (0.23096994f * f19) + ((4.0767417f * f17) - (3.3077116f * f18));
        float f21 = ((2.6097574f * f18) + ((-1.268438f) * f17)) - (0.34131938f * f19);
        float f22 = (f19 * 1.7076147f) + ((f17 * (-0.0041960864f)) - (f18 * 0.7034186f));
        return Color.argb((int) (((Color.alpha(i11) - Color.alpha(i10)) * f7) + Color.alpha(i10)), d(j(f20)), d(j(f21)), d(j(f22)));
    }

    public static float l(float f7) {
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

    public static void m(f fVar) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        if (fVar.f45611n == null) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= fVar.e) {
                    break;
                }
                for (int i15 = 0; i15 < fVar.e; i15++) {
                    int i16 = fVar.f45607j;
                    if (i15 < i16 || i15 >= (i12 = fVar.f45608k) || i13 < i16 || i13 >= i12) {
                        i14++;
                    }
                }
                i13++;
            }
            fVar.f45610m = i14;
            fVar.f45611n = new float[i14];
            fVar.f45612o = new float[i14];
            fVar.f45613p = new float[i14];
            fVar.f45614q = new boolean[i14];
            fVar.f45615r = new int[i14 * 4];
            float f13 = 1.4142f * ((i10 - 1) / 2.0f);
            int i17 = 0;
            for (int i18 = 0; i18 < fVar.e; i18++) {
                int i19 = 0;
                while (true) {
                    int i20 = fVar.e;
                    if (i19 < i20) {
                        int i21 = fVar.f45607j;
                        if (i19 < i21 || i19 >= (i11 = fVar.f45608k) || i18 < i21 || i18 >= i11) {
                            int i22 = (i20 * i18) + i19;
                            float f14 = fVar.f45606i[i22] * 3.17f;
                            float floor = f14 - ((float) Math.floor(f14));
                            boolean i23 = i(fVar, i19, i18);
                            float[] fArr = fVar.f45611n;
                            float f15 = fVar.f45605g;
                            float f16 = fVar.f45604f;
                            fArr[i17] = ((i19 + 0.5f) * f16) + f15;
                            fVar.f45612o[i17] = z20.b(i18, 0.5f, f16, f15);
                            float[] fArr2 = fVar.f45613p;
                            float hypot = (((float) Math.hypot(f10 - f7, f11 - f7)) / f13) * 0.5f;
                            if (i23) {
                                f12 = hypot * 0.85f;
                            } else {
                                f12 = hypot + (floor * 0.06f);
                            }
                            fArr2[i17] = f12;
                            fVar.f45614q[i17] = fVar.h[i22];
                            int[] iArr = fVar.f45615r;
                            int i24 = i17 * 4;
                            iArr[i24] = i19;
                            iArr[i24 + 1] = i18;
                            i17++;
                        }
                        i19++;
                    }
                }
            }
        }
    }

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i10, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i11) {
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

    public static float p(float f7) {
        double d = f7;
        double exp = Math.exp((-9.120752865260691d) * d);
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * exp)) * 1.02d);
    }

    public static float q(float f7) {
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void a(f fVar) {
        this.f45626m = fVar;
        this.f45627n = null;
        this.f45630q = 2;
        this.f45628o = 0.0f;
        this.f45629p = 0L;
        this.E = 0L;
        this.F = false;
    }

    public final void e(android.graphics.Canvas r90, float r91, float r92, float r93) {
        throw new UnsupportedOperationException("Method not decompiled: qh.g.e(android.graphics.Canvas, float, float, float):void");
    }

    public final void f(Canvas canvas, f fVar, float f7, float f10, float f11, float f12) {
        int i10;
        int i11;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float x10;
        float l4;
        int i12;
        float f18;
        float f19;
        Paint paint;
        boolean z10;
        float f20;
        float y3;
        int i13;
        float f21;
        int i14;
        int i15;
        float f22 = f7;
        float f23 = f10;
        float f24 = f12;
        int i16 = this.f45630q;
        Paint paint2 = this.f45633t;
        RectF rectF = this.f45635w;
        int i17 = 1;
        if (i16 == 2) {
            m(fVar);
            int i18 = fVar.f45605g;
            int i19 = fVar.e;
            g((i19 * i19) + (fVar.f45610m * 2));
            Bitmap bitmap = this.J;
            Bitmap bitmap2 = fVar.f45601a;
            Paint paint3 = this.K;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = fVar.f45601a;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                this.J = fVar.f45601a;
            }
            float f25 = f11 / fVar.f45602b;
            float min = Math.min(1.0f, Math.max(0.0f, f24) / 0.1f);
            float f26 = fVar.f45604f * 0.5f;
            float f27 = 1.0f;
            boolean z11 = true;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < fVar.f45610m) {
                float f28 = (f24 - fVar.f45613p[i20]) / 0.434f;
                if (f28 < 0.0f) {
                    f28 = 0.0f;
                } else if (f28 > f27) {
                    f28 = f27;
                }
                if (f28 < 0.5f) {
                    f19 = c3.i0.E(f28, 4.0f, f28, f28);
                } else {
                    float f29 = (f28 * (-2.0f)) + 2.0f;
                    f19 = f27 - (((f29 * f29) * f29) * 0.5f);
                }
                float f30 = (fVar.f45611n[i20] * f25) + f22;
                float f31 = (fVar.f45612o[i20] * f25) + f23;
                if (fVar.f45614q[i20]) {
                    if (f19 > 0.75f) {
                        f21 = 4.0f * (f19 - 0.75f);
                    } else {
                        f21 = 0.0f;
                    }
                    paint = paint3;
                    if (f21 < f27) {
                        float C = c3.i0.C(f19, 0.8f, 0.2f, f26 * f25);
                        int min2 = Math.min(7, (int) ((f19 * 7.0f) + 0.5f));
                        float f32 = (f27 - f21) * min;
                        if (f32 > 0.004f) {
                            n(this.L, this.M, this.P, i21, f30 - C, f31 - C, f30 + C, f31 + C, min2 * 48, fVar.d, i14 + 48, i15 + 48, (((int) (f32 * 255.0f)) << 24) | o());
                            i21++;
                        }
                        z11 = false;
                    }
                    if (f21 > 0.0f) {
                        int i23 = i20 * 4;
                        float f33 = i18;
                        int[] iArr = fVar.f45615r;
                        float f34 = fVar.f45604f;
                        float f35 = (iArr[i23] * f34) + f33;
                        float f36 = (iArr[i23 + 1] * f34) + f33;
                        float f37 = f35 + f34;
                        float f38 = f36 + f34;
                        n(this.N, this.O, this.Q, i22, (f35 * f25) + f22, (f36 * f25) + f23, (f37 * f25) + f22, (f38 * f25) + f23, f35, f36, f37, f38, (((int) (min * 255.0f)) << 24) | o());
                        i22++;
                    }
                } else {
                    paint = paint3;
                    if (f19 < f27) {
                        z10 = false;
                    } else {
                        z10 = z11;
                    }
                    float f39 = (f27 - f19) * 0.2f;
                    boolean z12 = z10;
                    if (f19 < 0.7f) {
                        f20 = f39;
                        y3 = f27;
                    } else {
                        f20 = f39;
                        y3 = m5.y(f19, 0.7f, 0.3f, f27);
                    }
                    float f40 = 0.9f * min * y3;
                    if (f20 > 0.01f && f40 > 0.004f) {
                        float f41 = f26 * f25 * f20;
                        n(this.L, this.M, this.P, i21, f30 - f41, f31 - f41, f30 + f41, f31 + f41, 0.0f, fVar.d, 48.0f, i13 + 48, (((int) (f40 * 255.0f)) << 24) | o());
                        z11 = z12;
                        i21++;
                    } else {
                        z11 = z12;
                    }
                }
                i20++;
                f24 = f12;
                paint3 = paint;
                f27 = 1.0f;
            }
            Paint paint4 = paint3;
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f12 - 0.05f) / 0.45f));
            float x11 = f1.x(max, max, max, 1.0f);
            if (x11 > 0.0f) {
                int i24 = fVar.f45607j;
                while (i24 < fVar.f45608k) {
                    int i25 = fVar.f45607j;
                    int i26 = i22;
                    while (i25 < fVar.f45608k) {
                        if (!fVar.h[(fVar.e * i24) + i25]) {
                            f18 = x11;
                        } else {
                            float f42 = i18;
                            float f43 = fVar.f45604f;
                            float f44 = (i25 * f43) + f42;
                            float f45 = (i24 * f43) + f42;
                            f18 = x11;
                            float f46 = f44 + f43;
                            float f47 = f45 + f43;
                            n(this.N, this.O, this.Q, i26, (f44 * f25) + f22, (f45 * f25) + f23, (f46 * f25) + f22, (f47 * f25) + f23, f44, f45, f46, f47, (((int) ((min * 255.0f) * f18)) << 24) | o());
                            i26++;
                        }
                        i25++;
                        x11 = f18;
                    }
                    i24++;
                    i22 = i26;
                }
            }
            if (z11 && min >= 1.0f) {
                rectF.set(f22, f23, f22 + f11, f23 + f11);
                canvas.drawBitmap(fVar.f45601a, fVar.f45603c, rectF, paint2);
                return;
            }
            if (i21 > 0) {
                int i27 = i22 * 8;
                int i28 = i21 * 8;
                System.arraycopy(this.L, 0, this.N, i27, i28);
                System.arraycopy(this.M, 0, this.O, i27, i28);
                System.arraycopy(this.P, 0, this.Q, i22 * 4, i21 * 4);
            }
            int i29 = i22 + i21;
            if (i29 > 0) {
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i29 * 8, this.N, 0, this.O, 0, this.Q, 0, this.R, 0, i29 * 6, paint4);
                return;
            }
            return;
        }
        int i30 = 0;
        float f48 = 2.0f;
        float f49 = 0.05f;
        int i31 = fVar.f45602b;
        int i32 = fVar.f45605g;
        float f50 = f11 / i31;
        float f51 = (fVar.e - 1) / 2.0f;
        float f52 = 1.4142f * f51;
        int i33 = 0;
        while (i33 < fVar.e) {
            int i34 = i30;
            while (true) {
                int i35 = fVar.e;
                if (i34 < i35) {
                    int i36 = (i35 * i33) + i34;
                    if (!fVar.h[i36] || i(fVar, i34, i33)) {
                        f13 = f50;
                        f14 = f51;
                        f15 = f52;
                        f16 = f23;
                        f17 = f22;
                    } else {
                        float f53 = i34;
                        float f54 = i33;
                        float c10 = (f12 - ((fVar.f45606i[i36] * 0.06f) + a1.g.c((float) Math.hypot(f53 - f51, f54 - f51), f52, 0.52f, f49))) / 0.367f;
                        if (c10 > 0.0f) {
                            if (c10 >= 1.0f) {
                                x10 = 1.0f;
                            } else {
                                float f55 = 1.0f - c10;
                                x10 = f1.x(f55, f55, f55, 1.0f);
                            }
                            if (this.f45630q == 2) {
                                l4 = (0.6f * x10) + 0.4f;
                            } else {
                                l4 = l(c10);
                            }
                            if (this.f45630q != 2) {
                                x10 = Math.min(1.0f, c10 * 6.0f);
                            }
                            int i37 = fVar.f45607j;
                            if (i34 < i37 || i34 >= (i12 = fVar.f45608k) || i33 < i37 || i33 >= i12) {
                                float f56 = i32;
                                float f57 = fVar.f45604f;
                                int i38 = (int) ((f53 * f57) + f56);
                                int i39 = (int) ((f54 * f57) + f56);
                                float f58 = l4;
                                float f59 = f51;
                                f15 = f52;
                                int ceil = (int) Math.ceil(((i34 + 1) * f57) + f56);
                                int ceil2 = (int) Math.ceil(((i33 + 1) * fVar.f45604f) + f56);
                                Rect rect = this.v;
                                rect.set(i38, i39, ceil, ceil2);
                                f14 = f59;
                                float f60 = f48;
                                f17 = f7;
                                float c11 = a1.g.c(i38 + ceil, f60, f50, f17);
                                f16 = f10;
                                float c12 = a1.g.c(i39 + ceil2, f60, f50, f16);
                                float f61 = ((ceil - i38) / f60) * f50 * f58;
                                float f62 = ((ceil2 - i39) / f60) * f50 * f58;
                                f13 = f50;
                                rectF.set(c11 - f61, c12 - f62, c11 + f61, c12 + f62);
                                paint2.setAlpha((int) (x10 * 255.0f));
                                f fVar2 = this.f45627n;
                                canvas.drawBitmap(fVar.f45601a, rect, rectF, paint2);
                                paint2.setAlpha(255);
                            }
                        }
                        f17 = f7;
                        f13 = f50;
                        f14 = f51;
                        f15 = f52;
                        f16 = f10;
                    }
                    i34++;
                    f22 = f17;
                    f23 = f16;
                    f50 = f13;
                    f52 = f15;
                    f51 = f14;
                    f48 = 2.0f;
                    f49 = 0.05f;
                }
            }
            i33++;
            f23 = f23;
            f51 = f51;
            i30 = 0;
            f48 = 2.0f;
            f49 = 0.05f;
        }
        float f63 = f23;
        float f64 = f22;
        float f65 = f11 / fVar.f45602b;
        int i40 = 0;
        while (i40 < 3) {
            if (i40 == i17) {
                i10 = fVar.e - 7;
            } else {
                i10 = 0;
            }
            if (i40 == 2) {
                i11 = fVar.e - 7;
            } else {
                i11 = 0;
            }
            float f66 = f12 / 0.32f;
            if (f66 > 0.0f) {
                float f67 = i32;
                float f68 = fVar.f45604f;
                float f69 = (((i10 * f68) + f67) * f65) + f64;
                float f70 = (((i11 * f68) + f67) * f65) + f63;
                float f71 = ((((i10 + 7) * f68) + f67) * f65) + f64;
                float f72 = ((((i11 + 7) * f68) + f67) * f65) + f63;
                float l10 = l(f66);
                canvas.save();
                canvas.scale(l10, l10, (f69 + f71) / 2.0f, (f70 + f72) / 2.0f);
                canvas.clipRect(f69 - 1.0f, f70 - 1.0f, f71 + 1.0f, f72 + 1.0f);
                rectF.set(f64, f63, f64 + f11, f63 + f11);
                paint2.setAlpha(255);
                canvas.drawBitmap(fVar.f45601a, fVar.f45603c, rectF, paint2);
                canvas.restore();
            }
            i40++;
            i17 = 1;
        }
        paint2.setAlpha(255);
    }

    public final void g(int i10) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < i10 * 8) {
            int i11 = i10 * 8;
            this.L = new float[i11];
            this.M = new float[i11];
            int i12 = i10 * 4;
            this.P = new int[i12];
            this.N = new float[i11];
            this.O = new float[i11];
            this.Q = new int[i12];
            this.R = new short[i10 * 6];
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 4;
                short[] sArr = this.R;
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

    public final int o() {
        return this.f45637y & 16777215;
    }
}
