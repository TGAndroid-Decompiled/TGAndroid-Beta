package wg;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f57683a;
    public final TLRPC.Chat f57684b;
    public final int f57685c;
    public final ArrayList d;
    public final c20 f57686e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, c20 c20Var, int i10) {
        this.f57683a = i10;
        this.f57684b = chat;
        this.f57685c = i7;
        this.d = arrayList;
        this.f57686e = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f57683a) {
            case 0:
                TLRPC.Chat chat = this.f57684b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f57685c, arrayList);
                }
                this.f57686e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f57684b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f57685c, arrayList2);
                }
                this.f57686e.a(arrayList2);
                return;
        }
    }
}
