package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ta1;
import org.telegram.ui.w5;
import yh.y3;
public final class c implements Runnable {
    public final int f46998a = 0;
    public final TLRPC.Chat f46999b;

    public c(TLRPC.Chat chat) {
        this.f46999b = chat;
    }

    @Override
    public final void run() {
        switch (this.f46998a) {
            case 0:
                TLRPC.Chat chat = this.f46999b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21358a = true;
                    LaunchActivity.R().showAsSheet(new w5(-chat.f20047id), obj);
                    return;
                }
                return;
            default:
                y3.d2(ta1.b0(this.f46999b, true));
                return;
        }
    }

    public c(y3 y3Var, TLRPC.Chat chat) {
        this.f46999b = chat;
    }
}
