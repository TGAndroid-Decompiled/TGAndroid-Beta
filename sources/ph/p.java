package ph;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.q80;
public final class p implements Runnable {
    public final int f45270a;
    public final vh.p2 f45271b;

    public p(vh.p2 p2Var, int i10) {
        this.f45270a = i10;
        this.f45271b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f45270a) {
            case 0:
                org.telegram.messenger.i0.E2(this.f45271b);
                return;
            case 1:
                org.telegram.messenger.i0.E2(this.f45271b);
                return;
            case 2:
                org.telegram.messenger.i0.E2(this.f45271b);
                return;
            default:
                this.f45271b.getClass();
                return;
        }
    }

    public p(vh.p2 p2Var, q80 q80Var, ClickableSpan clickableSpan) {
        this.f45270a = 3;
        this.f45271b = p2Var;
    }
}
