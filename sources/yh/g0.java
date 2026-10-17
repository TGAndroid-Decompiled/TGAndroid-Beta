package yh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.sn;
public final class g0 extends ChatActivityEnterView {
    public final j0 f50264o5;

    public g0(j0 j0Var, Activity activity, f0 f0Var) {
        super(activity, f0Var, null, false, null);
        this.f50264o5 = j0Var;
    }

    @Override
    public final void f0(Menu menu) {
        sn.n8(menu, null, false, false, false, false);
    }

    @Override
    public final void y0(float f7) {
        j0 j0Var = this.f50264o5;
        j0Var.f50324f.setInputBubbleHeight(f7);
        j0Var.p();
    }
}
