package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class rp0 extends org.telegram.ui.ActionBar.e5 {
    public final vk0 f42181f = new vk0(this, 12);
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
    public final void p(ig.f fVar) {
        this.h.b0(fVar);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            zp0 zp0Var = this.h;
            zp0Var.f45280f.clear();
            zp0Var.h.clear();
            zp0Var.v = null;
            zp0Var.f45295s = true;
            zp0Var.f45293r = false;
            if (zp0Var.f45299x != 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) zp0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(zp0Var.f45299x, true);
                zp0Var.f45299x = 0;
            }
            zp0Var.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            zp0Var.J.e(false, true);
            zp0Var.j0();
            return;
        }
        vk0 vk0Var = this.f42181f;
        AndroidUtilities.cancelRunOnUIThread(vk0Var);
        AndroidUtilities.runOnUIThread(vk0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
