package ug;

import android.view.KeyEvent;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.d1, q10 {
    public final f0 f56213a;

    public q(f0 f0Var) {
        this.f56213a = f0Var;
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        x g02 = this.f56213a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        f0 f0Var = this.f56213a;
        f0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = f0Var.B1) != null && f1Var.isShowing()) {
            f0Var.B1.d(true);
        }
    }
}
