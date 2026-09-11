package rh;

import bi.o2;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
public final class j implements Utilities.Callback2 {
    public final int f45642a;
    public final p f45643b;

    public j(p pVar, int i10) {
        this.f45642a = i10;
        this.f45643b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f45642a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f45643b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f45657j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f45650a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    o2 o2Var = new o2(pVar, peerDialogId, 3);
                    int i13 = m.f45647a;
                    h51 J = h51.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f26607z = i12;
                    J.D = o2Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f45648a;
                        arrayList.add(h51.J(n.class));
                        arrayList.add(h51.J(n.class));
                        arrayList.add(h51.J(n.class));
                        arrayList.add(h51.J(n.class));
                        arrayList.add(h51.J(n.class));
                        return;
                    }
                    int i15 = o.f45649a;
                    arrayList.add(h51.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f45650a;
                pVar.f45656i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f45655g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f45657j.addAll(tL_messages_votesList.votes);
                    org.telegram.ui.web.b bVar = pVar.f45653e;
                    if (bVar != null) {
                        bVar.run();
                        return;
                    }
                    return;
                }
                pVar.f45655g = null;
                pVar.h = true;
                return;
        }
    }
}
