package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class sq0 extends org.telegram.ui.ActionBar.i5 {
    public final ql0 f36743f = new ql0(this, 11);
    public final br0 h;

    public sq0(br0 br0Var) {
        this.h = br0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(bi.t2 t2Var) {
        this.h.b0(t2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            br0 br0Var = this.h;
            br0Var.f31371f.clear();
            br0Var.h.clear();
            br0Var.v = null;
            br0Var.f31386s = true;
            br0Var.f31384r = false;
            if (br0Var.f31393x != 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) br0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(br0Var.f31393x, true);
                br0Var.f31393x = 0;
            }
            br0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            br0Var.N.e(false, true);
            br0Var.j0();
            return;
        }
        ql0 ql0Var = this.f36743f;
        AndroidUtilities.cancelRunOnUIThread(ql0Var);
        AndroidUtilities.runOnUIThread(ql0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
