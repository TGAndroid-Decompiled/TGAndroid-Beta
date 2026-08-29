package qh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.w41;
public final class r implements Utilities.Callback2 {
    public final int f46774a;
    public final i0 f46775b;

    public r(i0 i0Var, int i10) {
        this.f46774a = i10;
        this.f46775b = i0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f46774a;
        i0 i0Var = this.f46775b;
        switch (i10) {
            case 0:
                k51 k51Var = (k51) obj2;
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
                k51 k51Var2 = (k51) obj2;
                int i11 = i0.R;
                i0Var.U((ArrayList) obj, false);
                return;
            case 4:
                k51 k51Var3 = (k51) obj2;
                i0.A(i0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var4 = (k51) obj2;
                o0 o0Var = i0Var.I;
                arrayList.add(w41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(w41.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(i0Var.f46716f)) {
                    arrayList.add(w41.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new t(i0Var, 2)), true)));
                } else {
                    arrayList.add(w41.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(w41.j(2, i0Var.H));
                arrayList.add(w41.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", o0Var.f46757l, new Object[0])));
                o0Var.c(arrayList);
                return;
        }
    }
}
