package xh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.xn;
public final class g0 extends ChatActivityEnterView {
    public final j0 f45822o5;

    public g0(j0 j0Var, Activity activity, f0 f0Var) {
        super(activity, f0Var, null, false, null);
        this.f45822o5 = j0Var;
    }

    @Override
    public final void B0(float f7) {
        j0 j0Var = this.f45822o5;
        j0Var.f45867f.setInputBubbleHeight(f7);
        j0Var.o();
    }

    @Override
    public final void i0(Menu menu) {
        xn.k8(menu, null, false, false, false, false);
    }
}
