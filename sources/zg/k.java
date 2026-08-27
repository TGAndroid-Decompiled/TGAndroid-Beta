package zg;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n41;

public final class k implements Utilities.Callback2 {

    public final int f50841a;

    public final q f50842b;

    public k(q qVar, int i10) {
        this.f50841a = i10;
        this.f50842b = qVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f50841a;
        int i11 = 0;
        q qVar = this.f50842b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = qVar.f50856j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(qVar.f50849a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    gh.o oVar = new gh.o(qVar, peerDialogId, 5);
                    int i13 = n.f50846a;
                    n41 n41VarJ = n41.J(n.class);
                    n41VarJ.G = userOrChat;
                    n41VarJ.B = peerDialogId;
                    n41VarJ.f30857z = i12;
                    n41VarJ.D = oVar;
                    arrayList.add(n41VarJ);
                }
                if (!qVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i14 = p.f50848a;
                        arrayList.add(n41.J(p.class));
                    } else {
                        int i15 = o.f50847a;
                        arrayList.add(n41.J(o.class));
                        arrayList.add(n41.J(o.class));
                        arrayList.add(n41.J(o.class));
                        arrayList.add(n41.J(o.class));
                        arrayList.add(n41.J(o.class));
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i16 = qVar.f50849a;
                qVar.f50855i = false;
                if (tL_messages_votesList == null) {
                    qVar.f50854g = null;
                    qVar.h = true;
                } else {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    qVar.f50854g = str;
                    qVar.h = str == null;
                    qVar.f50856j.addAll(tL_messages_votesList.votes);
                    j jVar = qVar.f50852e;
                    if (jVar != null) {
                        jVar.run();
                    }
                }
                break;
        }
    }
}
