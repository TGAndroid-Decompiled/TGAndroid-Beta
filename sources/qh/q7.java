package qh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q7 implements Utilities.Callback {
    public final int f45915a;
    public final x7 f45916b;

    public q7(x7 x7Var, int i10) {
        this.f45915a = i10;
        this.f45916b = x7Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f45915a) {
            case 0:
                x7 x7Var = this.f45916b;
                d8 d8Var = x7Var.T;
                d8Var.f45223c = (TLRPC.InputPeer) obj;
                HashSet hashSet = d8Var.v;
                hashSet.clear();
                if (d8Var.H && d8Var.D) {
                    d8Var.D = false;
                }
                Utilities.Callback callback = d8Var.T;
                if (callback != null) {
                    callback.run(d8Var.f45223c);
                }
                h8 h8Var = d8Var.U;
                if (h8Var != null) {
                    h8Var.run(new HashSet(hashSet));
                }
                x7Var.g(true);
                return;
            case 1:
                d8 d8Var2 = this.f45916b.T;
                i10 = ((org.telegram.ui.ActionBar.h3) d8Var2).currentAccount;
                d8Var2.g1(new b8(5, i10, (ArrayList) obj), new oh.v3(d8Var2, 1), false);
                return;
            case 2:
                x7 x7Var2 = this.f45916b;
                d8 d8Var3 = x7Var2.T;
                HashSet hashSet2 = d8Var3.v;
                hashSet2.add(Integer.valueOf(((oh.m6) obj).f17439a));
                x7Var2.g(true);
                h8 h8Var2 = d8Var3.U;
                if (h8Var2 != null) {
                    h8Var2.run(new HashSet(hashSet2));
                    return;
                }
                return;
            default:
                String str = (String) obj;
                x7 x7Var3 = this.f45916b;
                if (str != null) {
                    x7Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                x7Var3.F = str;
                x7Var3.g(false);
                return;
        }
    }
}
