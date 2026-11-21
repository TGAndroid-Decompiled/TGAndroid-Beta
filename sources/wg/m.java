package wg;

import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f59830a;
    public final TLRPC.Chat f59831b;
    public final int f59832c;
    public final ArrayList d;
    public final x10 f59833e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, x10 x10Var, int i10) {
        this.f59830a = i10;
        this.f59831b = chat;
        this.f59832c = i7;
        this.d = arrayList;
        this.f59833e = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f59830a) {
            case 0:
                TLRPC.Chat chat = this.f59831b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f59832c, arrayList);
                }
                this.f59833e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f59831b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f59832c, arrayList2);
                }
                this.f59833e.a(arrayList2);
                return;
        }
    }
}
