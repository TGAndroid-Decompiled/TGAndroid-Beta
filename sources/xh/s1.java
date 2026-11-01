package xh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class s1 implements r20 {
    public final int f54051a;
    public final m2 f54052b;

    public s1(m2 m2Var, int i10) {
        this.f54051a = i10;
        this.f54052b = m2Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f54051a) {
            case 0:
                Boolean bool = (Boolean) obj;
                e2 e2Var = this.f54052b.D;
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
                org.telegram.messenger.i0.g3(new vh.r0(24, this.f54052b, (TLRPC.UserFull) obj));
                return;
        }
    }
}
