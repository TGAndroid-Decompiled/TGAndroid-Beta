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
import org.telegram.ui.mj0;
public final class g implements Utilities.Callback {
    public final int f51728a;
    public final Object f51729b;

    public g(Object obj, int i10) {
        this.f51728a = i10;
        this.f51729b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51728a) {
            case 0:
                r rVar = (r) this.f51729b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (rVar.f51804y == null) {
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                        rVar.f51804y = tL_messages_stickerSet;
                    } else {
                        rVar.F = true;
                    }
                    rVar.e();
                    return;
                }
                return;
            case 1:
                f0 f0Var = (f0) this.f51729b;
                Uri uri = (Uri) obj;
                u0 u0Var = f0Var.d;
                if (u0Var != null && !f0Var.isFinished) {
                    u0Var.d1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                    return;
                }
                return;
            case 2:
                n2 n2Var = (n2) this.f51729b;
                Long l4 = (Long) obj;
                if (!n2Var.isFinished) {
                    if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                        n2Var.presentFragment(ProfileActivity.m4(l4.longValue()), true);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new mj0(24));
                        return;
                    }
                }
                return;
            case 3:
                i0 i0Var = (i0) this.f51729b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                u0 u0Var2 = i0Var.f51739b;
                if (!i0Var.E && tL_exportedContactToken != null) {
                    i0Var.f51743r = tL_exportedContactToken;
                    i0Var.f51744s = 0L;
                    String str = tL_exportedContactToken.url;
                    String str2 = i0Var.f51740c.f51734b;
                    if (!TextUtils.equals(u0Var2.f51903f, str2) || u0Var2.h) {
                        u0Var2.f51903f = str2;
                        u0Var2.h = false;
                        u0Var2.I5 = null;
                        u0Var2.J5 = 0;
                    }
                    if (!TextUtils.equals(u0Var2.d, str)) {
                        u0Var2.d = str;
                        Utilities.globalQueue.postRunnable(new l0(str, new k0(u0Var2, str, 0)));
                    }
                    u0Var2.setLinkExpires(tL_exportedContactToken.expires);
                    return;
                }
                return;
            default:
                u0 u0Var3 = (u0) this.f51729b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    u0Var3.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        u0Var3.f52016q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                u0Var3.invalidate();
                return;
        }
    }
}
