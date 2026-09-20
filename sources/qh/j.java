package qh;

import ai.a3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.web.r0;
public final class j implements Utilities.Callback2 {
    public final int f42087a;
    public final p f42088b;

    public j(p pVar, int i10) {
        this.f42087a = i10;
        this.f42088b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f42087a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f42088b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k61 k61Var = (k61) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f42101j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f42095a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a3 a3Var = new a3(pVar, peerDialogId, 3);
                    int i13 = m.f42092a;
                    w51 J = w51.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f29961z = i12;
                    J.D = a3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f42093a;
                        arrayList.add(w51.J(n.class));
                        arrayList.add(w51.J(n.class));
                        arrayList.add(w51.J(n.class));
                        arrayList.add(w51.J(n.class));
                        arrayList.add(w51.J(n.class));
                        return;
                    }
                    int i15 = o.f42094a;
                    arrayList.add(w51.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f42095a;
                pVar.f42100i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f42099g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f42101j.addAll(tL_messages_votesList.votes);
                    r0 r0Var = pVar.e;
                    if (r0Var != null) {
                        r0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f42099g = null;
                pVar.h = true;
                return;
        }
    }
}
