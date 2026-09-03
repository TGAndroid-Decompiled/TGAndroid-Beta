package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import qh.l6;
public final class t1 implements Utilities.Callback {
    public final int f47728a;
    public final p2 f47729b;

    public t1(p2 p2Var, int i10) {
        this.f47728a = i10;
        this.f47729b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47728a) {
            case 0:
                Boolean bool = (Boolean) obj;
                h2 h2Var = this.f47729b.f47648x;
                if (h2Var != null) {
                    if (bool.booleanValue()) {
                        h2Var.M = System.currentTimeMillis();
                        h2Var.v("main_button_pressed", null);
                        return;
                    }
                    h2Var.M = System.currentTimeMillis();
                    h2Var.v("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new l6(12, this.f47729b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
