package ug;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Runnable {
    public final int f47183a;
    public final TLRPC.Chat f47184b;
    public final int f47185c;
    public final ArrayList d;
    public final Utilities.Callback f47186e;

    public o(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47183a = i11;
        this.f47184b = chat;
        this.f47185c = i10;
        this.d = arrayList;
        this.f47186e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47183a) {
            case 0:
                TLRPC.Chat chat = this.f47184b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    t.m(this.f47185c, arrayList);
                }
                this.f47186e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47184b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    t.m(this.f47185c, arrayList2);
                }
                this.f47186e.run(arrayList2);
                return;
        }
    }
}
