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
public final class i {
    public static final PorterDuff.Mode[] Y = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
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
    public volatile long W;
    public long X;
    public final Paint f54803a = new Paint(3);
    public final Paint f54804b = new Paint(1);
    public final Paint f54805c = new Paint();
    public final Paint d;
    public final Path f54806e;
    public final Path f54807f;
    public final Matrix f54808g;
    public final Matrix h;
    public final float[] f54809i;
    public final float[] f54810j;
    public final float[] f54811k;
    public final RectF f54812l;
    public final Rect f54813m;
    public final int f54814n;
    public Bitmap f54815o;
    public Bitmap f54816p;
    public Canvas f54817q;
    public int f54818r;
    public int f54819s;
    public int[] f54820t;
    public int f54821u;
    public int v;
    public int f54822w;
    public int f54823x;
    public int f54824y;
    public int f54825z;

    public i(int i7) {
        Paint paint = new Paint();
        this.d = paint;
        this.f54806e = new Path();
        this.f54807f = new Path();
        this.f54808g = new Matrix();
        this.h = new Matrix();
        this.f54809i = new float[9];
        this.f54810j = new float[6];
        this.f54811k = new float[8];
        this.f54812l = new RectF();
        this.f54813m = new Rect();
        this.f54819s = -1;
        this.f54814n = i7;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void b(int r3, android.graphics.Paint r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.i.b(int, android.graphics.Paint):void");
    }

    public final void a(Paint paint) {
        int[] iArr;
        if (this.f54823x != 0 && (iArr = this.E) != null) {
            float[] fArr = this.F;
            paint.setColor(-16777216);
            int i7 = this.f54823x;
            float[] fArr2 = this.f54810j;
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
        paint.setColor(this.f54824y);
    }

    public final void c(android.graphics.Canvas r24, org.telegram.utils.twidget.h r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.i.c(android.graphics.Canvas, org.telegram.utils.twidget.h):void");
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
        if (i7 >= 0 && i7 <= this.f54820t.length - this.f54821u) {
            return;
        }
        throw new IllegalArgumentException("Canvas batch: count");
    }

    public final float f() {
        int[] iArr = this.f54820t;
        int i7 = this.f54821u;
        this.f54821u = i7 + 1;
        return Float.intBitsToFloat(iArr[i7]);
    }

    public final void g(Path path, boolean z10) {
        int i7;
        path.rewind();
        int[] iArr = this.f54820t;
        int i10 = this.f54821u;
        int i11 = i10 + 1;
        this.f54821u = i11;
        int i12 = iArr[i10];
        this.f54821u = i10 + 2;
        int i13 = iArr[i11];
        e(i12);
        if (i13 >= 0) {
            int[] iArr2 = this.f54820t;
            int length = iArr2.length;
            int i14 = this.f54821u;
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
                this.f54821u = i12 + i13 + this.f54821u;
                if (z10) {
                    path.setFillType(Path.FillType.WINDING);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Canvas batch: count");
    }

    public final void h(org.telegram.utils.twidget.h r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.i.h(org.telegram.utils.twidget.h):void");
    }

    public final synchronized void i() {
        try {
            Bitmap bitmap = this.f54815o;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f54815o = null;
            this.f54817q = null;
            this.f54816p = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Bitmap j() {
        try {
            Bitmap bitmap = this.f54815o;
            if (bitmap == null) {
                return null;
            }
            if (this.f54819s == this.f54818r) {
                if (this.f54816p == null) {
                }
                return this.f54816p;
            }
            this.f54816p = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            this.f54819s = this.f54818r;
            return this.f54816p;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
