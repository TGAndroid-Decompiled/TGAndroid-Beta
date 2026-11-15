package sh;

import bi.q;
import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
public final class h implements s10 {
    public final int f56882a;
    public final m f56883b;

    public h(m mVar, int i7) {
        this.f56882a = i7;
        this.f56883b = mVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f56882a;
        int i10 = 0;
        boolean z10 = false;
        m mVar = this.f56883b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                arrayList.clear();
                ArrayList arrayList2 = mVar.f56895j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o4 = m5.o(messagePeerVote.peer);
                    TLObject e22 = np.s1(mVar.f56888a).e2(o4);
                    int i11 = messagePeerVote.date;
                    q qVar = new q(mVar, o4, 5);
                    int i12 = j.f56885b;
                    b41 K = b41.K(j.class);
                    K.G = e22;
                    K.B = o4;
                    K.f33194z = i11;
                    K.D = qVar;
                    arrayList.add(K);
                }
                if (!mVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i13 = k.f56886b;
                        arrayList.add(b41.K(k.class));
                        arrayList.add(b41.K(k.class));
                        arrayList.add(b41.K(k.class));
                        arrayList.add(b41.K(k.class));
                        arrayList.add(b41.K(k.class));
                        return;
                    }
                    int i14 = l.f56887b;
                    arrayList.add(b41.K(l.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = mVar.f56888a;
                mVar.f56894i = false;
                if (tL_messages_votesList != null) {
                    np.s1(i15).Y3(tL_messages_votesList.users, false);
                    np.s1(i15).S3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.f56893g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    mVar.h = z10;
                    mVar.f56895j.addAll(tL_messages_votesList.votes);
                    q2.d dVar = mVar.f56891e;
                    if (dVar != null) {
                        dVar.run();
                        return;
                    }
                    return;
                }
                mVar.f56893g = null;
                mVar.h = true;
                return;
        }
    }
}
