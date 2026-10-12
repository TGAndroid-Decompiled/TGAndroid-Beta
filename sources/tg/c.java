package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.db1;
import org.telegram.ui.y5;
import yh.s3;
public final class c implements Runnable {
    public final int f48508a = 0;
    public final TLRPC.Chat f48509b;

    public c(TLRPC.Chat chat) {
        this.f48509b = chat;
    }

    @Override
    public final void run() {
        switch (this.f48508a) {
            case 0:
                TLRPC.Chat chat = this.f48509b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21087a = true;
                    LaunchActivity.R().showAsSheet(new y5(-chat.f19802id), obj);
                    return;
                }
                return;
            default:
                s3.e2(db1.d0(this.f48509b, true));
                return;
        }
    }

    public c(s3 s3Var, TLRPC.Chat chat) {
        this.f48509b = chat;
    }
}
