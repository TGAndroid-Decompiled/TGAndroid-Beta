package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class uq0 extends org.telegram.ui.ActionBar.e5 {
    public final uk0 f42551f = new uk0(this, 12);
    public final dr0 h;

    public uq0(dr0 dr0Var) {
        this.h = dr0Var;
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
            dr0 dr0Var = this.h;
            dr0Var.f36875f.clear();
            dr0Var.h.clear();
            dr0Var.v = null;
            dr0Var.f36890s = true;
            dr0Var.f36888r = false;
            if (dr0Var.f36897x != 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) dr0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(dr0Var.f36897x, true);
                dr0Var.f36897x = 0;
            }
            dr0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            dr0Var.N.e(false, true);
            dr0Var.j0();
            return;
        }
        uk0 uk0Var = this.f42551f;
        AndroidUtilities.cancelRunOnUIThread(uk0Var);
        AndroidUtilities.runOnUIThread(uk0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
