package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class e7 extends u51 {
    public static final int f47335a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        int i10;
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.p6 p6Var = f7Var.f47379a;
        ImageView imageView = f7Var.f47380b;
        int i11 = f7Var.f47381c;
        int i12 = v51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        f7Var.f47381c = i12;
        p6Var.c(v51Var.f29042l, z11, true);
        if (v51Var.f29047q) {
            i10 = org.telegram.ui.ActionBar.h6.f19246o6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (v51Var.f29037f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(rr.h);
        } else {
            if (v51Var.f29037f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new f7(context);
    }
}
