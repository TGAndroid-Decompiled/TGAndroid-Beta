package qh;

import ai.b3;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.web.t0;
public final class j implements Utilities.Callback2 {
    public final int f46639a;
    public final p f46640b;

    public j(p pVar, int i10) {
        this.f46639a = i10;
        this.f46640b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f46639a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f46640b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                h71 h71Var = (h71) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f46654j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f46647a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    b3 b3Var = new b3(pVar, peerDialogId, 3);
                    int i13 = m.f46644a;
                    u61 J = u61.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f31089z = i12;
                    J.D = b3Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f46645a;
                        arrayList.add(u61.J(n.class));
                        arrayList.add(u61.J(n.class));
                        arrayList.add(u61.J(n.class));
                        arrayList.add(u61.J(n.class));
                        arrayList.add(u61.J(n.class));
                        return;
                    }
                    int i15 = o.f46646a;
                    arrayList.add(u61.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f46647a;
                pVar.f46653i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f46652g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f46654j.addAll(tL_messages_votesList.votes);
                    t0 t0Var = pVar.f46650e;
                    if (t0Var != null) {
                        t0Var.run();
                        return;
                    }
                    return;
                }
                pVar.f46652g = null;
                pVar.h = true;
                return;
        }
    }
}
