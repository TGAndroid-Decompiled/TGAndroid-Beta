package qh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b4 implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final b5 f44944a;

    public b4(b5 b5Var) {
        this.f44944a = b5Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        b5 b5Var = this.f44944a;
        b5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = b5Var.E1) != null && p1Var.isShowing()) {
            b5Var.E1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        b5 b5Var = this.f44944a;
        b5Var.f44961i2 = true;
        p4 n02 = b5Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        b5Var.d0(n02);
        return Boolean.TRUE;
    }
}
