package vg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Runnable {
    public final int f50234a;
    public final TLRPC.Chat f50235b;
    public final int f50236c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public o(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f50234a = i11;
        this.f50235b = chat;
        this.f50236c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f50234a) {
            case 0:
                TLRPC.Chat chat = this.f50235b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f50236c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f50235b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f50236c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
