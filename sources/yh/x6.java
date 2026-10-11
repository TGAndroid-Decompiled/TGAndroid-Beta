package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class x6 extends q61 {
    public static final int f53466a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        boolean z11;
        int i10;
        y6 y6Var = (y6) view;
        org.telegram.ui.Components.r6 r6Var = y6Var.f53535a;
        ImageView imageView = y6Var.f53536b;
        int i11 = y6Var.f53537c;
        int i12 = r61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        y6Var.f53537c = i12;
        r6Var.c(r61Var.f30361l, z11, true);
        if (r61Var.f30366q) {
            i10 = org.telegram.ui.ActionBar.h6.f20989o6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        r6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (r61Var.f30356f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(is.h);
        } else {
            if (r61Var.f30356f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        y6Var.d = z10;
        y6Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y6(context);
    }
}
