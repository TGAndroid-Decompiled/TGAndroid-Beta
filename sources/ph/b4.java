package ph;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b4 implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final c5 f41325a;

    public b4(c5 c5Var) {
        this.f41325a = c5Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        c5 c5Var = this.f41325a;
        c5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = c5Var.E1) != null && p1Var.isShowing()) {
            c5Var.E1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        c5 c5Var = this.f41325a;
        c5Var.f41382i2 = true;
        p4 n02 = c5Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        c5Var.d0(n02);
        return Boolean.TRUE;
    }
}
