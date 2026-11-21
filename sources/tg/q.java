package tg;

import android.view.KeyEvent;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.e1, t10 {
    public final h0 f58130a;

    public q(h0 h0Var) {
        this.f58130a = h0Var;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        h0 h0Var = this.f58130a;
        h0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = h0Var.B1) != null && g1Var.isShowing()) {
            h0Var.B1.d(true);
        }
    }

    @Override
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        z g02 = this.f58130a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }
}
