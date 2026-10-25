package zh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wc;
public final class x1 extends mr0 {
    public final org.telegram.ui.ActionBar.r2 f53318a1;
    public final vs0 f53319b1;

    public x1(vs0 vs0Var, Context context, String str, String str2, u6 u6Var, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.f53319b1 = vs0Var;
        this.f53318a1 = r2Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        wc b02;
        String str;
        if (z10 && (b02 = wc.b0(this.f53318a1)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    qc G = b02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.f31896s = false;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                    int i11 = R.raw.forward;
                    int i12 = R.string.GiftCollectionSharedTo;
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = chat.title;
                    }
                    qc G2 = b02.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f31896s = false;
                    G2.j();
                } else {
                    qc G3 = b02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.f31896s = false;
                    G3.j();
                }
            } else {
                qc R = b02.R(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                R.f31896s = false;
                R.j();
            }
            try {
                this.f53319b1.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
