package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class x6 extends l61 {
    public static final int f51314a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        int i10;
        y6 y6Var = (y6) view;
        org.telegram.ui.Components.s6 s6Var = y6Var.f51340a;
        ImageView imageView = y6Var.f51341b;
        int i11 = y6Var.f51342c;
        int i12 = m61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        y6Var.f51342c = i12;
        s6Var.c(m61Var.f26946l, z11, true);
        if (m61Var.f26951q) {
            i10 = org.telegram.ui.ActionBar.g6.f19804o6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        }
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        s6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (m61Var.f26941f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(es.h);
        } else {
            if (m61Var.f26941f) {
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
