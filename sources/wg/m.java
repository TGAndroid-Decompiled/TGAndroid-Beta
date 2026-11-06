package wg;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f57684a;
    public final TLRPC.Chat f57685b;
    public final int f57686c;
    public final ArrayList d;
    public final c20 f57687e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, c20 c20Var, int i10) {
        this.f57684a = i10;
        this.f57685b = chat;
        this.f57686c = i7;
        this.d = arrayList;
        this.f57687e = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f57684a) {
            case 0:
                TLRPC.Chat chat = this.f57685b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f57686c, arrayList);
                }
                this.f57687e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f57685b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f57686c, arrayList2);
                }
                this.f57687e.a(arrayList2);
                return;
        }
    }
}
