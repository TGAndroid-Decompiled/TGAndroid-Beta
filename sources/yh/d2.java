package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.xc;
public final class d2 extends vq0 {
    public final x3 X0;

    public d2(x3 x3Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, e6Var);
        this.X0 = x3Var;
        this.f29740a0 = true;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        xc bulletinFactory;
        String str;
        if (z10 && (bulletinFactory = getBulletinFactory()) != null) {
            if (iVar.m() == 1) {
                long j3 = iVar.j(0);
                if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    qc G = bulletinFactory.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])));
                    G.f27699r = false;
                    G.f27701t = true;
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
                    qc G2 = bulletinFactory.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f27699r = false;
                    G2.f27701t = true;
                    G2.j();
                } else {
                    qc G3 = bulletinFactory.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                    G3.f27699r = false;
                    G3.f27701t = true;
                    G3.j();
                }
            } else {
                qc Q = bulletinFactory.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
                Q.f27699r = false;
                Q.f27701t = true;
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
