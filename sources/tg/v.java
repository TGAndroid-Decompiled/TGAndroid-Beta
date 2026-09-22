package tg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f43531a;
    public final a0 f43532b;

    public v(a0 a0Var, int i10) {
        this.f43531a = i10;
        this.f43532b = a0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43531a) {
            case 0:
                Void r42 = (Void) obj;
                a0 a0Var = this.f43532b;
                a0Var.dismiss();
                AndroidUtilities.runOnUIThread(new t(a0Var, 2), 220L);
                return;
            case 1:
                a0 a0Var2 = this.f43532b;
                a0Var2.f43401q0.b(false);
                i.j(a0Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                a0 a0Var3 = this.f43532b;
                a0Var3.f43398n0 = a0Var3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                a0Var3.a0(true, true);
                a0Var3.Z(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                a0 a0Var4 = this.f43532b;
                a0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new t(a0Var4, 1), 220L);
                return;
            case 4:
                a0 a0Var5 = this.f43532b;
                a0Var5.f43401q0.b(false);
                i.j(a0Var5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                a0 a0Var6 = this.f43532b;
                ArrayList arrayList = a0Var6.f43391f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                a0Var6.a0(true, true);
                return;
            default:
                a0 a0Var7 = this.f43532b;
                a0Var7.f43401q0.b(false);
                i.j(a0Var7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
