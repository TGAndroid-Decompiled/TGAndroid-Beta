package sg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final n0 f48459a;

    public q(n0 n0Var) {
        this.f48459a = n0Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        n0 n0Var = this.f48459a;
        n0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = n0Var.G1) != null && o1Var.isShowing()) {
            n0Var.G1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        a0 g02 = this.f48459a.g0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            g02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
