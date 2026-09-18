package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v5;
import org.telegram.ui.za1;
import yh.y3;
public final class c implements Runnable {
    public final int f43353a = 0;
    public final TLRPC.Chat f43354b;

    public c(TLRPC.Chat chat) {
        this.f43354b = chat;
    }

    @Override
    public final void run() {
        switch (this.f43353a) {
            case 0:
                TLRPC.Chat chat = this.f43354b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f19545a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f18296id), obj);
                    return;
                }
                return;
            default:
                y3.d2(za1.d0(this.f43354b, true));
                return;
        }
    }

    public c(y3 y3Var, TLRPC.Chat chat) {
        this.f43354b = chat;
    }
}
