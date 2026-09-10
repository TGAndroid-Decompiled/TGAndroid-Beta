package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
public final class h7 extends u51 {
    public static final int f45518a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        int i10;
        i7 i7Var = (i7) view;
        org.telegram.ui.Components.o6 o6Var = i7Var.f45555a;
        ImageView imageView = i7Var.f45556b;
        int i11 = i7Var.f45557c;
        int i12 = v51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        i7Var.f45557c = i12;
        o6Var.c(v51Var.f27829l, z11, true);
        if (v51Var.f27834q) {
            i10 = org.telegram.ui.ActionBar.j6.f18126o6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        o6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (v51Var.f27824f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(wr.h);
        } else {
            if (v51Var.f27824f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        i7Var.d = z10;
        i7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new i7(context);
    }
}
