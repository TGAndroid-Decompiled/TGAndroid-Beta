package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f43447a;
    public final TLRPC.Chat f43448b;
    public final int f43449c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f43447a = i11;
        this.f43448b = chat;
        this.f43449c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f43447a) {
            case 0:
                TLRPC.Chat chat = this.f43448b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f43449c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f43448b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f43449c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
