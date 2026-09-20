package xh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.zn;
public final class g0 extends ChatActivityEnterView {
    public final j0 f46170n5;

    public g0(j0 j0Var, Activity activity, f0 f0Var) {
        super(activity, f0Var, null, false, null);
        this.f46170n5 = j0Var;
    }

    @Override
    public final void A0(float f7) {
        j0 j0Var = this.f46170n5;
        j0Var.f46215f.setInputBubbleHeight(f7);
        j0Var.o();
    }

    @Override
    public final void h0(Menu menu) {
        zn.k8(menu, null, false, false, false, false);
    }
}
