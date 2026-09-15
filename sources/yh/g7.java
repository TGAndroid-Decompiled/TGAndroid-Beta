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
public final class g7 extends h51 {
    public static final int f47234a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        boolean z11;
        int i10;
        h7 h7Var = (h7) view;
        org.telegram.ui.Components.n6 n6Var = h7Var.f47262a;
        ImageView imageView = h7Var.f47263b;
        int i11 = h7Var.f47264c;
        int i12 = i51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        h7Var.f47264c = i12;
        n6Var.c(i51Var.f24894l, z11, true);
        if (i51Var.f24899q) {
            i10 = org.telegram.ui.ActionBar.i6.f19038o6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        n6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (i51Var.f24889f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(qr.h);
        } else {
            if (i51Var.f24889f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        h7Var.d = z10;
        h7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h7(context);
    }
}
