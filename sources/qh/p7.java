package qh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Utilities.Callback {
    public final int f45897a;
    public final w7 f45898b;

    public p7(w7 w7Var, int i10) {
        this.f45897a = i10;
        this.f45898b = w7Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f45897a) {
            case 0:
                w7 w7Var = this.f45898b;
                c8 c8Var = w7Var.T;
                c8Var.f45188c = (TLRPC.InputPeer) obj;
                HashSet hashSet = c8Var.v;
                hashSet.clear();
                if (c8Var.H && c8Var.D) {
                    c8Var.D = false;
                }
                Utilities.Callback callback = c8Var.T;
                if (callback != null) {
                    callback.run(c8Var.f45188c);
                }
                g8 g8Var = c8Var.U;
                if (g8Var != null) {
                    g8Var.run(new HashSet(hashSet));
                }
                w7Var.g(true);
                return;
            case 1:
                c8 c8Var2 = this.f45898b.T;
                i10 = ((org.telegram.ui.ActionBar.h3) c8Var2).currentAccount;
                c8Var2.g1(new a8(5, i10, (ArrayList) obj), new oh.v3(c8Var2, 1), false);
                return;
            case 2:
                w7 w7Var2 = this.f45898b;
                c8 c8Var3 = w7Var2.T;
                HashSet hashSet2 = c8Var3.v;
                hashSet2.add(Integer.valueOf(((oh.m6) obj).f17441a));
                w7Var2.g(true);
                g8 g8Var2 = c8Var3.U;
                if (g8Var2 != null) {
                    g8Var2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                w7 w7Var3 = this.f45898b;
                if (str != null) {
                    w7Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                w7Var3.F = str;
                w7Var3.g(false);
                return;
        }
    }
}
