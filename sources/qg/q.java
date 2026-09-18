package qg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final m0 f41871a;

    public q(m0 m0Var) {
        this.f41871a = m0Var;
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        m0 m0Var = this.f41871a;
        m0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = m0Var.R1) != null && n1Var.isShowing()) {
            m0Var.R1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        z i02 = this.f41871a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
