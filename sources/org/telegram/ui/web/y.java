package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.cj0;
import org.telegram.ui.gy;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

public final class y implements cj0, zx {

    public final z0 f44049a;

    public final boolean[] f44050b;

    public final String f44051c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;

    public y(z0 z0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f44049a = z0Var;
        this.f44050b = zArr;
        this.f44051c = str;
        this.d = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = 0;
        this.f44050b[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        z0 z0Var = this.f44049a;
        MessagesController.getInstance(z0Var.I);
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(z0Var.Q);
        String str = this.f44051c;
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(z0Var.I).getInputPeer(((Long) obj).longValue()));
        }
        ConnectionsManager.getInstance(z0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new w(z0Var, str, 2));
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f44050b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            z0 z0Var = this.f44049a;
            MessagesController.getInstance(z0Var.I);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(z0Var.Q);
            String str = this.f44051c;
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(z0Var.I).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(z0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new w(z0Var, str, 1));
        }
        gyVar.finishFragment();
        return true;
    }
}
