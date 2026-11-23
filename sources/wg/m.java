package wg;

import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f59799a;
    public final TLRPC.Chat f59800b;
    public final int f59801c;
    public final ArrayList d;
    public final y10 f59802e;

    public m(TLRPC.Chat chat, int i7, ArrayList arrayList, y10 y10Var, int i10) {
        this.f59799a = i10;
        this.f59800b = chat;
        this.f59801c = i7;
        this.d = arrayList;
        this.f59802e = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f59799a) {
            case 0:
                TLRPC.Chat chat = this.f59800b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    s.m(this.f59801c, arrayList);
                }
                this.f59802e.a(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f59800b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    s.m(this.f59801c, arrayList2);
                }
                this.f59802e.a(arrayList2);
                return;
        }
    }
}
