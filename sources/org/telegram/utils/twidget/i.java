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
    public final Paint f54761a = new Paint(3);
    public final Paint f54762b = new Paint(1);
    public final Paint f54763c = new Paint();
    public final Paint d;
    public final Path f54764e;
    public final Path f54765f;
    public final Matrix f54766g;
    public final Matrix h;
    public final float[] f54767i;
    public final float[] f54768j;
    public final float[] f54769k;
    public final RectF f54770l;
    public final Rect f54771m;
    public final int f54772n;
    public Bitmap f54773o;
    public Bitmap f54774p;
    public Canvas f54775q;
    public int f54776r;
    public int f54777s;
    public int[] f54778t;
    public int f54779u;
    public int v;
    public int f54780w;
    public int f54781x;
    public int f54782y;
    public int f54783z;

    public i(int i7) {
        Paint paint = new Paint();
        this.d = paint;
        this.f54764e = new Path();
        this.f54765f = new Path();
        this.f54766g = new Matrix();
        this.h = new Matrix();
        this.f54767i = new float[9];
        this.f54768j = new float[6];
        this.f54769k = new float[8];
        this.f54770l = new RectF();
        this.f54771m = new Rect();
        this.f54777s = -1;
        this.f54772n = i7;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void b(int r3, android.graphics.Paint r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.i.b(int, android.graphics.Paint):void");
    }

    public final void a(Paint paint) {
        int[] iArr;
        if (this.f54781x != 0 && (iArr = this.E) != null) {
            float[] fArr = this.F;
            paint.setColor(-16777216);
            int i7 = this.f54781x;
            float[] fArr2 = this.f54768j;
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
        paint.setColor(this.f54782y);
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
        if (i7 >= 0 && i7 <= this.f54778t.length - this.f54779u) {
            return;
        }
        throw new IllegalArgumentException("Canvas batch: count");
    }

    public final float f() {
        int[] iArr = this.f54778t;
        int i7 = this.f54779u;
        this.f54779u = i7 + 1;
        return Float.intBitsToFloat(iArr[i7]);
    }

    public final void g(Path path, boolean z10) {
        int i7;
        path.rewind();
        int[] iArr = this.f54778t;
        int i10 = this.f54779u;
        int i11 = i10 + 1;
        this.f54779u = i11;
        int i12 = iArr[i10];
        this.f54779u = i10 + 2;
        int i13 = iArr[i11];
        e(i12);
        if (i13 >= 0) {
            int[] iArr2 = this.f54778t;
            int length = iArr2.length;
            int i14 = this.f54779u;
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
                this.f54779u = i12 + i13 + this.f54779u;
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
            Bitmap bitmap = this.f54773o;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f54773o = null;
            this.f54775q = null;
            this.f54774p = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Bitmap j() {
        try {
            Bitmap bitmap = this.f54773o;
            if (bitmap == null) {
                return null;
            }
            if (this.f54777s == this.f54776r) {
                if (this.f54774p == null) {
                }
                return this.f54774p;
            }
            this.f54774p = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            this.f54777s = this.f54776r;
            return this.f54774p;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
