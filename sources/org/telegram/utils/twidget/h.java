package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
public final class h {
    public static final PorterDuff.Mode[] W = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
    public float A;
    public float B;
    public float C;
    public float D;
    public int[] E;
    public float[] F;
    public int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float[] L;
    public int M;
    public int N;
    public int O;
    public String P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public boolean V;
    public final Paint f52801a = new Paint(3);
    public final Paint f52802b = new Paint(1);
    public final Paint f52803c = new Paint();
    public final Paint d;
    public final Path f52804e;
    public final Path f52805f;
    public final Matrix f52806g;
    public final Matrix h;
    public final float[] f52807i;
    public final float[] f52808j;
    public final float[] f52809k;
    public final RectF f52810l;
    public final Rect f52811m;
    public final int f52812n;
    public Bitmap f52813o;
    public Bitmap f52814p;
    public Canvas f52815q;
    public int f52816r;
    public int f52817s;
    public int[] f52818t;
    public int f52819u;
    public int v;
    public int f52820w;
    public int f52821x;
    public int f52822y;
    public int f52823z;

    public h(int i7) {
        Paint paint = new Paint();
        this.d = paint;
        this.f52804e = new Path();
        this.f52805f = new Path();
        this.f52806g = new Matrix();
        this.h = new Matrix();
        this.f52807i = new float[9];
        this.f52808j = new float[6];
        this.f52809k = new float[8];
        this.f52810l = new RectF();
        this.f52811m = new Rect();
        this.f52817s = -1;
        this.f52812n = i7;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void b(int r3, android.graphics.Paint r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.h.b(int, android.graphics.Paint):void");
    }

    public final void a(Paint paint) {
        int[] iArr;
        if (this.f52821x != 0 && (iArr = this.E) != null) {
            float[] fArr = this.F;
            paint.setColor(-16777216);
            int i7 = this.f52821x;
            float[] fArr2 = this.f52808j;
            if (i7 == 1) {
                paint.setShader(new LinearGradient(fArr2[0], fArr2[1], fArr2[2], fArr2[3], iArr, fArr, Shader.TileMode.CLAMP));
                return;
            } else if (i7 == 2) {
                float f10 = fArr2[2];
                float max = Math.max(fArr2[5], 0.01f);
                if (f10 > 0.0f && f10 < max) {
                    float[] fArr3 = new float[fArr.length];
                    for (int i10 = 0; i10 < fArr.length; i10++) {
                        float f11 = f10 / max;
                        fArr3[i10] = com.google.android.recaptcha.internal.a.z(1.0f, f11, fArr[i10], f11);
                    }
                    fArr = fArr3;
                }
                paint.setShader(new RadialGradient(fArr2[3], fArr2[4], max, iArr, fArr, Shader.TileMode.CLAMP));
                return;
            } else {
                SweepGradient sweepGradient = new SweepGradient(fArr2[1], fArr2[2], iArr, fArr);
                Matrix matrix = new Matrix();
                matrix.setRotate((float) Math.toDegrees(fArr2[0]), fArr2[1], fArr2[2]);
                sweepGradient.setLocalMatrix(matrix);
                paint.setShader(sweepGradient);
                return;
            }
        }
        paint.setShader(null);
        paint.setColor(this.f52822y);
    }

    public final void c(android.graphics.Canvas r18, org.telegram.utils.twidget.g r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.h.c(android.graphics.Canvas, org.telegram.utils.twidget.g):void");
    }

    public final void d(Paint paint) {
        Paint.Cap cap;
        Paint.Join join;
        int i7;
        paint.setStrokeWidth(this.I);
        int i10 = this.G;
        if (i10 == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i10 == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        int i11 = this.H;
        if (i11 == 1) {
            join = Paint.Join.ROUND;
        } else if (i11 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(this.J);
        paint.setPathEffect(null);
        float[] fArr = this.L;
        if (fArr != null) {
            int length = fArr.length;
            if (length % 2 == 1) {
                i7 = length * 2;
            } else {
                i7 = length;
            }
            float[] fArr2 = new float[i7];
            float f10 = 0.0f;
            for (int i12 = 0; i12 < i7; i12++) {
                float max = Math.max(0.0f, this.L[i12 % length]);
                fArr2[i12] = max;
                f10 += max;
            }
            if (f10 > 0.0f) {
                paint.setPathEffect(new DashPathEffect(fArr2, this.K));
            }
        }
    }

    public final float e() {
        int[] iArr = this.f52818t;
        int i7 = this.f52819u;
        this.f52819u = i7 + 1;
        return Float.intBitsToFloat(iArr[i7]);
    }

    public final void f(Path path, boolean z9) {
        path.rewind();
        int[] iArr = this.f52818t;
        int i7 = this.f52819u;
        int i10 = i7 + 1;
        this.f52819u = i10;
        int i11 = iArr[i7];
        int i12 = i7 + 2;
        this.f52819u = i12;
        int i13 = iArr[i10];
        int i14 = i12 + i11;
        int i15 = i14;
        for (int i16 = i12; i16 < i14; i16++) {
            int i17 = iArr[i16];
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 == 4) {
                                path.close();
                            }
                        } else {
                            path.cubicTo(Float.intBitsToFloat(iArr[i15]), Float.intBitsToFloat(iArr[i15 + 1]), Float.intBitsToFloat(iArr[i15 + 2]), Float.intBitsToFloat(iArr[i15 + 3]), Float.intBitsToFloat(iArr[i15 + 4]), Float.intBitsToFloat(iArr[i15 + 5]));
                            i15 += 6;
                        }
                    } else {
                        path.quadTo(Float.intBitsToFloat(iArr[i15]), Float.intBitsToFloat(iArr[i15 + 1]), Float.intBitsToFloat(iArr[i15 + 2]), Float.intBitsToFloat(iArr[i15 + 3]));
                        i15 += 4;
                    }
                } else {
                    path.lineTo(Float.intBitsToFloat(iArr[i15]), Float.intBitsToFloat(iArr[i15 + 1]));
                }
            } else {
                path.moveTo(Float.intBitsToFloat(iArr[i15]), Float.intBitsToFloat(iArr[i15 + 1]));
            }
            i15 += 2;
        }
        this.f52819u = i11 + i13 + this.f52819u;
        if (z9) {
            path.setFillType(Path.FillType.WINDING);
        }
    }

    public final void g(org.telegram.utils.twidget.g r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.h.g(org.telegram.utils.twidget.g):void");
    }
}
