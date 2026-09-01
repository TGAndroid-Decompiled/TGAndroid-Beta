package qh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h6 implements View.OnFocusChangeListener {
    public final k6 f45380a;

    public h6(k6 k6Var) {
        this.f45380a = k6Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            k6 k6Var = this.f45380a;
            k6Var.f45572f0 = true;
            xh.o oVar = new xh.o(k6Var.getContext(), 2);
            oVar.f5805a = 1;
            oVar.f50659p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((f2.j0) k6Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
