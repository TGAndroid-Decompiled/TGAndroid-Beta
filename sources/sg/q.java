package sg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final m0 f48509a;

    public q(m0 m0Var) {
        this.f48509a = m0Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        m0 m0Var = this.f48509a;
        m0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = m0Var.G1) != null && o1Var.isShowing()) {
            m0Var.G1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        z g02 = this.f48509a.g0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            g02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
