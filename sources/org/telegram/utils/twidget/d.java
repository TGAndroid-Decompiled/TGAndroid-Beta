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
public final class d {
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
    public final Paint f44324a = new Paint(3);
    public final Paint f44325b = new Paint(1);
    public final Paint f44326c = new Paint();
    public final Paint d;
    public final Path e;
    public final Path f44327f;
    public final Matrix f44328g;
    public final Matrix h;
    public final float[] f44329i;
    public final float[] f44330j;
    public final float[] f44331k;
    public final RectF f44332l;
    public final Rect f44333m;
    public final int f44334n;
    public Bitmap f44335o;
    public Bitmap f44336p;
    public Canvas f44337q;
    public int f44338r;
    public int f44339s;
    public int[] f44340t;
    public int f44341u;
    public int v;
    public int f44342w;
    public int f44343x;
    public int f44344y;
    public int f44345z;

    public d(int i10) {
        Paint paint = new Paint();
        this.d = paint;
        this.e = new Path();
        this.f44327f = new Path();
        this.f44328g = new Matrix();
        this.h = new Matrix();
        this.f44329i = new float[9];
        this.f44330j = new float[6];
        this.f44331k = new float[8];
        this.f44332l = new RectF();
        this.f44333m = new Rect();
        this.f44339s = -1;
        this.f44334n = i10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void b(int r3, android.graphics.Paint r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.d.b(int, android.graphics.Paint):void");
    }

    public final void a(Paint paint) {
        int[] iArr;
        if (this.f44343x != 0 && (iArr = this.E) != null) {
            float[] fArr = this.F;
            paint.setColor(-16777216);
            int i10 = this.f44343x;
            float[] fArr2 = this.f44330j;
            if (i10 == 1) {
                paint.setShader(new LinearGradient(fArr2[0], fArr2[1], fArr2[2], fArr2[3], iArr, fArr, Shader.TileMode.CLAMP));
                return;
            } else if (i10 == 2) {
                float f7 = fArr2[2];
                float max = Math.max(fArr2[5], 0.01f);
                if (f7 > 0.0f && f7 < max) {
                    float[] fArr3 = new float[fArr.length];
                    for (int i11 = 0; i11 < fArr.length; i11++) {
                        float f10 = f7 / max;
                        fArr3[i11] = c3.i0.z(1.0f, f10, fArr[i11], f10);
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
        paint.setColor(this.f44344y);
    }

    public final void c(android.graphics.Canvas r18, org.telegram.utils.twidget.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.d.c(android.graphics.Canvas, org.telegram.utils.twidget.c):void");
    }

    public final void d(Paint paint) {
        Paint.Cap cap;
        Paint.Join join;
        int i10;
        paint.setStrokeWidth(this.I);
        int i11 = this.G;
        if (i11 == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i11 == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        int i12 = this.H;
        if (i12 == 1) {
            join = Paint.Join.ROUND;
        } else if (i12 == 2) {
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
                i10 = length * 2;
            } else {
                i10 = length;
            }
            float[] fArr2 = new float[i10];
            float f7 = 0.0f;
            for (int i13 = 0; i13 < i10; i13++) {
                float max = Math.max(0.0f, this.L[i13 % length]);
                fArr2[i13] = max;
                f7 += max;
            }
            if (f7 > 0.0f) {
                paint.setPathEffect(new DashPathEffect(fArr2, this.K));
            }
        }
    }

    public final float e() {
        int[] iArr = this.f44340t;
        int i10 = this.f44341u;
        this.f44341u = i10 + 1;
        return Float.intBitsToFloat(iArr[i10]);
    }

    public final void f(Path path, boolean z10) {
        path.rewind();
        int[] iArr = this.f44340t;
        int i10 = this.f44341u;
        int i11 = i10 + 1;
        this.f44341u = i11;
        int i12 = iArr[i10];
        int i13 = i10 + 2;
        this.f44341u = i13;
        int i14 = iArr[i11];
        int i15 = i13 + i12;
        int i16 = i15;
        for (int i17 = i13; i17 < i15; i17++) {
            int i18 = iArr[i17];
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 == 4) {
                                path.close();
                            }
                        } else {
                            path.cubicTo(Float.intBitsToFloat(iArr[i16]), Float.intBitsToFloat(iArr[i16 + 1]), Float.intBitsToFloat(iArr[i16 + 2]), Float.intBitsToFloat(iArr[i16 + 3]), Float.intBitsToFloat(iArr[i16 + 4]), Float.intBitsToFloat(iArr[i16 + 5]));
                            i16 += 6;
                        }
                    } else {
                        path.quadTo(Float.intBitsToFloat(iArr[i16]), Float.intBitsToFloat(iArr[i16 + 1]), Float.intBitsToFloat(iArr[i16 + 2]), Float.intBitsToFloat(iArr[i16 + 3]));
                        i16 += 4;
                    }
                } else {
                    path.lineTo(Float.intBitsToFloat(iArr[i16]), Float.intBitsToFloat(iArr[i16 + 1]));
                }
            } else {
                path.moveTo(Float.intBitsToFloat(iArr[i16]), Float.intBitsToFloat(iArr[i16 + 1]));
            }
            i16 += 2;
        }
        this.f44341u = i12 + i14 + this.f44341u;
        if (z10) {
            path.setFillType(Path.FillType.WINDING);
        }
    }

    public final void g(org.telegram.utils.twidget.c r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.d.g(org.telegram.utils.twidget.c):void");
    }
}
