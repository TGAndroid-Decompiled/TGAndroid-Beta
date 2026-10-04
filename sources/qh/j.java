package qh;

import ai.a3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.web.u0;
public final class j implements Utilities.Callback2 {
    public final int f45491a;
    public final p f45492b;

    public j(p pVar, int i10) {
        this.f45491a = i10;
        this.f45492b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f45491a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f45492b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var = (u61) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f45506j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f45499a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a3 a3Var = new a3(pVar, peerDialogId, 3);
                    int i13 = m.f45496a;
                    g61 J = g61.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f26687z = i12;
                    J.D = a3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f45497a;
                        arrayList.add(g61.J(n.class));
                        arrayList.add(g61.J(n.class));
                        arrayList.add(g61.J(n.class));
                        arrayList.add(g61.J(n.class));
                        arrayList.add(g61.J(n.class));
                        return;
                    }
                    int i15 = o.f45498a;
                    arrayList.add(g61.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f45499a;
                pVar.f45505i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f45504g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f45506j.addAll(tL_messages_votesList.votes);
                    u0 u0Var = pVar.f45502e;
                    if (u0Var != null) {
                        u0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f45504g = null;
                pVar.h = true;
                return;
        }
    }
}
