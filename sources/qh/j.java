package qh;

import ai.a3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.web.q0;
public final class j implements Utilities.Callback2 {
    public final int f42073a;
    public final p f42074b;

    public j(p pVar, int i10) {
        this.f42073a = i10;
        this.f42074b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f42073a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f42074b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f42087j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f42081a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a3 a3Var = new a3(pVar, peerDialogId, 3);
                    int i13 = m.f42078a;
                    v51 J = v51.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f29061z = i12;
                    J.D = a3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f42079a;
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        return;
                    }
                    int i15 = o.f42080a;
                    arrayList.add(v51.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f42081a;
                pVar.f42086i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f42085g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f42087j.addAll(tL_messages_votesList.votes);
                    q0 q0Var = pVar.e;
                    if (q0Var != null) {
                        q0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f42085g = null;
                pVar.h = true;
                return;
        }
    }
}
