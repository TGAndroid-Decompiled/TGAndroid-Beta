package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t implements Utilities.Callback {
    public final int f48203a;
    public final y f48204b;

    public t(y yVar, int i10) {
        this.f48203a = i10;
        this.f48204b = yVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48203a) {
            case 0:
                Void r42 = (Void) obj;
                y yVar = this.f48204b;
                yVar.dismiss();
                AndroidUtilities.runOnUIThread(new r(yVar, 2), 220L);
                return;
            case 1:
                y yVar2 = this.f48204b;
                yVar2.f48255q0.b(false);
                h.j(yVar2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                y yVar3 = this.f48204b;
                yVar3.f48252n0 = yVar3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                yVar3.a0(true, true);
                yVar3.Z(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                y yVar4 = this.f48204b;
                yVar4.dismiss();
                AndroidUtilities.runOnUIThread(new r(yVar4, 1), 220L);
                return;
            case 4:
                y yVar5 = this.f48204b;
                yVar5.f48255q0.b(false);
                h.j(yVar5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                y yVar6 = this.f48204b;
                ArrayList arrayList = yVar6.f48245f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                yVar6.a0(true, true);
                return;
            default:
                y yVar7 = this.f48204b;
                yVar7.f48255q0.b(false);
                h.j(yVar7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
