package yh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.sn;
public final class f0 extends ChatActivityEnterView {
    public final i0 f50682s5;

    public f0(i0 i0Var, Activity activity, e0 e0Var) {
        super(activity, e0Var, null, false, null);
        this.f50682s5 = i0Var;
    }

    @Override
    public final void e0(Menu menu) {
        sn.n8(menu, null, false, false, false, false);
    }

    @Override
    public final void y0(float f7) {
        i0 i0Var = this.f50682s5;
        i0Var.f50750f.setInputBubbleHeight(f7);
        i0Var.r();
    }
}
