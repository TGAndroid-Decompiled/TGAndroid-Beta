package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t1 implements Utilities.Callback {
    public final int f46067a;
    public final p2 f46068b;

    public t1(p2 p2Var, int i10) {
        this.f46067a = i10;
        this.f46068b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46067a) {
            case 0:
                Boolean bool = (Boolean) obj;
                h2 h2Var = this.f46068b.f45987x;
                if (h2Var != null) {
                    if (bool.booleanValue()) {
                        h2Var.L = System.currentTimeMillis();
                        h2Var.v("main_button_pressed", null);
                        return;
                    }
                    h2Var.L = System.currentTimeMillis();
                    h2Var.v("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(9, this.f46068b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
