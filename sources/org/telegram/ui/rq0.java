package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class rq0 extends org.telegram.ui.ActionBar.g5 {
    public final pl0 f37175f = new pl0(this, 11);
    public final ar0 h;

    public rq0(ar0 ar0Var) {
        this.h = ar0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(ci.h2 h2Var) {
        this.h.b0(h2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            ar0 ar0Var = this.h;
            ar0Var.f31916f.clear();
            ar0Var.h.clear();
            ar0Var.v = null;
            ar0Var.f31931s = true;
            ar0Var.f31929r = false;
            if (ar0Var.f31938x != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) ar0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(ar0Var.f31938x, true);
                ar0Var.f31938x = 0;
            }
            ar0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            ar0Var.N.e(false, true);
            ar0Var.j0();
            return;
        }
        pl0 pl0Var = this.f37175f;
        AndroidUtilities.cancelRunOnUIThread(pl0Var);
        AndroidUtilities.runOnUIThread(pl0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
