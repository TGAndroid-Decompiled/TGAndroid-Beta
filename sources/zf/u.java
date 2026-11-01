package zf;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.at;
import org.telegram.messenger.i20;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.tk0;
public class u extends tk0 {
    public final Context f55647c;
    public final int d;
    public final boolean e;
    public final boolean f55648f;
    public final p6 h;

    public u(int i10, Context context, p6 p6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.f55647c = context;
        this.d = i10;
        this.f55648f = z11;
        this.h = p6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return vi.b0(this.d).f18654i1.size();
    }

    @Override
    public void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        String str;
        q4 q4Var = (q4) c1Var.f47909a;
        int i11 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) vi.b0(i11).f18654i1.get(i10);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = wp.r1(i11).Z1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = wp.r1(i11).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = wp.r1(i11).L0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j10 = 0;
                    chat = null;
                }
            }
        }
        q4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = i20.j(user, true);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = gg.e.i(i11, chat, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        q4Var.a(j10, true, str);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        q4 q4Var = new q4(this.f55647c, this.h, z10);
        if (this.f55648f && !q4Var.f22831y) {
            q4Var.f22831y = true;
            at.f(q4Var.h).h(q4Var, at.f14725i3, new l2(q4Var, 1));
        }
        q4Var.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(86.0f)));
        return new s4.c1(q4Var);
    }
}
