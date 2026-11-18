package wg;

import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f59789a;
    public final TLRPC.Chat f59790b;
    public final int f59791c;
    public final ArrayList d;
    public final x10 f59792e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, x10 x10Var, int i10) {
        this.f59789a = i10;
        this.f59790b = chat;
        this.f59791c = i7;
        this.d = arrayList;
        this.f59792e = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f59789a) {
            case 0:
                TLRPC.Chat chat = this.f59790b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f59791c, arrayList);
                }
                this.f59792e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f59790b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f59791c, arrayList2);
                }
                this.f59792e.a(arrayList2);
                return;
        }
    }
}
