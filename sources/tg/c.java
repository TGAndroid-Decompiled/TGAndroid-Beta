package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.va1;
import org.telegram.ui.w5;
import yh.x3;
public final class c implements Runnable {
    public final int f46984a = 0;
    public final TLRPC.Chat f46985b;

    public c(TLRPC.Chat chat) {
        this.f46985b = chat;
    }

    @Override
    public final void run() {
        switch (this.f46984a) {
            case 0:
                TLRPC.Chat chat = this.f46985b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21350a = true;
                    LaunchActivity.R().showAsSheet(new w5(-chat.f20038id), obj);
                    return;
                }
                return;
            default:
                x3.d2(va1.b0(this.f46985b, true));
                return;
        }
    }

    public c(x3 x3Var, TLRPC.Chat chat) {
        this.f46985b = chat;
    }
}
