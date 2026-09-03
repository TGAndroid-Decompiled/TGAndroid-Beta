package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.pr;
import org.telegram.ui.vd1;
public final class u7 extends LinearLayout {
    public float f46173a;
    public float f46174b;
    public ValueAnimator f46175c;
    public ValueAnimator d;
    public final Paint f46176e;
    public final org.telegram.ui.Components.z5 f46177f;
    public final w7 h;

    public u7(w7 w7Var, Context context) {
        super(context);
        this.h = w7Var;
        this.f46176e = new Paint(1);
        this.f46177f = new org.telegram.ui.Components.z5(this);
    }

    public static void a(u7 u7Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        u7Var.f46174b = floatValue;
        super.setTranslationY(floatValue + u7Var.f46173a);
    }

    public final void b(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f46175c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (z10) {
            setVisibility(0);
            float f11 = this.f46174b;
            if (z4) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f46175c = ofFloat;
            ofFloat.addUpdateListener(new t7(this, 0));
            this.f46175c.addListener(new vd1(12, this, z4));
            this.f46175c.setDuration(320L);
            this.f46175c.setInterpolator(pr.h);
            this.f46175c.start();
            return;
        }
        if (z4) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z4) {
            f10 = getMeasuredHeight();
        }
        this.f46174b = f10;
        super.setTranslationY(f10 + this.f46173a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.k6.f21607a7;
        w7 w7Var = this.h;
        g6Var = ((org.telegram.ui.ActionBar.h3) w7Var.T).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        Paint paint = this.f46176e;
        paint.setColor(v02);
        if (w7Var.f46266f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f46177f.d(f10, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f46174b;
        this.f46173a = f10;
        super.setTranslationY(f11 + f10);
    }
}
