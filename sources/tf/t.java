package tf;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.ql0;
public class t extends ql0 {
    public final Context f44892c;
    public final int d;
    public final boolean e;
    public final boolean f44893f;
    public final f6 h;

    public t(int i10, Context context, f6 f6Var, boolean z4, boolean z10) {
        this.e = z4;
        this.f44892c = context;
        this.d = i10;
        this.f44893f = z10;
        this.h = f6Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override
    public void v(f2.l1 l1Var, int i10) {
        TLRPC.Chat chat;
        String str;
        m4 m4Var = (m4) l1Var.f5774a;
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
        m4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = ag.f.i(chat, i11, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        m4Var.a(j10, str);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4 = this.e;
        m4 m4Var = new m4(this.f44892c, this.h, z4);
        if (this.f44893f && !m4Var.f21357x) {
            m4Var.f21357x = true;
            NotificationCenter.getInstance(m4Var.h).listen(m4Var, NotificationCenter.userIsPremiumBlockedUpadted, new h2(m4Var, 1));
        }
        m4Var.setLayoutParams(new f2.w0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new f2.l1(m4Var);
    }
}
