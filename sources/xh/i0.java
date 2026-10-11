package xh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.zn;
public final class i0 extends ChatActivityEnterView {
    public final l0 f51399o5;

    public i0(l0 l0Var, Activity activity, h0 h0Var) {
        super(activity, h0Var, null, false, null);
        this.f51399o5 = l0Var;
    }

    @Override
    public final void f0(Menu menu) {
        zn.n8(menu, null, false, false, false, false);
    }

    @Override
    public final void y0(float f7) {
        l0 l0Var = this.f51399o5;
        l0Var.f51456f.setInputBubbleHeight(f7);
        l0Var.q();
    }
}
