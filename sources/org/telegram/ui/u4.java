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

    public final int f43104a = 0;

    public int f43105b;

    public boolean f43106c;
    public Object d;

    public final Object f43107e;

    public Object f43108f;
    public Object h;

    public u4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f43105b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.setAspectFit(true);
        n9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(n9Var, h7.z5.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.f43107e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.f43104a;
        float f10 = 1.0f;
        Object obj = this.f43107e;
        final int i11 = 0;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f43106c) {
                    Drawable drawable = ((org.telegram.ui.Components.n9) this.d).getImageReceiver().getDrawable();
                    final int i12 = 1;
                    if ((drawable instanceof org.telegram.ui.Components.x5) && ((org.telegram.ui.Components.x5) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if ((radialProgress2.f26466c ? radialProgress2.f26471j : radialProgress2.f26470i).f28314w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f43108f = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addListener(new lh.h9(this, 8));
                            ((ValueAnimator) this.f43108f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                                public final u4 f42778b;

                                {
                                    this.f42778b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i11) {
                                        case 0:
                                            this.f42778b.invalidate();
                                            break;
                                        default:
                                            this.f42778b.invalidate();
                                            break;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f43108f).setDuration(250L);
                            ((ValueAnimator) this.f43108f).start();
                        } else {
                            this.f43106c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final u4 f42778b;

                            {
                                this.f42778b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (i12) {
                                    case 0:
                                        this.f42778b.invalidate();
                                        break;
                                    default:
                                        this.f42778b.invalidate();
                                        break;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f43108f;
                    if (valueAnimator2 == null) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) this.h;
                        if (valueAnimator3 != null) {
                            radialProgress2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                            radialProgress2.draw(canvas);
                        }
                    } else {
                        radialProgress2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                    }
                }
                break;
            default:
                Paint paint = (Paint) obj;
                nc1 nc1Var = (nc1) this.h;
                mb1 mb1Var = nc1Var.f40735a;
                if (this.f43106c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.g6.s(this, nc1Var.f40784t0, mb1Var);
                    Paint paintN = mb1Var.N("paintChatActionBackground");
                    ColorFilter colorFilter = paintN.getColorFilter();
                    paintN.setColorFilter((ColorMatrixColorFilter) this.f43108f);
                    cc1 cc1Var = nc1Var.f40784t0;
                    if (cc1Var != null && (cc1Var.getBackground() instanceof org.telegram.ui.Components.nb0) && nc1Var.f40760h1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = paintN.getAlpha();
                    paintN.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, paintN);
                    paintN.setAlpha(alpha);
                    paintN.setColorFilter(colorFilter);
                    if (nc1Var.I1) {
                        float f11 = nc1Var.f40764j1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.b.k(-16777216, (int) (f11 * 255.0f * nc1Var.f40766k1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f43105b != getHeight()) {
                        int height = getHeight();
                        this.f43105b = height;
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        this.d = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    canvas.drawRect(rectF, paint);
                    canvas.restore();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43104a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                RadialProgress2 radialProgress2 = (RadialProgress2) this.f43107e;
                int i14 = this.f43105b;
                radialProgress2.q(width - i14, height - i14, width + i14, height + i14);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f43104a) {
            case 1:
                super.onMeasure(i10, i11);
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getMeasuredWidth() > AndroidUtilities.dp(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    }
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    public u4(nc1 nc1Var, Context context, boolean z10) {
        super(context);
        this.h = nc1Var;
        this.f43106c = z10;
        Paint paint = new Paint(3);
        this.f43107e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f43108f = new ColorMatrixColorFilter(colorMatrix);
    }
}
