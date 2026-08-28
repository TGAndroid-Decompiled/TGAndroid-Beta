package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class rp0 extends org.telegram.ui.ActionBar.e5 {
    public final zk0 f42473f = new zk0(this, 12);
    public final zp0 h;

    public rp0(zp0 zp0Var) {
        this.h = zp0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(fg.g gVar) {
        this.h.a0(gVar);
    }

    @Override
    public final void q(EditText editText) {
        int i9;
        if (editText.getText().length() == 0) {
            zp0 zp0Var = this.h;
            zp0Var.f45215f.clear();
            zp0Var.h.clear();
            zp0Var.v = null;
            zp0Var.f45230s = true;
            zp0Var.f45228r = false;
            if (zp0Var.f45234x != 0) {
                i9 = ((org.telegram.ui.ActionBar.o2) zp0Var).currentAccount;
                ConnectionsManager.getInstance(i9).cancelRequest(zp0Var.f45234x, true);
                zp0Var.f45234x = 0;
            }
            zp0Var.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            zp0Var.J.e(false, true);
            zp0Var.i0();
            return;
        }
        zk0 zk0Var = this.f42473f;
        AndroidUtilities.cancelRunOnUIThread(zk0Var);
        AndroidUtilities.runOnUIThread(zk0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
