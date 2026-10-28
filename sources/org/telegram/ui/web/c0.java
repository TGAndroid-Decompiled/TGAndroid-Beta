package org.telegram.ui.web;

import di.x7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.cf1;
import org.telegram.ui.dj0;
import org.telegram.ui.ey;
import org.telegram.ui.xx;
public final class c0 implements dj0, xx {
    public final a1 f44716a;
    public final boolean[] f44717b;
    public final String f44718c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final x7 e;

    public c0(a1 a1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, x7 x7Var) {
        this.f44716a = a1Var;
        this.f44717b = zArr;
        this.f44718c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = x7Var;
    }

    @Override
    public boolean C() {
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
            this.f44717b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f44716a;
            MessagesController.getInstance(a1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.U);
            String str = this.f44718c;
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
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f44717b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f44716a;
            MessagesController.getInstance(a1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.U);
            String str = this.f44718c;
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
        eyVar.finishFragment();
        return true;
    }
}
