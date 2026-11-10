package wg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class u implements c20 {
    public final int f57808a;
    public final z f57809b;

    public u(z zVar, int i7) {
        this.f57808a = i7;
        this.f57809b = zVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f57808a) {
            case 0:
                Void r42 = (Void) obj;
                z zVar = this.f57809b;
                zVar.dismiss();
                org.telegram.messenger.g0.i3(new s(zVar, 2), 220L);
                return;
            case 1:
                z zVar2 = this.f57809b;
                zVar2.f57851l2.b(false);
                h.j(zVar2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                z zVar3 = this.f57809b;
                zVar3.f57848i2 = zVar3.T1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                zVar3.k1(true, true);
                zVar3.j1(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                z zVar4 = this.f57809b;
                zVar4.dismiss();
                org.telegram.messenger.g0.i3(new s(zVar4, 1), 220L);
                return;
            case 4:
                z zVar5 = this.f57809b;
                zVar5.f57851l2.b(false);
                h.j(zVar5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                z zVar6 = this.f57809b;
                ArrayList arrayList = zVar6.f57841a2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                zVar6.k1(true, true);
                return;
            default:
                z zVar7 = this.f57809b;
                zVar7.f57851l2.b(false);
                h.j(zVar7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
