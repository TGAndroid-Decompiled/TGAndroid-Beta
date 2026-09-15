package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v5;
import org.telegram.ui.ya1;
import yh.a4;
public final class e implements Runnable {
    public final int f43127a = 0;
    public final TLRPC.Chat f43128b;

    @Override
    public final void run() {
        switch (this.f43127a) {
            case 0:
                TLRPC.Chat chat = this.f43128b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f19368a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f18112id), obj);
                    return;
                }
                return;
            default:
                a4.d2(ya1.d0(this.f43128b, true));
                return;
        }
    }

    public e(a4 a4Var, TLRPC.Chat chat) {
        this.f43128b = chat;
    }
}
