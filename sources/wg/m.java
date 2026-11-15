package wg;

import java.util.ArrayList;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f59209a;
    public final TLRPC.Chat f59210b;
    public final int f59211c;
    public final ArrayList d;
    public final z10 f59212e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, z10 z10Var, int i10) {
        this.f59209a = i10;
        this.f59210b = chat;
        this.f59211c = i7;
        this.d = arrayList;
        this.f59212e = z10Var;
    }

    @Override
    public final void run() {
        switch (this.f59209a) {
            case 0:
                TLRPC.Chat chat = this.f59210b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    q.m(this.f59211c, arrayList);
                }
                this.f59212e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f59210b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    q.m(this.f59211c, arrayList2);
                }
                this.f59212e.a(arrayList2);
                return;
        }
    }
}
