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
public final class x4 extends FrameLayout {
    public final int f45633a = 0;
    public int f45634b;
    public boolean f45635c;
    public Object d;
    public final Object e;
    public Object f45636f;
    public Object h;

    public x4(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f45634b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(y9Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, u6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.pa0 pa0Var;
        int i10 = this.f45633a;
        float f7 = 1.0f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f45635c) {
                    Drawable drawable = ((org.telegram.ui.Components.y9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.g6) && ((org.telegram.ui.Components.g6) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f26245c) {
                                pa0Var = radialProgress2.f26249j;
                            } else {
                                pa0Var = radialProgress2.f26248i;
                            }
                            if (pa0Var.f31512w < 1.0f) {
                                radialProgress2.p(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f45636f = ofFloat;
                            ofFloat.addListener(new kg.e(this, 7));
                            ((ValueAnimator) this.f45636f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final x4 f44973b;

                                {
                                    this.f44973b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f44973b.invalidate();
                                            return;
                                        default:
                                            this.f44973b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f45636f).setDuration(250L);
                            ((ValueAnimator) this.f45636f).start();
                        } else {
                            this.f45635c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final x4 f44973b;

                            {
                                this.f44973b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f44973b.invalidate();
                                        return;
                                    default:
                                        this.f44973b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f45636f;
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
                tc1 tc1Var = (tc1) this.h;
                sb1 sb1Var = tc1Var.f43736a;
                if (this.f45635c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.y6.s(this, tc1Var.f43802y0, sb1Var);
                    Paint d = sb1Var.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f45636f);
                    ic1 ic1Var = tc1Var.f43802y0;
                    if (ic1Var != null && (ic1Var.getBackground() instanceof org.telegram.ui.Components.uc0) && tc1Var.f43773m1 < 0.0f) {
                        f7 = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f7));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (tc1Var.N1) {
                        float f10 = tc1Var.f43778o1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f * tc1Var.f43780p1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f45634b != getHeight()) {
                        int height = getHeight();
                        this.f45634b = height;
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
        switch (this.f45633a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f45634b;
                ((RadialProgress2) this.e).r(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f45633a) {
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

    public x4(tc1 tc1Var, Context context, boolean z10) {
        super(context);
        this.h = tc1Var;
        this.f45635c = z10;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f45636f = new ColorMatrixColorFilter(colorMatrix);
    }
}
