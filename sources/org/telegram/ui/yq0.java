package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class yq0 extends org.telegram.ui.ActionBar.e5 {
    public final yk0 f42211f = new yk0(this, 12);
    public final hr0 h;

    public yq0(hr0 hr0Var) {
        this.h = hr0Var;
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
            hr0 hr0Var = this.h;
            hr0Var.f36921f.clear();
            hr0Var.h.clear();
            hr0Var.v = null;
            hr0Var.f36936s = true;
            hr0Var.f36934r = false;
            if (hr0Var.f36943x != 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) hr0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(hr0Var.f36943x, true);
                hr0Var.f36943x = 0;
            }
            hr0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            hr0Var.N.e(false, true);
            hr0Var.j0();
            return;
        }
        yk0 yk0Var = this.f42211f;
        AndroidUtilities.cancelRunOnUIThread(yk0Var);
        AndroidUtilities.runOnUIThread(yk0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
