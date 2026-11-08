package wg;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f57775a;
    public final TLRPC.Chat f57776b;
    public final int f57777c;
    public final ArrayList d;
    public final c20 f57778e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, c20 c20Var, int i10) {
        this.f57775a = i10;
        this.f57776b = chat;
        this.f57777c = i7;
        this.d = arrayList;
        this.f57778e = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f57775a) {
            case 0:
                TLRPC.Chat chat = this.f57776b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f57777c, arrayList);
                }
                this.f57778e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f57776b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f57777c, arrayList2);
                }
                this.f57778e.a(arrayList2);
                return;
        }
    }
}
