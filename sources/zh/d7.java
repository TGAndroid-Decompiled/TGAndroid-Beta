package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
public final class d7 extends g51 {
    public static final int f51832a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        int i10;
        e7 e7Var = (e7) view;
        org.telegram.ui.Components.q6 q6Var = e7Var.f51868a;
        ImageView imageView = e7Var.f51869b;
        int i11 = e7Var.f51870c;
        int i12 = h51Var.d;
        if (i11 == i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        e7Var.f51870c = i12;
        q6Var.c(h51Var.f26621l, z11, true);
        if (h51Var.f26626q) {
            i10 = org.telegram.ui.ActionBar.j6.f20889o6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        q6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        float f7 = 180.0f;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (h51Var.f26616f) {
                f7 = 0.0f;
            }
            animate.rotation(f7).setDuration(340L).setInterpolator(pr.h);
        } else {
            if (h51Var.f26616f) {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        e7Var.d = z10;
        e7Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new e7(context);
    }
}
