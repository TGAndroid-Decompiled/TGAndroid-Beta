package ph;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.voip.x;
public final class j implements Utilities.Callback2 {
    public final int f40431a;
    public final p f40432b;

    public j(p pVar, int i10) {
        this.f40431a = i10;
        this.f40432b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f40431a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f40432b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f40445j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f40439a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    m80 m80Var = new m80(pVar, peerDialogId, 2);
                    int i13 = m.f40436a;
                    v51 J = v51.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f27842z = i12;
                    J.D = m80Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f40437a;
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        arrayList.add(v51.J(n.class));
                        return;
                    }
                    int i15 = o.f40438a;
                    arrayList.add(v51.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f40439a;
                pVar.f40444i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f40443g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f40445j.addAll(tL_messages_votesList.votes);
                    x xVar = pVar.e;
                    if (xVar != null) {
                        xVar.run();
                        return;
                    }
                    return;
                }
                pVar.f40443g = null;
                pVar.h = true;
                return;
        }
    }
}
