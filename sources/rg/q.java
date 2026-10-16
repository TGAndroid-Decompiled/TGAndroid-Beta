package rg;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements org.telegram.ui.ActionBar.k1, Utilities.Callback3Return {
    public final o0 f44238a;

    public q(o0 o0Var) {
        this.f44238a = o0Var;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        o0 o0Var = this.f44238a;
        o0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = o0Var.R1) != null && m1Var.isShowing()) {
            o0Var.R1.d(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        z i02 = this.f44238a.i0(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            i02.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
