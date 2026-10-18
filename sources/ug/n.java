package ug;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f47775a;
    public final TLRPC.Chat f47776b;
    public final int f47777c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47775a = i11;
        this.f47776b = chat;
        this.f47777c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47775a) {
            case 0:
                TLRPC.Chat chat = this.f47776b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    r.m(this.f47777c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47776b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    r.m(this.f47777c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
