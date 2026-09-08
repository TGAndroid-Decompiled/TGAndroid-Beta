package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f47247a;
    public final b0 f47248b;

    public w(b0 b0Var, int i10) {
        this.f47247a = i10;
        this.f47248b = b0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47247a) {
            case 0:
                Void r42 = (Void) obj;
                b0 b0Var = this.f47248b;
                b0Var.dismiss();
                AndroidUtilities.runOnUIThread(new u(b0Var, 2), 220L);
                return;
            case 1:
                b0 b0Var2 = this.f47248b;
                b0Var2.f47111q0.b(false);
                j.j(b0Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                b0 b0Var3 = this.f47248b;
                b0Var3.f47108n0 = b0Var3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                b0Var3.a0(true, true);
                b0Var3.Z(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                b0 b0Var4 = this.f47248b;
                b0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new u(b0Var4, 1), 220L);
                return;
            case 4:
                b0 b0Var5 = this.f47248b;
                b0Var5.f47111q0.b(false);
                j.j(b0Var5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                b0 b0Var6 = this.f47248b;
                ArrayList arrayList = b0Var6.f47101f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                b0Var6.a0(true, true);
                return;
            default:
                b0 b0Var7 = this.f47248b;
                b0Var7.f47111q0.b(false);
                j.j(b0Var7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
