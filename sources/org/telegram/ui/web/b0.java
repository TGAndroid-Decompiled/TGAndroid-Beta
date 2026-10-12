package org.telegram.ui.web;

import ai.ea;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.hg1;
import org.telegram.ui.py;
import org.telegram.ui.sj0;
import org.telegram.ui.vy;
public final class b0 implements sj0, py {
    public final b1 f43177a;
    public final boolean[] f43178b;
    public final String f43179c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final ea f43180e;

    public b0(b1 b1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, ea eaVar) {
        this.f43177a = b1Var;
        this.f43178b = zArr;
        this.f43179c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.f43180e = eaVar;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(vy vyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f43178b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            b1 b1Var = this.f43177a;
            MessagesController.getInstance(b1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(b1Var.U);
            String str = this.f43179c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(b1Var.M).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new u(b1Var, this.f43180e, str, 2));
        }
    }

    @Override
    public boolean w(vy vyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, hg1 hg1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f43178b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            b1 b1Var = this.f43177a;
            MessagesController.getInstance(b1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(b1Var.U);
            String str = this.f43179c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(b1Var.M).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new u(b1Var, this.f43180e, str, 1));
        }
        vyVar.finishFragment();
        return true;
    }
}
