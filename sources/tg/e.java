package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ra1;
import org.telegram.ui.w5;
import yh.y3;
public final class e implements Runnable {
    public final int f43078a = 0;
    public final TLRPC.Chat f43079b;

    @Override
    public final void run() {
        switch (this.f43078a) {
            case 0:
                TLRPC.Chat chat = this.f43079b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f19352a = true;
                    LaunchActivity.R().showAsSheet(new w5(-chat.f18083id), obj);
                    return;
                }
                return;
            default:
                y3.d2(ra1.d0(this.f43079b, true));
                return;
        }
    }

    public e(y3 y3Var, TLRPC.Chat chat) {
        this.f43079b = chat;
    }
}
