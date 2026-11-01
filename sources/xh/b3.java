package xh;

import org.telegram.messenger.rz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b3 implements Runnable {
    public final int f53726a;
    public final j3 f53727b;

    public b3(j3 j3Var, int i10) {
        this.f53726a = i10;
        this.f53727b = j3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull M0;
        TLRPC.Peer peer;
        switch (this.f53726a) {
            case 0:
                this.f53727b.f53846n.Q();
                return;
            case 1:
                this.f53727b.O();
                return;
            case 2:
                j3 j3Var = this.f53727b;
                if (!j3Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = wp.r1(j3Var.F).n1(j3Var.f53849w);
                    tL_messages_prolongWebView.peer = wp.r1(j3Var.F).i1(j3Var.f53850x);
                    tL_messages_prolongWebView.query_id = j3Var.f53851y;
                    tL_messages_prolongWebView.silent = false;
                    if (j3Var.D != 0) {
                        rz.C(j3Var.F);
                        int i10 = j3Var.D;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i10;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (j3Var.E != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = wp.r1(j3Var.F).i1(j3Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (j3Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = wp.r1(j3Var.F).i1(j3Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (j3Var.f53850x < 0 && (M0 = wp.r1(j3Var.F).M0(-j3Var.f53850x)) != null && (peer = M0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = wp.r1(j3Var.F).l1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(j3Var.F).sendRequest(tL_messages_prolongWebView, new ag.c(j3Var, 26));
                    return;
                }
                return;
            case 3:
                j3 j3Var2 = this.f53727b;
                j3Var2.f30964b.L1(j3Var2, 0);
                j3Var2.f53846n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f53727b.f53846n.n(true, false);
                return;
        }
    }
}
