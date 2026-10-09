package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f48380a;
    public final TLRPC.Chat f48381b;
    public final int f48382c;
    public final ArrayList d;
    public final Utilities.Callback f48383e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f48380a = i11;
        this.f48381b = chat;
        this.f48382c = i10;
        this.d = arrayList;
        this.f48383e = callback;
    }

    @Override
    public final void run() {
        switch (this.f48380a) {
            case 0:
                TLRPC.Chat chat = this.f48381b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f48382c, arrayList);
                }
                this.f48383e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f48381b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f48382c, arrayList2);
                }
                this.f48383e.run(arrayList2);
                return;
        }
    }
}
