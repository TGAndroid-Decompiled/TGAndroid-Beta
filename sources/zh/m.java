package zh;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ff0;
public final class m implements Utilities.Callback {
    public final int f52045a;
    public final Object f52046b;

    public m(Object obj, int i10) {
        this.f52045a = i10;
        this.f52046b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f52045a) {
            case 0:
                x xVar = (x) this.f52046b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (xVar.f52131y == null) {
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                        xVar.f52131y = tL_messages_stickerSet;
                    } else {
                        xVar.F = true;
                    }
                    xVar.e();
                    return;
                }
                return;
            case 1:
                m0 m0Var = (m0) this.f52046b;
                Uri uri = (Uri) obj;
                b1 b1Var = m0Var.d;
                if (b1Var != null && !m0Var.isFinished) {
                    b1Var.W0(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                    return;
                }
                return;
            case 2:
                n2 n2Var = (n2) this.f52046b;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new ff0(25));
                        return;
                    }
                }
                return;
            case 3:
                p0 p0Var = (p0) this.f52046b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                b1 b1Var2 = p0Var.f52077b;
                if (!p0Var.E && tL_exportedContactToken != null) {
                    p0Var.f52081r = tL_exportedContactToken;
                    p0Var.f52082s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = p0Var.f52078c.f52072b;
                    if (!TextUtils.equals(b1Var2.f51726f, str2) || b1Var2.h) {
                        b1Var2.f51726f = str2;
                        b1Var2.h = false;
                        b1Var2.f51797m5 = null;
                        b1Var2.f51807n5 = 0;
                    }
                    if (!TextUtils.equals(b1Var2.d, str)) {
                        b1Var2.d = str;
                        Utilities.globalQueue.postRunnable(new r0(str, new q0(b1Var2, str, 0)));
                    }
                    b1Var2.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            default:
                b1 b1Var3 = (b1) this.f52046b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    b1Var3.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        b1Var3.Z7 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                b1Var3.invalidate();
                return;
        }
    }
}
