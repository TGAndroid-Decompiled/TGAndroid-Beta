package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.wc;
public final class z1 extends sq0 {
    public final a3 f49128b1;

    public z1(a3 a3Var, Context context, String str, String str2, boolean z10, bi.n1 n1Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, n1Var);
        this.f49128b1 = a3Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        a3 a3Var = this.f49128b1;
        wc wcVar = new wc(a3Var.f48160c1, this.resourcesProvider);
        if (iVar.m() == 1) {
            long j3 = iVar.j(0);
            if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                pc G = wcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f26089r = false;
                G.j();
            } else if (j3 < 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
                int i11 = R.raw.forward;
                int i12 = R.string.StorySharedTo;
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = chat.title;
                }
                pc G2 = wcVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f26089r = false;
                G2.j();
            } else {
                pc G3 = wcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                G3.f26089r = false;
                G3.j();
            }
        } else {
            pc Q = wcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
            Q.f26089r = false;
            Q.j();
        }
        try {
            a3Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.f49128b1.e1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.f49128b1.Z2 = null;
    }
}
