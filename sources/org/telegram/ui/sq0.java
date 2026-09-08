package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class sq0 extends org.telegram.ui.ActionBar.g5 {
    public final rl0 f40528f = new rl0(this, 11);
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
    public final void p(di.h2 h2Var) {
        this.h.b0(h2Var);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            br0 br0Var = this.h;
            br0Var.f34917f.clear();
            br0Var.h.clear();
            br0Var.v = null;
            br0Var.f34932s = true;
            br0Var.f34930r = false;
            if (br0Var.f34939x != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) br0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(br0Var.f34939x, true);
                br0Var.f34939x = 0;
            }
            br0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            br0Var.N.e(false, true);
            br0Var.j0();
            return;
        }
        rl0 rl0Var = this.f40528f;
        AndroidUtilities.cancelRunOnUIThread(rl0Var);
        AndroidUtilities.runOnUIThread(rl0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
