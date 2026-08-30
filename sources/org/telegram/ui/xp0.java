package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class xp0 extends org.telegram.ui.ActionBar.h5 {
    public final el0 f40286f = new el0(this, 12);
    public final fq0 h;

    public xp0(fq0 fq0Var) {
        this.h = fq0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(kg.f fVar) {
        this.h.b0(fVar);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            fq0 fq0Var = this.h;
            fq0Var.f34321f.clear();
            fq0Var.h.clear();
            fq0Var.v = null;
            fq0Var.f34336s = true;
            fq0Var.f34334r = false;
            if (fq0Var.f34341x != 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) fq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(fq0Var.f34341x, true);
                fq0Var.f34341x = 0;
            }
            fq0Var.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            fq0Var.K.e(false, true);
            fq0Var.j0();
            return;
        }
        el0 el0Var = this.f40286f;
        AndroidUtilities.cancelRunOnUIThread(el0Var);
        AndroidUtilities.runOnUIThread(el0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
