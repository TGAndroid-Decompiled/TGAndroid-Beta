package sh;

import bi.q;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.web.z0;
public final class h implements q10 {
    public final int f57497a;
    public final m f57498b;

    public h(m mVar, int i7) {
        this.f57497a = i7;
        this.f57498b = mVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f57497a;
        int i10 = 0;
        boolean z10 = false;
        m mVar = this.f57498b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = mVar.f57510j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o4 = n5.o(messagePeerVote.peer);
                    TLObject g22 = mp.u1(mVar.f57503a).g2(o4);
                    int i11 = messagePeerVote.date;
                    q qVar = new q(mVar, o4, 5);
                    int i12 = j.f57500b;
                    o41 K = o41.K(j.class);
                    K.H = g22;
                    K.C = o4;
                    K.A = i11;
                    K.E = qVar;
                    arrayList.add(K);
                }
                if (!mVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i13 = k.f57501b;
                        arrayList.add(o41.K(k.class));
                        arrayList.add(o41.K(k.class));
                        arrayList.add(o41.K(k.class));
                        arrayList.add(o41.K(k.class));
                        arrayList.add(o41.K(k.class));
                        return;
                    }
                    int i14 = l.f57502b;
                    arrayList.add(o41.K(l.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = mVar.f57503a;
                mVar.f57509i = false;
                if (tL_messages_votesList != null) {
                    mp.u1(i15).f4(tL_messages_votesList.users, false);
                    mp.u1(i15).Z3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.f57508g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    mVar.h = z10;
                    mVar.f57510j.addAll(tL_messages_votesList.votes);
                    z0 z0Var = mVar.f57506e;
                    if (z0Var != null) {
                        z0Var.run();
                        return;
                    }
                    return;
                }
                mVar.f57508g = null;
                mVar.h = true;
                return;
        }
    }
}
