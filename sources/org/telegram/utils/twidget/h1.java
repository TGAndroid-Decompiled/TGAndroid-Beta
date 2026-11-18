package org.telegram.utils.twidget;

import a8.r7;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.json.JSONArray;
public final class h1 {
    public final RectF A;
    public final RectF B;
    public final Matrix C;
    public long D;
    public long E;
    public final Paint f54739a = new Paint(1);
    public final Paint f54740b;
    public final Paint f54741c;
    public final Paint d;
    public final Path f54742e;
    public final Path f54743f;
    public final Path f54744g;
    public final RectF h;
    public final RectF f54745i;
    public final float[] f54746j;
    public final float[] f54747k;
    public final Matrix f54748l;
    public final HashMap f54749m;
    public final IdentityHashMap f54750n;
    public final float[] f54751o;
    public final RectF f54752p;
    public final RectF f54753q;
    public final float[] f54754r;
    public boolean f54755s;
    public boolean f54756t;
    public float[] f54757u;
    public int v;
    public int f54758w;
    public int f54759x;
    public long f54760y;
    public long f54761z;

    public h1() {
        Paint paint = new Paint(1);
        this.f54740b = paint;
        this.f54741c = new Paint(2);
        this.d = new Paint(1);
        this.f54742e = new Path();
        this.f54743f = new Path();
        this.f54744g = new Path();
        this.h = new RectF();
        new RectF();
        this.f54745i = new RectF();
        this.f54746j = new float[8];
        this.f54747k = new float[8];
        this.f54748l = new Matrix();
        this.f54749m = new HashMap();
        this.f54750n = new IdentityHashMap();
        this.f54751o = new float[9];
        this.f54752p = new RectF();
        this.f54753q = new RectF();
        this.f54754r = new float[8];
        this.f54757u = new float[64];
        this.f54761z = 67108864L;
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Matrix();
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void d(JSONArray jSONArray, float[] fArr, int i7, float... fArr2) {
        float f10;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 < fArr2.length) {
                f10 = fArr2[i10];
            } else {
                f10 = 0.0f;
            }
            if (jSONArray != null && i10 < jSONArray.length()) {
                f10 = (float) jSONArray.optDouble(i10, f10);
            }
            fArr[i10] = f10;
        }
    }

    public static long h(float f10, float f11, float f12) {
        double d = f12;
        double ceil = Math.ceil(f10 * d);
        double ceil2 = Math.ceil(f11 * d);
        if (ceil > 0.0d && ceil2 > 0.0d) {
            return (long) Math.min(ceil * ceil2, 1.0E15d);
        }
        return 0L;
    }

    public static float j(r7 r7Var, RectF rectF) {
        int[] iArr = (int[]) r7Var.f617b;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float max = Math.max(0.0f, ((float[]) r7Var.d)[i7]);
            int i10 = iArr[i7];
            if (i10 == 0) {
                float f14 = max * 3.0f;
                f10 += f14;
                f11 += f14;
                f12 += f14;
                f13 += f14;
            } else if (i10 == 9) {
                float f15 = ((float[]) r7Var.f619e)[i7];
                float f16 = ((float[]) r7Var.f620f)[i7];
                float f17 = max * 1.5f;
                f10 = Math.max(f10, f17 - f15);
                f12 = Math.max(f12, f15 + f17);
                f11 = Math.max(f11, f17 - f16);
                f13 = Math.max(f13, f17 + f16);
            }
        }
        rectF.set(rectF.left - f10, rectF.top - f11, rectF.right + f12, rectF.bottom + f13);
        return Math.max(Math.max(f10, f12), Math.max(f11, f13));
    }

    public static r7 k(b3.j jVar) {
        int e10 = jVar.e(64, 5);
        r7 r7Var = new r7(e10);
        for (int i7 = 0; i7 < e10; i7++) {
            ((int[]) r7Var.f617b)[i7] = jVar.o();
            ((float[]) r7Var.d)[i7] = jVar.j();
            ((float[]) r7Var.f619e)[i7] = jVar.j();
            ((float[]) r7Var.f620f)[i7] = jVar.j();
            ((int[]) r7Var.f618c)[i7] = jVar.o();
        }
        return r7Var;
    }

    public static void m(b3.j jVar, int i7, int[] iArr, float[] fArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            float max = Math.max(0.0f, Math.min(1.0f, jVar.j()));
            iArr[i10] = jVar.o();
            if (i7 > 1) {
                fArr[i10] = max;
            }
        }
        if (i7 == 1) {
            iArr[1] = iArr[0];
        }
    }

    public static void o(int i7, Paint paint) {
        paint.setShader(null);
        paint.setColor(i7);
    }

    public final void a(Path path, RectF rectF, float f10) {
        if (!this.f54755s) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i7 = 0;
        while (true) {
            float[] fArr = this.f54746j;
            if (i7 < 8) {
                fArr[i7] = Math.max(this.f54754r[i7] + f10, 0.0f);
                i7++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void b(int i7, int i10) {
        this.v = 0;
        this.f54758w = 0;
        this.f54760y = 0L;
        this.f54759x = 0;
        this.f54761z = Math.max(67108864L, Math.max(0, i7) * 8 * Math.max(0, i10));
    }

    public final void c(Canvas canvas, Paint paint) {
        float f10;
        if (this.f54755s) {
            float[] fArr = this.f54754r;
            f10 = fArr[0];
            int i7 = 1;
            while (true) {
                if (i7 >= 8) {
                    break;
                } else if (fArr[i7] != f10) {
                    f10 = -1.0f;
                    break;
                } else {
                    i7++;
                }
            }
        } else {
            f10 = 0.0f;
        }
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF = this.f54752p;
        if (i10 == 0) {
            canvas.drawRect(rectF, paint);
        } else if (i10 > 0) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Path path = this.f54742e;
            n(rectF, path);
            canvas.drawPath(path, paint);
        }
    }

    public final void e(android.graphics.Canvas r44, org.telegram.utils.twidget.j r45, int r46, org.telegram.utils.twidget.g1 r47, float r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.h1.e(android.graphics.Canvas, org.telegram.utils.twidget.j, int, org.telegram.utils.twidget.g1, float, boolean):void");
    }

    public final void f(Canvas canvas, j jVar, g1 g1Var, float f10, float f11, float f12, float f13, float f14) {
        boolean z10;
        int i7;
        RectF rectF = this.A;
        rectF.set(f11, f12, f13, f14);
        this.D = 0L;
        this.E = h(rectF.width(), rectF.height(), f10) * 64;
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && jVar.f54792c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = canvas.saveLayer(null, null);
        } else {
            i7 = -1;
        }
        e(canvas, jVar, jVar.f54791b, g1Var, f10, true);
        if (z10) {
            canvas.restoreToCount(i7);
        }
    }

    public final Shader g(b3.j jVar, int i7) {
        float[] fArr = this.f54747k;
        jVar.k(7, fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        int e10 = jVar.e(4096, 2);
        int[] iArr = new int[Math.max(2, e10)];
        float[] fArr2 = e10 == 1 ? new float[]{0.0f, 1.0f} : new float[Math.max(e10, 2)];
        m(jVar, e10, iArr, fArr2);
        if (e10 < 2) {
            return null;
        }
        if (i7 == 1) {
            return new LinearGradient(f10, f11, f12, f13, iArr, fArr2, Shader.TileMode.CLAMP);
        }
        return new RadialGradient(f10, f11, Math.max(f14, 0.01f), iArr, fArr2, Shader.TileMode.CLAMP);
    }

    public final void i(cc.e eVar, float f10) {
        Object obj;
        int i7;
        f1 f1Var = (f1) p5.c.g(1, (ArrayList) eVar.h);
        if (f1Var.f54729c != null || f1Var.f54731f != null) {
            eVar.f5166b--;
        }
        while (true) {
            int i10 = eVar.f5165a;
            obj = f1Var.f54729c;
            if (obj == null && f1Var.f54731f == null) {
                i7 = f1Var.f54728b;
            } else {
                i7 = 0;
            }
            if (i10 <= i7) {
                break;
            }
            eVar.t();
        }
        if (obj != null) {
            e1.d(f1Var, f10);
            eVar.d = f1Var.f54727a;
        } else {
            Bitmap bitmap = f1Var.f54731f;
            if (bitmap != null) {
                r7 r7Var = f1Var.f54733i;
                WidgetClientNative.filterPixels(bitmap, (int[]) r7Var.f617b, (float[]) r7Var.d, (float[]) r7Var.f619e, (float[]) r7Var.f620f, (int[]) r7Var.f618c, f1Var.h);
                eVar.d = f1Var.f54727a;
                Matrix matrix = new Matrix();
                if (f1Var.f54732g.invert(matrix)) {
                    ((Canvas) eVar.d).save();
                    ((Canvas) eVar.d).concat(matrix);
                    ((Canvas) eVar.d).drawBitmap(f1Var.f54731f, f1Var.d, f1Var.f54730e, this.f54741c);
                    ((Canvas) eVar.d).restore();
                }
            }
        }
        eVar.f5165a = f1Var.f54728b;
    }

    public final void l(b3.j jVar, Path path) {
        Path.FillType fillType;
        int i7;
        int i10;
        int i11;
        int i12;
        path.rewind();
        int e10 = jVar.e(1048576, 0);
        int e11 = jVar.e(6291456, 1);
        int i13 = jVar.f2902b;
        long j3 = (e10 + 3) / 4;
        j jVar2 = (j) jVar.f2903c;
        if (4 * j3 <= jVar2.d - i13) {
            jVar.f2902b = (((int) j3) * 4) + i13;
            float[] fArr = this.f54757u;
            int i14 = 2;
            if (fArr.length < e11) {
                this.f54757u = new float[Math.max(e11, fArr.length * 2)];
            }
            jVar.k(e11, this.f54757u);
            int i15 = 0;
            int i16 = 0;
            while (i15 < e10) {
                int i17 = jVar2.f54790a.get(i13 + i15) & 255;
                if (i17 == 3) {
                    i7 = 6;
                } else if (i17 == i14) {
                    i7 = 4;
                } else if (i17 == 4) {
                    i7 = 0;
                } else {
                    i7 = i14;
                }
                int i18 = i7 + i16;
                if (i18 > e11) {
                    break;
                }
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != i14) {
                            if (i17 != 3) {
                                if (i17 == 4) {
                                    path.close();
                                }
                                i10 = i15;
                                i11 = i14;
                                i12 = i18;
                            } else {
                                float[] fArr2 = this.f54757u;
                                int i19 = i16;
                                i11 = i14;
                                i12 = i18;
                                i10 = i15;
                                path.cubicTo(fArr2[i19], fArr2[i19 + 1], fArr2[i19 + 2], fArr2[i19 + 3], fArr2[i19 + 4], fArr2[i19 + 5]);
                            }
                        } else {
                            i10 = i15;
                            int i20 = i16;
                            i11 = i14;
                            i12 = i18;
                            float[] fArr3 = this.f54757u;
                            path.quadTo(fArr3[i20], fArr3[i20 + 1], fArr3[i20 + 2], fArr3[i20 + 3]);
                        }
                    } else {
                        i10 = i15;
                        int i21 = i16;
                        i11 = i14;
                        i12 = i18;
                        float[] fArr4 = this.f54757u;
                        path.lineTo(fArr4[i21], fArr4[i21 + 1]);
                    }
                } else {
                    i10 = i15;
                    int i22 = i16;
                    i11 = i14;
                    i12 = i18;
                    float[] fArr5 = this.f54757u;
                    path.moveTo(fArr5[i22], fArr5[i22 + 1]);
                }
                i15 = i10 + 1;
                i16 = i12;
                i14 = i11;
            }
            if (jVar.o() != 0) {
                fillType = Path.FillType.EVEN_ODD;
            } else {
                fillType = Path.FillType.WINDING;
            }
            path.setFillType(fillType);
            return;
        }
        throw j.a();
    }

    public final void n(RectF rectF, Path path) {
        float[] fArr;
        if (this.f54755s) {
            fArr = this.f54754r;
        } else {
            fArr = null;
        }
        path.rewind();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final boolean p(long j3) {
        if (j3 > 0) {
            long j10 = j3 * 4;
            long j11 = this.f54761z;
            long j12 = this.f54760y;
            if (j10 <= j11 - j12) {
                this.f54760y = j12 + j10;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean q(cc.e eVar, RectF rectF, float f10) {
        Matrix matrix = this.C;
        if (!((Matrix) eVar.f5169f).invert(matrix)) {
            return false;
        }
        RectF rectF2 = this.A;
        RectF rectF3 = this.B;
        matrix.mapRect(rectF3, rectF2);
        float f11 = (-f10) - 1.0f;
        rectF3.inset(f11, f11);
        return rectF.intersect(rectF3);
    }
}
