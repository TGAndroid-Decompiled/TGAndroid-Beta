package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.x51;
public final class g7 extends i51 {
    public static final int f47262a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        boolean z11;
        int i10;
        h7 h7Var = (h7) view;
        org.telegram.ui.Components.n6 n6Var = h7Var.f47290a;
        ImageView imageView = h7Var.f47291b;
        int i11 = h7Var.f47292c;
        int i12 = j51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        h7Var.f47292c = i12;
        n6Var.c(j51Var.f25127l, z11, true);
        if (j51Var.f25132q) {
            i10 = org.telegram.ui.ActionBar.j6.f19065o6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        n6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (j51Var.f25122f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(qr.h);
        } else {
            if (j51Var.f25122f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        h7Var.d = z10;
        h7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h7(context);
    }
}
