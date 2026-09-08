package ug;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Runnable {
    public final int f47210a;
    public final TLRPC.Chat f47211b;
    public final int f47212c;
    public final ArrayList d;
    public final Utilities.Callback f47213e;

    public o(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47210a = i11;
        this.f47211b = chat;
        this.f47212c = i10;
        this.d = arrayList;
        this.f47213e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47210a) {
            case 0:
                TLRPC.Chat chat = this.f47211b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    t.m(this.f47212c, arrayList);
                }
                this.f47213e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47211b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    t.m(this.f47212c, arrayList2);
                }
                this.f47213e.run(arrayList2);
                return;
        }
    }
}
