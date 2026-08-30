package ph;

import org.telegram.messenger.AndroidUtilities;
public final class w6 implements Runnable {
    public final int f42511a;
    public final d7 f42512b;

    public w6(d7 d7Var, int i10) {
        this.f42511a = i10;
        this.f42512b = d7Var;
    }

    @Override
    public final void run() {
        switch (this.f42511a) {
            case 0:
                d7.Q(this.f42512b);
                return;
            case 1:
                this.f42512b.X();
                return;
            default:
                d7 d7Var = this.f42512b;
                org.telegram.ui.Cells.i3 i3Var = d7Var.V;
                if (d7Var.isShowing()) {
                    i3Var.f21199b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f21199b);
                    return;
                }
                return;
        }
    }
}
