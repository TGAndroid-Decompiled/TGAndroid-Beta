package vh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class p5 implements Runnable {
    public final int f51764a;
    public final t5 f51765b;

    public p5(t5 t5Var, int i10) {
        this.f51764a = i10;
        this.f51765b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f51764a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                t5 t5Var = this.f51765b;
                getwebpagepreview.message = t5Var.Q1.d.getText().toString();
                t5Var.a2 = ConnectionsManager.getInstance(t5Var.f21583a).sendRequest(getwebpagepreview, new ag.c(t5Var, 25));
                return;
            case 1:
                this.f51765b.h1();
                return;
            default:
                t5 t5Var2 = this.f51765b;
                org.telegram.ui.Cells.m3 m3Var = t5Var2.Q1;
                if (t5Var2.isShowing()) {
                    m3Var.d.requestFocus();
                    org.telegram.messenger.i0.J3(m3Var.d);
                    return;
                }
                return;
        }
    }
}
