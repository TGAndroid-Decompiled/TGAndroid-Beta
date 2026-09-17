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
public final class u4 extends FrameLayout {
    public final int f40921a = 0;
    public int f40922b;
    public boolean f40923c;
    public Object d;
    public final Object f40924e;
    public Object f40925f;
    public Object h;

    public u4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f40922b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.d = x9Var;
        x9Var.setAspectFit(true);
        x9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(x9Var, w7.x5.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.f40924e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.t90 t90Var;
        int i10 = this.f40921a;
        float f7 = 1.0f;
        Object obj = this.f40924e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f40923c) {
                    Drawable drawable = ((org.telegram.ui.Components.x9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.d6) && ((org.telegram.ui.Components.d6) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f24073c) {
                                t90Var = radialProgress2.f24078j;
                            } else {
                                t90Var = radialProgress2.f24077i;
                            }
                            if (t90Var.f30579w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f40925f = ofFloat;
                            ofFloat.addListener(new s0(this, 3));
                            ((ValueAnimator) this.f40925f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final u4 f40615b;

                                {
                                    this.f40615b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f40615b.invalidate();
                                            return;
                                        default:
                                            this.f40615b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f40925f).setDuration(250L);
                            ((ValueAnimator) this.f40925f).start();
                        } else {
                            this.f40923c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final u4 f40615b;

                            {
                                this.f40615b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f40615b.invalidate();
                                        return;
                                    default:
                                        this.f40615b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f40925f;
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
                wd1 wd1Var = (wd1) this.h;
                wc1 wc1Var = wd1Var.f41915a;
                if (this.f40923c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.j6.s(this, wd1Var.f41978x0, wc1Var);
                    Paint G = wc1Var.G("paintChatActionBackground");
                    ColorFilter colorFilter = G.getColorFilter();
                    G.setColorFilter((ColorMatrixColorFilter) this.f40925f);
                    ld1 ld1Var = wd1Var.f41978x0;
                    if (ld1Var != null && (ld1Var.getBackground() instanceof org.telegram.ui.Components.dc0) && wd1Var.l1 < 0.0f) {
                        f7 = 0.33f;
                    }
                    int alpha = G.getAlpha();
                    G.setAlpha((int) (alpha * f7));
                    canvas.drawRect(rectF, G);
                    G.setAlpha(alpha);
                    G.setColorFilter(colorFilter);
                    if (wd1Var.M1) {
                        float f10 = wd1Var.f41955n1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f * wd1Var.f41957o1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f40922b != getHeight()) {
                        int height = getHeight();
                        this.f40922b = height;
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
        switch (this.f40921a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f40922b;
                ((RadialProgress2) this.f40924e).q(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40921a) {
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

    public u4(wd1 wd1Var, Context context, boolean z10) {
        super(context);
        this.h = wd1Var;
        this.f40923c = z10;
        Paint paint = new Paint(3);
        this.f40924e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f40925f = new ColorMatrixColorFilter(colorMatrix);
    }
}
