package pf;

import android.content.Context;
import android.view.ViewGroup;
import f2.o1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

public class t extends yk0 {

    public final Context f45913c;
    public final int d;

    public final boolean f45914e;

    public final boolean f45915f;
    public final c6 h;

    public t(int i10, Context context, c6 c6Var, boolean z10, boolean z11) {
        this.f45914e = z10;
        this.f45913c = context;
        this.d = i10;
        this.f45915f = z11;
        this.h = c6Var;
    }

    @Override
    public final boolean D(o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override
    public void v(o1 o1Var, int i10) {
        TLRPC.Chat chat;
        String strI;
        k4 k4Var = (k4) o1Var.f5789a;
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
        k4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            strI = UserObject.getFirstName(user);
        } else if (chat != null) {
            strI = chat.monoforum ? wf.c.i(chat, i11, false) : chat.title;
        } else {
            strI = "";
        }
        k4Var.a(j10, strI);
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.f45914e;
        k4 k4Var = new k4(this.f45913c, this.h, z10);
        if (this.f45915f && !k4Var.f24580x) {
            k4Var.f24580x = true;
            NotificationCenter.getInstance(k4Var.h).listen(k4Var, NotificationCenter.userIsPremiumBlockedUpadted, new h2(k4Var, 1));
        }
        k4Var.setLayoutParams(new f2.y0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new lk0(k4Var);
    }
}
