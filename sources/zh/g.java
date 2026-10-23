package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.if0;
public final class g implements Utilities.Callback {
    public final int f52479a;
    public final Object f52480b;

    public g(Object obj, int i10) {
        this.f52479a = i10;
        this.f52480b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f52479a) {
            case 0:
                r rVar = (r) this.f52480b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (rVar.f52558y == null) {
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                        rVar.f52558y = tL_messages_stickerSet;
                    } else {
                        rVar.F = true;
                    }
                    rVar.e();
                    return;
                }
                return;
            case 1:
                o2 o2Var = (o2) this.f52480b;
                Long l4 = (Long) obj;
                if (!o2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        o2Var.presentFragment(ProfileActivity.o4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new if0(25));
                        return;
                    }
                }
                return;
            case 2:
                r0 r0Var = (r0) this.f52480b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                c1 c1Var = r0Var.f52560b;
                if (!r0Var.E && tL_exportedContactToken != null) {
                    r0Var.f52564r = tL_exportedContactToken;
                    r0Var.f52565s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = r0Var.f52561c.f52539b;
                    if (!TextUtils.equals(c1Var.f52221f, str2) || c1Var.h) {
                        c1Var.f52221f = str2;
                        c1Var.h = false;
                        c1Var.I5 = null;
                        c1Var.J5 = 0;
                    }
                    if (!TextUtils.equals(c1Var.d, str)) {
                        c1Var.d = str;
                        Utilities.globalQueue.postRunnable(new h0(2, str, new t0(c1Var, str, 0)));
                    }
                    c1Var.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            default:
                c1 c1Var2 = (c1) this.f52480b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    c1Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        c1Var2.f52334q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                c1Var2.invalidate();
                return;
        }
    }
}
