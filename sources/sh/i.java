package sh;

import di.u1;
import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.y31;
public final class i implements v10 {
    public final int f55330a;
    public final n f55331b;

    public i(n nVar, int i7) {
        this.f55330a = i7;
        this.f55331b = nVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f55330a;
        int i10 = 0;
        boolean z9 = false;
        n nVar = this.f55331b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                arrayList.clear();
                ArrayList arrayList2 = nVar.f55343j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o4 = m5.o(messagePeerVote.peer);
                    TLObject e22 = qp.s1(nVar.f55336a).e2(o4);
                    int i11 = messagePeerVote.date;
                    u1 u1Var = new u1(nVar, o4, 3);
                    int i12 = k.f55333b;
                    y31 K = y31.K(k.class);
                    K.G = e22;
                    K.B = o4;
                    K.f40581z = i11;
                    K.D = u1Var;
                    arrayList.add(K);
                }
                if (!nVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i13 = l.f55334b;
                        arrayList.add(y31.K(l.class));
                        arrayList.add(y31.K(l.class));
                        arrayList.add(y31.K(l.class));
                        arrayList.add(y31.K(l.class));
                        arrayList.add(y31.K(l.class));
                        return;
                    }
                    int i14 = m.f55335b;
                    arrayList.add(y31.K(m.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = nVar.f55336a;
                nVar.f55342i = false;
                if (tL_messages_votesList != null) {
                    qp.s1(i15).Y3(tL_messages_votesList.users, false);
                    qp.s1(i15).S3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    nVar.f55341g = str;
                    if (str == null) {
                        z9 = true;
                    }
                    nVar.h = z9;
                    nVar.f55343j.addAll(tL_messages_votesList.votes);
                    b bVar = nVar.f55339e;
                    if (bVar != null) {
                        bVar.run();
                        return;
                    }
                    return;
                }
                nVar.f55341g = null;
                nVar.h = true;
                return;
        }
    }
}
