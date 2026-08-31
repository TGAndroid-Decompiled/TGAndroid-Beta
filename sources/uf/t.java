package uf;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.sl0;
public class t extends sl0 {
    public final Context f48685c;
    public final int d;
    public final boolean f48686e;
    public final boolean f48687f;
    public final g6 h;

    public t(int i10, Context context, g6 g6Var, boolean z4, boolean z10) {
        this.f48686e = z4;
        this.f48685c = context;
        this.d = i10;
        this.f48687f = z10;
        this.h = g6Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override
    public void v(f2.m1 m1Var, int i10) {
        TLRPC.Chat chat;
        String str;
        n4 n4Var = (n4) m1Var.f5875a;
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
        n4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = bg.e.i(chat, i11, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        n4Var.a(j10, str);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        boolean z4 = this.f48686e;
        n4 n4Var = new n4(this.f48685c, this.h, z4);
        if (this.f48687f && !n4Var.f23215x) {
            n4Var.f23215x = true;
            NotificationCenter.getInstance(n4Var.h).listen(n4Var, NotificationCenter.userIsPremiumBlockedUpadted, new i2(n4Var, 1));
        }
        n4Var.setLayoutParams(new f2.x0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new f2.m1(n4Var);
    }
}
