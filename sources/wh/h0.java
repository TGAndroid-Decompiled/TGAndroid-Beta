package wh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.eo;
public final class h0 extends ChatActivityEnterView {
    public final k0 f44112n5;

    public h0(k0 k0Var, Activity activity, g0 g0Var) {
        super(activity, g0Var, null, false, null);
        this.f44112n5 = k0Var;
    }

    @Override
    public final void A0(float f7) {
        k0 k0Var = this.f44112n5;
        k0Var.f44164f.setInputBubbleHeight(f7);
        k0Var.o();
    }

    @Override
    public final void h0(Menu menu) {
        eo.k8(menu, null, false, false, false, false);
    }
}
