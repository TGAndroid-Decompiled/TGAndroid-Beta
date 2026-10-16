package ug;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hb1;
import org.telegram.ui.z5;
import zh.r3;
public final class d implements Runnable {
    public final int f46292a = 0;
    public final TLRPC.Chat f46293b;

    @Override
    public final void run() {
        switch (this.f46292a) {
            case 0:
                TLRPC.Chat chat = this.f46293b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f20169a = true;
                    LaunchActivity.R().showAsSheet(new z5(-chat.f18916id), obj);
                    return;
                }
                return;
            default:
                r3.e2(hb1.d0(this.f46293b, true));
                return;
        }
    }

    public d(r3 r3Var, TLRPC.Chat chat) {
        this.f46293b = chat;
    }
}
