package qh;

import ai.a3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.web.u0;
public final class j implements Utilities.Callback2 {
    public final int f45498a;
    public final p f45499b;

    public j(p pVar, int i10) {
        this.f45498a = i10;
        this.f45499b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f45498a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f45499b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w61 w61Var = (w61) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f45513j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f45506a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a3 a3Var = new a3(pVar, peerDialogId, 3);
                    int i13 = m.f45503a;
                    h61 K = h61.K(m.class);
                    K.G = userOrChat;
                    K.B = peerDialogId;
                    K.f27106z = i12;
                    K.D = a3Var;
                    arrayList.add(K);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f45504a;
                        arrayList.add(h61.K(n.class));
                        arrayList.add(h61.K(n.class));
                        arrayList.add(h61.K(n.class));
                        arrayList.add(h61.K(n.class));
                        arrayList.add(h61.K(n.class));
                        return;
                    }
                    int i15 = o.f45505a;
                    arrayList.add(h61.K(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f45506a;
                pVar.f45512i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f45511g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f45513j.addAll(tL_messages_votesList.votes);
                    u0 u0Var = pVar.f45509e;
                    if (u0Var != null) {
                        u0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f45511g = null;
                pVar.h = true;
                return;
        }
    }
}
