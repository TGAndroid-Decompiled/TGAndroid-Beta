package vh;

import android.view.KeyEvent;
import org.telegram.messenger.n20;
import org.telegram.tgnet.TLRPC;
public final class i3 implements org.telegram.ui.ActionBar.i1, n20 {
    public final b4 f51291a;

    public i3(b4 b4Var) {
        this.f51291a = b4Var;
    }

    @Override
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        b4 b4Var = this.f51291a;
        b4Var.U1 = true;
        t3 k02 = b4Var.k0(obj, document);
        if (bool.booleanValue()) {
            k02.setScale(1.5f);
        }
        b4Var.b0(k02);
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        b4 b4Var = this.f51291a;
        b4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = b4Var.f50990q1) != null && k1Var.isShowing()) {
            b4Var.f50990q1.d(true);
        }
    }
}
