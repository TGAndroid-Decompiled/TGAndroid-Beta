package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

public final class sp0 extends org.telegram.ui.ActionBar.e5 {

    public final zk0 f42679f = new zk0(this, 12);
    public final aq0 h;

    public sp0(aq0 aq0Var) {
        this.h = aq0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(gg.g gVar) {
        this.h.b0(gVar);
    }

    @Override
    public final void q(EditText editText) {
        if (editText.getText().length() != 0) {
            zk0 zk0Var = this.f42679f;
            AndroidUtilities.cancelRunOnUIThread(zk0Var);
            AndroidUtilities.runOnUIThread(zk0Var, 1200L);
            return;
        }
        aq0 aq0Var = this.h;
        aq0Var.f36605f.clear();
        aq0Var.h.clear();
        aq0Var.v = null;
        aq0Var.f36620s = true;
        aq0Var.f36618r = false;
        if (aq0Var.f36624x != 0) {
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount).cancelRequest(aq0Var.f36624x, true);
            aq0Var.f36624x = 0;
        }
        aq0Var.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        aq0Var.J.e(false, true);
        aq0Var.j0();
    }

    @Override
    public final void n() {
    }
}
