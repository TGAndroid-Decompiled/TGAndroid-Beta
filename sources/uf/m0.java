package uf;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 implements Runnable {
    public final String f48642a;
    public final String f48643b;
    public final MessagesController f48644c;
    public final MessagesStorage d;
    public final u0 f48645e;

    public m0(u0 u0Var, String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f48645e = u0Var;
        this.f48642a = str;
        this.f48643b = str2;
        this.f48644c = messagesController;
        this.d = messagesStorage;
    }

    @Override
    public final void run() {
        u0 u0Var = this.f48645e;
        if (u0Var.f48719v0 == this) {
            u0Var.f48719v0 = null;
            TLRPC.User user = u0Var.f48717t0;
            if (user == null && !u0Var.f48716s0) {
                String str = this.f48643b;
                u0Var.f48709n0 = str;
                MessagesController messagesController = this.f48644c;
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    u0Var.R((TLRPC.User) userOrChat);
                    return;
                }
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = u0Var.f48709n0;
                u0Var.f48712q0 = ConnectionsManager.getInstance(u0Var.f48700f).sendRequest(tL_contacts_resolveUsername, new lh.b1(this, str, messagesController, this.d, 18));
            } else if (u0Var.f48716s0) {
            } else {
                u0Var.T(true, user, this.f48642a, "");
            }
        }
    }
}
