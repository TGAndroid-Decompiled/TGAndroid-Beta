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
    public final int f43173a = 0;
    public int f43174b;
    public boolean f43175c;
    public Object d;
    public final Object f43176e;
    public Object f43177f;
    public Object h;

    public u4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f43174b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.d = t9Var;
        t9Var.setAspectFit(true);
        t9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(t9Var, i7.f6.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.f43176e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.o90 o90Var;
        int i10 = this.f43173a;
        float f9 = 1.0f;
        Object obj = this.f43176e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f43175c) {
                    Drawable drawable = ((org.telegram.ui.Components.t9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.c6) && ((org.telegram.ui.Components.c6) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f26481c) {
                                o90Var = radialProgress2.f26486j;
                            } else {
                                o90Var = radialProgress2.f26485i;
                            }
                            if (o90Var.f31316w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f43177f = ofFloat;
                            ofFloat.addListener(new nh.q5(this, 8));
                            ((ValueAnimator) this.f43177f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final u4 f42543b;

                                {
                                    this.f42543b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f42543b.invalidate();
                                            return;
                                        default:
                                            this.f42543b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f43177f).setDuration(250L);
                            ((ValueAnimator) this.f43177f).start();
                        } else {
                            this.f43175c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final u4 f42543b;

                            {
                                this.f42543b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f42543b.invalidate();
                                        return;
                                    default:
                                        this.f42543b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f43177f;
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
                qc1 qc1Var = (qc1) this.h;
                pb1 pb1Var = qc1Var.f41623a;
                if (this.f43175c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.g6.s(this, qc1Var.f41672t0, pb1Var);
                    Paint G = pb1Var.G("paintChatActionBackground");
                    ColorFilter colorFilter = G.getColorFilter();
                    G.setColorFilter((ColorMatrixColorFilter) this.f43177f);
                    fc1 fc1Var = qc1Var.f41672t0;
                    if (fc1Var != null && (fc1Var.getBackground() instanceof org.telegram.ui.Components.yb0) && qc1Var.f41648h1 < 0.0f) {
                        f9 = 0.33f;
                    }
                    int alpha = G.getAlpha();
                    G.setAlpha((int) (alpha * f9));
                    canvas.drawRect(rectF, G);
                    G.setAlpha(alpha);
                    G.setColorFilter(colorFilter);
                    if (qc1Var.I1) {
                        float f10 = qc1Var.f41652j1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f * qc1Var.f41654k1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f43174b != getHeight()) {
                        int height = getHeight();
                        this.f43174b = height;
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
        switch (this.f43173a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f43174b;
                ((RadialProgress2) this.f43176e).q(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f43173a) {
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

    public u4(qc1 qc1Var, Context context, boolean z10) {
        super(context);
        this.h = qc1Var;
        this.f43175c = z10;
        Paint paint = new Paint(3);
        this.f43176e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f43177f = new ColorMatrixColorFilter(colorMatrix);
    }
}
