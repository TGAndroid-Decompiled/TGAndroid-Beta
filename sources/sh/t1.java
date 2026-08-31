package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import qh.d6;
public final class t1 implements Utilities.Callback {
    public final int f47692a;
    public final p2 f47693b;

    public t1(p2 p2Var, int i10) {
        this.f47692a = i10;
        this.f47693b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47692a) {
            case 0:
                Boolean bool = (Boolean) obj;
                h2 h2Var = this.f47693b.f47612x;
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
                AndroidUtilities.runOnUIThread(new d6(13, this.f47693b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
