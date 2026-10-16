package yh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.fo;
public final class h0 extends ChatActivityEnterView {
    public final k0 f48889o5;

    public h0(k0 k0Var, Activity activity, g0 g0Var) {
        super(activity, g0Var, null, false, null);
        this.f48889o5 = k0Var;
    }

    @Override
    public final void f0(Menu menu) {
        fo.n8(menu, null, false, false, false, false);
    }

    @Override
    public final void y0(float f7) {
        k0 k0Var = this.f48889o5;
        k0Var.f48928f.setInputBubbleHeight(f7);
        k0Var.q();
    }
}
