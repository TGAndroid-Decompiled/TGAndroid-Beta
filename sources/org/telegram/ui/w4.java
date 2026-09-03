package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgress2;
public final class w4 extends FrameLayout {
    public final int f42273a = 0;
    public int f42274b;
    public boolean f42275c;
    public Object d;
    public final Object f42276e;
    public Object f42277f;
    public Object h;

    public w4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f42274b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(p9Var, k7.c6.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.f42276e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.w90 w90Var;
        int i10 = this.f42273a;
        float f10 = 1.0f;
        Object obj = this.f42276e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f42275c) {
                    Drawable drawable = ((org.telegram.ui.Components.p9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.y5) && ((org.telegram.ui.Components.y5) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f24970c) {
                                w90Var = radialProgress2.f24975j;
                            } else {
                                w90Var = radialProgress2.f24974i;
                            }
                            if (w90Var.f32711w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f42277f = ofFloat;
                            ofFloat.addListener(new dg.l0(this, 29));
                            ((ValueAnimator) this.f42277f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final w4 f42007b;

                                {
                                    this.f42007b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f42007b.invalidate();
                                            return;
                                        default:
                                            this.f42007b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f42277f).setDuration(250L);
                            ((ValueAnimator) this.f42277f).start();
                        } else {
                            this.f42275c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final w4 f42007b;

                            {
                                this.f42007b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f42007b.invalidate();
                                        return;
                                    default:
                                        this.f42007b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f42277f;
                    if (valueAnimator2 != null) {
                        radialProgress2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        return;
                    }
                    ValueAnimator valueAnimator3 = (ValueAnimator) this.h;
                    if (valueAnimator3 != null) {
                        radialProgress2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            default:
                Paint paint = (Paint) obj;
                jd1 jd1Var = (jd1) this.h;
                ic1 ic1Var = jd1Var.f37961a;
                if (this.f42275c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.k6.s(this, jd1Var.f38013u0, ic1Var);
                    Paint F = ic1Var.F("paintChatActionBackground");
                    ColorFilter colorFilter = F.getColorFilter();
                    F.setColorFilter((ColorMatrixColorFilter) this.f42277f);
                    yc1 yc1Var = jd1Var.f38013u0;
                    if (yc1Var != null && (yc1Var.getBackground() instanceof org.telegram.ui.Components.fc0) && jd1Var.f37989i1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = F.getAlpha();
                    F.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, F);
                    F.setAlpha(alpha);
                    F.setColorFilter(colorFilter);
                    if (jd1Var.J1) {
                        float f11 = jd1Var.f37993k1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.a.k(-16777216, (int) (f11 * 255.0f * jd1Var.l1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f42274b != getHeight()) {
                        int height = getHeight();
                        this.f42274b = height;
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        this.d = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    canvas.drawRect(rectF, paint);
                    canvas.restore();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f42273a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f42274b;
                ((RadialProgress2) this.f42276e).q(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f42273a) {
            case 1:
                super.onMeasure(i10, i11);
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getMeasuredWidth() > AndroidUtilities.dp(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    }
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public w4(jd1 jd1Var, Context context, boolean z4) {
        super(context);
        this.h = jd1Var;
        this.f42275c = z4;
        Paint paint = new Paint(3);
        this.f42276e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f42277f = new ColorMatrixColorFilter(colorMatrix);
    }
}
