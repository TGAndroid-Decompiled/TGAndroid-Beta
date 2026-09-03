package qh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a4 implements org.telegram.ui.ActionBar.n1, Utilities.Callback3Return {
    public final a5 f44921a;

    public a4(a5 a5Var) {
        this.f44921a = a5Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        a5 a5Var = this.f44921a;
        a5Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = a5Var.E1) != null && p1Var.isShowing()) {
            a5Var.E1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        a5 a5Var = this.f44921a;
        a5Var.f44938i2 = true;
        o4 n02 = a5Var.n0(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            n02.setScale(1.5f);
        }
        a5Var.d0(n02);
        return Boolean.TRUE;
    }
}
