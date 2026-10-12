package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f48619a;
    public final TLRPC.Chat f48620b;
    public final int f48621c;
    public final ArrayList d;
    public final Utilities.Callback f48622e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f48619a = i11;
        this.f48620b = chat;
        this.f48621c = i10;
        this.d = arrayList;
        this.f48622e = callback;
    }

    @Override
    public final void run() {
        switch (this.f48619a) {
            case 0:
                TLRPC.Chat chat = this.f48620b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    r.m(this.f48621c, arrayList);
                }
                this.f48622e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f48620b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    r.m(this.f48621c, arrayList2);
                }
                this.f48622e.run(arrayList2);
                return;
        }
    }
}
