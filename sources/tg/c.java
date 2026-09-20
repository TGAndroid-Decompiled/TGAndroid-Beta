package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.v5;
import yh.y3;
public final class c implements Runnable {
    public final int f43397a = 0;
    public final TLRPC.Chat f43398b;

    public c(TLRPC.Chat chat) {
        this.f43398b = chat;
    }

    @Override
    public final void run() {
        switch (this.f43397a) {
            case 0:
                TLRPC.Chat chat = this.f43398b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f19577a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f18328id), obj);
                    return;
                }
                return;
            default:
                y3.d2(bb1.d0(this.f43398b, true));
                return;
        }
    }

    public c(y3 y3Var, TLRPC.Chat chat) {
        this.f43398b = chat;
    }
}
