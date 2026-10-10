package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class x6 extends p61 {
    public static final int f53423a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        boolean z11;
        int i10;
        y6 y6Var = (y6) view;
        org.telegram.ui.Components.r6 r6Var = y6Var.f53492a;
        ImageView imageView = y6Var.f53493b;
        int i11 = y6Var.f53494c;
        int i12 = q61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        y6Var.f53494c = i12;
        r6Var.c(q61Var.f30063l, z11, true);
        if (q61Var.f30068q) {
            i10 = org.telegram.ui.ActionBar.i6.f21004o6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        r6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (q61Var.f30058f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(is.h);
        } else {
            if (q61Var.f30058f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        y6Var.d = z10;
        y6Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y6(context);
    }
}
