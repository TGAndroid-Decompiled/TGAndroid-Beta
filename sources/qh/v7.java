package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.pr;
import org.telegram.ui.qd1;
public final class v7 extends LinearLayout {
    public float f46197a;
    public float f46198b;
    public ValueAnimator f46199c;
    public ValueAnimator d;
    public final Paint f46200e;
    public final org.telegram.ui.Components.z5 f46201f;
    public final x7 h;

    public v7(x7 x7Var, Context context) {
        super(context);
        this.h = x7Var;
        this.f46200e = new Paint(1);
        this.f46201f = new org.telegram.ui.Components.z5(this);
    }

    public static void a(v7 v7Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v7Var.f46198b = floatValue;
        super.setTranslationY(floatValue + v7Var.f46197a);
    }

    public final void b(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f46199c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (z10) {
            setVisibility(0);
            float f11 = this.f46198b;
            if (z4) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f46199c = ofFloat;
            ofFloat.addUpdateListener(new u7(this, 0));
            this.f46199c.addListener(new qd1(12, this, z4));
            this.f46199c.setDuration(320L);
            this.f46199c.setInterpolator(pr.h);
            this.f46199c.start();
            return;
        }
        if (z4) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z4) {
            f10 = getMeasuredHeight();
        }
        this.f46198b = f10;
        super.setTranslationY(f10 + this.f46197a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.k6.f21605a7;
        x7 x7Var = this.h;
        g6Var = ((org.telegram.ui.ActionBar.h3) x7Var.T).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        Paint paint = this.f46200e;
        paint.setColor(v02);
        if (x7Var.f46293f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f46201f.d(f10, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f46198b;
        this.f46197a = f10;
        super.setTranslationY(f11 + f10);
    }
}
