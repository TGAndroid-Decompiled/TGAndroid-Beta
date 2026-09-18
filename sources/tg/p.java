package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Runnable {
    public final int f43229a;
    public final TLRPC.Chat f43230b;
    public final int f43231c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public p(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f43229a = i11;
        this.f43230b = chat;
        this.f43231c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f43229a) {
            case 0:
                TLRPC.Chat chat = this.f43230b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    t.m(this.f43231c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f43230b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    t.m(this.f43231c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
