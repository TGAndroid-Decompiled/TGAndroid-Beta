package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class rq0 extends org.telegram.ui.ActionBar.e5 {
    public final sk0 f41490f = new sk0(this, 12);
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
    public final void p(ci.g2 g2Var) {
        this.h.b0(g2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            ar0 ar0Var = this.h;
            ar0Var.f36142f.clear();
            ar0Var.h.clear();
            ar0Var.v = null;
            ar0Var.f36157s = true;
            ar0Var.f36155r = false;
            if (ar0Var.f36164x != 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) ar0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(ar0Var.f36164x, true);
                ar0Var.f36164x = 0;
            }
            ar0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            ar0Var.N.e(false, true);
            ar0Var.j0();
            return;
        }
        sk0 sk0Var = this.f41490f;
        AndroidUtilities.cancelRunOnUIThread(sk0Var);
        AndroidUtilities.runOnUIThread(sk0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
