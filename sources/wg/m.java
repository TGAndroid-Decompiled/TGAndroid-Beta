package wg;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f57772a;
    public final TLRPC.Chat f57773b;
    public final int f57774c;
    public final ArrayList d;
    public final c20 f57775e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, c20 c20Var, int i10) {
        this.f57772a = i10;
        this.f57773b = chat;
        this.f57774c = i7;
        this.d = arrayList;
        this.f57775e = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f57772a) {
            case 0:
                TLRPC.Chat chat = this.f57773b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    r.m(this.f57774c, arrayList);
                }
                this.f57775e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f57773b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    r.m(this.f57774c, arrayList2);
                }
                this.f57775e.a(arrayList2);
                return;
        }
    }
}
