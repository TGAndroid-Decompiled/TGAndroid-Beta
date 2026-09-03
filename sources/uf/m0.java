package uf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 implements Runnable {
    public final String f48678a;
    public final String f48679b;
    public final MessagesController f48680c;
    public final MessagesStorage d;
    public final u0 f48681e;

    public m0(u0 u0Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f48681e = u0Var;
        this.f48678a = str;
        this.f48679b = str2;
        this.f48680c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        u0 u0Var = this.f48681e;
        if (u0Var.f48755v0 == this) {
            u0Var.f48755v0 = null;
            TLRPC.User user = u0Var.f48753t0;
            if (user == null && !u0Var.f48752s0) {
                String str = this.f48679b;
                u0Var.f48745n0 = str;
                MessagesController messagesController = this.f48680c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    u0Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = u0Var.f48745n0;
                u0Var.f48748q0 = ConnectionsManager.getInstance(u0Var.f48736f).sendRequest(tL_contacts_resolveUsername, new lh.b1(this, str, messagesController, this.d, 18));
            } else if (u0Var.f48752s0) {
            } else {
                u0Var.T(true, user, this.f48678a, "");
            }
        }
    }
}
