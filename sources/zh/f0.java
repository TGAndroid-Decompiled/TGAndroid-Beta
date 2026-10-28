package zh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.wn;
public final class f0 extends ChatActivityEnterView {
    public final i0 f53026s5;

    public f0(i0 i0Var, Activity activity, e0 e0Var) {
        super(activity, e0Var, null, false, null);
        this.f53026s5 = i0Var;
    }

    @Override
    public final void d0(Menu menu) {
        wn.t8(menu, null, false, false, false, false);
    }

    @Override
    public final void x0(float f7) {
        i0 i0Var = this.f53026s5;
        i0Var.f53097f.setInputBubbleHeight(f7);
        i0Var.q();
    }
}
