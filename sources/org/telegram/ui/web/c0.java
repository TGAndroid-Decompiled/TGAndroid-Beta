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
import org.telegram.ui.aj0;
import org.telegram.ui.cy;
import org.telegram.ui.re1;
import org.telegram.ui.vx;
public final class c0 implements aj0, vx {
    public final a1 f42614a;
    public final boolean[] f42615b;
    public final String f42616c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final z7 e;

    public c0(a1 a1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, z7 z7Var) {
        this.f42614a = a1Var;
        this.f42615b = zArr;
        this.f42616c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = z7Var;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(cy cyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f42615b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f42614a;
            MessagesController.getInstance(a1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.U);
            String str = this.f42616c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(a1Var.M).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(a1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new v(a1Var, this.e, str, 2));
        }
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f42615b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f42614a;
            MessagesController.getInstance(a1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.U);
            String str = this.f42616c;
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
            ConnectionsManager.getInstance(a1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new v(a1Var, this.e, str, 1));
        }
        cyVar.finishFragment();
        return true;
    }
}
