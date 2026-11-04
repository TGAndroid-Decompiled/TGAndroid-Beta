package th;

import ai.v;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.r31;
import r4.u;
public final class h implements n10 {
    public final int f55423a;
    public final m f55424b;

    public h(m mVar, int i3) {
        this.f55423a = i3;
        this.f55424b = mVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f55423a;
        int i10 = 0;
        boolean z10 = false;
        m mVar = this.f55424b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                arrayList.clear();
                ArrayList arrayList2 = mVar.f55436j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o10 = m5.o(messagePeerVote.peer);
                    TLObject e22 = hp.s1(mVar.f55429a).e2(o10);
                    int i11 = messagePeerVote.date;
                    v vVar = new v(mVar, o10, 5);
                    int i12 = j.f55426b;
                    r31 K = r31.K(j.class);
                    K.G = e22;
                    K.B = o10;
                    K.f37640z = i11;
                    K.D = vVar;
                    arrayList.add(K);
                }
                if (!mVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i13 = k.f55427b;
                        arrayList.add(r31.K(k.class));
                        arrayList.add(r31.K(k.class));
                        arrayList.add(r31.K(k.class));
                        arrayList.add(r31.K(k.class));
                        arrayList.add(r31.K(k.class));
                        return;
                    }
                    int i14 = l.f55428b;
                    arrayList.add(r31.K(l.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = mVar.f55429a;
                mVar.f55435i = false;
                if (tL_messages_votesList != null) {
                    hp.s1(i15).Y3(tL_messages_votesList.users, false);
                    hp.s1(i15).S3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    mVar.f55434g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    mVar.h = z10;
                    mVar.f55436j.addAll(tL_messages_votesList.votes);
                    u uVar = mVar.f55432e;
                    if (uVar != null) {
                        uVar.run();
                        return;
                    }
                    return;
                }
                mVar.f55434g = null;
                mVar.h = true;
                return;
        }
    }
}
