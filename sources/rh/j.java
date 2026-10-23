package rh;

import ci.a2;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.m61;
public final class j implements Utilities.Callback2 {
    public final int f46203a;
    public final p f46204b;

    public j(p pVar, int i10) {
        this.f46203a = i10;
        this.f46204b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f46203a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f46204b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b71 b71Var = (b71) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f46217j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f46211a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a2 a2Var = new a2(pVar, peerDialogId, 3);
                    int i13 = m.f46208a;
                    m61 J = m61.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f28572z = i12;
                    J.D = a2Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f46209a;
                        arrayList.add(m61.J(n.class));
                        arrayList.add(m61.J(n.class));
                        arrayList.add(m61.J(n.class));
                        arrayList.add(m61.J(n.class));
                        arrayList.add(m61.J(n.class));
                        return;
                    }
                    int i15 = o.f46210a;
                    arrayList.add(m61.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f46211a;
                pVar.f46216i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f46215g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f46217j.addAll(tL_messages_votesList.votes);
                    org.telegram.ui.web.a2 a2Var2 = pVar.e;
                    if (a2Var2 != null) {
                        a2Var2.run();
                        return;
                    }
                    return;
                }
                pVar.f46215g = null;
                pVar.h = true;
                return;
        }
    }
}
