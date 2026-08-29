package ph;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f3 implements Runnable {
    public final int f45796a;
    public final n3 f45797b;

    public f3(n3 n3Var, int i10) {
        this.f45796a = i10;
        this.f45797b = n3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f45796a) {
            case 0:
                this.f45797b.f45917n.L();
                return;
            case 1:
                this.f45797b.K();
                return;
            case 2:
                n3 n3Var = this.f45797b;
                if (!n3Var.P) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(n3Var.B).getInputUser(n3Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(n3Var.B).getInputPeer(n3Var.f45920w);
                    tL_messages_prolongWebView.query_id = n3Var.f45921x;
                    tL_messages_prolongWebView.silent = false;
                    if (n3Var.f45922y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(n3Var.B).createReplyInput(n3Var.f45922y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (n3Var.A != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(n3Var.B).getInputPeer(n3Var.A);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (n3Var.A != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(n3Var.B).getInputPeer(n3Var.A);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (n3Var.f45920w < 0 && (chatFull = MessagesController.getInstance(n3Var.B).getChatFull(-n3Var.f45920w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(n3Var.B).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(n3Var.B).sendRequest(tL_messages_prolongWebView, new ef.a(n3Var, 19));
                    return;
                }
                return;
            case 3:
                n3 n3Var2 = this.f45797b;
                n3Var2.f28403b.X1(n3Var2, 0);
                n3Var2.f45917n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f45797b.f45917n.n(true, false);
                return;
        }
    }
}
