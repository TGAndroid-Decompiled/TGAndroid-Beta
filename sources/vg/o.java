package vg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Runnable {
    public final int f50269a;
    public final TLRPC.Chat f50270b;
    public final int f50271c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public o(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f50269a = i11;
        this.f50270b = chat;
        this.f50271c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f50269a) {
            case 0:
                TLRPC.Chat chat = this.f50270b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f50271c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f50270b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f50271c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
