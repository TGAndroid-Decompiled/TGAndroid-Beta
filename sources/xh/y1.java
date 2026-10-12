package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zc;
public final class y1 extends sr0 {
    public final org.telegram.ui.ActionBar.m2 f51839b1;
    public final xs0 f51840c1;

    public y1(xs0 xs0Var, Context context, String str, String str2, c6 c6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.f51840c1 = xs0Var;
        this.f51839b1 = m2Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        zc a02;
        String str;
        if (z10 && (a02 = zc.a0(this.f51839b1)) != null) {
            if (iVar.m() == 1) {
                long j3 = iVar.j(0);
                if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    sc G = a02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.f30544r = false;
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
                    sc G2 = a02.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f30544r = false;
                    G2.j();
                } else {
                    sc G3 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                    G3.f30544r = false;
                    G3.j();
                }
            } else {
                sc Q = a02.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
                Q.f30544r = false;
                Q.j();
            }
            try {
                this.f51840c1.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
