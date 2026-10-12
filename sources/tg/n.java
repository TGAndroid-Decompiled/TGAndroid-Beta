package tg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Runnable {
    public final int f48588a;
    public final TLRPC.Chat f48589b;
    public final int f48590c;
    public final ArrayList d;
    public final Utilities.Callback f48591e;

    public n(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f48588a = i11;
        this.f48589b = chat;
        this.f48590c = i10;
        this.d = arrayList;
        this.f48591e = callback;
    }

    @Override
    public final void run() {
        switch (this.f48588a) {
            case 0:
                TLRPC.Chat chat = this.f48589b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    r.m(this.f48590c, arrayList);
                }
                this.f48591e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f48589b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    r.m(this.f48590c, arrayList2);
                }
                this.f48591e.run(arrayList2);
                return;
        }
    }
}
