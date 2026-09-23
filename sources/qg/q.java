package qg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.l1, Utilities.Callback3Return {
    public final p0 f41532a;

    public q(p0 p0Var) {
        this.f41532a = p0Var;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        p0 p0Var = this.f41532a;
        p0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = p0Var.R1) != null && n1Var.isShowing()) {
            p0Var.R1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        a0 i02 = this.f41532a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
