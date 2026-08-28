package yf;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.m1, Utilities.Callback3Return {
    public final l0 f50069a;

    public q(l0 l0Var) {
        this.f50069a = l0Var;
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        l0 l0Var = this.f50069a;
        l0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = l0Var.N1) != null && o1Var.isShowing()) {
            l0Var.N1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        y i02 = this.f50069a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
