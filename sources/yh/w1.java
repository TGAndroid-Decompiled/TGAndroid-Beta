package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
public final class w1 extends hr0 {
    public final org.telegram.ui.ActionBar.o2 f51030e1;
    public final ms0 f51031f1;

    public w1(ms0 ms0Var, Context context, String str, String str2, g6 g6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.f51031f1 = ms0Var;
        this.f51030e1 = o2Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        vc a02;
        String str;
        if (z10 && (a02 = vc.a0(this.f51030e1)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    oc G = a02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.f29211r = false;
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
                    oc G2 = a02.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f29211r = false;
                    G2.j();
                } else {
                    oc G3 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.f29211r = false;
                    G3.j();
                }
            } else {
                oc Q = a02.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                Q.f29211r = false;
                Q.j();
            }
            try {
                this.f51031f1.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
