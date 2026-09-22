package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v5;
import org.telegram.ui.za1;
import yh.z3;
public final class e implements Runnable {
    public final int f43123a = 0;
    public final TLRPC.Chat f43124b;

    @Override
    public final void run() {
        switch (this.f43123a) {
            case 0:
                TLRPC.Chat chat = this.f43124b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f19364a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f18109id), obj);
                    return;
                }
                return;
            default:
                z3.d2(za1.d0(this.f43124b, true));
                return;
        }
    }

    public e(z3 z3Var, TLRPC.Chat chat) {
        this.f43124b = chat;
    }
}
