package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class zp0 extends org.telegram.ui.ActionBar.i5 {
    public final gl0 f43969f = new gl0(this, 12);
    public final hq0 h;

    public zp0(hq0 hq0Var) {
        this.h = hq0Var;
    }

    @Override
    public final boolean b() {
        this.h.finishFragment();
        return false;
    }

    @Override
    public final void p(lg.f fVar) {
        this.h.b0(fVar);
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        if (editText.getText().length() == 0) {
            hq0 hq0Var = this.h;
            hq0Var.f37580f.clear();
            hq0Var.h.clear();
            hq0Var.v = null;
            hq0Var.f37595s = true;
            hq0Var.f37593r = false;
            if (hq0Var.f37600x != 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) hq0Var).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(hq0Var.f37600x, true);
                hq0Var.f37600x = 0;
            }
            hq0Var.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
            hq0Var.K.e(false, true);
            hq0Var.j0();
            return;
        }
        gl0 gl0Var = this.f43969f;
        AndroidUtilities.cancelRunOnUIThread(gl0Var);
        AndroidUtilities.runOnUIThread(gl0Var, 1200L);
    }

    @Override
    public final void n() {
    }
}
