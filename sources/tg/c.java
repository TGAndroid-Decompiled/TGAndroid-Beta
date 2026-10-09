package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.v5;
import yh.s3;
public final class c implements Runnable {
    public final int f48297a = 0;
    public final TLRPC.Chat f48298b;

    public c(TLRPC.Chat chat) {
        this.f48298b = chat;
    }

    @Override
    public final void run() {
        switch (this.f48297a) {
            case 0:
                TLRPC.Chat chat = this.f48298b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21357a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f20038id), obj);
                    return;
                }
                return;
            default:
                s3.e2(bb1.d0(this.f48298b, true));
                return;
        }
    }

    public c(s3 s3Var, TLRPC.Chat chat) {
        this.f48298b = chat;
    }
}
