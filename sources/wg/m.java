package wg;

import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f59788a;
    public final TLRPC.Chat f59789b;
    public final int f59790c;
    public final ArrayList d;
    public final x10 f59791e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, x10 x10Var, int i10) {
        this.f59788a = i10;
        this.f59789b = chat;
        this.f59790c = i7;
        this.d = arrayList;
        this.f59791e = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f59788a) {
            case 0:
                TLRPC.Chat chat = this.f59789b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f59790c, arrayList);
                }
                this.f59791e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f59789b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f59790c, arrayList2);
                }
                this.f59791e.a(arrayList2);
                return;
        }
    }
}
