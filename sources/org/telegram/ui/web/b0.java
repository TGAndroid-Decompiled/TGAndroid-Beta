package org.telegram.ui.web;

import ci.z7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.cj0;
import org.telegram.ui.ey;
import org.telegram.ui.te1;
import org.telegram.ui.xx;
public final class b0 implements cj0, xx {
    public final a1 f42555a;
    public final boolean[] f42556b;
    public final String f42557c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final z7 e;

    public b0(a1 a1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, z7 z7Var) {
        this.f42555a = a1Var;
        this.f42556b = zArr;
        this.f42557c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = z7Var;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f42556b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f42555a;
            MessagesController.getInstance(a1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.U);
            String str = this.f42557c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(a1Var.M).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(a1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new u(a1Var, this.e, str, 2));
        }
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f42556b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f42555a;
            MessagesController.getInstance(a1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.U);
            String str = this.f42557c;
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(a1Var.M).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(a1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new u(a1Var, this.e, str, 1));
        }
        eyVar.finishFragment();
        return true;
    }
}
