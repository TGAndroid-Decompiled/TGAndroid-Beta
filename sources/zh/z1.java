package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class z1 extends jr0 {
    public final r3 f51367b1;

    public z1(r3 r3Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, c6Var);
        this.f51367b1 = r3Var;
        this.f26457a0 = true;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        zc bulletinFactory;
        String str;
        if (z10 && (bulletinFactory = getBulletinFactory()) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    sc G = bulletinFactory.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])));
                    G.f29110r = false;
                    G.f29112t = true;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                    int i11 = R.raw.forward;
                    int i12 = R.string.LinkSharedTo;
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = chat.title;
                    }
                    sc G2 = bulletinFactory.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f29110r = false;
                    G2.f29112t = true;
                    G2.j();
                } else {
                    sc G3 = bulletinFactory.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.f29110r = false;
                    G3.f29112t = true;
                    G3.j();
                }
            } else {
                sc Q = bulletinFactory.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                Q.f29110r = false;
                Q.f29112t = true;
                Q.j();
            }
            try {
                this.container.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void T0(View view) {
        r3.l1(this.f51367b1, view);
    }
}
