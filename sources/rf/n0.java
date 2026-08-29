package rf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n0 implements Runnable {
    public final String f47320a;
    public final String f47321b;
    public final MessagesController f47322c;
    public final MessagesStorage d;
    public final v0 f47323e;

    public n0(v0 v0Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f47323e = v0Var;
        this.f47320a = str;
        this.f47321b = str2;
        this.f47322c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        v0 v0Var = this.f47323e;
        if (v0Var.f47387u0 == this) {
            v0Var.f47387u0 = null;
            TLRPC.User user = v0Var.f47385s0;
            if (user == null && !v0Var.f47383r0) {
                String str = this.f47321b;
                v0Var.m0 = str;
                MessagesController messagesController = this.f47322c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    v0Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = v0Var.m0;
                v0Var.f47380p0 = ConnectionsManager.getInstance(v0Var.f47369f).sendRequest(tL_contacts_resolveUsername, new ih.c1(this, str, messagesController, this.d, 18));
            } else if (v0Var.f47383r0) {
            } else {
                v0Var.T(true, user, this.f47320a, "");
            }
        }
    }
}
