package qh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class d3 extends View implements b2 {
    public final org.telegram.ui.Components.j6 f45223a;

    public d3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, true, false);
        this.f45223a = j6Var;
        j6Var.k(0.35f, 300L, pr.h);
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        j6Var.f27999b = 1;
        j6Var.setCallback(this);
        j6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.j6 j6Var = this.f45223a;
        j6Var.setBounds(0, 0, width, height);
        j6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f45223a.G = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f45223a.r(i0.a.d(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f45223a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
