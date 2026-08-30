package ph;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class e3 extends View implements c2 {
    public final org.telegram.ui.Components.j6 f41564a;

    public e3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, true, false);
        this.f41564a = j6Var;
        j6Var.k(0.35f, 300L, nr.h);
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.p(AndroidUtilities.dp(1.4f), AndroidUtilities.dp(0.4f), 1275068416);
        j6Var.f25884b = 1;
        j6Var.setCallback(this);
        j6Var.G = AndroidUtilities.displaySize.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Components.j6 j6Var = this.f41564a;
        j6Var.setBounds(0, 0, width, height);
        j6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f41564a.G = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f10) {
        this.f41564a.r(i0.a.d(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f41564a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
