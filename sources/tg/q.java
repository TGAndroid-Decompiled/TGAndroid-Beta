package tg;

import android.view.KeyEvent;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.e1, y10 {
    public final g0 f55916a;

    public q(g0 g0Var) {
        this.f55916a = g0Var;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        g0 g0Var = this.f55916a;
        g0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = g0Var.A1) != null && g1Var.isShowing()) {
            g0Var.A1.d(true);
        }
    }

    @Override
    public void k(Object obj, TLRPC.Document document, Boolean bool) {
        x g02 = this.f55916a.g0(obj, document, true);
        if (bool.booleanValue()) {
            g02.setScale(1.5f);
        }
    }
}
