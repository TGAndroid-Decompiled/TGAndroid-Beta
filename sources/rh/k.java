package rh;

import bi.p2;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.voip.m2;
import org.telegram.ui.Components.z61;
public final class k implements Utilities.Callback2 {
    public final int f44690a;
    public final q f44691b;

    public k(q qVar, int i10) {
        this.f44690a = i10;
        this.f44691b = qVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f44690a;
        int i11 = 0;
        boolean z10 = false;
        q qVar = this.f44691b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z61 z61Var = (z61) obj2;
                arrayList.clear();
                ArrayList arrayList2 = qVar.f44704j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(qVar.f44698a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    p2 p2Var = new p2(qVar, peerDialogId, 3);
                    int i13 = n.f44695a;
                    l61 J = l61.J(n.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f26967z = i12;
                    J.D = p2Var;
                    arrayList.add(J);
                }
                if (!qVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = o.f44696a;
                        arrayList.add(l61.J(o.class));
                        arrayList.add(l61.J(o.class));
                        arrayList.add(l61.J(o.class));
                        arrayList.add(l61.J(o.class));
                        arrayList.add(l61.J(o.class));
                        return;
                    }
                    int i15 = p.f44697a;
                    arrayList.add(l61.J(p.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = qVar.f44698a;
                qVar.f44703i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    qVar.f44702g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    qVar.h = z10;
                    qVar.f44704j.addAll(tL_messages_votesList.votes);
                    m2 m2Var = qVar.e;
                    if (m2Var != null) {
                        m2Var.run();
                        return;
                    }
                    return;
                }
                qVar.f44702g = null;
                qVar.h = true;
                return;
        }
    }
}
