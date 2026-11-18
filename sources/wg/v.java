package wg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class v implements x10 {
    public final int f59830a;
    public final a0 f59831b;

    public v(a0 a0Var, int i7) {
        this.f59830a = i7;
        this.f59831b = a0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59830a) {
            case 0:
                Void r42 = (Void) obj;
                a0 a0Var = this.f59831b;
                a0Var.dismiss();
                org.telegram.messenger.g0.h3(new t(a0Var, 2), 220L);
                return;
            case 1:
                a0 a0Var2 = this.f59831b;
                a0Var2.f59707m2.b(false);
                h.j(a0Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                a0 a0Var3 = this.f59831b;
                a0Var3.f59704j2 = a0Var3.U1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                a0Var3.l1(true, true);
                a0Var3.k1(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                a0 a0Var4 = this.f59831b;
                a0Var4.dismiss();
                org.telegram.messenger.g0.h3(new t(a0Var4, 1), 220L);
                return;
            case 4:
                a0 a0Var5 = this.f59831b;
                a0Var5.f59707m2.b(false);
                h.j(a0Var5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                a0 a0Var6 = this.f59831b;
                ArrayList arrayList = a0Var6.f59697b2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                a0Var6.l1(true, true);
                return;
            default:
                a0 a0Var7 = this.f59831b;
                a0Var7.f59707m2.b(false);
                h.j(a0Var7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
