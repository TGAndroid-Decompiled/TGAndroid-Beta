package zh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.an;
public final class e0 extends ChatActivityEnterView {
    public final h0 f60303t5;

    public e0(h0 h0Var, Activity activity, d0 d0Var) {
        super(activity, d0Var, null, false, null);
        this.f60303t5 = h0Var;
    }

    @Override
    public final void A0(float f10) {
        h0 h0Var = this.f60303t5;
        h0Var.f60350m1.setInputBubbleHeight(f10);
        h0Var.I0();
    }

    @Override
    public final void e0(Menu menu) {
        an.A8(menu, null, false, false, false, false);
    }
}
