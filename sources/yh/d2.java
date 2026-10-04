package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zq0;
public final class d2 extends zq0 {
    public final x3 X0;

    public d2(x3 x3Var, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, d6Var);
        this.X0 = x3Var;
        this.f33602a0 = true;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        yc bulletinFactory;
        String str;
        if (z10 && (bulletinFactory = getBulletinFactory()) != null) {
            if (iVar.m() == 1) {
                long j3 = iVar.j(0);
                if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    rc G = bulletinFactory.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])));
                    G.f30353r = false;
                    G.f30355t = true;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
                    int i11 = R.raw.forward;
                    int i12 = R.string.LinkSharedTo;
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = chat.title;
                    }
                    rc G2 = bulletinFactory.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f30353r = false;
                    G2.f30355t = true;
                    G2.j();
                } else {
                    rc G3 = bulletinFactory.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                    G3.f30353r = false;
                    G3.f30355t = true;
                    G3.j();
                }
            } else {
                rc Q = bulletinFactory.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
                Q.f30353r = false;
                Q.f30355t = true;
                Q.j();
            }
            try {
                this.container.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void P0(View view) {
        x3.k1(this.X0, view);
    }
}
