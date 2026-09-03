package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import ph.e6;
public final class t1 implements Utilities.Callback {
    public final int f43832a;
    public final p2 f43833b;

    public t1(p2 p2Var, int i10) {
        this.f43832a = i10;
        this.f43833b = p2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43832a) {
            case 0:
                Boolean bool = (Boolean) obj;
                h2 h2Var = this.f43833b.f43760x;
                if (h2Var != null) {
                    if (bool.booleanValue()) {
                        h2Var.M = System.currentTimeMillis();
                        h2Var.y("main_button_pressed", null);
                        return;
                    }
                    h2Var.M = System.currentTimeMillis();
                    h2Var.y("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new e6(13, this.f43833b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
