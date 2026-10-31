package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class q7 extends z41 {
    public static final int f47376b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        r7 r7Var = (r7) view;
        org.telegram.ui.Components.f6 f6Var = r7Var.f47416a;
        ImageView imageView = r7Var.f47417b;
        int i13 = r7Var.f47418c;
        int i14 = a51Var.d;
        if (i13 == i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        r7Var.f47418c = i14;
        f6Var.c(a51Var.f24292l, z11, true);
        if (a51Var.f24297q) {
            i10 = org.telegram.ui.ActionBar.t6.f21134o6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        }
        org.telegram.ui.ActionBar.t6.v0(i10);
        if (a51Var.f24297q) {
            i11 = org.telegram.ui.ActionBar.t6.f21134o6;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.G6;
        }
        org.telegram.ui.ActionBar.a7.Z(f6Var, i11, null);
        if (a51Var.f24297q) {
            i12 = org.telegram.ui.ActionBar.t6.f21134o6;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.G6;
        }
        org.telegram.ui.ActionBar.a7.t(imageView, i12, null, PorterDuff.Mode.SRC_IN);
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (a51Var.f24287f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(gr.h);
        } else {
            if (a51Var.f24287f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        r7Var.d = z10;
        r7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new r7(context);
    }
}
