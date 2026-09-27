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
    public final int f38806a = 0;
    public int f38807b;
    public boolean f38808c;
    public Object d;
    public final Object e;
    public Object f38809f;
    public Object h;

    public w4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38807b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(w9Var, w7.y5.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.fa0 fa0Var;
        int i10 = this.f38806a;
        float f7 = 1.0f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f38808c) {
                    Drawable drawable = ((org.telegram.ui.Components.w9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.d6) && ((org.telegram.ui.Components.d6) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f22352c) {
                                fa0Var = radialProgress2.f22356j;
                            } else {
                                fa0Var = radialProgress2.f22355i;
                            }
                            if (fa0Var.f24246w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f38809f = ofFloat;
                            ofFloat.addListener(new v4(this, 0));
                            ((ValueAnimator) this.f38809f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final w4 f38120b;

                                {
                                    this.f38120b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f38120b.invalidate();
                                            return;
                                        default:
                                            this.f38120b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f38809f).setDuration(250L);
                            ((ValueAnimator) this.f38809f).start();
                        } else {
                            this.f38808c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final w4 f38120b;

                            {
                                this.f38120b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f38120b.invalidate();
                                        return;
                                    default:
                                        this.f38120b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f38809f;
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
                pd1 pd1Var = (pd1) this.h;
                pc1 pc1Var = pd1Var.f36390a;
                if (this.f38808c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.i6.s(this, pd1Var.f36452x0, pc1Var);
                    Paint G = pc1Var.G("paintChatActionBackground");
                    ColorFilter colorFilter = G.getColorFilter();
                    G.setColorFilter((ColorMatrixColorFilter) this.f38809f);
                    ed1 ed1Var = pd1Var.f36452x0;
                    if (ed1Var != null && (ed1Var.getBackground() instanceof org.telegram.ui.Components.nc0) && pd1Var.l1 < 0.0f) {
                        f7 = 0.33f;
                    }
                    int alpha = G.getAlpha();
                    G.setAlpha((int) (alpha * f7));
                    canvas.drawRect(rectF, G);
                    G.setAlpha(alpha);
                    G.setColorFilter(colorFilter);
                    if (pd1Var.M1) {
                        float f10 = pd1Var.f36429n1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f * pd1Var.f36431o1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f38807b != getHeight()) {
                        int height = getHeight();
                        this.f38807b = height;
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
        switch (this.f38806a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f38807b;
                ((RadialProgress2) this.e).q(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f38806a) {
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

    public w4(pd1 pd1Var, Context context, boolean z10) {
        super(context);
        this.h = pd1Var;
        this.f38808c = z10;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f38809f = new ColorMatrixColorFilter(colorMatrix);
    }
}
