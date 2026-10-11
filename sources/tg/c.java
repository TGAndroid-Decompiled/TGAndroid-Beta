package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.u5;
import yh.s3;
public final class c implements Runnable {
    public final int f48367a = 0;
    public final TLRPC.Chat f48368b;

    public c(TLRPC.Chat chat) {
        this.f48368b = chat;
    }

    @Override
    public final void run() {
        switch (this.f48367a) {
            case 0:
                TLRPC.Chat chat = this.f48368b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21313a = true;
                    LaunchActivity.R().showAsSheet(new u5(-chat.f20032id), obj);
                    return;
                }
                return;
            default:
                s3.e2(ab1.d0(this.f48368b, true));
                return;
        }
    }

    public c(s3 s3Var, TLRPC.Chat chat) {
        this.f48368b = chat;
    }
}
