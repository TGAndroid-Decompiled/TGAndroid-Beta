package qg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final n0 f41894a;

    public q(n0 n0Var) {
        this.f41894a = n0Var;
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        n0 n0Var = this.f41894a;
        n0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = n0Var.R1) != null && m1Var.isShowing()) {
            n0Var.R1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        a0 i02 = this.f41894a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
