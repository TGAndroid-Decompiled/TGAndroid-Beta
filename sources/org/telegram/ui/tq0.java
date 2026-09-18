package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class tq0 extends org.telegram.ui.ActionBar.h5 {
    public final sl0 f37854f = new sl0(this, 11);
    public final cr0 h;

    public tq0(cr0 cr0Var) {
        this.h = cr0Var;
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
            cr0 cr0Var = this.h;
            cr0Var.f32883f.clear();
            cr0Var.h.clear();
            cr0Var.v = null;
            cr0Var.f32898s = true;
            cr0Var.f32896r = false;
            if (cr0Var.f32905x != 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) cr0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(cr0Var.f32905x, true);
                cr0Var.f32905x = 0;
            }
            cr0Var.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            cr0Var.N.e(false, true);
            cr0Var.j0();
            return;
        }
        sl0 sl0Var = this.f37854f;
        AndroidUtilities.cancelRunOnUIThread(sl0Var);
        AndroidUtilities.runOnUIThread(sl0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
