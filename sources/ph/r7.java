package ph;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r7 implements Utilities.Callback {
    public final int f42288a;
    public final y7 f42289b;

    public r7(y7 y7Var, int i10) {
        this.f42288a = i10;
        this.f42289b = y7Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f42288a) {
            case 0:
                y7 y7Var = this.f42289b;
                e8 e8Var = y7Var.T;
                e8Var.f41622c = (TLRPC.InputPeer) obj;
                HashSet hashSet = e8Var.v;
                hashSet.clear();
                if (e8Var.H && e8Var.D) {
                    e8Var.D = false;
                }
                Utilities.Callback callback = e8Var.T;
                if (callback != null) {
                    callback.run(e8Var.f41622c);
                }
                h8 h8Var = e8Var.U;
                if (h8Var != null) {
                    h8Var.run(new HashSet(hashSet));
                }
                y7Var.g(true);
                return;
            case 1:
                e8 e8Var2 = this.f42289b.T;
                i10 = ((org.telegram.ui.ActionBar.g3) e8Var2).currentAccount;
                e8Var2.g1(new c8(5, i10, (ArrayList) obj), new nh.t3(e8Var2, 1), false);
                return;
            case 2:
                y7 y7Var2 = this.f42289b;
                e8 e8Var3 = y7Var2.T;
                HashSet hashSet2 = e8Var3.v;
                hashSet2.add(Integer.valueOf(((nh.m6) obj).f15598a));
                y7Var2.g(true);
                h8 h8Var2 = e8Var3.U;
                if (h8Var2 != null) {
                    h8Var2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                y7 y7Var3 = this.f42289b;
                if (str != null) {
                    y7Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                y7Var3.F = str;
                y7Var3.g(false);
                return;
        }
    }
}
