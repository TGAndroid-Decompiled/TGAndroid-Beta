package rh;

import bi.p2;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.voip.r2;
public final class j implements Utilities.Callback2 {
    public final int f44447a;
    public final p f44448b;

    public j(p pVar, int i10) {
        this.f44447a = i10;
        this.f44448b = pVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f44447a;
        int i11 = 0;
        boolean z10 = false;
        p pVar = this.f44448b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                arrayList.clear();
                ArrayList arrayList2 = pVar.f44461j;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(pVar.f44455a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    p2 p2Var = new p2(pVar, peerDialogId, 3);
                    int i13 = m.f44452a;
                    m61 J = m61.J(m.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f26959z = i12;
                    J.D = p2Var;
                    arrayList.add(J);
                }
                if (!pVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = n.f44453a;
                        arrayList.add(m61.J(n.class));
                        arrayList.add(m61.J(n.class));
                        arrayList.add(m61.J(n.class));
                        arrayList.add(m61.J(n.class));
                        arrayList.add(m61.J(n.class));
                        return;
                    }
                    int i15 = o.f44454a;
                    arrayList.add(m61.J(o.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = pVar.f44455a;
                pVar.f44460i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    pVar.f44459g = str;
                    if (str == null) {
                        z10 = true;
                    }
                    pVar.h = z10;
                    pVar.f44461j.addAll(tL_messages_votesList.votes);
                    r2 r2Var = pVar.e;
                    if (r2Var != null) {
                        r2Var.run();
                        return;
                    }
                    return;
                }
                pVar.f44459g = null;
                pVar.h = true;
                return;
        }
    }
}
