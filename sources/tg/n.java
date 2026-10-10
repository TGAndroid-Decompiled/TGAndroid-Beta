package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f48424a;
    public final TLRPC.Chat f48425b;
    public final int f48426c;
    public final ArrayList d;
    public final Utilities.Callback f48427e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f48424a = i11;
        this.f48425b = chat;
        this.f48426c = i10;
        this.d = arrayList;
        this.f48427e = callback;
    }

    @Override
    public final void run() {
        switch (this.f48424a) {
            case 0:
                TLRPC.Chat chat = this.f48425b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f48426c, arrayList);
                }
                this.f48427e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f48425b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f48426c, arrayList2);
                }
                this.f48427e.run(arrayList2);
                return;
        }
    }
}
