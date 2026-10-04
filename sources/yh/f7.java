package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class f7 extends f61 {
    public static final int f51295a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        int i10;
        g7 g7Var = (g7) view;
        org.telegram.ui.Components.p6 p6Var = g7Var.f51366a;
        ImageView imageView = g7Var.f51367b;
        int i11 = g7Var.f51368c;
        int i12 = g61Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        g7Var.f51368c = i12;
        p6Var.c(g61Var.f26669l, z11, true);
        if (g61Var.f26674q) {
            i10 = org.telegram.ui.ActionBar.i6.f21021o6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (g61Var.f26664f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(tr.h);
        } else {
            if (g61Var.f26664f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        g7Var.d = z10;
        g7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g7(context);
    }
}
