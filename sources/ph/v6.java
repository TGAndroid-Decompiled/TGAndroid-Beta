package ph;

import org.telegram.messenger.AndroidUtilities;
public final class v6 implements Runnable {
    public final int f42515a;
    public final c7 f42516b;

    public v6(c7 c7Var, int i10) {
        this.f42515a = i10;
        this.f42516b = c7Var;
    }

    @Override
    public final void run() {
        switch (this.f42515a) {
            case 0:
                c7.Q(this.f42516b);
                return;
            case 1:
                this.f42516b.X();
                return;
            default:
                c7 c7Var = this.f42516b;
                org.telegram.ui.Cells.h3 h3Var = c7Var.V;
                if (c7Var.isShowing()) {
                    h3Var.f21132b.requestFocus();
                    AndroidUtilities.showKeyboard(h3Var.f21132b);
                    return;
                }
                return;
        }
    }
}
