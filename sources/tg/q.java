package tg;

import android.view.KeyEvent;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.f1, t10 {
    public final g0 f58092a;

    public q(g0 g0Var) {
        this.f58092a = g0Var;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        g0 g0Var = this.f58092a;
        g0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = g0Var.B1) != null && h1Var.isShowing()) {
            g0Var.B1.d(true);
        }
    }

    @Override
    public void m(Object obj, TLRPC.Document document, Boolean bool) {
        y g02 = this.f58092a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }
}
