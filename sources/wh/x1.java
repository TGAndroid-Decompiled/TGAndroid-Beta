package wh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
public final class x1 extends sq0 {
    public final org.telegram.ui.ActionBar.p2 f44426b1;
    public final wr0 f44427c1;

    public x1(wr0 wr0Var, Context context, String str, String str2, f6 f6Var, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.f44427c1 = wr0Var;
        this.f44426b1 = p2Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        wc a02;
        String str;
        if (z10 && (a02 = wc.a0(this.f44426b1)) != null) {
            if (iVar.m() == 1) {
                long j3 = iVar.j(0);
                if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    pc G = a02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.f26089r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
                    int i11 = R.raw.forward;
                    int i12 = R.string.GiftCollectionSharedTo;
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = chat.title;
                    }
                    pc G2 = a02.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f26089r = false;
                    G2.j();
                } else {
                    pc G3 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                    G3.f26089r = false;
                    G3.j();
                }
            } else {
                pc Q = a02.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
                Q.f26089r = false;
                Q.j();
            }
            try {
                this.f44427c1.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
