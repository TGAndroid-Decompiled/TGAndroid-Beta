package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import ph.f6;
public final class u1 implements Utilities.Callback {
    public final int f43780a;
    public final q2 f43781b;

    public u1(q2 q2Var, int i10) {
        this.f43780a = i10;
        this.f43781b = q2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43780a) {
            case 0:
                Boolean bool = (Boolean) obj;
                i2 i2Var = this.f43781b.f43708x;
                if (i2Var != null) {
                    if (bool.booleanValue()) {
                        i2Var.M = System.currentTimeMillis();
                        i2Var.v("main_button_pressed", null);
                        return;
                    }
                    i2Var.M = System.currentTimeMillis();
                    i2Var.v("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new f6(11, this.f43781b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
