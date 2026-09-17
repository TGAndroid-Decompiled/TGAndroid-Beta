package ug;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Runnable {
    public final int f47211a;
    public final TLRPC.Chat f47212b;
    public final int f47213c;
    public final ArrayList d;
    public final Utilities.Callback f47214e;

    public o(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47211a = i11;
        this.f47212b = chat;
        this.f47213c = i10;
        this.d = arrayList;
        this.f47214e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47211a) {
            case 0:
                TLRPC.Chat chat = this.f47212b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    t.m(this.f47213c, arrayList);
                }
                this.f47214e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47212b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    t.m(this.f47213c, arrayList2);
                }
                this.f47214e.run(arrayList2);
                return;
        }
    }
}
