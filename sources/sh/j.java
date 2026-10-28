package sh;

import di.a2;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.web.h1;
public final class j implements Utilities.Callback2 {
    public final int f48689a;
    public final p f48690b;

    public j(p pVar, int i10) {
        this.f48689a = i10;
        this.f48690b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f48689a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f48690b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k71 k71Var = (k71) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f48703j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f48697a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    a2 a2Var = new a2(pVar, peerDialogId, 3);
                    int i13 = m.f48694a;
                    u61 K = u61.K(m.class);
                    K.G = userOrChat;
                    K.B = peerDialogId;
                    K.f33262z = i12;
                    K.D = a2Var;
                    arrayList.add(K);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f48695a;
                        arrayList.add(u61.K(n.class));
                        arrayList.add(u61.K(n.class));
                        arrayList.add(u61.K(n.class));
                        arrayList.add(u61.K(n.class));
                        arrayList.add(u61.K(n.class));
                        return;
                    }
                    int i15 = o.f48696a;
                    arrayList.add(u61.K(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f48697a;
                pVar.f48702i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f48701g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f48703j.addAll(tL_messages_votesList.votes);
                    h1 h1Var = pVar.e;
                    if (h1Var != null) {
                        h1Var.run();
                        return;
                    }
                    return;
                }
                pVar.f48701g = null;
                pVar.h = true;
                return;
        }
    }
}
