package xh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class s1 implements q20 {
    public final int f54033a;
    public final m2 f54034b;

    public s1(m2 m2Var, int i10) {
        this.f54033a = i10;
        this.f54034b = m2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f54033a) {
            case 0:
                Boolean bool = (Boolean) obj;
                e2 e2Var = this.f54034b.D;
                if (e2Var != null) {
                    if (bool.booleanValue()) {
                        e2Var.P = System.currentTimeMillis();
                        e2Var.x("main_button_pressed", null);
                        return;
                    }
                    e2Var.P = System.currentTimeMillis();
                    e2Var.x("secondary_button_pressed", null);
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.g3(new vh.d1(23, this.f54034b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
