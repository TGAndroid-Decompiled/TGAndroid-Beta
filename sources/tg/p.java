package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Runnable {
    public final int f43152a;
    public final TLRPC.Chat f43153b;
    public final int f43154c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public p(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f43152a = i11;
        this.f43153b = chat;
        this.f43154c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f43152a) {
            case 0:
                TLRPC.Chat chat = this.f43153b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    t.m(this.f43154c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f43153b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    t.m(this.f43154c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
