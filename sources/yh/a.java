package yh;

import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p51;
public final class a implements j20 {
    public final int f54439a;
    public final e f54440b;

    public a(e eVar, int i10) {
        this.f54439a = i10;
        this.f54440b = eVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String L0;
        int i10;
        int i11 = this.f54439a;
        e eVar = this.f54440b;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                arrayList.add(a51.l(0, eVar.h));
                a51 c10 = a51.c(1, 2131232175, cd.L0(2131751939, null));
                c10.f24297q = true;
                arrayList.add(c10);
                arrayList.add(a51.E(2, i0.L(14.0f)));
                ArrayList arrayList2 = eVar.f54471n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(a51.t(3, cd.L0(2131751969, null)));
                    ArrayList arrayList3 = eVar.f54471n;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull M0 = eVar.getMessagesController().M0(chat.f19793id);
                        a51 w9 = a51.w(chat);
                        long j10 = chat.f19793id;
                        w9.d = (int) (j10 ^ (j10 >>> 32));
                        if (M0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = M0.linked_peers;
                            if (arrayList4 != null) {
                                i10 = arrayList4.size();
                            } else {
                                i10 = 0;
                            }
                            L0 = cd.G(i10, "Chats", new Object[0]);
                        } else {
                            L0 = cd.L0(2131748789, null);
                        }
                        w9.f24293m = L0;
                        arrayList.add(w9);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    eVar.getClass();
                    cc.a0(eVar).f0(tL_error, false);
                    return;
                }
                f0.d(eVar, eVar.f54468b, 0);
                return;
        }
    }
}
