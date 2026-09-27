package xh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.xc;
public final class a2 extends vq0 {
    public final org.telegram.ui.ActionBar.o2 X0;
    public final bs0 Y0;

    public a2(bs0 bs0Var, Context context, String str, String str2, e6 e6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.Y0 = bs0Var;
        this.X0 = o2Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        xc a02;
        String str;
        if (z10 && (a02 = xc.a0(this.X0)) != null) {
            if (iVar.m() == 1) {
                long j3 = iVar.j(0);
                if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    qc G = a02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.f27699r = false;
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
                    qc G2 = a02.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f27699r = false;
                    G2.j();
                } else {
                    qc G3 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                    G3.f27699r = false;
                    G3.j();
                }
            } else {
                qc Q = a02.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
                Q.f27699r = false;
                Q.j();
            }
            try {
                this.Y0.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
