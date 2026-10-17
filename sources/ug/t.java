package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t implements Utilities.Callback {
    public final int f47778a;
    public final y f47779b;

    public t(y yVar, int i10) {
        this.f47778a = i10;
        this.f47779b = yVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47778a) {
            case 0:
                Void r42 = (Void) obj;
                y yVar = this.f47779b;
                yVar.dismiss();
                AndroidUtilities.runOnUIThread(new r(yVar, 2), 220L);
                return;
            case 1:
                y yVar2 = this.f47779b;
                yVar2.f47830q0.b(false);
                h.j(yVar2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                y yVar3 = this.f47779b;
                yVar3.f47827n0 = yVar3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                yVar3.b0(true, true);
                yVar3.a0(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                y yVar4 = this.f47779b;
                yVar4.dismiss();
                AndroidUtilities.runOnUIThread(new r(yVar4, 1), 220L);
                return;
            case 4:
                y yVar5 = this.f47779b;
                yVar5.f47830q0.b(false);
                h.j(yVar5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                y yVar6 = this.f47779b;
                ArrayList arrayList = yVar6.f47820f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                yVar6.b0(true, true);
                return;
            default:
                y yVar7 = this.f47779b;
                yVar7.f47830q0.b(false);
                h.j(yVar7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
