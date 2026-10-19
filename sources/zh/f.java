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
import android.graphics.drawable.ColorDrawable;
import com.google.android.gms.internal.play_billing.k3;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.kk;
public final class f {
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
    public int f51992l;
    public e f51993m;
    public e f51994n;
    public long f51996p;
    public boolean[] f51999s;
    public PorterDuffColorFilter f52005z;
    public final float[] f51984a = new float[2400];
    public final float[] f51985b = new float[2400];
    public final float[] f51986c = new float[2400];
    public final float[] d = new float[2400];
    public final float[] e = new float[2400];
    public final float[] f51987f = new float[2400];
    public final float[] f51988g = new float[2400];
    public final float[] h = new float[2400];
    public final float[] f51989i = new float[2400];
    public final float[] f51990j = new float[2400];
    public final byte[] f51991k = new byte[2400];
    public float f51995o = 1.0f;
    public int f51997q = 0;
    public final RectF f51998r = new RectF();
    public final Paint f52000t = new Paint(3);
    public final Paint f52001u = new Paint(1);
    public final Rect v = new Rect();
    public final RectF f52002w = new RectF();
    public final Random f52003x = new Random();
    public int f52004y = -16777216;
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
        synchronized (f.class) {
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

    public static e c(String str, int i10, ic.c cVar, float f7, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(dc.b.f7921a, cVar);
            hashMap.put(dc.b.f7923c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            if (colorDrawable != null) {
                telegramQRCodeWriter.setCenterDrawable(colorDrawable);
            }
            e eVar = new e();
            Bitmap encode = telegramQRCodeWriter.encode(str, i10, i10, hashMap, null, f7, 0, -1);
            eVar.f51968b = encode.getWidth();
            int i11 = ((kc.b) kc.c.b(str, cVar, hashMap).f8097f).f15011b;
            eVar.e = i11;
            eVar.f51970f = (eVar.f51968b - (eVar.f51971g * 2.0f)) / i11;
            int i12 = i11 * i11;
            eVar.h = new boolean[i12];
            eVar.f51972i = new float[i12];
            Random random = new Random(str.hashCode());
            for (int i13 = 0; i13 < eVar.e; i13++) {
                for (int i14 = 0; i14 < eVar.e; i14++) {
                    float f10 = eVar.f51971g;
                    float f11 = i14 + 0.5f;
                    float f12 = eVar.f51970f;
                    int i15 = (int) ((f11 * f12) + f10);
                    int b10 = (int) kk.b(i13, 0.5f, f12, f10);
                    boolean z10 = false;
                    for (int i16 = -1; i16 <= 1 && !z10; i16++) {
                        if (Color.alpha(encode.getPixel(Math.max(0, Math.min(eVar.f51968b - 1, ((int) (i16 * eVar.f51970f * 0.3f)) + i15)), b10)) > 40) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    boolean[] zArr = eVar.h;
                    int i17 = (eVar.e * i13) + i14;
                    zArr[i17] = z10;
                    eVar.f51972i[i17] = random.nextFloat();
                }
            }
            Bitmap b11 = b();
            int i18 = eVar.f51968b;
            eVar.d = i18 + 2;
            eVar.f51967a = Bitmap.createBitmap(Math.max(i18, b11.getWidth()), eVar.d + b11.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(eVar.f51967a);
            canvas.drawBitmap(encode, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b11, 0.0f, eVar.d, (Paint) null);
            encode.recycle();
            eVar.f51967a.prepareToDraw();
            Rect rect = eVar.f51969c;
            int i19 = eVar.f51968b;
            rect.set(0, 0, i19, i19);
            eVar.f51975l = telegramQRCodeWriter.getImageSize();
            int round = Math.round(telegramQRCodeWriter.getImageSize() / eVar.f51970f) + 2;
            int i20 = (eVar.e - round) / 2;
            eVar.f51973j = i20;
            eVar.f51974k = i20 + round;
            return eVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 255.0f)));
    }

    public static float h(e eVar, float f7) {
        float f10 = 1.0f - f7;
        float f11 = f10 * f10;
        return kk.b(eVar.e, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * f11), -1.5f);
    }

    public static boolean i(e eVar, int i10, int i11) {
        if (i10 >= 7 || i11 >= 7) {
            int i12 = eVar.e;
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
        float y3 = k3.y((float) Math.cbrt(f13 + (0.53633255f * q13) + (0.41222146f * q12)), cbrt, f7, cbrt);
        float y10 = k3.y((float) Math.cbrt(f15 + f14 + (0.2119035f * q12)), cbrt2, f7, cbrt2);
        float y11 = k3.y((float) Math.cbrt(f16 + (q13 * 0.28171885f) + (q12 * 0.08830246f)), cbrt3, f7, cbrt3);
        float f17 = y3 * y3 * y3;
        float f18 = y10 * y10 * y10;
        float f19 = y11 * y11 * y11;
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

    public static void m(e eVar) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        if (eVar.f51977n == null) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= eVar.e) {
                    break;
                }
                for (int i15 = 0; i15 < eVar.e; i15++) {
                    int i16 = eVar.f51973j;
                    if (i15 < i16 || i15 >= (i12 = eVar.f51974k) || i13 < i16 || i13 >= i12) {
                        i14++;
                    }
                }
                i13++;
            }
            eVar.f51976m = i14;
            eVar.f51977n = new float[i14];
            eVar.f51978o = new float[i14];
            eVar.f51979p = new float[i14];
            eVar.f51980q = new boolean[i14];
            eVar.f51981r = new int[i14 * 4];
            float f13 = 1.4142f * ((i10 - 1) / 2.0f);
            int i17 = 0;
            for (int i18 = 0; i18 < eVar.e; i18++) {
                int i19 = 0;
                while (true) {
                    int i20 = eVar.e;
                    if (i19 < i20) {
                        int i21 = eVar.f51973j;
                        if (i19 < i21 || i19 >= (i11 = eVar.f51974k) || i18 < i21 || i18 >= i11) {
                            int i22 = (i20 * i18) + i19;
                            float f14 = eVar.f51972i[i22] * 3.17f;
                            float floor = f14 - ((float) Math.floor(f14));
                            boolean i23 = i(eVar, i19, i18);
                            float[] fArr = eVar.f51977n;
                            float f15 = eVar.f51971g;
                            float f16 = eVar.f51970f;
                            fArr[i17] = ((i19 + 0.5f) * f16) + f15;
                            eVar.f51978o[i17] = kk.b(i18, 0.5f, f16, f15);
                            float[] fArr2 = eVar.f51979p;
                            float hypot = (((float) Math.hypot(f10 - f7, f11 - f7)) / f13) * 0.5f;
                            if (i23) {
                                f12 = hypot * 0.85f;
                            } else {
                                f12 = hypot + (floor * 0.06f);
                            }
                            fArr2[i17] = f12;
                            eVar.f51980q[i17] = eVar.h[i22];
                            int[] iArr = eVar.f51981r;
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

    public final void a(e eVar) {
        this.f51993m = eVar;
        this.f51994n = null;
        this.f51997q = 2;
        this.f51995o = 0.0f;
        this.f51996p = 0L;
        this.E = 0L;
        this.F = false;
    }

    public final void e(android.graphics.Canvas r89, float r90, float r91, float r92) {
        throw new UnsupportedOperationException("Method not decompiled: zh.f.e(android.graphics.Canvas, float, float, float):void");
    }

    public final void f(Canvas canvas, e eVar, float f7, float f10, float f11, float f12) {
        int i10;
        int i11;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float z10;
        float l4;
        int i12;
        float f18;
        float f19;
        Paint paint;
        boolean z11;
        float f20;
        float x10;
        int i13;
        float f21;
        int i14;
        int i15;
        float f22 = f7;
        float f23 = f10;
        float f24 = f12;
        int i16 = this.f51997q;
        Paint paint2 = this.f52000t;
        RectF rectF = this.f52002w;
        int i17 = 1;
        if (i16 == 2) {
            m(eVar);
            int i18 = eVar.f51971g;
            int i19 = eVar.e;
            g((i19 * i19) + (eVar.f51976m * 2));
            Bitmap bitmap = this.J;
            Bitmap bitmap2 = eVar.f51967a;
            Paint paint3 = this.K;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = eVar.f51967a;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                this.J = eVar.f51967a;
            }
            float f25 = f11 / eVar.f51968b;
            float min = Math.min(1.0f, Math.max(0.0f, f24) / 0.1f);
            float f26 = eVar.f51970f * 0.5f;
            float f27 = 1.0f;
            boolean z12 = true;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < eVar.f51976m) {
                float f28 = (f24 - eVar.f51979p[i20]) / 0.434f;
                if (f28 < 0.0f) {
                    f28 = 0.0f;
                } else if (f28 > f27) {
                    f28 = f27;
                }
                if (f28 < 0.5f) {
                    f19 = k3.C(f28, 4.0f, f28, f28);
                } else {
                    float f29 = (f28 * (-2.0f)) + 2.0f;
                    f19 = f27 - (((f29 * f29) * f29) * 0.5f);
                }
                float f30 = (eVar.f51977n[i20] * f25) + f22;
                float f31 = (eVar.f51978o[i20] * f25) + f23;
                if (eVar.f51980q[i20]) {
                    if (f19 > 0.75f) {
                        f21 = 4.0f * (f19 - 0.75f);
                    } else {
                        f21 = 0.0f;
                    }
                    paint = paint3;
                    if (f21 < f27) {
                        float A = k3.A(f19, 0.8f, 0.2f, f26 * f25);
                        int min2 = Math.min(7, (int) ((f19 * 7.0f) + 0.5f));
                        float f32 = (f27 - f21) * min;
                        if (f32 > 0.004f) {
                            n(this.L, this.M, this.P, i21, f30 - A, f31 - A, f30 + A, f31 + A, min2 * 48, eVar.d, i14 + 48, i15 + 48, (((int) (f32 * 255.0f)) << 24) | o());
                            i21++;
                        }
                        z12 = false;
                    }
                    if (f21 > 0.0f) {
                        int i23 = i20 * 4;
                        float f33 = i18;
                        int[] iArr = eVar.f51981r;
                        float f34 = eVar.f51970f;
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
                        z11 = false;
                    } else {
                        z11 = z12;
                    }
                    float f39 = (f27 - f19) * 0.2f;
                    boolean z13 = z11;
                    if (f19 < 0.7f) {
                        f20 = f39;
                        x10 = f27;
                    } else {
                        f20 = f39;
                        x10 = org.telegram.messenger.g0.x(f19, 0.7f, 0.3f, f27);
                    }
                    float f40 = 0.9f * min * x10;
                    if (f20 > 0.01f && f40 > 0.004f) {
                        float f41 = f26 * f25 * f20;
                        n(this.L, this.M, this.P, i21, f30 - f41, f31 - f41, f30 + f41, f31 + f41, 0.0f, eVar.d, 48.0f, i13 + 48, (((int) (f40 * 255.0f)) << 24) | o());
                        z12 = z13;
                        i21++;
                    } else {
                        z12 = z13;
                    }
                }
                i20++;
                f24 = f12;
                paint3 = paint;
                f27 = 1.0f;
            }
            Paint paint4 = paint3;
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f12 - 0.05f) / 0.45f));
            float z14 = org.telegram.ui.Cells.c1.z(max, max, max, 1.0f);
            if (z14 > 0.0f) {
                int i24 = eVar.f51973j;
                while (i24 < eVar.f51974k) {
                    int i25 = eVar.f51973j;
                    int i26 = i22;
                    while (i25 < eVar.f51974k) {
                        if (!eVar.h[(eVar.e * i24) + i25]) {
                            f18 = z14;
                        } else {
                            float f42 = i18;
                            float f43 = eVar.f51970f;
                            float f44 = (i25 * f43) + f42;
                            float f45 = (i24 * f43) + f42;
                            f18 = z14;
                            float f46 = f44 + f43;
                            float f47 = f45 + f43;
                            n(this.N, this.O, this.Q, i26, (f44 * f25) + f22, (f45 * f25) + f23, (f46 * f25) + f22, (f47 * f25) + f23, f44, f45, f46, f47, (((int) ((min * 255.0f) * f18)) << 24) | o());
                            i26++;
                        }
                        i25++;
                        z14 = f18;
                    }
                    i24++;
                    i22 = i26;
                }
            }
            if (z12 && min >= 1.0f) {
                rectF.set(f22, f23, f22 + f11, f23 + f11);
                canvas.drawBitmap(eVar.f51967a, eVar.f51969c, rectF, paint2);
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
        int i31 = eVar.f51968b;
        int i32 = eVar.f51971g;
        float f50 = f11 / i31;
        float f51 = (eVar.e - 1) / 2.0f;
        float f52 = 1.4142f * f51;
        int i33 = 0;
        while (i33 < eVar.e) {
            int i34 = i30;
            while (true) {
                int i35 = eVar.e;
                if (i34 < i35) {
                    int i36 = (i35 * i33) + i34;
                    if (!eVar.h[i36] || i(eVar, i34, i33)) {
                        f13 = f50;
                        f14 = f51;
                        f15 = f52;
                        f16 = f23;
                        f17 = f22;
                    } else {
                        float f53 = i34;
                        float f54 = i33;
                        float d = (f12 - ((eVar.f51972i[i36] * 0.06f) + a1.g.d((float) Math.hypot(f53 - f51, f54 - f51), f52, 0.52f, f49))) / 0.367f;
                        if (d > 0.0f) {
                            if (d >= 1.0f) {
                                z10 = 1.0f;
                            } else {
                                float f55 = 1.0f - d;
                                z10 = org.telegram.ui.Cells.c1.z(f55, f55, f55, 1.0f);
                            }
                            if (this.f51997q == 2) {
                                l4 = (0.6f * z10) + 0.4f;
                            } else {
                                l4 = l(d);
                            }
                            if (this.f51997q != 2) {
                                z10 = Math.min(1.0f, d * 6.0f);
                            }
                            int i37 = eVar.f51973j;
                            if (i34 < i37 || i34 >= (i12 = eVar.f51974k) || i33 < i37 || i33 >= i12) {
                                float f56 = i32;
                                float f57 = eVar.f51970f;
                                int i38 = (int) ((f53 * f57) + f56);
                                int i39 = (int) ((f54 * f57) + f56);
                                float f58 = l4;
                                float f59 = f51;
                                f15 = f52;
                                int ceil = (int) Math.ceil(((i34 + 1) * f57) + f56);
                                int ceil2 = (int) Math.ceil(((i33 + 1) * eVar.f51970f) + f56);
                                Rect rect = this.v;
                                rect.set(i38, i39, ceil, ceil2);
                                f14 = f59;
                                float f60 = f48;
                                f17 = f7;
                                float d10 = a1.g.d(i38 + ceil, f60, f50, f17);
                                f16 = f10;
                                float d11 = a1.g.d(i39 + ceil2, f60, f50, f16);
                                float f61 = ((ceil - i38) / f60) * f50 * f58;
                                float f62 = ((ceil2 - i39) / f60) * f50 * f58;
                                f13 = f50;
                                rectF.set(d10 - f61, d11 - f62, d10 + f61, d11 + f62);
                                paint2.setAlpha((int) (z10 * 255.0f));
                                e eVar2 = this.f51994n;
                                canvas.drawBitmap(eVar.f51967a, rect, rectF, paint2);
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
        float f65 = f11 / eVar.f51968b;
        int i40 = 0;
        while (i40 < 3) {
            if (i40 == i17) {
                i10 = eVar.e - 7;
            } else {
                i10 = 0;
            }
            if (i40 == 2) {
                i11 = eVar.e - 7;
            } else {
                i11 = 0;
            }
            float f66 = f12 / 0.32f;
            if (f66 > 0.0f) {
                float f67 = i32;
                float f68 = eVar.f51970f;
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
                canvas.drawBitmap(eVar.f51967a, eVar.f51969c, rectF, paint2);
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
        return this.f52004y & 16777215;
    }
}
