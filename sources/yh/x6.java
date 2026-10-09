package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class x6 extends o61 {
    public static final int f53377a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        boolean z11;
        int i10;
        y6 y6Var = (y6) view;
        org.telegram.ui.Components.r6 r6Var = y6Var.f53446a;
        ImageView imageView = y6Var.f53447b;
        int i11 = y6Var.f53448c;
        int i12 = p61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        y6Var.f53448c = i12;
        r6Var.c(p61Var.f29734l, z11, true);
        if (p61Var.f29739q) {
            i10 = org.telegram.ui.ActionBar.i6.f21000o6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        r6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (p61Var.f29729f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(hs.h);
        } else {
            if (p61Var.f29729f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        y6Var.d = z10;
        y6Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y6(context);
    }
}
