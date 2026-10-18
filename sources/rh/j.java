package rh;

import ci.a2;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
public final class j implements Utilities.Callback2 {
    public final int f45768a;
    public final p f45769b;

    public j(p pVar, int i10) {
        this.f45768a = i10;
        this.f45769b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f45768a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f45769b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f45782j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f45776a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a2 a2Var = new a2(pVar, peerDialogId, 3);
                    int i13 = m.f45773a;
                    f61 J = f61.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f26153z = i12;
                    J.D = a2Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f45774a;
                        arrayList.add(f61.J(n.class));
                        arrayList.add(f61.J(n.class));
                        arrayList.add(f61.J(n.class));
                        arrayList.add(f61.J(n.class));
                        arrayList.add(f61.J(n.class));
                        return;
                    }
                    int i15 = o.f45775a;
                    arrayList.add(f61.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f45776a;
                pVar.f45781i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f45780g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f45782j.addAll(tL_messages_votesList.votes);
                    org.telegram.ui.web.a2 a2Var2 = pVar.e;
                    if (a2Var2 != null) {
                        a2Var2.run();
                        return;
                    }
                    return;
                }
                pVar.f45780g = null;
                pVar.h = true;
                return;
        }
    }
}
