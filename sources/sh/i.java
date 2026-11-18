package sh;

import bi.q;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.web.z0;
public final class i implements q10 {
    public final int f57458a;
    public final n f57459b;

    public i(n nVar, int i7) {
        this.f57458a = i7;
        this.f57459b = nVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f57458a;
        int i10 = 0;
        boolean z10 = false;
        n nVar = this.f57459b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                arrayList.clear();
                ArrayList arrayList2 = nVar.f57471j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o4 = n5.o(messagePeerVote.peer);
                    TLObject g22 = mp.u1(nVar.f57464a).g2(o4);
                    int i11 = messagePeerVote.date;
                    q qVar = new q(nVar, o4, 5);
                    int i12 = k.f57461b;
                    l41 K = l41.K(k.class);
                    K.H = g22;
                    K.C = o4;
                    K.A = i11;
                    K.E = qVar;
                    arrayList.add(K);
                }
                if (!nVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i13 = l.f57462b;
                        arrayList.add(l41.K(l.class));
                        arrayList.add(l41.K(l.class));
                        arrayList.add(l41.K(l.class));
                        arrayList.add(l41.K(l.class));
                        arrayList.add(l41.K(l.class));
                        return;
                    }
                    int i14 = m.f57463b;
                    arrayList.add(l41.K(m.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = nVar.f57464a;
                nVar.f57470i = false;
                if (tL_messages_votesList != null) {
                    mp.u1(i15).f4(tL_messages_votesList.users, false);
                    mp.u1(i15).Z3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    nVar.f57469g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    nVar.h = z10;
                    nVar.f57471j.addAll(tL_messages_votesList.votes);
                    z0 z0Var = nVar.f57467e;
                    if (z0Var != null) {
                        z0Var.run();
                        return;
                    }
                    return;
                }
                nVar.f57469g = null;
                nVar.h = true;
                return;
        }
    }
}
