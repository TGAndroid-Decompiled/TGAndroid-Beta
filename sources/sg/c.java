package sg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fb1;
import org.telegram.ui.w5;
import xh.x3;
public final class c implements Runnable {
    public final int f41876a = 0;
    public final TLRPC.Chat f41877b;

    public c(TLRPC.Chat chat) {
        this.f41877b = chat;
    }

    @Override
    public final void run() {
        switch (this.f41876a) {
            case 0:
                TLRPC.Chat chat = this.f41877b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f18485a = true;
                    LaunchActivity.R().showAsSheet(new w5(-chat.f17195id), obj);
                    return;
                }
                return;
            default:
                x3.d2(fb1.d0(this.f41877b, true));
                return;
        }
    }

    public c(x3 x3Var, TLRPC.Chat chat) {
        this.f41877b = chat;
    }
}
