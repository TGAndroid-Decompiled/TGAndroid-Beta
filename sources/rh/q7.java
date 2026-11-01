package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class q7 extends a51 {
    public static final int f47389b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        r7 r7Var = (r7) view;
        org.telegram.ui.Components.f6 f6Var = r7Var.f47428a;
        ImageView imageView = r7Var.f47429b;
        int i13 = r7Var.f47430c;
        int i14 = b51Var.d;
        if (i13 == i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        r7Var.f47430c = i14;
        f6Var.c(b51Var.f24643l, z11, true);
        if (b51Var.f24648q) {
            i10 = org.telegram.ui.ActionBar.t6.f21135o6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        }
        org.telegram.ui.ActionBar.t6.v0(i10);
        if (b51Var.f24648q) {
            i11 = org.telegram.ui.ActionBar.t6.f21135o6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.G6;
        }
        org.telegram.ui.ActionBar.a7.Z(f6Var, i11, null);
        if (b51Var.f24648q) {
            i12 = org.telegram.ui.ActionBar.t6.f21135o6;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.G6;
        }
        org.telegram.ui.ActionBar.a7.t(imageView, i12, null, PorterDuff.Mode.SRC_IN);
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (b51Var.f24638f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(gr.h);
        } else {
            if (b51Var.f24638f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        r7Var.d = z10;
        r7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new r7(context);
    }
}
