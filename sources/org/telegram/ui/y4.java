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
    public final int f41728a = 0;
    public int f41729b;
    public boolean f41730c;
    public Object d;
    public final Object e;
    public Object f41731f;
    public Object h;

    public y4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f41729b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        z9Var.setAspectFit(true);
        z9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(z9Var, w7.z5.d(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.ta0 ta0Var;
        int i10 = this.f41728a;
        float f7 = 1.0f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f41730c) {
                    Drawable drawable = ((org.telegram.ui.Components.z9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.f6) && ((org.telegram.ui.Components.f6) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f22947c) {
                                ta0Var = radialProgress2.f22951j;
                            } else {
                                ta0Var = radialProgress2.f22950i;
                            }
                            if (ta0Var.f29028w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f41731f = ofFloat;
                            ofFloat.addListener(new u0(this, 3));
                            ((ValueAnimator) this.f41731f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final y4 f41426b;

                                {
                                    this.f41426b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f41426b.invalidate();
                                            return;
                                        default:
                                            this.f41426b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f41731f).setDuration(250L);
                            ((ValueAnimator) this.f41731f).start();
                        } else {
                            this.f41730c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final y4 f41426b;

                            {
                                this.f41426b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f41426b.invalidate();
                                        return;
                                    default:
                                        this.f41426b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f41731f;
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
                ce1 ce1Var = (ce1) this.h;
                cd1 cd1Var = ce1Var.f34577a;
                if (this.f41730c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.g6.s(this, ce1Var.f34639x0, cd1Var);
                    Paint F = cd1Var.F("paintChatActionBackground");
                    ColorFilter colorFilter = F.getColorFilter();
                    F.setColorFilter((ColorMatrixColorFilter) this.f41731f);
                    rd1 rd1Var = ce1Var.f34639x0;
                    if (rd1Var != null && (rd1Var.getBackground() instanceof org.telegram.ui.Components.cd0) && ce1Var.l1 < 0.0f) {
                        f7 = 0.33f;
                    }
                    int alpha = F.getAlpha();
                    F.setAlpha((int) (alpha * f7));
                    canvas.drawRect(rectF, F);
                    F.setAlpha(alpha);
                    F.setColorFilter(colorFilter);
                    if (ce1Var.M1) {
                        float f10 = ce1Var.f34616n1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f * ce1Var.f34618o1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f41729b != getHeight()) {
                        int height = getHeight();
                        this.f41729b = height;
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
        switch (this.f41728a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f41729b;
                ((RadialProgress2) this.e).q(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f41728a) {
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

    public y4(ce1 ce1Var, Context context, boolean z10) {
        super(context);
        this.h = ce1Var;
        this.f41730c = z10;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f41731f = new ColorMatrixColorFilter(colorMatrix);
    }
}
