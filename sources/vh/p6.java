package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.gr;
public final class p6 extends LinearLayout {
    public float f51766a;
    public float f51767b;
    public ValueAnimator f51768c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.t5 f51769f;
    public final r6 h;

    public p6(r6 r6Var, Context context) {
        super(context);
        this.h = r6Var;
        this.e = new Paint(1);
        this.f51769f = new org.telegram.ui.Components.t5(this);
    }

    public static void a(p6 p6Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p6Var.f51767b = floatValue;
        super.setTranslationY(floatValue + p6Var.f51766a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f51768c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f51767b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f51768c = ofFloat;
            ofFloat.addUpdateListener(new o6(this, 0));
            this.f51768c.addListener(new sg.y(13, this, z10));
            this.f51768c.setDuration(320L);
            this.f51768c.setInterpolator(gr.h);
            this.f51768c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f51767b = f7;
        super.setTranslationY(f7 + this.f51766a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.t6.f20872a7;
        r6 r6Var = this.h;
        w6 w6Var = r6Var.W;
        int i11 = w6.U1;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, w6Var.I0);
        Paint paint = this.e;
        paint.setColor(w02);
        if (r6Var.f51889f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f51769f.e(false, f7) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f51767b;
        this.f51766a = f7;
        super.setTranslationY(f10 + f7);
    }
}
