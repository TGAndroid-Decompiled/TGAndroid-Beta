package tg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u implements Utilities.Callback {
    public final int f48515a;
    public final z f48516b;

    public u(z zVar, int i10) {
        this.f48515a = i10;
        this.f48516b = zVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48515a) {
            case 0:
                Void r42 = (Void) obj;
                z zVar = this.f48516b;
                zVar.dismiss();
                AndroidUtilities.runOnUIThread(new s(zVar, 2), 220L);
                return;
            case 1:
                z zVar2 = this.f48516b;
                zVar2.f48568q0.b(false);
                i.j(zVar2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                z zVar3 = this.f48516b;
                zVar3.f48565n0 = zVar3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                zVar3.b0(true, true);
                zVar3.a0(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                z zVar4 = this.f48516b;
                zVar4.dismiss();
                AndroidUtilities.runOnUIThread(new s(zVar4, 1), 220L);
                return;
            case 4:
                z zVar5 = this.f48516b;
                zVar5.f48568q0.b(false);
                i.j(zVar5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                z zVar6 = this.f48516b;
                ArrayList arrayList = zVar6.f48558f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                zVar6.b0(true, true);
                return;
            default:
                z zVar7 = this.f48516b;
                zVar7.f48568q0.b(false);
                i.j(zVar7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
