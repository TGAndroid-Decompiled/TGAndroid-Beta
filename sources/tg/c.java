package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sa1;
import org.telegram.ui.v5;
import yh.x3;
public final class c implements Runnable {
    public final int f43382a = 0;
    public final TLRPC.Chat f43383b;

    public c(TLRPC.Chat chat) {
        this.f43383b = chat;
    }

    @Override
    public final void run() {
        switch (this.f43382a) {
            case 0:
                TLRPC.Chat chat = this.f43383b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f19581a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f18335id), obj);
                    return;
                }
                return;
            default:
                x3.d2(sa1.d0(this.f43383b, true));
                return;
        }
    }

    public c(x3 x3Var, TLRPC.Chat chat) {
        this.f43383b = chat;
    }
}
