package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f43463a;
    public final TLRPC.Chat f43464b;
    public final int f43465c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f43463a = i11;
        this.f43464b = chat;
        this.f43465c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f43463a) {
            case 0:
                TLRPC.Chat chat = this.f43464b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f43465c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f43464b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f43465c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
