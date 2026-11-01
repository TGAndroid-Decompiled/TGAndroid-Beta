package ph;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.un;
public final class h0 extends ChatActivityEnterView {
    public final k0 f45097t5;

    public h0(k0 k0Var, Activity activity, g0 g0Var) {
        super(activity, g0Var, null, false, null);
        this.f45097t5 = k0Var;
    }

    @Override
    public final void d0(Menu menu) {
        un.x8(menu, null, false, false, false, false);
    }

    @Override
    public final void y0(float f7) {
        k0 k0Var = this.f45097t5;
        k0Var.f45158m1.setInputBubbleHeight(f7);
        k0Var.I0();
    }
}
