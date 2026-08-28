package yg;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import pf.o1;
public final class j implements Utilities.Callback2 {
    public final int f50243a;
    public final p f50244b;

    public j(p pVar, int i9) {
        this.f50243a = i9;
        this.f50244b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9 = this.f50243a;
        int i10 = 0;
        boolean z10 = false;
        p pVar = this.f50244b;
        switch (i9) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f50258j;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj3 = arrayList2.get(i10);
                    i10++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f50251a).getUserOrChat(peerDialogId);
                    int i11 = messagePeerVote.date;
                    fh.p pVar2 = new fh.p(pVar, peerDialogId, 5);
                    int i12 = m.f50248a;
                    l41 J = l41.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f30352z = i11;
                    J.D = pVar2;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i13 = n.f50249a;
                        arrayList.add(l41.J(n.class));
                        arrayList.add(l41.J(n.class));
                        arrayList.add(l41.J(n.class));
                        arrayList.add(l41.J(n.class));
                        arrayList.add(l41.J(n.class));
                        return;
                    }
                    int i14 = o.f50250a;
                    arrayList.add(l41.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i15 = pVar.f50251a;
                pVar.f50257i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i15).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i15).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f50256g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f50258j.addAll(tL_messages_votesList.votes);
                    o1 o1Var = pVar.f50254e;
                    if (o1Var != null) {
                        o1Var.run();
                        return;
                    }
                    return;
                }
                pVar.f50256g = null;
                pVar.h = true;
                return;
        }
    }
}
