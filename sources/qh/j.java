package qh;

import ai.a3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.web.u0;
public final class j implements Utilities.Callback2 {
    public final int f42042a;
    public final p f42043b;

    public j(p pVar, int i10) {
        this.f42042a = i10;
        this.f42043b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f42042a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f42043b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l61 l61Var = (l61) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f42056j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f42050a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a3 a3Var = new a3(pVar, peerDialogId, 3);
                    int i13 = m.f42047a;
                    x51 J = x51.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f30261z = i12;
                    J.D = a3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f42048a;
                        arrayList.add(x51.J(n.class));
                        arrayList.add(x51.J(n.class));
                        arrayList.add(x51.J(n.class));
                        arrayList.add(x51.J(n.class));
                        arrayList.add(x51.J(n.class));
                        return;
                    }
                    int i15 = o.f42049a;
                    arrayList.add(x51.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f42050a;
                pVar.f42055i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f42054g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f42056j.addAll(tL_messages_votesList.votes);
                    u0 u0Var = pVar.e;
                    if (u0Var != null) {
                        u0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f42054g = null;
                pVar.h = true;
                return;
        }
    }
}
