package qh;

import ai.a3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.web.t0;
public final class j implements Utilities.Callback2 {
    public final int f41740a;
    public final p f41741b;

    public j(p pVar, int i10) {
        this.f41740a = i10;
        this.f41741b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f41740a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f41741b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f41754j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f41748a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a3 a3Var = new a3(pVar, peerDialogId, 3);
                    int i13 = m.f41745a;
                    h51 J = h51.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f24520z = i12;
                    J.D = a3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f41746a;
                        arrayList.add(h51.J(n.class));
                        arrayList.add(h51.J(n.class));
                        arrayList.add(h51.J(n.class));
                        arrayList.add(h51.J(n.class));
                        arrayList.add(h51.J(n.class));
                        return;
                    }
                    int i15 = o.f41747a;
                    arrayList.add(h51.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f41748a;
                pVar.f41753i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f41752g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f41754j.addAll(tL_messages_votesList.votes);
                    t0 t0Var = pVar.e;
                    if (t0Var != null) {
                        t0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f41752g = null;
                pVar.h = true;
                return;
        }
    }
}
