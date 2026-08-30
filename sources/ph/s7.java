package ph;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s7 implements Utilities.Callback {
    public final int f42309a;
    public final z7 f42310b;

    public s7(z7 z7Var, int i10) {
        this.f42309a = i10;
        this.f42310b = z7Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f42309a) {
            case 0:
                z7 z7Var = this.f42310b;
                f8 f8Var = z7Var.T;
                f8Var.f41658c = (TLRPC.InputPeer) obj;
                HashSet hashSet = f8Var.v;
                hashSet.clear();
                if (f8Var.H && f8Var.D) {
                    f8Var.D = false;
                }
                Utilities.Callback callback = f8Var.T;
                if (callback != null) {
                    callback.run(f8Var.f41658c);
                }
                i8 i8Var = f8Var.U;
                if (i8Var != null) {
                    i8Var.run(new HashSet(hashSet));
                }
                z7Var.g(true);
                return;
            case 1:
                f8 f8Var2 = this.f42310b.T;
                i10 = ((org.telegram.ui.ActionBar.g3) f8Var2).currentAccount;
                f8Var2.g1(new d8(5, i10, (ArrayList) obj), new nh.t3(f8Var2, 1), false);
                return;
            case 2:
                z7 z7Var2 = this.f42310b;
                f8 f8Var3 = z7Var2.T;
                HashSet hashSet2 = f8Var3.v;
                hashSet2.add(Integer.valueOf(((nh.m6) obj).f15618a));
                z7Var2.g(true);
                i8 i8Var2 = f8Var3.U;
                if (i8Var2 != null) {
                    i8Var2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                z7 z7Var3 = this.f42310b;
                if (str != null) {
                    z7Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                z7Var3.F = str;
                z7Var3.g(false);
                return;
        }
    }
}
