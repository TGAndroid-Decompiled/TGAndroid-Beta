package qh;

import ai.b3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.web.q0;
public final class j implements Utilities.Callback2 {
    public final int f46702a;
    public final p f46703b;

    public j(p pVar, int i10) {
        this.f46702a = i10;
        this.f46703b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f46702a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f46703b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var = (c71) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f46717j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f46710a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    b3 b3Var = new b3(pVar, peerDialogId, 3);
                    int i13 = m.f46707a;
                    p61 J = p61.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f29747z = i12;
                    J.D = b3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f46708a;
                        arrayList.add(p61.J(n.class));
                        arrayList.add(p61.J(n.class));
                        arrayList.add(p61.J(n.class));
                        arrayList.add(p61.J(n.class));
                        arrayList.add(p61.J(n.class));
                        return;
                    }
                    int i15 = o.f46709a;
                    arrayList.add(p61.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f46710a;
                pVar.f46716i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f46715g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f46717j.addAll(tL_messages_votesList.votes);
                    q0 q0Var = pVar.f46713e;
                    if (q0Var != null) {
                        q0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f46715g = null;
                pVar.h = true;
                return;
        }
    }
}
