package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Runnable {
    public final int f43197a;
    public final TLRPC.Chat f43198b;
    public final int f43199c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public p(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f43197a = i11;
        this.f43198b = chat;
        this.f43199c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f43197a) {
            case 0:
                TLRPC.Chat chat = this.f43198b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    t.m(this.f43199c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f43198b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    t.m(this.f43199c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
