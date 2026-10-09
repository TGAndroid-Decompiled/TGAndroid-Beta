package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f48378a;
    public final TLRPC.Chat f48379b;
    public final int f48380c;
    public final ArrayList d;
    public final Utilities.Callback f48381e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f48378a = i11;
        this.f48379b = chat;
        this.f48380c = i10;
        this.d = arrayList;
        this.f48381e = callback;
    }

    @Override
    public final void run() {
        switch (this.f48378a) {
            case 0:
                TLRPC.Chat chat = this.f48379b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f48380c, arrayList);
                }
                this.f48381e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f48379b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f48380c, arrayList2);
                }
                this.f48381e.run(arrayList2);
                return;
        }
    }
}
