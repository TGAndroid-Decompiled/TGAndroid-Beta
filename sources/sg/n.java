package sg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f41956a;
    public final TLRPC.Chat f41957b;
    public final int f41958c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f41956a = i11;
        this.f41957b = chat;
        this.f41958c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f41956a) {
            case 0:
                TLRPC.Chat chat = this.f41957b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f41958c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f41957b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f41958c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
