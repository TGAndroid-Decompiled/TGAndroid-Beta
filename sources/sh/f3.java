package sh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f3 implements Runnable {
    public final int f47456a;
    public final n3 f47457b;

    public f3(n3 n3Var, int i10) {
        this.f47456a = i10;
        this.f47457b = n3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f47456a) {
            case 0:
                this.f47457b.f47578n.L();
                return;
            case 1:
                this.f47457b.K();
                return;
            case 2:
                n3 n3Var = this.f47457b;
                if (!n3Var.Q) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(n3Var.C).getInputUser(n3Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(n3Var.C).getInputPeer(n3Var.f47581w);
                    tL_messages_prolongWebView.query_id = n3Var.f47582x;
                    tL_messages_prolongWebView.silent = false;
                    if (n3Var.f47583y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(n3Var.C).createReplyInput(n3Var.f47583y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (n3Var.B != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(n3Var.C).getInputPeer(n3Var.B);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (n3Var.B != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(n3Var.C).getInputPeer(n3Var.B);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (n3Var.f47581w < 0 && (chatFull = MessagesController.getInstance(n3Var.C).getChatFull(-n3Var.f47581w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(n3Var.C).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(n3Var.C).sendRequest(tL_messages_prolongWebView, new gf.a(n3Var, 19));
                    return;
                }
                return;
            case 3:
                n3 n3Var2 = this.f47457b;
                n3Var2.f26590b.X1(n3Var2, 0);
                n3Var2.f47578n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f47457b.f47578n.n(true, false);
                return;
        }
    }
}
