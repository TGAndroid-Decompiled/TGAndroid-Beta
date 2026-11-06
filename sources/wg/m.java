package wg;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f57659a;
    public final TLRPC.Chat f57660b;
    public final int f57661c;
    public final ArrayList d;
    public final c20 f57662e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, c20 c20Var, int i10) {
        this.f57659a = i10;
        this.f57660b = chat;
        this.f57661c = i7;
        this.d = arrayList;
        this.f57662e = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f57659a) {
            case 0:
                TLRPC.Chat chat = this.f57660b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f57661c, arrayList);
                }
                this.f57662e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f57660b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f57661c, arrayList2);
                }
                this.f57662e.a(arrayList2);
                return;
        }
    }
}
