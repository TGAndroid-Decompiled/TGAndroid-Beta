package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.mr;
import org.telegram.ui.s61;
public final class w7 extends LinearLayout {
    public float f42544a;
    public float f42545b;
    public ValueAnimator f42546c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.z5 f42547f;
    public final y7 h;

    public w7(y7 y7Var, Context context) {
        super(context);
        this.h = y7Var;
        this.e = new Paint(1);
        this.f42547f = new org.telegram.ui.Components.z5(this);
    }

    public static void a(w7 w7Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w7Var.f42545b = floatValue;
        super.setTranslationY(floatValue + w7Var.f42544a);
    }

    public final void b(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f42546c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (z10) {
            setVisibility(0);
            float f11 = this.f42545b;
            if (z4) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42546c = ofFloat;
            ofFloat.addUpdateListener(new v7(this, 0));
            this.f42546c.addListener(new s61(12, this, z4));
            this.f42546c.setDuration(320L);
            this.f42546c.setInterpolator(mr.h);
            this.f42546c.start();
            return;
        }
        if (z4) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z4) {
            f10 = getMeasuredHeight();
        }
        this.f42545b = f10;
        super.setTranslationY(f10 + this.f42544a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.f19827a7;
        y7 y7Var = this.h;
        f6Var = ((org.telegram.ui.ActionBar.g3) y7Var.T).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        if (y7Var.f42661f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f42547f.d(f10, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f42545b;
        this.f42544a = f10;
        super.setTranslationY(f11 + f10);
    }
}
