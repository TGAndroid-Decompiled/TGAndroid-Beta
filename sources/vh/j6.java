package vh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class j6 implements q20 {
    public final int f51321a;
    public final r6 f51322b;

    public j6(r6 r6Var, int i10) {
        this.f51321a = i10;
        this.f51322b = r6Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f51321a;
        r6 r6Var = this.f51322b;
        switch (i10) {
            case 0:
                w6 w6Var = r6Var.W;
                w6Var.f52101j1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = w6Var.f52108r1;
                hashSet.clear();
                if (w6Var.B1 && w6Var.f52114x1) {
                    w6Var.f52114x1 = false;
                }
                q20 q20Var = w6Var.N1;
                if (q20Var != null) {
                    q20Var.a(w6Var.f52101j1);
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
                w6Var2.N0(new u6(5, w6Var2.f21583a, (ArrayList) obj), new th.r2(w6Var2, 1), false);
                return;
            case 2:
                w6 w6Var3 = r6Var.W;
                HashSet hashSet2 = w6Var3.f52108r1;
                hashSet2.add(Integer.valueOf(((th.y4) obj).f49680a));
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
