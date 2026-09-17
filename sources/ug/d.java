package ug;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.v5;
import zh.w3;
public final class d implements Runnable {
    public final int f47102a = 0;
    public final TLRPC.Chat f47103b;

    @Override
    public final void run() {
        switch (this.f47102a) {
            case 0:
                TLRPC.Chat chat = this.f47103b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21143a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f19869id), obj);
                    return;
                }
                return;
            default:
                w3.d2(bb1.d0(this.f47103b, true));
                return;
        }
    }

    public d(w3 w3Var, TLRPC.Chat chat) {
        this.f47103b = chat;
    }
}
