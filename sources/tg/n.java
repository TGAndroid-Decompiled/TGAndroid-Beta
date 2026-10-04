package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f47066a;
    public final TLRPC.Chat f47067b;
    public final int f47068c;
    public final ArrayList d;
    public final Utilities.Callback f47069e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47066a = i11;
        this.f47067b = chat;
        this.f47068c = i10;
        this.d = arrayList;
        this.f47069e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47066a) {
            case 0:
                TLRPC.Chat chat = this.f47067b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f47068c, arrayList);
                }
                this.f47069e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47067b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f47068c, arrayList2);
                }
                this.f47069e.run(arrayList2);
                return;
        }
    }
}
