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
import com.google.android.gms.internal.vision.e2;
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
    public final Paint f54220a = new Paint(3);
    public final Paint f54221b = new Paint(1);
    public final Paint f54222c = new Paint();
    public final Paint d;
    public final Path f54223e;
    public final Path f54224f;
    public final Matrix f54225g;
    public final Matrix h;
    public final float[] f54226i;
    public final float[] f54227j;
    public final float[] f54228k;
    public final RectF f54229l;
    public final Rect f54230m;
    public final int f54231n;
    public Bitmap f54232o;
    public Bitmap f54233p;
    public Canvas f54234q;
    public int f54235r;
    public int f54236s;
    public int[] f54237t;
    public int f54238u;
    public int v;
    public int f54239w;
    public int f54240x;
    public int f54241y;
    public int f54242z;

    public h(int i7) {
        Paint paint = new Paint();
        this.d = paint;
        this.f54223e = new Path();
        this.f54224f = new Path();
        this.f54225g = new Matrix();
        this.h = new Matrix();
        this.f54226i = new float[9];
        this.f54227j = new float[6];
        this.f54228k = new float[8];
        this.f54229l = new RectF();
        this.f54230m = new Rect();
        this.f54236s = -1;
        this.f54231n = i7;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void b(int r3, android.graphics.Paint r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.h.b(int, android.graphics.Paint):void");
    }

    public final void a(Paint paint) {
        int[] iArr;
        if (this.f54240x != 0 && (iArr = this.E) != null) {
            float[] fArr = this.F;
            paint.setColor(-16777216);
            int i7 = this.f54240x;
            float[] fArr2 = this.f54227j;
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
                        fArr3[i10] = e2.z(1.0f, f11, fArr[i10], f11);
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
        paint.setColor(this.f54241y);
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

    public final void e(int i7) {
        if (i7 >= 0 && i7 <= this.f54237t.length - this.f54238u) {
            return;
        }
        throw new IllegalArgumentException("Canvas batch: count");
    }

    public final float f() {
        int[] iArr = this.f54237t;
        int i7 = this.f54238u;
        this.f54238u = i7 + 1;
        return Float.intBitsToFloat(iArr[i7]);
    }

    public final void g(Path path, boolean z10) {
        int i7;
        path.rewind();
        int[] iArr = this.f54237t;
        int i10 = this.f54238u;
        int i11 = i10 + 1;
        this.f54238u = i11;
        int i12 = iArr[i10];
        this.f54238u = i10 + 2;
        int i13 = iArr[i11];
        e(i12);
        if (i13 >= 0) {
            int[] iArr2 = this.f54237t;
            int length = iArr2.length;
            int i14 = this.f54238u;
            if (i13 <= (length - i14) - i12) {
                int i15 = i14 + i12;
                int i16 = i15 + i13;
                int i17 = i15;
                for (int i18 = i14; i18 < i15; i18++) {
                    int i19 = iArr2[i18];
                    if (i19 != 0 && i19 != 1) {
                        if (i19 == 2) {
                            i7 = 4;
                        } else if (i19 == 3) {
                            i7 = 6;
                        } else {
                            i7 = 0;
                        }
                    } else {
                        i7 = 2;
                    }
                    if (i7 + i17 <= i16) {
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 != 2) {
                                    if (i19 != 3) {
                                        if (i19 == 4) {
                                            path.close();
                                        }
                                    } else {
                                        path.cubicTo(Float.intBitsToFloat(iArr2[i17]), Float.intBitsToFloat(iArr2[i17 + 1]), Float.intBitsToFloat(iArr2[i17 + 2]), Float.intBitsToFloat(iArr2[i17 + 3]), Float.intBitsToFloat(iArr2[i17 + 4]), Float.intBitsToFloat(iArr2[i17 + 5]));
                                        i17 += 6;
                                    }
                                } else {
                                    path.quadTo(Float.intBitsToFloat(iArr2[i17]), Float.intBitsToFloat(iArr2[i17 + 1]), Float.intBitsToFloat(iArr2[i17 + 2]), Float.intBitsToFloat(iArr2[i17 + 3]));
                                    i17 += 4;
                                }
                            } else {
                                path.lineTo(Float.intBitsToFloat(iArr2[i17]), Float.intBitsToFloat(iArr2[i17 + 1]));
                            }
                        } else {
                            path.moveTo(Float.intBitsToFloat(iArr2[i17]), Float.intBitsToFloat(iArr2[i17 + 1]));
                        }
                        i17 += 2;
                    } else {
                        throw new IllegalArgumentException("Canvas batch: path");
                    }
                }
                this.f54238u = i12 + i13 + this.f54238u;
                if (z10) {
                    path.setFillType(Path.FillType.WINDING);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Canvas batch: count");
    }

    public final void h(org.telegram.utils.twidget.g r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.h.h(org.telegram.utils.twidget.g):void");
    }

    public final synchronized Bitmap i() {
        try {
            Bitmap bitmap = this.f54232o;
            if (bitmap == null) {
                return null;
            }
            if (this.f54236s == this.f54235r) {
                if (this.f54233p == null) {
                }
                return this.f54233p;
            }
            this.f54233p = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            this.f54236s = this.f54235r;
            return this.f54233p;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
