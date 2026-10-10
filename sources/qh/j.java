package qh;

import ai.b3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.web.q0;
public final class j implements Utilities.Callback2 {
    public final int f46746a;
    public final p f46747b;

    public j(p pVar, int i10) {
        this.f46746a = i10;
        this.f46747b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f46746a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f46747b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                d71 d71Var = (d71) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f46761j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f46754a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    b3 b3Var = new b3(pVar, peerDialogId, 3);
                    int i13 = m.f46751a;
                    q61 J = q61.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f30076z = i12;
                    J.D = b3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f46752a;
                        arrayList.add(q61.J(n.class));
                        arrayList.add(q61.J(n.class));
                        arrayList.add(q61.J(n.class));
                        arrayList.add(q61.J(n.class));
                        arrayList.add(q61.J(n.class));
                        return;
                    }
                    int i15 = o.f46753a;
                    arrayList.add(q61.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f46754a;
                pVar.f46760i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f46759g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f46761j.addAll(tL_messages_votesList.votes);
                    q0 q0Var = pVar.f46757e;
                    if (q0Var != null) {
                        q0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f46759g = null;
                pVar.h = true;
                return;
        }
    }
}
