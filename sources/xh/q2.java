package xh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class q2 extends FrameLayout {
    public float E;
    public int F;
    public ValueAnimator G;
    public p2 H;
    public final x I;
    public final View[] f45912a;
    public final Matrix f45913b;
    public final float[] f45914c;
    public float d;
    public float e;
    public boolean f45915f;
    public final float[][] h;
    public final float[] f45916n;
    public final float[] f45917r;
    public final Integer[] f45918s;
    public final HashSet v;
    public final HashMap f45919w;
    public final HashMap f45920x;
    public final float[] f45921y;

    public q2(Context context, View[] viewArr) {
        super(context);
        this.f45913b = new Matrix();
        float[] fArr = new float[16];
        this.f45914c = fArr;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45915f = true;
        this.h = new float[][]{new float[]{-1.0f, 0.0f, 0.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{0.0f, -1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}};
        this.f45916n = new float[4];
        this.f45917r = new float[6];
        this.f45918s = new Integer[]{0, 1, 2, 3, 4, 5};
        this.v = new HashSet();
        this.f45919w = new HashMap();
        this.f45920x = new HashMap();
        this.f45921y = new float[6];
        this.F = -1;
        this.I = new x(this, 5);
        setClipToOutline(false);
        setClipToPadding(false);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        this.f45912a = viewArr;
        for (View view : viewArr) {
            addView(view, w7.a6.e(108, 108, 17));
        }
    }

    public static void b(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = 1.0f - cos;
        float f13 = f12 * f7;
        fArr[0] = (f13 * f7) + cos;
        float f14 = f13 * f10;
        float f15 = sin * 0.0f;
        fArr[4] = f14 - f15;
        float f16 = f13 * 0.0f;
        float f17 = sin * f10;
        fArr[8] = f16 + f17;
        fArr[12] = 0.0f;
        fArr[1] = f14 + f15;
        float f18 = f12 * f10;
        fArr[5] = (f10 * f18) + cos;
        float f19 = f18 * 0.0f;
        float f20 = sin * f7;
        fArr[9] = f19 - f20;
        fArr[13] = 0.0f;
        fArr[2] = f16 - f17;
        fArr[6] = f19 + f20;
        fArr[10] = com.google.android.gms.internal.vision.e2.x(f12, 0.0f, 0.0f, cos);
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static void c(float[] fArr, float[] fArr2, float[] fArr3) {
        float f7 = fArr[1];
        float f10 = fArr2[2];
        float f11 = fArr[2];
        fArr3[0] = (f7 * f10) - (fArr2[1] * f11);
        float f12 = fArr2[0];
        float f13 = fArr[0];
        fArr3[1] = (f11 * f12) - (f10 * f13);
        fArr3[2] = (f13 * fArr2[1]) - (fArr[1] * f12);
    }

    public static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArr4 = new float[16];
        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr2, 0);
        System.arraycopy(fArr4, 0, fArr3, 0, 16);
    }

    public static void e(float[] fArr) {
        float f7 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = f11 * f11;
        float sqrt = (float) Math.sqrt(f12 + (f10 * f10) + (f7 * f7));
        if (sqrt > 0.0f) {
            fArr[0] = fArr[0] / sqrt;
            fArr[1] = fArr[1] / sqrt;
            fArr[2] = fArr[2] / sqrt;
        }
    }

    public final void a() {
        if (Math.abs(this.d) > 1.0E-4f || Math.abs(this.e) > 1.0E-4f) {
            float[] fArr = new float[16];
            b(1.0f, 0.0f, this.d, fArr);
            float[] fArr2 = this.f45914c;
            d(fArr, fArr2, fArr2);
            b(0.0f, 1.0f, this.e, fArr);
            d(fArr, fArr2, fArr2);
            if (this.f45915f) {
                this.d *= 0.96f;
                this.e *= 0.96f;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        RectF rectF;
        boolean z10;
        boolean z11;
        float f7;
        char c10;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 6) {
            if (this.F == indexOfChild) {
                z10 = true;
            } else {
                z10 = false;
            }
            rectF = (RectF) this.f45920x.get(Integer.valueOf(indexOfChild));
            Integer num = (Integer) this.f45919w.get(Integer.valueOf(indexOfChild));
            if (num != null) {
                indexOfChild = num.intValue();
            }
            if (view instanceof v2) {
                v2 v2Var = (v2) view;
                if (z10) {
                    f14 = this.E;
                } else {
                    f14 = 1.0f;
                }
                float f15 = 1.0f - f14;
                v2Var.d.setAlpha(f15);
                v2Var.e.setAlpha(f15);
                if (!z10 || this.E >= 1.0f) {
                    this.f45912a[indexOfChild].setVisibility(8);
                }
            }
            z11 = true;
        } else {
            rectF = null;
            z10 = false;
            z11 = false;
        }
        float[][] fArr = this.h;
        android.opengl.Matrix.multiplyMV(this.f45916n, 0, this.f45914c, 0, fArr[indexOfChild], 0);
        float f16 = this.f45916n[2];
        if (f16 < 0.001f) {
            return false;
        }
        view.setAlpha(Math.min(1.0f, f16 / 0.3f));
        float width = view.getWidth() / 2.0f;
        if (z11 && (view instanceof v2)) {
            float dp = AndroidUtilities.dp(-6.0f);
            f7 = 1.0f;
            if (z10) {
                f13 = this.E;
            } else {
                f13 = 1.0f;
            }
            c10 = 6;
            f10 = (f13 * AndroidUtilities.dp(2.0f)) + dp;
        } else {
            f7 = 1.0f;
            c10 = 6;
            f10 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(108.0f) / 2.0f;
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float[] fArr2 = new float[4];
        float[] fArr3 = new float[4];
        float[] fArr4 = new float[4];
        System.arraycopy(fArr[indexOfChild], 0, fArr2, 0, 4);
        if (indexOfChild != 0) {
            if (indexOfChild != 1) {
                if (indexOfChild != 2) {
                    if (indexOfChild != 3) {
                        if (indexOfChild != 4) {
                            i10 = 3;
                            if (indexOfChild == 5) {
                                fArr3[0] = f7;
                                fArr3[1] = 0.0f;
                                fArr3[2] = 0.0f;
                                fArr4[0] = 0.0f;
                                fArr4[1] = -1.0f;
                                fArr4[2] = 0.0f;
                            }
                        } else {
                            i10 = 3;
                            fArr3[0] = -1.0f;
                            fArr3[1] = 0.0f;
                            fArr3[2] = 0.0f;
                            fArr4[0] = 0.0f;
                            fArr4[1] = -1.0f;
                            fArr4[2] = 0.0f;
                        }
                    } else {
                        i10 = 3;
                        fArr3[0] = f7;
                        fArr3[1] = 0.0f;
                        fArr3[2] = 0.0f;
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        fArr4[2] = -1.0f;
                    }
                } else {
                    i10 = 3;
                    fArr3[0] = f7;
                    fArr3[1] = 0.0f;
                    fArr3[2] = 0.0f;
                    fArr4[0] = 0.0f;
                    fArr4[1] = 0.0f;
                    fArr4[2] = f7;
                }
            } else {
                i10 = 3;
                fArr3[0] = 0.0f;
                fArr3[1] = 0.0f;
                fArr3[2] = -1.0f;
                fArr4[0] = 0.0f;
                fArr4[1] = -1.0f;
                fArr4[2] = 0.0f;
            }
        } else {
            i10 = 3;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = f7;
            fArr4[0] = 0.0f;
            fArr4[1] = -1.0f;
            fArr4[2] = 0.0f;
        }
        fArr3[i10] = 0.0f;
        fArr4[i10] = 0.0f;
        float f17 = this.f45921y[indexOfChild];
        if (f17 != 0.0f) {
            double radians = (float) Math.toRadians(f17);
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f18 = fArr3[0];
            float f19 = fArr4[0];
            float f20 = fArr3[1];
            float f21 = fArr4[1];
            float f22 = fArr3[2];
            float f23 = fArr4[2];
            fArr3[0] = (f19 * sin) + (f18 * cos);
            fArr3[1] = (f21 * sin) + (f20 * cos);
            fArr3[2] = (f23 * sin) + (f22 * cos);
            fArr4[0] = (f19 * cos) + ((-f18) * sin);
            fArr4[1] = (f21 * cos) + ((-f20) * sin);
            fArr4[2] = (f23 * cos) + ((-f22) * sin);
        }
        float[] fArr5 = new float[4];
        float[] fArr6 = new float[4];
        float[] fArr7 = new float[4];
        android.opengl.Matrix.multiplyMV(fArr5, 0, this.f45914c, 0, fArr2, 0);
        float[] fArr8 = fArr5;
        android.opengl.Matrix.multiplyMV(fArr6, 0, this.f45914c, 0, fArr3, 0);
        float[] fArr9 = fArr6;
        android.opengl.Matrix.multiplyMV(fArr7, 0, this.f45914c, 0, fArr4, 0);
        float f24 = 64.0f * dp2;
        int i11 = 2;
        int i12 = 1;
        float[][] fArr10 = (float[][]) Array.newInstance(Float.TYPE, 4, i10);
        int i13 = 0;
        for (int i14 = 4; i13 < i14; i14 = 4) {
            if (i13 != i12 && i13 != i11) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            if (i13 != 0 && i13 != i12) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            float[] fArr11 = fArr10[i13];
            float[] fArr12 = fArr8;
            float[] fArr13 = fArr9;
            fArr11[0] = com.google.android.gms.internal.vision.e2.B(fArr7[0], f12, (fArr9[0] * f11) + fArr8[0], dp2);
            fArr11[1] = com.google.android.gms.internal.vision.e2.B(fArr7[1], f12, (fArr13[1] * f11) + fArr12[1], dp2);
            fArr11[2] = com.google.android.gms.internal.vision.e2.B(fArr7[2], f12, (fArr13[2] * f11) + fArr12[2], dp2);
            i13++;
            fArr9 = fArr13;
            fArr8 = fArr12;
            i12 = 1;
            i11 = 2;
        }
        char c11 = 2;
        float[] fArr14 = new float[8];
        int i15 = 0;
        while (i15 < 4) {
            float[] fArr15 = fArr10[i15];
            float f25 = f24 / (f24 - fArr15[c11]);
            int i16 = i15 * 2;
            fArr14[i16] = (fArr15[0] * f25) + width2;
            fArr14[i16 + 1] = (fArr15[1] * f25) + height;
            i15++;
            c11 = 2;
        }
        float f26 = (width2 - width) - f10;
        float f27 = (height - width) - f10;
        float f28 = width2 + width + f10;
        float f29 = height + width + f10;
        float[] fArr16 = new float[8];
        fArr16[0] = f26;
        fArr16[1] = f27;
        fArr16[2] = f28;
        fArr16[i10] = f27;
        fArr16[4] = f28;
        fArr16[5] = f29;
        fArr16[c10] = f26;
        fArr16[7] = f29;
        if (z10 && rectF != null) {
            float f30 = rectF.left;
            float f31 = rectF.top;
            float f32 = rectF.right;
            float f33 = rectF.bottom;
            float[] fArr17 = new float[8];
            fArr17[0] = f30;
            fArr17[1] = f31;
            fArr17[2] = f32;
            fArr17[i10] = f31;
            fArr17[4] = f32;
            fArr17[5] = f33;
            fArr17[c10] = f30;
            fArr17[7] = f33;
            AndroidUtilities.lerp(fArr17, fArr14, this.E, fArr14);
        }
        Matrix matrix = this.f45913b;
        matrix.reset();
        matrix.setPolyToPoly(fArr16, 0, fArr14, 0, 4);
        canvas.save();
        canvas.concat(matrix);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void f(int i10, FrameLayout frameLayout) {
        if (i10 == -1) {
            i10 = 5;
        }
        AndroidUtilities.removeFromParent(frameLayout);
        int childCount = getChildCount();
        addView(frameLayout, w7.a6.e(64, 64, 17));
        this.v.add(Integer.valueOf(i10));
        this.f45919w.put(Integer.valueOf(childCount), Integer.valueOf(i10));
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        if (i11 < 6) {
            Integer[] numArr = this.f45918s;
            if (i11 < numArr.length) {
                return numArr[i11].intValue();
            }
        }
        return i11;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.I, 16L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.I);
    }
}
