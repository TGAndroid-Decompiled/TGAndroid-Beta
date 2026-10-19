package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.kj0;
public final class g implements Utilities.Callback {
    public final int f52006a;
    public final Object f52007b;

    public g(Object obj, int i10) {
        this.f52006a = i10;
        this.f52007b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f52006a) {
            case 0:
                r rVar = (r) this.f52007b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (rVar.f52092y == null) {
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                        rVar.f52092y = tL_messages_stickerSet;
                    } else {
                        rVar.F = true;
                    }
                    rVar.e();
                    return;
                }
                return;
            case 1:
                n2 n2Var = (n2) this.f52007b;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new kj0(24));
                        return;
                    }
                }
                return;
            case 2:
                q0 q0Var = (q0) this.f52007b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                c1 c1Var = q0Var.f52074b;
                if (!q0Var.E && tL_exportedContactToken != null) {
                    q0Var.f52078r = tL_exportedContactToken;
                    q0Var.f52079s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = q0Var.f52075c.f52060b;
                    if (!TextUtils.equals(c1Var.f51748f, str2) || c1Var.h) {
                        c1Var.f51748f = str2;
                        c1Var.h = false;
                        c1Var.I5 = null;
                        c1Var.J5 = 0;
                    }
                    if (!TextUtils.equals(c1Var.d, str)) {
                        c1Var.d = str;
                        Utilities.globalQueue.postRunnable(new t0(str, new s0(c1Var, str, 0)));
                    }
                    c1Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            default:
                c1 c1Var2 = (c1) this.f52007b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    c1Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        c1Var2.f51861q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                c1Var2.invalidate();
                return;
        }
    }
}
