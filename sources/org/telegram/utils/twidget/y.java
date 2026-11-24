package org.telegram.utils.twidget;

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
public final class y {
    public final RectF A;
    public final RectF B;
    public final Matrix C;
    public long D;
    public long E;
    public final Paint a = new Paint(1);
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Path g;
    public final RectF h;
    public final RectF i;
    public final float[] j;
    public final float[] k;
    public final Matrix l;
    public final HashMap m;
    public final IdentityHashMap n;
    public final float[] o;
    public final RectF p;
    public final RectF q;
    public final float[] r;
    public boolean s;
    public boolean t;
    public float[] u;
    public int v;
    public int w;
    public int x;
    public long y;
    public long z;

    public y() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(2);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new float[8];
        this.k = new float[8];
        this.l = new Matrix();
        this.m = new HashMap();
        this.n = new IdentityHashMap();
        this.o = new float[9];
        this.p = new RectF();
        this.q = new RectF();
        this.r = new float[8];
        this.u = new float[64];
        this.z = 67108864L;
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Matrix();
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void d(JSONArray jSONArray, float[] fArr, int i, float... fArr2) {
        float f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < fArr2.length) {
                f = fArr2[i2];
            } else {
                f = 0.0f;
            }
            if (jSONArray != null && i2 < jSONArray.length()) {
                f = (float) jSONArray.optDouble(i2, f);
            }
            fArr[i2] = f;
        }
    }

    public static long h(float f, float f2, float f3) {
        double d = f3;
        double ceil = Math.ceil(f * d);
        double ceil2 = Math.ceil(f2 * d);
        if (ceil > 0.0d && ceil2 > 0.0d) {
            return (long) Math.min(ceil * ceil2, 1.0E15d);
        }
        return 0L;
    }

    public static float j(gl2 gl2Var, RectF rectF) {
        int[] iArr = (int[]) gl2Var.b;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float max = Math.max(0.0f, ((float[]) gl2Var.f)[i]);
            int i2 = iArr[i];
            if (i2 == 0) {
                float f5 = max * 3.0f;
                f += f5;
                f2 += f5;
                f3 += f5;
                f4 += f5;
            } else if (i2 == 9) {
                float f6 = ((float[]) gl2Var.d)[i];
                float f7 = ((float[]) gl2Var.e)[i];
                float f8 = max * 1.5f;
                f = Math.max(f, f8 - f6);
                f3 = Math.max(f3, f6 + f8);
                f2 = Math.max(f2, f8 - f7);
                f4 = Math.max(f4, f8 + f7);
            }
        }
        rectF.set(rectF.left - f, rectF.top - f2, rectF.right + f3, rectF.bottom + f4);
        return Math.max(Math.max(f, f3), Math.max(f2, f4));
    }

    public static gl2 k(dd ddVar) {
        int X = ddVar.X(64, 5);
        gl2 gl2Var = new gl2(X);
        for (int i = 0; i < X; i++) {
            ((int[]) gl2Var.b)[i] = ddVar.i0();
            ((float[]) gl2Var.f)[i] = ddVar.c0();
            ((float[]) gl2Var.d)[i] = ddVar.c0();
            ((float[]) gl2Var.e)[i] = ddVar.c0();
            ((int[]) gl2Var.c)[i] = ddVar.i0();
        }
        return gl2Var;
    }

    public static void m(dd ddVar, int i, int[] iArr, float[] fArr) {
        for (int i2 = 0; i2 < i; i2++) {
            float max = Math.max(0.0f, Math.min(1.0f, ddVar.c0()));
            iArr[i2] = ddVar.i0();
            if (i > 1) {
                fArr[i2] = max;
            }
        }
        if (i == 1) {
            iArr[1] = iArr[0];
        }
    }

    public final void a(Path path, RectF rectF, float f) {
        if (!this.s) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i = 0;
        while (true) {
            float[] fArr = this.j;
            if (i < 8) {
                fArr[i] = Math.max(this.r[i] + f, 0.0f);
                i++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void b(int i, int i2) {
        this.v = 0;
        this.w = 0;
        this.y = 0L;
        this.x = 0;
        this.z = Math.max(67108864L, (Math.max(0, i) << 3) * Math.max(0, i2));
    }

    public final void c(Canvas canvas, Paint paint) {
        float f;
        if (this.s) {
            float[] fArr = this.r;
            f = fArr[0];
            int i = 1;
            while (true) {
                if (i >= 8) {
                    break;
                } else if (fArr[i] != f) {
                    f = -1.0f;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            f = 0.0f;
        }
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        RectF rectF = this.p;
        if (i2 == 0) {
            canvas.drawRect(rectF, paint);
        } else if (i2 > 0) {
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            Path path = this.e;
            n(rectF, path);
            canvas.drawPath(path, paint);
        }
    }

    public final void e(android.graphics.Canvas r44, defpackage.jvc r45, int r46, defpackage.dwc r47, float r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.y.e(android.graphics.Canvas, jvc, int, dwc, float, boolean):void");
    }

    public final void f(Canvas canvas, jvc jvcVar, dwc dwcVar, float f, float f2, float f3, float f4, float f5) {
        boolean z;
        int i;
        RectF rectF = this.A;
        rectF.set(f2, f3, f4, f5);
        this.D = 0L;
        this.E = h(rectF.width(), rectF.height(), f) << 6;
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && jvcVar.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = canvas.saveLayer(null, null);
        } else {
            i = -1;
        }
        e(canvas, jvcVar, jvcVar.b, dwcVar, f, true);
        if (z) {
            canvas.restoreToCount(i);
        }
    }

    public final Shader g(dd ddVar, int i) {
        float[] fArr = this.k;
        ddVar.d0(7, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        int X = ddVar.X(4096, 2);
        int[] iArr = new int[Math.max(2, X)];
        float[] fArr2 = X == 1 ? new float[]{0.0f, 1.0f} : new float[Math.max(X, 2)];
        m(ddVar, X, iArr, fArr2);
        if (X < 2) {
            return null;
        }
        if (i == 1) {
            return new LinearGradient(f, f2, f3, f4, iArr, fArr2, Shader.TileMode.CLAMP);
        }
        return new RadialGradient(f, f2, Math.max(f5, 0.01f), iArr, fArr2, Shader.TileMode.CLAMP);
    }

    public final void i(kka kkaVar, float f) {
        Object obj;
        int i;
        cwc cwcVar = (cwc) tb4.l(1, (ArrayList) kkaVar.h);
        if (cwcVar.c != null || cwcVar.f != null) {
            kkaVar.b--;
        }
        while (true) {
            int i2 = kkaVar.a;
            obj = cwcVar.c;
            if (obj == null && cwcVar.f == null) {
                i = cwcVar.b;
            } else {
                i = 0;
            }
            if (i2 <= i) {
                break;
            }
            kkaVar.t();
        }
        if (obj != null) {
            yz.j(cwcVar, f);
            kkaVar.d = cwcVar.a;
        } else {
            Bitmap bitmap = cwcVar.f;
            if (bitmap != null) {
                gl2 gl2Var = cwcVar.i;
                WidgetClientNative.filterPixels(bitmap, (int[]) gl2Var.b, (float[]) gl2Var.f, (float[]) gl2Var.d, (float[]) gl2Var.e, (int[]) gl2Var.c, cwcVar.h);
                kkaVar.d = cwcVar.a;
                Matrix matrix = new Matrix();
                if (cwcVar.g.invert(matrix)) {
                    ((Canvas) kkaVar.d).save();
                    ((Canvas) kkaVar.d).concat(matrix);
                    ((Canvas) kkaVar.d).drawBitmap(cwcVar.f, cwcVar.d, cwcVar.e, this.c);
                    ((Canvas) kkaVar.d).restore();
                }
            }
        }
        kkaVar.a = cwcVar.b;
    }

    public final void l(dd ddVar, Path path) {
        Path.FillType fillType;
        int i;
        int i2;
        int i3;
        path.rewind();
        int X = ddVar.X(1048576, 0);
        int X2 = ddVar.X(6291456, 1);
        int i4 = ddVar.b;
        long j = (X + 3) / 4;
        jvc jvcVar = (jvc) ddVar.c;
        if ((j << 2) <= jvcVar.d - i4) {
            ddVar.b = (((int) j) << 2) + i4;
            float[] fArr = this.u;
            if (fArr.length < X2) {
                fArr = new float[Math.max(X2, fArr.length << 1)];
                this.u = fArr;
            }
            ddVar.d0(X2, fArr);
            int i5 = 0;
            int i6 = 0;
            while (i5 < X) {
                int i7 = jvcVar.a.get(i4 + i5) & 255;
                if (i7 == 3) {
                    i = 6;
                } else if (i7 == 2) {
                    i = 4;
                } else if (i7 == 4) {
                    i = 0;
                } else {
                    i = 2;
                }
                int i8 = i + i6;
                if (i8 > X2) {
                    break;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 4) {
                                    path.close();
                                }
                                i2 = i5;
                                i3 = i8;
                            } else {
                                float[] fArr2 = this.u;
                                int i9 = i6;
                                i3 = i8;
                                i2 = i5;
                                path.cubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3], fArr2[i9 + 4], fArr2[i9 + 5]);
                            }
                        } else {
                            i2 = i5;
                            int i10 = i6;
                            i3 = i8;
                            float[] fArr3 = this.u;
                            path.quadTo(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3]);
                        }
                    } else {
                        i2 = i5;
                        int i11 = i6;
                        i3 = i8;
                        float[] fArr4 = this.u;
                        path.lineTo(fArr4[i11], fArr4[i11 + 1]);
                    }
                } else {
                    i2 = i5;
                    int i12 = i6;
                    i3 = i8;
                    float[] fArr5 = this.u;
                    path.moveTo(fArr5[i12], fArr5[i12 + 1]);
                }
                i5 = i2 + 1;
                i6 = i3;
            }
            if (ddVar.i0() != 0) {
                fillType = Path.FillType.EVEN_ODD;
            } else {
                fillType = Path.FillType.WINDING;
            }
            path.setFillType(fillType);
            return;
        }
        throw jvc.a();
    }

    public final void n(RectF rectF, Path path) {
        float[] fArr;
        if (this.s) {
            fArr = this.r;
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

    public final boolean o(long j) {
        if (j > 0) {
            long j2 = j << 2;
            long j3 = this.z;
            long j4 = this.y;
            if (j2 <= j3 - j4) {
                this.y = j4 + j2;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean p(kka kkaVar, RectF rectF, float f) {
        Matrix matrix = this.C;
        if (!((Matrix) kkaVar.f).invert(matrix)) {
            return false;
        }
        RectF rectF2 = this.A;
        RectF rectF3 = this.B;
        matrix.mapRect(rectF3, rectF2);
        float f2 = (-f) - 1.0f;
        rectF3.inset(f2, f2);
        return rectF.intersect(rectF3);
    }
}
