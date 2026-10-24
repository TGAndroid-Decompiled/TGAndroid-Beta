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
public final class y4 extends FrameLayout {
    public final int f43744a = 0;
    public int f43745b;
    public boolean f43746c;
    public Object d;
    public final Object e;
    public Object f43747f;
    public Object h;

    public y4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f43745b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.d = u9Var;
        u9Var.setAspectFit(true);
        u9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(u9Var, w7.z5.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.ma0 ma0Var;
        int i10 = this.f43744a;
        float f7 = 1.0f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f43746c) {
                    Drawable drawable = ((org.telegram.ui.Components.u9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.c6) && ((org.telegram.ui.Components.c6) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f24453c) {
                                ma0Var = radialProgress2.f24457j;
                            } else {
                                ma0Var = radialProgress2.f24456i;
                            }
                            if (ma0Var.f28568w < 1.0f) {
                                radialProgress2.p(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f43747f = ofFloat;
                            ofFloat.addListener(new m.a(this, 5));
                            ((ValueAnimator) this.f43747f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final y4 f43465b;

                                {
                                    this.f43465b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f43465b.invalidate();
                                            return;
                                        default:
                                            this.f43465b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f43747f).setDuration(250L);
                            ((ValueAnimator) this.f43747f).start();
                        } else {
                            this.f43746c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final y4 f43465b;

                            {
                                this.f43465b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f43465b.invalidate();
                                        return;
                                    default:
                                        this.f43465b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f43747f;
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
                pc1 pc1Var = (pc1) this.h;
                pb1 pb1Var = pc1Var.f40442a;
                if (this.f43746c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.k6.s(this, pc1Var.f40508y0, pb1Var);
                    Paint d = pb1Var.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f43747f);
                    ec1 ec1Var = pc1Var.f40508y0;
                    if (ec1Var != null && (ec1Var.getBackground() instanceof org.telegram.ui.Components.wc0) && pc1Var.f40479m1 < 0.0f) {
                        f7 = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f7));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (pc1Var.N1) {
                        float f10 = pc1Var.f40484o1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f * pc1Var.f40486p1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f43745b != getHeight()) {
                        int height = getHeight();
                        this.f43745b = height;
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
        switch (this.f43744a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f43745b;
                ((RadialProgress2) this.e).r(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f43744a) {
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

    public y4(pc1 pc1Var, Context context, boolean z10) {
        super(context);
        this.h = pc1Var;
        this.f43746c = z10;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f43747f = new ColorMatrixColorFilter(colorMatrix);
    }
}
