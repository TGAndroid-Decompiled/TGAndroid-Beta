package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.db1;
import org.telegram.ui.y5;
import yh.s3;
public final class c implements Runnable {
    public final int f48538a = 0;
    public final TLRPC.Chat f48539b;

    public c(TLRPC.Chat chat) {
        this.f48539b = chat;
    }

    @Override
    public final void run() {
        switch (this.f48538a) {
            case 0:
                TLRPC.Chat chat = this.f48539b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21088a = true;
                    LaunchActivity.R().showAsSheet(new y5(-chat.f19803id), obj);
                    return;
                }
                return;
            default:
                s3.e2(db1.d0(this.f48539b, true));
                return;
        }
    }

    public c(s3 s3Var, TLRPC.Chat chat) {
        this.f48539b = chat;
    }
}
