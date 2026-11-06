package wg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class v implements c20 {
    public final int f57724a;
    public final a0 f57725b;

    public v(a0 a0Var, int i7) {
        this.f57724a = i7;
        this.f57725b = a0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f57724a) {
            case 0:
                Void r42 = (Void) obj;
                a0 a0Var = this.f57725b;
                a0Var.dismiss();
                org.telegram.messenger.g0.i3(new t(a0Var, 2), 220L);
                return;
            case 1:
                a0 a0Var2 = this.f57725b;
                a0Var2.f57592i2.b(false);
                h.j(a0Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                a0 a0Var3 = this.f57725b;
                a0Var3.f57589f2 = a0Var3.Q1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                a0Var3.k1(true, true);
                a0Var3.j1(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                a0 a0Var4 = this.f57725b;
                a0Var4.dismiss();
                org.telegram.messenger.g0.i3(new t(a0Var4, 1), 220L);
                return;
            case 4:
                a0 a0Var5 = this.f57725b;
                a0Var5.f57592i2.b(false);
                h.j(a0Var5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                a0 a0Var6 = this.f57725b;
                ArrayList arrayList = a0Var6.X1;
                arrayList.clear();
                arrayList.addAll((List) obj);
                a0Var6.k1(true, true);
                return;
            default:
                a0 a0Var7 = this.f57725b;
                a0Var7.f57592i2.b(false);
                h.j(a0Var7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
