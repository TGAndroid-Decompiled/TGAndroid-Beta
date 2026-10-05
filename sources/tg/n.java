package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f47081a;
    public final TLRPC.Chat f47082b;
    public final int f47083c;
    public final ArrayList d;
    public final Utilities.Callback f47084e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47081a = i11;
        this.f47082b = chat;
        this.f47083c = i10;
        this.d = arrayList;
        this.f47084e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47081a) {
            case 0:
                TLRPC.Chat chat = this.f47082b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f47083c, arrayList);
                }
                this.f47084e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47082b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f47083c, arrayList2);
                }
                this.f47084e.run(arrayList2);
                return;
        }
    }
}
