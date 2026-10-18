package org.telegram.ui.web;

import ci.y7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.bj0;
import org.telegram.ui.ey;
import org.telegram.ui.te1;
import org.telegram.ui.xx;
public final class d0 implements bj0, xx {
    public final b1 f42568a;
    public final boolean[] f42569b;
    public final String f42570c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final y7 e;

    public d0(b1 b1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, y7 y7Var) {
        this.f42568a = b1Var;
        this.f42569b = zArr;
        this.f42570c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = y7Var;
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
            this.f42569b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            b1 b1Var = this.f42568a;
            MessagesController.getInstance(b1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(b1Var.U);
            String str = this.f42570c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(b1Var.M).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new w(b1Var, this.e, str, 2));
        }
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f42569b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            b1 b1Var = this.f42568a;
            MessagesController.getInstance(b1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(b1Var.U);
            String str = this.f42570c;
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
            ConnectionsManager.getInstance(b1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new w(b1Var, this.e, str, 1));
        }
        eyVar.finishFragment();
        return true;
    }
}
