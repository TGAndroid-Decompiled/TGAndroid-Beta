package qh;

import ai.a3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.web.u0;
public final class j implements Utilities.Callback2 {
    public final int f41784a;
    public final p f41785b;

    public j(p pVar, int i10) {
        this.f41784a = i10;
        this.f41785b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f41784a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f41785b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f41798j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f41792a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a3 a3Var = new a3(pVar, peerDialogId, 3);
                    int i13 = m.f41789a;
                    i51 J = i51.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f24913z = i12;
                    J.D = a3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f41790a;
                        arrayList.add(i51.J(n.class));
                        arrayList.add(i51.J(n.class));
                        arrayList.add(i51.J(n.class));
                        arrayList.add(i51.J(n.class));
                        arrayList.add(i51.J(n.class));
                        return;
                    }
                    int i15 = o.f41791a;
                    arrayList.add(i51.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f41792a;
                pVar.f41797i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f41796g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f41798j.addAll(tL_messages_votesList.votes);
                    u0 u0Var = pVar.e;
                    if (u0Var != null) {
                        u0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f41796g = null;
                pVar.h = true;
                return;
        }
    }
}
