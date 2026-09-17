package ug;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.v5;
import zh.w3;
public final class d implements Runnable {
    public final int f47130a = 0;
    public final TLRPC.Chat f47131b;

    @Override
    public final void run() {
        switch (this.f47130a) {
            case 0:
                TLRPC.Chat chat = this.f47131b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21170a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f19896id), obj);
                    return;
                }
                return;
            default:
                w3.d2(bb1.d0(this.f47131b, true));
                return;
        }
    }

    public d(w3 w3Var, TLRPC.Chat chat) {
        this.f47131b = chat;
    }
}
