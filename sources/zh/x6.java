package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class x6 extends k61 {
    public static final int f51313a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        boolean z11;
        int i10;
        y6 y6Var = (y6) view;
        org.telegram.ui.Components.s6 s6Var = y6Var.f51339a;
        ImageView imageView = y6Var.f51340b;
        int i11 = y6Var.f51341c;
        int i12 = l61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        y6Var.f51341c = i12;
        s6Var.c(l61Var.f26954l, z11, true);
        if (l61Var.f26959q) {
            i10 = org.telegram.ui.ActionBar.g6.f20104o6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        }
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        s6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (l61Var.f26949f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(es.h);
        } else {
            if (l61Var.f26949f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        y6Var.d = z10;
        y6Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y6(context);
    }
}
