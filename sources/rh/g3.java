package rh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g3 implements Runnable {
    public final int f43531a;
    public final o3 f43532b;

    public g3(o3 o3Var, int i10) {
        this.f43531a = i10;
        this.f43532b = o3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f43531a) {
            case 0:
                this.f43532b.f43641n.L();
                return;
            case 1:
                this.f43532b.K();
                return;
            case 2:
                o3 o3Var = this.f43532b;
                if (!o3Var.Q) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(o3Var.C).getInputUser(o3Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(o3Var.C).getInputPeer(o3Var.f43644w);
                    tL_messages_prolongWebView.query_id = o3Var.f43645x;
                    tL_messages_prolongWebView.silent = false;
                    if (o3Var.f43646y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(o3Var.C).createReplyInput(o3Var.f43646y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (o3Var.B != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(o3Var.C).getInputPeer(o3Var.B);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (o3Var.B != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(o3Var.C).getInputPeer(o3Var.B);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (o3Var.f43644w < 0 && (chatFull = MessagesController.getInstance(o3Var.C).getChatFull(-o3Var.f43644w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(o3Var.C).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(o3Var.C).sendRequest(tL_messages_prolongWebView, new gf.a(o3Var, 19));
                    return;
                }
                return;
            case 3:
                o3 o3Var2 = this.f43532b;
                o3Var2.f24278b.X1(o3Var2, 0);
                o3Var2.f43641n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f43532b.f43641n.n(true, false);
                return;
        }
    }
}
