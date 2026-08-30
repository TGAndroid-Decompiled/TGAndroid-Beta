package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.nr;
import org.telegram.ui.l61;
public final class x7 extends LinearLayout {
    public float f42562a;
    public float f42563b;
    public ValueAnimator f42564c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.z5 f42565f;
    public final z7 h;

    public x7(z7 z7Var, Context context) {
        super(context);
        this.h = z7Var;
        this.e = new Paint(1);
        this.f42565f = new org.telegram.ui.Components.z5(this);
    }

    public static void a(x7 x7Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x7Var.f42563b = floatValue;
        super.setTranslationY(floatValue + x7Var.f42562a);
    }

    public final void b(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.f42564c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (z10) {
            setVisibility(0);
            float f11 = this.f42563b;
            if (z4) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42564c = ofFloat;
            ofFloat.addUpdateListener(new w7(this, 0));
            this.f42564c.addListener(new l61(12, this, z4));
            this.f42564c.setDuration(320L);
            this.f42564c.setInterpolator(nr.h);
            this.f42564c.start();
            return;
        }
        if (z4) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z4) {
            f10 = getMeasuredHeight();
        }
        this.f42563b = f10;
        super.setTranslationY(f10 + this.f42562a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.f19852a7;
        z7 z7Var = this.h;
        f6Var = ((org.telegram.ui.ActionBar.g3) z7Var.T).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        if (z7Var.f42663f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f42565f.d(f10, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f42563b;
        this.f42562a = f10;
        super.setTranslationY(f11 + f10);
    }
}
