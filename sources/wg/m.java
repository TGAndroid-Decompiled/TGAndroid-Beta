package wg;

import java.util.ArrayList;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f59898a;
    public final TLRPC.Chat f59899b;
    public final int f59900c;
    public final ArrayList d;
    public final w10 f59901e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, w10 w10Var, int i10) {
        this.f59898a = i10;
        this.f59899b = chat;
        this.f59900c = i7;
        this.d = arrayList;
        this.f59901e = w10Var;
    }

    @Override
    public final void run() {
        switch (this.f59898a) {
            case 0:
                TLRPC.Chat chat = this.f59899b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    r.m(this.f59900c, arrayList);
                }
                this.f59901e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f59899b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    r.m(this.f59900c, arrayList2);
                }
                this.f59901e.a(arrayList2);
                return;
        }
    }
}
