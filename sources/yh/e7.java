package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;
public final class e7 extends g51 {
    public static final int f47034a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        int i10;
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.p6 p6Var = f7Var.f47071a;
        ImageView imageView = f7Var.f47072b;
        int i11 = f7Var.f47073c;
        int i12 = h51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        f7Var.f47073c = i12;
        p6Var.c(h51Var.f24507l, z11, true);
        if (h51Var.f24512q) {
            i10 = org.telegram.ui.ActionBar.h6.f18990o6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (h51Var.f24502f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(rr.h);
        } else {
            if (h51Var.f24502f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new f7(context);
    }
}
