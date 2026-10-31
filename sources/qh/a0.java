package qh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AnimationUtils;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.f1;
public final class a0 implements Consumer {
    public final i0 f45564a;
    public final m f45565b;
    public final q f45566c;

    public a0(i0 i0Var, m mVar, q qVar) {
        this.f45564a = i0Var;
        this.f45565b = mVar;
        this.f45566c = qVar;
    }

    @Override
    public final void accept(Object obj) {
        int[] iArr;
        int[] iArr2;
        float f7;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float max;
        RectF rectF;
        float f14;
        float f15;
        float f16;
        Paint paint;
        float f17;
        int[] iArr3;
        Paint paint2;
        int[] iArr4;
        int[] iArr5;
        boolean z11;
        float f18;
        Canvas canvas;
        float f19;
        float f20;
        Canvas canvas2;
        float f21;
        float f22;
        float f23;
        m mVar;
        float max2;
        Canvas canvas3 = (Canvas) obj;
        i0 i0Var = this.f45564a;
        int[] iArr6 = i0Var.U;
        int[] iArr7 = i0Var.T;
        float[] fArr = i0Var.S;
        RectF rectF2 = i0Var.R;
        RectF rectF3 = i0Var.f45653h0;
        Paint paint3 = i0Var.O;
        Paint paint4 = i0Var.J;
        int[] iArr8 = i0Var.M;
        Paint paint5 = i0Var.f45652g0;
        int[] iArr9 = i0Var.L;
        Paint paint6 = i0Var.Q;
        Matrix matrix = i0Var.P;
        m mVar2 = this.f45565b;
        if (mVar2.isVerticalScrollBarEnabled()) {
            mVar2.setVerticalScrollBarEnabled(false);
        }
        if (!i0Var.f45649e0) {
            iArr = iArr6;
            g0 g0Var = i0Var.h;
            if (g0Var != null) {
                i0Var.f45649e0 = true;
                i0.b0(g0Var);
            }
        } else {
            iArr = iArr6;
        }
        if (i0Var.h != null && !Float.isNaN(i0Var.K)) {
            x0 x0Var = i0Var.d;
            if (x0Var != null) {
                f7 = 1.0f;
                if (x0Var.f45859g1 < 0.5f) {
                    iArr2 = iArr7;
                    f10 = (-Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - x0Var.f45835d6)) / 150.0f)) - 1.0E-4f;
                } else {
                    iArr2 = iArr7;
                    if (!x0Var.f45845e6) {
                        f10 = 0.0f;
                    } else {
                        f10 = Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - x0Var.f45825c6)) / 470.0f);
                    }
                }
            } else {
                iArr2 = iArr7;
                f7 = 1.0f;
                f10 = 1.0f;
            }
            x0 x0Var2 = i0Var.d;
            int[] iArr10 = iArr2;
            if (x0Var2 != null && x0Var2.f45859g1 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (x0Var2 != null) {
                f11 = Utilities.l(x0Var2.f45850f1);
            } else {
                f11 = f7;
            }
            float f24 = f7 - f11;
            boolean z12 = z10;
            float x10 = f1.x(f24, f24, f24, f7);
            if (z12) {
                f12 = i0Var.d.V0();
            } else {
                f12 = -1.0f;
            }
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 >= 0) {
                float f25 = f7 - f12;
                max = ((f7 - ((f25 * f25) * f25)) * 0.25f) + 0.75f;
                f13 = f12;
            } else if (f11 >= 0.999f) {
                f13 = f12;
                max = 1.0f;
            } else {
                f13 = f12;
                max = Math.max(mVar2.getScaleX(), (0.25f * x10) + 0.75f);
            }
            if (z12) {
                rectF = rectF2;
                f14 = 1.0f;
                f15 = Math.min(1.0f, f11 / 0.55f);
            } else {
                rectF = rectF2;
                f14 = 1.0f;
                f15 = 1.0f;
            }
            if (i10 >= 0 && f13 < f14) {
                f16 = f14;
                i0Var.d.invalidate();
            } else {
                f16 = f14;
            }
            if (max < f16) {
                mVar2.postInvalidateOnAnimation();
            }
            if (mVar2.getScaleX() != max) {
                View view = mVar2;
                float f26 = 0.0f;
                while (true) {
                    paint = paint5;
                    if (view == null || view == i0Var.h || !(view.getParent() instanceof View)) {
                        break;
                    }
                    f26 += view.getTop();
                    view = (View) view.getParent();
                    paint5 = paint;
                }
                if (Float.isNaN(i0Var.K)) {
                    max2 = mVar2.getHeight();
                } else {
                    max2 = Math.max(0.0f, Math.min(mVar2.getHeight(), i0Var.K - f26));
                }
                mVar2.setPivotX(mVar2.getWidth() / 2.0f);
                mVar2.setPivotY(max2);
                mVar2.setScaleX(max);
                mVar2.setScaleY(max);
            } else {
                paint = paint5;
            }
            if (mVar2.getAlpha() != f15) {
                mVar2.setAlpha(f15);
            }
            mVar2.getLocationOnScreen(iArr9);
            i0Var.h.getLocationOnScreen(iArr8);
            float f27 = iArr9[1] - iArr8[1];
            if (mVar2.getScaleY() > 0.01f) {
                f17 = mVar2.getScaleY();
            } else {
                f17 = 1.0f;
            }
            float width = mVar2.getWidth();
            if (i0Var.V == null) {
                LinearGradient i02 = i0.i0(false);
                i0Var.V = i02;
                paint4.setShader(i02);
                iArr3 = iArr8;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint4.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient i03 = i0.i0(true);
                i0Var.N = i03;
                paint3.setShader(i03);
                paint3.setXfermode(new PorterDuffXfermode(mode));
                paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                iArr3 = iArr8;
            }
            q qVar = this.f45566c;
            qVar.getLocationOnScreen(iArr9);
            float f28 = iArr9[1] - iArr3[1];
            float f29 = (f28 - f27) / f17;
            float L = ((org.telegram.messenger.i0.L(12.0f) + qVar.getHeight()) / f17) + f29;
            c cVar = i0Var.f45668y;
            if (cVar != null) {
                float height = (f28 + qVar.getHeight()) - i0Var.f45647c0;
                paint2 = paint3;
                if (cVar.K != height) {
                    cVar.K = height;
                    cVar.invalidate();
                }
            } else {
                paint2 = paint3;
            }
            qVar.getLocationOnScreen(i0Var.f45654i0);
            mVar2.getLocationOnScreen(i0Var.f45655j0);
            float scaleX = (iArr4[0] - iArr5[0]) / mVar2.getScaleX();
            rectF3.set((i0Var.f45643a0 / f17) + scaleX, (i0Var.f45645b0 / f17) + f29, ((qVar.getWidth() - i0Var.f45643a0) / f17) + scaleX, ((qVar.getHeight() - i0Var.f45647c0) / f17) + f29);
            paint6.setAlpha(255);
            canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
            matrix.setScale(1.0f, L - f29);
            matrix.postTranslate(0.0f, f29);
            i0Var.N.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, Math.min(f29, (-f27) / f17), width, L, paint2);
            float L2 = org.telegram.messenger.i0.L(10.0f);
            float f30 = ((i0Var.K - f27) - L2) / f17;
            float f31 = L2 / f17;
            matrix.setScale(1.0f, f31);
            matrix.postTranslate(0.0f, f30);
            i0Var.V.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, f30, width, Math.max(f31 + f30, org.telegram.messenger.i0.L(200.0f) + mVar2.getHeight()), paint4);
            if (f10 < 1.0f && !z12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12) {
                f18 = f11;
            } else {
                f18 = f10;
            }
            x0 x0Var3 = i0Var.d;
            float f32 = 90.0f;
            if (x0Var3 != null) {
                i0Var.f45648d0 = i0Var.f45663r - (x0Var3.H0() - org.telegram.messenger.i0.L(8.0f));
                float translationY = qVar.getTranslationY();
                float f33 = i0Var.f45648d0;
                if (translationY != f33) {
                    qVar.setTranslationY(f33);
                    qVar.invalidate();
                }
                if (f18 < 1.0f) {
                    if (f18 >= 0.0f) {
                        float max3 = Math.max(0.0f, Math.min(1.0f, f18));
                        float f34 = 1.0f - max3;
                        f22 = Math.min(1.0f, max3 / 0.35f);
                        f23 = ((1.0f - ((f34 * f34) * f34)) * 0.15f) + 0.85f;
                    } else {
                        float max4 = Math.max(0.0f, Math.min(1.0f, ((-f18) * 150.0f) / 90.0f));
                        f23 = f1.x(max4, 0.15f, max4, 1.0f);
                        f22 = 1.0f - max4;
                    }
                } else {
                    f22 = 1.0f;
                    f23 = 1.0f;
                }
                if (qVar.getScaleX() != f23) {
                    qVar.setPivotX(qVar.getWidth() / 2.0f);
                    qVar.setPivotY(qVar.getHeight() / 2.0f);
                    qVar.setScaleX(f23);
                    qVar.setScaleY(f23);
                    qVar.invalidate();
                }
                if (qVar.getAlpha() != f22) {
                    qVar.setAlpha(f22);
                }
                if ((f23 != 1.0f || f22 != 1.0f) && (mVar = i0Var.Z) != null) {
                    mVar.postInvalidateOnAnimation();
                }
            }
            float max5 = Math.max(0.0f, -f27);
            float f35 = i0Var.K - f27;
            int i11 = 0;
            float f36 = 0.0f;
            while (true) {
                float f37 = f32;
                if (i11 >= mVar2.getChildCount()) {
                    break;
                }
                View childAt = mVar2.getChildAt(i11);
                if (!(childAt instanceof l)) {
                    canvas2 = canvas3;
                } else {
                    l lVar = (l) childAt;
                    if (f36 == 0.0f) {
                        f36 = childAt.getHeight();
                    }
                    if (z11 && f36 > 0.0f) {
                        float max6 = Math.max(1.0f, (f35 - max5) / f36);
                        float height2 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                        if (f10 >= 0.0f) {
                            canvas2 = canvas3;
                            f21 = (x0.S(Math.max(0.0f, Math.min(1.0f, ((f10 * 470.0f) - (Math.max(0.0f, ((f35 - height2) / f36) - 0.5f) * Math.min(45.0f, 250.0f / max6))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                        } else {
                            canvas2 = canvas3;
                            float max7 = Math.max(0.0f, Math.min(1.0f, (((-f10) * 150.0f) - (Math.max(0.0f, ((height2 - max5) / f36) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max6 - 1.0f)))) / f37));
                            f21 = f1.x(max7, 0.4f, max7, 1.0f);
                        }
                    } else {
                        canvas2 = canvas3;
                        f21 = 1.0f;
                    }
                    if (lVar.f45682r != f21) {
                        lVar.f45682r = f21;
                        lVar.invalidate();
                    }
                }
                i11++;
                f32 = f37;
                canvas3 = canvas2;
            }
            Canvas canvas4 = canvas3;
            if (z11 && f36 > 0.0f) {
                float max8 = Math.max(1.0f, (f35 - max5) / f36);
                if (i0Var.f45651f0 == null) {
                    i0Var.f45651f0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
                }
                if (f10 >= 0.0f) {
                    f19 = 1.0f;
                    matrix.setScale(1.0f, f36);
                    matrix.postTranslate(0.0f, (f35 - (Math.max(-1.0f, ((f10 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / max8)) * f36)) - (f36 / 2.0f));
                } else {
                    f19 = 1.0f;
                    matrix.setScale(1.0f, f36);
                    matrix.postTranslate(0.0f, ((Math.max(-1.0f, (((-f10) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, max8 - 1.0f))) * f36) + max5) - (f36 / 2.0f));
                }
                i0Var.f45651f0.setLocalMatrix(matrix);
                Paint paint7 = paint;
                paint7.setShader(i0Var.f45651f0);
                if (paint7.getXfermode() == null) {
                    paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                canvas = canvas4;
                canvas.drawRect(0.0f, 0.0f, width, mVar2.getHeight(), paint7);
                mVar2.invalidate();
            } else {
                canvas = canvas4;
                f19 = 1.0f;
            }
            c cVar2 = i0Var.f45668y;
            if (cVar2 != null) {
                RectF rectF4 = cVar2.F;
                if (cVar2.f45588y > 0.003f && !rectF4.isEmpty()) {
                    RectF rectF5 = rectF;
                    rectF5.set(rectF4);
                    fArr[0] = rectF4.height() / 2.0f;
                    fArr[1] = cVar2.D;
                    i0Var.f45668y.getLocationOnScreen(iArr10);
                    int[] iArr11 = iArr;
                    mVar2.getLocationOnScreen(iArr11);
                    if (mVar2.getScaleX() > 0.01f) {
                        f20 = mVar2.getScaleX();
                    } else {
                        f20 = f19;
                    }
                    if (mVar2.getScaleY() > 0.01f) {
                        f19 = mVar2.getScaleY();
                    }
                    float f38 = iArr10[0] - iArr11[0];
                    float f39 = iArr10[1] - iArr11[1];
                    rectF5.set((rectF5.left + f38) / f20, (rectF5.top + f39) / f19, (rectF5.right + f38) / f20, (rectF5.bottom + f39) / f19);
                    fArr[0] = fArr[0] / f19;
                    paint6.setAlpha((int) (fArr[1] * 255.0f));
                    float f40 = fArr[0];
                    canvas.drawRoundRect(rectF5, f40, f40, paint6);
                }
            }
        }
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
