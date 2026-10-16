package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class wq0 extends org.telegram.ui.ActionBar.e5 {
    public final xk0 f41341f = new xk0(this, 12);
    public final fr0 h;

    public wq0(fr0 fr0Var) {
        this.h = fr0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(di.g2 g2Var) {
        this.h.b0(g2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            fr0 fr0Var = this.h;
            fr0Var.f35919f.clear();
            fr0Var.h.clear();
            fr0Var.v = null;
            fr0Var.f35934s = true;
            fr0Var.f35932r = false;
            if (fr0Var.f35941x != 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) fr0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(fr0Var.f35941x, true);
                fr0Var.f35941x = 0;
            }
            fr0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            fr0Var.N.e(false, true);
            fr0Var.j0();
            return;
        }
        xk0 xk0Var = this.f41341f;
        AndroidUtilities.cancelRunOnUIThread(xk0Var);
        AndroidUtilities.runOnUIThread(xk0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
