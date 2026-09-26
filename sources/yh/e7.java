package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class e7 extends v51 {
    public static final int f47345a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        int i10;
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.p6 p6Var = f7Var.f47389a;
        ImageView imageView = f7Var.f47390b;
        int i11 = f7Var.f47391c;
        int i12 = w51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        f7Var.f47391c = i12;
        p6Var.c(w51Var.f29895l, z11, true);
        if (w51Var.f29900q) {
            i10 = org.telegram.ui.ActionBar.h6.f19260o6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (w51Var.f29890f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(sr.h);
        } else {
            if (w51Var.f29890f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new f7(context);
    }
}
