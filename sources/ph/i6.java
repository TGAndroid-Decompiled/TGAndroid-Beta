package ph;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i6 implements View.OnFocusChangeListener {
    public final l6 f41785a;

    public i6(l6 l6Var) {
        this.f41785a = l6Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            l6 l6Var = this.f41785a;
            l6Var.f41951f0 = true;
            wh.o oVar = new wh.o(l6Var.getContext(), 2);
            oVar.f5712a = 1;
            oVar.f46707p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((f2.i0) l6Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
