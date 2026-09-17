package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.v5;
import yh.a4;
public final class e implements Runnable {
    public final int f43149a = 0;
    public final TLRPC.Chat f43150b;

    @Override
    public final void run() {
        switch (this.f43149a) {
            case 0:
                TLRPC.Chat chat = this.f43150b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f19397a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f18121id), obj);
                    return;
                }
                return;
            default:
                a4.d2(ab1.d0(this.f43150b, true));
                return;
        }
    }

    public e(a4 a4Var, TLRPC.Chat chat) {
        this.f43150b = chat;
    }
}
