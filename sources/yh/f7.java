package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w51;
public final class f7 extends h51 {
    public static final int f47109a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        boolean z11;
        int i10;
        g7 g7Var = (g7) view;
        org.telegram.ui.Components.n6 n6Var = g7Var.f47169a;
        ImageView imageView = g7Var.f47170b;
        int i11 = g7Var.f47171c;
        int i12 = i51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        g7Var.f47171c = i12;
        n6Var.c(i51Var.f24900l, z11, true);
        if (i51Var.f24905q) {
            i10 = org.telegram.ui.ActionBar.i6.f19035o6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        n6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (i51Var.f24895f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(qr.h);
        } else {
            if (i51Var.f24895f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        g7Var.d = z10;
        g7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new g7(context);
    }
}
