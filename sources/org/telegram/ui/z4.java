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
public final class z4 extends FrameLayout {
    public final int f43616a = 0;
    public int f43617b;
    public boolean f43618c;
    public Object d;
    public final Object e;
    public Object f43619f;
    public Object h;

    public z4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f43617b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(w9Var, w7.z5.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, d6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.na0 na0Var;
        int i10 = this.f43616a;
        float f7 = 1.0f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f43618c) {
                    Drawable drawable = ((org.telegram.ui.Components.w9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.e6) && ((org.telegram.ui.Components.e6) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f24303c) {
                                na0Var = radialProgress2.f24307j;
                            } else {
                                na0Var = radialProgress2.f24306i;
                            }
                            if (na0Var.f28740w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f43619f = ofFloat;
                            ofFloat.addListener(new m.a(this, 5));
                            ((ValueAnimator) this.f43619f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final z4 f43341b;

                                {
                                    this.f43341b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f43341b.invalidate();
                                            return;
                                        default:
                                            this.f43341b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f43619f).setDuration(250L);
                            ((ValueAnimator) this.f43619f).start();
                        } else {
                            this.f43618c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final z4 f43341b;

                            {
                                this.f43341b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f43341b.invalidate();
                                        return;
                                    default:
                                        this.f43341b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f43619f;
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
                kc1 kc1Var = (kc1) this.h;
                kb1 kb1Var = kc1Var.f38510a;
                if (this.f43618c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.h6.s(this, kc1Var.f38572x0, kb1Var);
                    Paint n10 = kb1Var.n("paintChatActionBackground");
                    ColorFilter colorFilter = n10.getColorFilter();
                    n10.setColorFilter((ColorMatrixColorFilter) this.f43619f);
                    zb1 zb1Var = kc1Var.f38572x0;
                    if (zb1Var != null && (zb1Var.getBackground() instanceof org.telegram.ui.Components.wc0) && kc1Var.l1 < 0.0f) {
                        f7 = 0.33f;
                    }
                    int alpha = n10.getAlpha();
                    n10.setAlpha((int) (alpha * f7));
                    canvas.drawRect(rectF, n10);
                    n10.setAlpha(alpha);
                    n10.setColorFilter(colorFilter);
                    if (kc1Var.M1) {
                        float f10 = kc1Var.f38549n1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f * kc1Var.f38551o1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f43617b != getHeight()) {
                        int height = getHeight();
                        this.f43617b = height;
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43616a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f43617b;
                ((RadialProgress2) this.e).q(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f43616a) {
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

    public z4(kc1 kc1Var, Context context, boolean z10) {
        super(context);
        this.h = kc1Var;
        this.f43618c = z10;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f43619f = new ColorMatrixColorFilter(colorMatrix);
    }
}
