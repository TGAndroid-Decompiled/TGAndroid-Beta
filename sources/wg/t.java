package wg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class t implements z10 {
    public final int f59239a;
    public final y f59240b;

    public t(y yVar, int i7) {
        this.f59239a = i7;
        this.f59240b = yVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59239a) {
            case 0:
                Void r42 = (Void) obj;
                y yVar = this.f59240b;
                yVar.dismiss();
                org.telegram.messenger.g0.i3(new r(yVar, 2), 220L);
                return;
            case 1:
                y yVar2 = this.f59240b;
                yVar2.f59284m2.b(false);
                h.j(yVar2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                y yVar3 = this.f59240b;
                yVar3.f59281j2 = yVar3.U1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                yVar3.k1(true, true);
                yVar3.j1(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                y yVar4 = this.f59240b;
                yVar4.dismiss();
                org.telegram.messenger.g0.i3(new r(yVar4, 1), 220L);
                return;
            case 4:
                y yVar5 = this.f59240b;
                yVar5.f59284m2.b(false);
                h.j(yVar5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                y yVar6 = this.f59240b;
                ArrayList arrayList = yVar6.f59274b2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                yVar6.k1(true, true);
                return;
            default:
                y yVar7 = this.f59240b;
                yVar7.f59284m2.b(false);
                h.j(yVar7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
