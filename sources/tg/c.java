package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ra1;
import org.telegram.ui.x5;
import yh.x3;
public final class c implements Runnable {
    public final int f43428a = 0;
    public final TLRPC.Chat f43429b;

    public c(TLRPC.Chat chat) {
        this.f43429b = chat;
    }

    @Override
    public final void run() {
        switch (this.f43428a) {
            case 0:
                TLRPC.Chat chat = this.f43429b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f19631a = true;
                    LaunchActivity.R().showAsSheet(new x5(-chat.f18329id), obj);
                    return;
                }
                return;
            default:
                x3.d2(ra1.b0(this.f43429b, true));
                return;
        }
    }

    public c(x3 x3Var, TLRPC.Chat chat) {
        this.f43429b = chat;
    }
}
