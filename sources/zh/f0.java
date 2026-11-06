package zh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.an;
public final class f0 extends ChatActivityEnterView {
    public final i0 f60185t5;

    public f0(i0 i0Var, Activity activity, e0 e0Var) {
        super(activity, e0Var, null, false, null);
        this.f60185t5 = i0Var;
    }

    @Override
    public final void A0(float f10) {
        i0 i0Var = this.f60185t5;
        i0Var.f60242m1.setInputBubbleHeight(f10);
        i0Var.I0();
    }

    @Override
    public final void e0(Menu menu) {
        an.A8(menu, null, false, false, false, false);
    }
}
