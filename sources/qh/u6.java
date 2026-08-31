package qh;

import org.telegram.messenger.AndroidUtilities;
public final class u6 implements Runnable {
    public final int f46162a;
    public final b7 f46163b;

    public u6(b7 b7Var, int i10) {
        this.f46162a = i10;
        this.f46163b = b7Var;
    }

    @Override
    public final void run() {
        switch (this.f46162a) {
            case 0:
                b7.Q(this.f46163b);
                return;
            case 1:
                this.f46163b.X();
                return;
            default:
                b7 b7Var = this.f46163b;
                org.telegram.ui.Cells.i3 i3Var = b7Var.V;
                if (b7Var.isShowing()) {
                    i3Var.f22955b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.f22955b);
                    return;
                }
                return;
        }
    }
}
