package tg;

import android.view.KeyEvent;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
public final class w implements org.telegram.ui.ActionBar.e1, s10 {
    public final l0 f58276a;

    public w(l0 l0Var) {
        this.f58276a = l0Var;
    }

    @Override
    public void l(Object obj, TLRPC.Document document, Boolean bool) {
        d0 i02 = this.f58276a.i0(obj, document, true);
        if (bool.booleanValue()) {
            i02.setScale(1.5f);
        }
    }

    @Override
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        l0 l0Var = this.f58276a;
        l0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = l0Var.B1) != null && g1Var.isShowing()) {
            l0Var.B1.d(true);
        }
    }
}
