package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.va1;
import org.telegram.ui.w5;
import yh.x3;
public final class c implements Runnable {
    public final int f46983a = 0;
    public final TLRPC.Chat f46984b;

    public c(TLRPC.Chat chat) {
        this.f46984b = chat;
    }

    @Override
    public final void run() {
        switch (this.f46983a) {
            case 0:
                TLRPC.Chat chat = this.f46984b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21349a = true;
                    LaunchActivity.R().showAsSheet(new w5(-chat.f20037id), obj);
                    return;
                }
                return;
            default:
                x3.d2(va1.b0(this.f46984b, true));
                return;
        }
    }

    public c(x3 x3Var, TLRPC.Chat chat) {
        this.f46984b = chat;
    }
}
