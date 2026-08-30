package ph;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j6 implements View.OnFocusChangeListener {
    public final m6 f41783a;

    public j6(m6 m6Var) {
        this.f41783a = m6Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            m6 m6Var = this.f41783a;
            m6Var.f41944f0 = true;
            wh.o oVar = new wh.o(m6Var.getContext(), 2);
            oVar.f5723a = 1;
            oVar.f46638p = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f);
            ((f2.i0) m6Var.d.getLayoutManager()).w0(oVar);
        }
    }
}
