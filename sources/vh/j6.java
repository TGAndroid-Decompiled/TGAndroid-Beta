package vh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class j6 implements r20 {
    public final int f51336a;
    public final r6 f51337b;

    public j6(r6 r6Var, int i10) {
        this.f51336a = i10;
        this.f51337b = r6Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f51336a;
        r6 r6Var = this.f51337b;
        switch (i10) {
            case 0:
                w6 w6Var = r6Var.W;
                w6Var.f52119j1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = w6Var.f52126r1;
                hashSet.clear();
                if (w6Var.B1 && w6Var.f52132x1) {
                    w6Var.f52132x1 = false;
                }
                r20 r20Var = w6Var.N1;
                if (r20Var != null) {
                    r20Var.a(w6Var.f52119j1);
                }
                z6 z6Var = w6Var.O1;
                if (z6Var != null) {
                    z6Var.a(new HashSet(hashSet));
                }
                r6Var.h(true);
                return;
            case 1:
                w6 w6Var2 = r6Var.W;
                int i11 = w6.U1;
                w6Var2.N0(new u6(5, w6Var2.f21584a, (ArrayList) obj), new th.r2(w6Var2, 1), false);
                return;
            case 2:
                w6 w6Var3 = r6Var.W;
                HashSet hashSet2 = w6Var3.f52126r1;
                hashSet2.add(Integer.valueOf(((th.y4) obj).f49694a));
                r6Var.h(true);
                z6 z6Var2 = w6Var3.O1;
                if (z6Var2 != null) {
                    z6Var2.a(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                if (str != null) {
                    r6Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                r6Var.I = str;
                r6Var.h(false);
                return;
        }
    }
}
