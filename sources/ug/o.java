package ug;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Runnable {
    public final int f47182a;
    public final TLRPC.Chat f47183b;
    public final int f47184c;
    public final ArrayList d;
    public final Utilities.Callback f47185e;

    public o(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47182a = i11;
        this.f47183b = chat;
        this.f47184c = i10;
        this.d = arrayList;
        this.f47185e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47182a) {
            case 0:
                TLRPC.Chat chat = this.f47183b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    t.m(this.f47184c, arrayList);
                }
                this.f47185e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47183b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    t.m(this.f47184c, arrayList2);
                }
                this.f47185e.run(arrayList2);
                return;
        }
    }
}
