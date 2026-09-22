package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class e7 extends x51 {
    public static final int f47408a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        boolean z11;
        int i10;
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.o6 o6Var = f7Var.f47446a;
        ImageView imageView = f7Var.f47447b;
        int i11 = f7Var.f47448c;
        int i12 = y51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        f7Var.f47448c = i12;
        o6Var.c(y51Var.f30518l, z11, true);
        if (y51Var.f30523q) {
            i10 = org.telegram.ui.ActionBar.j6.f19311o6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        o6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (y51Var.f30513f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(qr.h);
        } else {
            if (y51Var.f30513f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f7(context);
    }
}
