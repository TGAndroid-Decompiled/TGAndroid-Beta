package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f47074a;
    public final TLRPC.Chat f47075b;
    public final int f47076c;
    public final ArrayList d;
    public final Utilities.Callback f47077e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47074a = i11;
        this.f47075b = chat;
        this.f47076c = i10;
        this.d = arrayList;
        this.f47077e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47074a) {
            case 0:
                TLRPC.Chat chat = this.f47075b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f47076c, arrayList);
                }
                this.f47077e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47075b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f47076c, arrayList2);
                }
                this.f47077e.run(arrayList2);
                return;
        }
    }
}
