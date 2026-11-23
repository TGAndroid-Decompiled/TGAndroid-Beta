package sh;

import bi.q;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.web.z0;
public final class h implements p10 {
    public final int f57577a;
    public final m f57578b;

    public h(m mVar, int i7) {
        this.f57577a = i7;
        this.f57578b = mVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f57577a;
        int i10 = 0;
        boolean z10 = false;
        m mVar = this.f57578b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = mVar.f57590j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o4 = n5.o(messagePeerVote.peer);
                    TLObject g22 = mp.u1(mVar.f57583a).g2(o4);
                    int i11 = messagePeerVote.date;
                    q qVar = new q(mVar, o4, 5);
                    int i12 = j.f57580b;
                    n41 K = n41.K(j.class);
                    K.H = g22;
                    K.C = o4;
                    K.A = i11;
                    K.E = qVar;
                    arrayList.add(K);
                }
                if (!mVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i13 = k.f57581b;
                        arrayList.add(n41.K(k.class));
                        arrayList.add(n41.K(k.class));
                        arrayList.add(n41.K(k.class));
                        arrayList.add(n41.K(k.class));
                        arrayList.add(n41.K(k.class));
                        return;
                    }
                    int i14 = l.f57582b;
                    arrayList.add(n41.K(l.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = mVar.f57583a;
                mVar.f57589i = false;
                if (tL_messages_votesList != null) {
                    mp.u1(i15).f4(tL_messages_votesList.users, false);
                    mp.u1(i15).Z3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.f57588g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    mVar.h = z10;
                    mVar.f57590j.addAll(tL_messages_votesList.votes);
                    z0 z0Var = mVar.f57586e;
                    if (z0Var != null) {
                        z0Var.run();
                        return;
                    }
                    return;
                }
                mVar.f57588g = null;
                mVar.h = true;
                return;
        }
    }
}
