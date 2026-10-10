package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.v5;
import yh.s3;
public final class c implements Runnable {
    public final int f48343a = 0;
    public final TLRPC.Chat f48344b;

    public c(TLRPC.Chat chat) {
        this.f48344b = chat;
    }

    @Override
    public final void run() {
        switch (this.f48343a) {
            case 0:
                TLRPC.Chat chat = this.f48344b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21361a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f20042id), obj);
                    return;
                }
                return;
            default:
                s3.e2(bb1.d0(this.f48344b, true));
                return;
        }
    }

    public c(s3 s3Var, TLRPC.Chat chat) {
        this.f48344b = chat;
    }
}
