package yh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class x1 extends ir0 {
    public final org.telegram.ui.ActionBar.m2 f49194b1;
    public final ns0 f49195c1;

    public x1(ns0 ns0Var, Context context, String str, String str2, c6 c6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.f49195c1 = ns0Var;
        this.f49194b1 = m2Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        zc a02;
        String str;
        if (z10 && (a02 = zc.a0(this.f49194b1)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    sc G = a02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.f28813r = false;
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
                    sc G2 = a02.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f28813r = false;
                    G2.j();
                } else {
                    sc G3 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.f28813r = false;
                    G3.j();
                }
            } else {
                sc Q = a02.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                Q.f28813r = false;
                Q.j();
            }
            try {
                this.f49195c1.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
