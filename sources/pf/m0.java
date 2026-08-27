package pf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class m0 implements Runnable {

    public final String f45879a;

    public final String f45880b;

    public final MessagesController f45881c;
    public final MessagesStorage d;

    public final u0 f45882e;

    public m0(u0 u0Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f45882e = u0Var;
        this.f45879a = str;
        this.f45880b = str2;
        this.f45881c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        u0 u0Var = this.f45882e;
        if (u0Var.f45946u0 != this) {
            return;
        }
        u0Var.f45946u0 = null;
        TLRPC.User user = u0Var.f45944s0;
        if (user != null || u0Var.f45942r0) {
            if (u0Var.f45942r0) {
                return;
            }
            u0Var.T(true, user, this.f45879a, "");
            return;
        }
        String str = this.f45880b;
        u0Var.m0 = str;
        MessagesController messagesController = this.f45881c;
        TLObject userOrChat = messagesController.getUserOrChat(str);
        if (userOrChat instanceof TLRPC.User) {
            u0Var.R((TLRPC.User) userOrChat);
            return;
        }
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = u0Var.m0;
        u0Var.f45939p0 = ConnectionsManager.getInstance(u0Var.f45928f).sendRequest(tL_contacts_resolveUsername, new gh.f1(this, str, messagesController, this.d, 18));
    }
}
