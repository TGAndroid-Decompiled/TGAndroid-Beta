package ug;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f47730a;
    public final TLRPC.Chat f47731b;
    public final int f47732c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47730a = i11;
        this.f47731b = chat;
        this.f47732c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47730a) {
            case 0:
                TLRPC.Chat chat = this.f47731b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    r.m(this.f47732c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47731b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    r.m(this.f47732c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
