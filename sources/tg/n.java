package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f47065a;
    public final TLRPC.Chat f47066b;
    public final int f47067c;
    public final ArrayList d;
    public final Utilities.Callback f47068e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47065a = i11;
        this.f47066b = chat;
        this.f47067c = i10;
        this.d = arrayList;
        this.f47068e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47065a) {
            case 0:
                TLRPC.Chat chat = this.f47066b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f47067c, arrayList);
                }
                this.f47068e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47066b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f47067c, arrayList2);
                }
                this.f47068e.run(arrayList2);
                return;
        }
    }
}
