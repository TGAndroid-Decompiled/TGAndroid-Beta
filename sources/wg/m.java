package wg;

import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f59834a;
    public final TLRPC.Chat f59835b;
    public final int f59836c;
    public final ArrayList d;
    public final y10 f59837e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, y10 y10Var, int i10) {
        this.f59834a = i10;
        this.f59835b = chat;
        this.f59836c = i7;
        this.d = arrayList;
        this.f59837e = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f59834a) {
            case 0:
                TLRPC.Chat chat = this.f59835b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f59836c, arrayList);
                }
                this.f59837e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f59835b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f59836c, arrayList2);
                }
                this.f59837e.a(arrayList2);
                return;
        }
    }
}
