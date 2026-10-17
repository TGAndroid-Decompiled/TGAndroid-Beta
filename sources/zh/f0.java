package zh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f0 implements Consumer {
    public final m0 f51985a;
    public final s f51986b;
    public final w f51987c;

    public f0(m0 m0Var, s sVar, w wVar) {
        this.f51985a = m0Var;
        this.f51986b = sVar;
        this.f51987c = wVar;
    }

    @Override
    public final void accept(Object obj) {
        float[] fArr;
        float f7;
        Paint paint;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float max;
        Canvas canvas;
        float f13;
        float f14;
        boolean z11;
        float f15;
        float f16;
        float f17;
        s sVar;
        Canvas canvas2;
        boolean z12;
        float f18;
        float f19;
        float f20;
        float max2;
        k0 k0Var;
        Canvas canvas3 = (Canvas) obj;
        m0 m0Var = this.f51985a;
        float[] fArr2 = m0Var.Q;
        RectF rectF = m0Var.P;
        RectF rectF2 = m0Var.f52048a0;
        Paint paint2 = m0Var.M;
        Paint paint3 = m0Var.H;
        int[] iArr = m0Var.K;
        Paint paint4 = m0Var.Z;
        int[] iArr2 = m0Var.J;
        Paint paint5 = m0Var.O;
        Matrix matrix = m0Var.N;
        s sVar2 = this.f51986b;
        if (sVar2.isVerticalScrollBarEnabled()) {
            sVar2.setVerticalScrollBarEnabled(false);
        }
        if (!m0Var.X && (k0Var = m0Var.h) != null) {
            m0Var.X = true;
            m0.W(k0Var);
        }
        if (m0Var.h != null && !Float.isNaN(m0Var.I)) {
            sVar2.getLocationOnScreen(iArr2);
            m0Var.h.getLocationOnScreen(iArr);
            float f21 = iArr2[1] - iArr[1];
            float width = sVar2.getWidth();
            if (m0Var.R == null) {
                LinearGradient d02 = m0.d0(false);
                m0Var.R = d02;
                paint3.setShader(d02);
                fArr = fArr2;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient d03 = m0.d0(true);
                m0Var.L = d03;
                paint2.setShader(d03);
                paint2.setXfermode(new PorterDuffXfermode(mode));
                paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                fArr = fArr2;
            }
            w wVar = this.f51987c;
            wVar.getLocationOnScreen(iArr2);
            float f22 = (iArr2[1] - iArr[1]) - f21;
            float height = wVar.getHeight() + f22 + AndroidUtilities.dp(12.0f);
            c cVar = m0Var.f52066x;
            if (cVar != null) {
                f7 = height;
                float height2 = ((f22 + f21) + wVar.getHeight()) - m0Var.V;
                paint = paint2;
                if (cVar.K != height2) {
                    cVar.K = height2;
                    cVar.invalidate();
                }
            } else {
                f7 = height;
                paint = paint2;
            }
            int[] iArr3 = m0Var.f52050b0;
            wVar.getLocationOnScreen(iArr3);
            int[] iArr4 = m0Var.f52052c0;
            sVar2.getLocationOnScreen(iArr4);
            float f23 = iArr3[0] - iArr4[0];
            rectF2.set(m0Var.T + f23, m0Var.U + f22, (f23 + wVar.getWidth()) - m0Var.T, (wVar.getHeight() + f22) - m0Var.V);
            paint5.setAlpha(255);
            canvas3.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint5);
            matrix.setScale(1.0f, f7 - f22);
            matrix.postTranslate(0.0f, f22);
            m0Var.L.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, Math.min(f22, -f21), width, f7, paint);
            float dp = AndroidUtilities.dp(10.0f);
            float f24 = (m0Var.I - f21) - dp;
            matrix.setScale(1.0f, dp);
            matrix.postTranslate(0.0f, f24);
            m0Var.R.setLocalMatrix(matrix);
            canvas3.drawRect(0.0f, f24, width, Math.max(dp + f24, AndroidUtilities.dp(200.0f) + sVar2.getHeight()), paint3);
            b1 b1Var = m0Var.d;
            if (b1Var != null) {
                if (b1Var.f51737g1 < 0.5f) {
                    f10 = (-Utilities.clamp01(((float) (AnimationUtils.currentAnimationTimeMillis() - b1Var.J5)) / 150.0f)) - 1.0E-4f;
                } else if (!b1Var.K5) {
                    f10 = 0.0f;
                } else {
                    f10 = Utilities.clamp01(((float) (AnimationUtils.currentAnimationTimeMillis() - b1Var.I5)) / 470.0f);
                }
            } else {
                f10 = 1.0f;
            }
            b1 b1Var2 = m0Var.d;
            if (b1Var2 != null && b1Var2.f51737g1 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (b1Var2 != null) {
                f11 = Utilities.clamp01(b1Var2.f51728f1);
            } else {
                f11 = 1.0f;
            }
            float f25 = 1.0f - f11;
            float z13 = org.telegram.ui.Cells.t0.z(f25, f25, f25, 1.0f);
            if (z10) {
                f12 = m0Var.d.O0();
            } else {
                f12 = -1.0f;
            }
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 >= 0) {
                float f26 = 1.0f - f12;
                max = ((1.0f - ((f26 * f26) * f26)) * 0.25f) + 0.75f;
            } else if (f11 >= 0.999f) {
                max = 1.0f;
            } else {
                max = Math.max(sVar2.getScaleX(), (z13 * 0.25f) + 0.75f);
            }
            if (z10) {
                canvas = canvas3;
                f13 = 1.0f;
                f14 = Math.min(1.0f, f11 / 0.55f);
            } else {
                canvas = canvas3;
                f13 = 1.0f;
                f14 = 1.0f;
            }
            if (i10 >= 0 && f12 < f13) {
                m0Var.d.invalidate();
            }
            if (sVar2.getScaleX() != max) {
                View view = sVar2;
                float f27 = 0.0f;
                while (true) {
                    f20 = f27;
                    if (view == null || view == m0Var.h || !(view.getParent() instanceof View)) {
                        break;
                    }
                    f27 = f20 + view.getTop();
                    view = (View) view.getParent();
                }
                if (Float.isNaN(m0Var.I)) {
                    max2 = sVar2.getHeight();
                } else {
                    max2 = Math.max(0.0f, Math.min(sVar2.getHeight(), m0Var.I - f20));
                }
                sVar2.setPivotX(sVar2.getWidth() / 2.0f);
                sVar2.setPivotY(max2);
                sVar2.setScaleX(max);
                sVar2.setScaleY(max);
            }
            if (sVar2.getAlpha() != f14) {
                sVar2.setAlpha(f14);
            }
            if (f10 < 1.0f && !z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10) {
                f11 = f10;
            }
            b1 b1Var3 = m0Var.d;
            if (b1Var3 == null) {
                f15 = 90.0f;
            } else {
                m0Var.W = m0Var.f52063r - (b1Var3.D0() - AndroidUtilities.dp(8.0f));
                float translationY = wVar.getTranslationY();
                float f28 = m0Var.W;
                if (translationY != f28) {
                    wVar.setTranslationY(f28);
                    wVar.invalidate();
                }
                if (f11 < 1.0f) {
                    f15 = 90.0f;
                    if (f11 >= 0.0f) {
                        float max3 = Math.max(0.0f, Math.min(1.0f, f11));
                        float f29 = 1.0f - max3;
                        f16 = Math.min(1.0f, max3 / 0.35f);
                        f17 = ((1.0f - ((f29 * f29) * f29)) * 0.15f) + 0.85f;
                    } else {
                        float max4 = Math.max(0.0f, Math.min(1.0f, ((-f11) * 150.0f) / 90.0f));
                        f17 = org.telegram.ui.Cells.t0.z(max4, 0.15f, max4, 1.0f);
                        f16 = 1.0f - max4;
                    }
                } else {
                    f15 = 90.0f;
                    f16 = 1.0f;
                    f17 = 1.0f;
                }
                if (wVar.getScaleX() != f17) {
                    wVar.setPivotX(wVar.getWidth() / 2.0f);
                    wVar.setPivotY(wVar.getHeight() / 2.0f);
                    wVar.setScaleX(f17);
                    wVar.setScaleY(f17);
                    wVar.invalidate();
                }
                if (wVar.getAlpha() != f16) {
                    wVar.setAlpha(f16);
                }
                if ((f17 != 1.0f || f16 != 1.0f) && (sVar = m0Var.S) != null) {
                    sVar.postInvalidateOnAnimation();
                }
            }
            float f30 = -f21;
            float max5 = Math.max(0.0f, f30);
            float f31 = m0Var.I - f21;
            int i11 = 0;
            float f32 = 0.0f;
            while (i11 < sVar2.getChildCount()) {
                View childAt = sVar2.getChildAt(i11);
                if (!(childAt instanceof r)) {
                    z12 = z11;
                    f18 = max5;
                } else {
                    r rVar = (r) childAt;
                    z12 = z11;
                    if (f32 == 0.0f) {
                        f32 = childAt.getHeight();
                    }
                    if (z12 && f32 > 0.0f) {
                        f18 = max5;
                        float max6 = Math.max(1.0f, (f31 - max5) / f32);
                        float height3 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                        if (f10 >= 0.0f) {
                            f19 = (b1.R(Math.max(0.0f, Math.min(1.0f, ((f10 * 470.0f) - (Math.max(0.0f, ((f31 - height3) / f32) - 0.5f) * Math.min(45.0f, 250.0f / max6))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                        } else {
                            float max7 = Math.max(0.0f, Math.min(1.0f, (((-f10) * 150.0f) - (Math.max(0.0f, ((height3 - f18) / f32) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max6 - 1.0f)))) / f15));
                            f19 = org.telegram.ui.Cells.t0.z(max7, 0.4f, max7, 1.0f);
                        }
                    } else {
                        f18 = max5;
                        f19 = 1.0f;
                    }
                    if (rVar.f52095r != f19) {
                        rVar.f52095r = f19;
                        rVar.invalidate();
                    }
                }
                i11++;
                z11 = z12;
                max5 = f18;
            }
            float f33 = max5;
            if (z11 && f32 > 0.0f) {
                float max8 = Math.max(1.0f, (f31 - f33) / f32);
                if (m0Var.Y == null) {
                    m0Var.Y = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
                }
                if (f10 >= 0.0f) {
                    matrix.setScale(1.0f, f32);
                    matrix.postTranslate(0.0f, (f31 - (Math.max(-1.0f, ((f10 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / max8)) * f32)) - (f32 / 2.0f));
                } else {
                    matrix.setScale(1.0f, f32);
                    matrix.postTranslate(0.0f, ((Math.max(-1.0f, (((-f10) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, max8 - 1.0f))) * f32) + f33) - (f32 / 2.0f));
                }
                m0Var.Y.setLocalMatrix(matrix);
                paint4.setShader(m0Var.Y);
                if (paint4.getXfermode() == null) {
                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, width, sVar2.getHeight(), paint4);
                sVar2.invalidate();
            } else {
                canvas2 = canvas;
            }
            c cVar2 = m0Var.f52066x;
            if (cVar2 != null) {
                RectF rectF3 = cVar2.F;
                if (cVar2.f51936x > 0.003f && !rectF3.isEmpty()) {
                    rectF.set(rectF3);
                    fArr[0] = rectF3.height() / 2.0f;
                    fArr[1] = cVar2.f51937y;
                    rectF.offset(0.0f, f30);
                    paint5.setAlpha((int) (fArr[1] * 255.0f));
                    float f34 = fArr[0];
                    canvas2.drawRoundRect(rectF, f34, f34, paint5);
                }
            }
        }
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
