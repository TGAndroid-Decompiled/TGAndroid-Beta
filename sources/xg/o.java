package xg;

import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class o implements Runnable {
    public final int f58737a;
    public final TLRPC.Chat f58738b;
    public final int f58739c;
    public final ArrayList d;
    public final u10 f58740e;

    public o(TLRPC.Chat chat, int i3, ArrayList arrayList, u10 u10Var, int i10) {
        this.f58737a = i10;
        this.f58738b = chat;
        this.f58739c = i3;
        this.d = arrayList;
        this.f58740e = u10Var;
    }

    @Override
    public final void run() {
        switch (this.f58737a) {
            case 0:
                TLRPC.Chat chat = this.f58738b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f58739c, arrayList);
                }
                this.f58740e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f58738b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f58739c, arrayList2);
                }
                this.f58740e.a(arrayList2);
                return;
        }
    }
}
