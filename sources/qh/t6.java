package qh;

import org.telegram.messenger.AndroidUtilities;
public final class t6 implements Runnable {
    public final int f46142a;
    public final a7 f46143b;

    public t6(a7 a7Var, int i10) {
        this.f46142a = i10;
        this.f46143b = a7Var;
    }

    @Override
    public final void run() {
        switch (this.f46142a) {
            case 0:
                a7.Q(this.f46143b);
                return;
            case 1:
                this.f46143b.X();
                return;
            default:
                a7 a7Var = this.f46143b;
                org.telegram.ui.Cells.i3 i3Var = a7Var.V;
                if (a7Var.isShowing()) {
                    i3Var.f22957b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f22957b);
                    return;
                }
                return;
        }
    }
}
