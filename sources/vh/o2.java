package vh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.gr;
public final class o2 extends View implements y1 {
    public final org.telegram.ui.Components.e6 f51592a;

    public o2(Activity activity) {
        super(activity);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, true, true);
        this.f51592a = e6Var;
        e6Var.n(0.35f, 300L, gr.h);
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.s(org.telegram.messenger.i0.L(1.4f), org.telegram.messenger.i0.L(0.4f), 1275068416);
        e6Var.f25695b = 1;
        e6Var.setCallback(this);
        e6Var.M = org.telegram.messenger.i0.f16026q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.e6 e6Var = this.f51592a;
        e6Var.setBounds(0, 0, width, height);
        e6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f51592a.M = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f7) {
        this.f51592a.u(i0.b.f(f7, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f51592a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
