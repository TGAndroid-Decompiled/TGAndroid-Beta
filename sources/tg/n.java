package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f43462a;
    public final TLRPC.Chat f43463b;
    public final int f43464c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f43462a = i11;
        this.f43463b = chat;
        this.f43464c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f43462a) {
            case 0:
                TLRPC.Chat chat = this.f43463b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f43464c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f43463b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f43464c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
