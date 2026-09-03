package sh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;
public final class r implements Utilities.Callback2 {
    public final int f44470a;
    public final i0 f44471b;

    public r(i0 i0Var, int i10) {
        this.f44470a = i10;
        this.f44471b = i0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f44470a;
        i0 i0Var = this.f44471b;
        switch (i10) {
            case 0:
                w51 w51Var = (w51) obj2;
                i0Var.U((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                i0.o(i0Var, (TLRPC.TL_error) obj2);
                return;
            case 2:
                i0.n(i0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                w51 w51Var2 = (w51) obj2;
                int i11 = i0.S;
                i0Var.U((ArrayList) obj, false);
                return;
            case 4:
                w51 w51Var3 = (w51) obj2;
                i0.A(i0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var4 = (w51) obj2;
                n0 n0Var = i0Var.J;
                arrayList.add(i51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(i51.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(i0Var.f44418f)) {
                    arrayList.add(i51.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new t(i0Var, 2)), true)));
                } else {
                    arrayList.add(i51.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(i51.j(2, i0Var.I));
                arrayList.add(i51.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", n0Var.f44453l, new Object[0])));
                n0Var.c(arrayList);
                return;
        }
    }
}
