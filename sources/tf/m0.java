package tf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 implements Runnable {
    public final String f44854a;
    public final String f44855b;
    public final MessagesController f44856c;
    public final MessagesStorage d;
    public final u0 e;

    public m0(u0 u0Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.e = u0Var;
        this.f44854a = str;
        this.f44855b = str2;
        this.f44856c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        u0 u0Var = this.e;
        if (u0Var.f44924v0 == this) {
            u0Var.f44924v0 = null;
            TLRPC.User user = u0Var.f44922t0;
            if (user == null && !u0Var.f44921s0) {
                String str = this.f44855b;
                u0Var.f44914n0 = str;
                MessagesController messagesController = this.f44856c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    u0Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = u0Var.f44914n0;
                u0Var.f44917q0 = ConnectionsManager.getInstance(u0Var.f44905f).sendRequest(tL_contacts_resolveUsername, new kh.b1(this, str, messagesController, this.d, 19));
            } else if (u0Var.f44921s0) {
            } else {
                u0Var.T(true, user, this.f44854a, "");
            }
        }
    }
}
