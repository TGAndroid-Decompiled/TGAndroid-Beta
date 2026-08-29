package rf;

import android.content.Context;
import android.view.ViewGroup;
import f2.n1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.il0;
public class u extends il0 {
    public final Context f47354c;
    public final int d;
    public final boolean f47355e;
    public final boolean f47356f;
    public final c6 h;

    public u(int i10, Context context, c6 c6Var, boolean z10, boolean z11) {
        this.f47355e = z10;
        this.f47354c = context;
        this.d = i10;
        this.f47356f = z11;
        this.h = c6Var;
    }

    @Override
    public final boolean D(n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override
    public void v(n1 n1Var, int i10) {
        TLRPC.Chat chat;
        String str;
        l4 l4Var = (l4) n1Var.f6432a;
        int i11 = this.d;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        l4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = yf.d.i(chat, i11, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        l4Var.a(j10, str);
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.f47355e;
        l4 l4Var = new l4(this.f47354c, this.h, z10);
        if (this.f47356f && !l4Var.f24633x) {
            l4Var.f24633x = true;
            NotificationCenter.getInstance(l4Var.h).listen(l4Var, NotificationCenter.userIsPremiumBlockedUpadted, new h2(l4Var, 1));
        }
        l4Var.setLayoutParams(new f2.x0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new n1(l4Var);
    }
}
