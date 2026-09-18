package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class d7 extends w51 {
    public static final int f47303a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        boolean z11;
        int i10;
        e7 e7Var = (e7) view;
        org.telegram.ui.Components.p6 p6Var = e7Var.f47342a;
        ImageView imageView = e7Var.f47343b;
        int i11 = e7Var.f47344c;
        int i12 = x51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        e7Var.f47344c = i12;
        p6Var.c(x51Var.f30248l, z11, true);
        if (x51Var.f30253q) {
            i10 = org.telegram.ui.ActionBar.j6.f19264o6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (x51Var.f30243f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(qr.h);
        } else {
            if (x51Var.f30243f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        e7Var.d = z10;
        e7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e7(context);
    }
}
