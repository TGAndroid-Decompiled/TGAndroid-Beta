package wg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class u implements w10 {
    public final int f59935a;
    public final z f59936b;

    public u(z zVar, int i7) {
        this.f59935a = i7;
        this.f59936b = zVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59935a) {
            case 0:
                Void r42 = (Void) obj;
                z zVar = this.f59936b;
                zVar.dismiss();
                org.telegram.messenger.g0.h3(new s(zVar, 2), 220L);
                return;
            case 1:
                z zVar2 = this.f59936b;
                zVar2.f59980m2.b(false);
                h.j(zVar2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                z zVar3 = this.f59936b;
                zVar3.f59977j2 = zVar3.U1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                zVar3.l1(true, true);
                zVar3.k1(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                z zVar4 = this.f59936b;
                zVar4.dismiss();
                org.telegram.messenger.g0.h3(new s(zVar4, 1), 220L);
                return;
            case 4:
                z zVar5 = this.f59936b;
                zVar5.f59980m2.b(false);
                h.j(zVar5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                z zVar6 = this.f59936b;
                ArrayList arrayList = zVar6.f59970b2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                zVar6.l1(true, true);
                return;
            default:
                z zVar7 = this.f59936b;
                zVar7.f59980m2.b(false);
                h.j(zVar7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
