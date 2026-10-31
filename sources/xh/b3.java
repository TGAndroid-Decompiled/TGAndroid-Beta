package xh;

import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b3 implements Runnable {
    public final int f53708a;
    public final i3 f53709b;

    public b3(i3 i3Var, int i10) {
        this.f53708a = i10;
        this.f53709b = i3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull M0;
        TLRPC.Peer peer;
        switch (this.f53708a) {
            case 0:
                this.f53709b.f53809n.Q();
                return;
            case 1:
                this.f53709b.O();
                return;
            case 2:
                i3 i3Var = this.f53709b;
                if (!i3Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = vp.r1(i3Var.F).n1(i3Var.f53812w);
                    tL_messages_prolongWebView.peer = vp.r1(i3Var.F).i1(i3Var.f53813x);
                    tL_messages_prolongWebView.query_id = i3Var.f53814y;
                    tL_messages_prolongWebView.silent = false;
                    if (i3Var.D != 0) {
                        qz.C(i3Var.F);
                        int i10 = i3Var.D;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i10;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (i3Var.E != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = vp.r1(i3Var.F).i1(i3Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (i3Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = vp.r1(i3Var.F).i1(i3Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (i3Var.f53813x < 0 && (M0 = vp.r1(i3Var.F).M0(-i3Var.f53813x)) != null && (peer = M0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = vp.r1(i3Var.F).l1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(i3Var.F).sendRequest(tL_messages_prolongWebView, new ag.c(i3Var, 26));
                    return;
                }
                return;
            case 3:
                i3 i3Var2 = this.f53709b;
                i3Var2.f30947b.L1(i3Var2, 0);
                i3Var2.f53809n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f53709b.f53809n.n(true, false);
                return;
        }
    }
}
