package yh;

import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.q51;
public final class a implements k20 {
    public final int f54460a;
    public final e f54461b;

    public a(e eVar, int i10) {
        this.f54460a = i10;
        this.f54461b = eVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String L0;
        int i10;
        int i11 = this.f54460a;
        e eVar = this.f54461b;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var = (q51) obj2;
                arrayList.add(b51.l(0, eVar.h));
                b51 c10 = b51.c(1, 2131232175, dd.L0(2131751939, null));
                c10.f24648q = true;
                arrayList.add(c10);
                arrayList.add(b51.E(2, i0.L(14.0f)));
                ArrayList arrayList2 = eVar.f54490n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(b51.t(3, dd.L0(2131751969, null)));
                    ArrayList arrayList3 = eVar.f54490n;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull M0 = eVar.getMessagesController().M0(chat.f19794id);
                        b51 w9 = b51.w(chat);
                        long j10 = chat.f19794id;
                        w9.d = (int) (j10 ^ (j10 >>> 32));
                        if (M0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = M0.linked_peers;
                            if (arrayList4 != null) {
                                i10 = arrayList4.size();
                            } else {
                                i10 = 0;
                            }
                            L0 = dd.G(i10, "Chats", new Object[0]);
                        } else {
                            L0 = dd.L0(2131748789, null);
                        }
                        w9.f24644m = L0;
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
                e0.d(eVar, eVar.f54487b, 0);
                return;
        }
    }
}
