package xh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.eo;
public final class i0 extends ChatActivityEnterView {
    public final l0 T5;

    public i0(l0 l0Var, Activity activity, h0 h0Var) {
        super(activity, h0Var, null, false, null);
        this.T5 = l0Var;
    }

    @Override
    public final void C0(float f7) {
        l0 l0Var = this.T5;
        l0Var.f51562f.setInputBubbleHeight(f7);
        l0Var.q();
    }

    @Override
    public final void i0(Menu menu) {
        eo.n8(menu, null, false, false, false, false);
    }
}
