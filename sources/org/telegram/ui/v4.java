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
public final class v4 extends FrameLayout {
    public final int f41556a = 0;
    public int f41557b;
    public boolean f41558c;
    public Object d;
    public final Object f41559e;
    public Object f41560f;
    public Object h;

    public v4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f41557b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(w9Var, w7.z5.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, d6Var);
        this.f41559e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.ga0 ga0Var;
        int i10 = this.f41556a;
        float f7 = 1.0f;
        Object obj = this.f41559e;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f41558c) {
                    Drawable drawable = ((org.telegram.ui.Components.w9) this.d).getImageReceiver().getDrawable();
                    if ((drawable instanceof org.telegram.ui.Components.d6) && ((org.telegram.ui.Components.d6) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f24263c) {
                                ga0Var = radialProgress2.f24268j;
                            } else {
                                ga0Var = radialProgress2.f24267i;
                            }
                            if (ga0Var.f26787w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f41560f = ofFloat;
                            ofFloat.addListener(new u4(this, 0));
                            ((ValueAnimator) this.f41560f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final v4 f40690b;

                                {
                                    this.f40690b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f40690b.invalidate();
                                            return;
                                        default:
                                            this.f40690b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f41560f).setDuration(250L);
                            ((ValueAnimator) this.f41560f).start();
                        } else {
                            this.f41558c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final v4 f40690b;

                            {
                                this.f40690b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f40690b.invalidate();
                                        return;
                                    default:
                                        this.f40690b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f41560f;
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
                rd1 rd1Var = (rd1) this.h;
                rc1 rc1Var = rd1Var.f40037a;
                if (this.f41558c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.i6.s(this, rd1Var.f40100x0, rc1Var);
                    Paint H = rc1Var.H("paintChatActionBackground");
                    ColorFilter colorFilter = H.getColorFilter();
                    H.setColorFilter((ColorMatrixColorFilter) this.f41560f);
                    gd1 gd1Var = rd1Var.f40100x0;
                    if (gd1Var != null && (gd1Var.getBackground() instanceof org.telegram.ui.Components.pc0) && rd1Var.l1 < 0.0f) {
                        f7 = 0.33f;
                    }
                    int alpha = H.getAlpha();
                    H.setAlpha((int) (alpha * f7));
                    canvas.drawRect(rectF, H);
                    H.setAlpha(alpha);
                    H.setColorFilter(colorFilter);
                    if (rd1Var.M1) {
                        float f10 = rd1Var.f40077n1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f * rd1Var.f40079o1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f41557b != getHeight()) {
                        int height = getHeight();
                        this.f41557b = height;
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
        switch (this.f41556a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i14 = this.f41557b;
                ((RadialProgress2) this.f41559e).q(width - i14, height - i14, width + i14, height + i14);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f41556a) {
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

    public v4(rd1 rd1Var, Context context, boolean z10) {
        super(context);
        this.h = rd1Var;
        this.f41558c = z10;
        Paint paint = new Paint(3);
        this.f41559e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f41560f = new ColorMatrixColorFilter(colorMatrix);
    }
}
