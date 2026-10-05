package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class g7 extends g61 {
    public static final int f51360a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        boolean z11;
        int i10;
        h7 h7Var = (h7) view;
        org.telegram.ui.Components.p6 p6Var = h7Var.f51438a;
        ImageView imageView = h7Var.f51439b;
        int i11 = h7Var.f51440c;
        int i12 = h61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        h7Var.f51440c = i12;
        p6Var.c(h61Var.f27093l, z11, true);
        if (h61Var.f27098q) {
            i10 = org.telegram.ui.ActionBar.i6.f21030o6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (h61Var.f27088f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(tr.h);
        } else {
            if (h61Var.f27088f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        h7Var.d = z10;
        h7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new h7(context);
    }
}
