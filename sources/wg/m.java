package wg;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f57774a;
    public final TLRPC.Chat f57775b;
    public final int f57776c;
    public final ArrayList d;
    public final c20 f57777e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, c20 c20Var, int i10) {
        this.f57774a = i10;
        this.f57775b = chat;
        this.f57776c = i7;
        this.d = arrayList;
        this.f57777e = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f57774a) {
            case 0:
                TLRPC.Chat chat = this.f57775b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    r.m(this.f57776c, arrayList);
                }
                this.f57777e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f57775b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    r.m(this.f57776c, arrayList2);
                }
                this.f57777e.a(arrayList2);
                return;
        }
    }
}
