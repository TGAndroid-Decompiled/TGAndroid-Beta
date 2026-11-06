package sh;

import di.u1;
import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x31;
import sg.t0;
public final class h implements v10 {
    public final int f55225a;
    public final m f55226b;

    public h(m mVar, int i7) {
        this.f55225a = i7;
        this.f55226b = mVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f55225a;
        int i10 = 0;
        boolean z9 = false;
        m mVar = this.f55226b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l41 l41Var = (l41) obj2;
                arrayList.clear();
                ArrayList arrayList2 = mVar.f55238j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o4 = m5.o(messagePeerVote.peer);
                    TLObject e22 = qp.s1(mVar.f55231a).e2(o4);
                    int i11 = messagePeerVote.date;
                    u1 u1Var = new u1(mVar, o4, 3);
                    int i12 = j.f55228b;
                    x31 K = x31.K(j.class);
                    K.G = e22;
                    K.B = o4;
                    K.f40172z = i11;
                    K.D = u1Var;
                    arrayList.add(K);
                }
                if (!mVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i13 = k.f55229b;
                        arrayList.add(x31.K(k.class));
                        arrayList.add(x31.K(k.class));
                        arrayList.add(x31.K(k.class));
                        arrayList.add(x31.K(k.class));
                        arrayList.add(x31.K(k.class));
                        return;
                    }
                    int i14 = l.f55230b;
                    arrayList.add(x31.K(l.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = mVar.f55231a;
                mVar.f55237i = false;
                if (tL_messages_votesList != null) {
                    qp.s1(i15).Y3(tL_messages_votesList.users, false);
                    qp.s1(i15).S3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.f55236g = str;
                    if (str == null) {
                        z9 = true;
                    }
                    mVar.h = z9;
                    mVar.f55238j.addAll(tL_messages_votesList.votes);
                    t0 t0Var = mVar.f55234e;
                    if (t0Var != null) {
                        t0Var.run();
                        return;
                    }
                    return;
                }
                mVar.f55236g = null;
                mVar.h = true;
                return;
        }
    }
}
