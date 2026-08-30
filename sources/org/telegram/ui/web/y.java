package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.gj0;
import org.telegram.ui.iy;
import org.telegram.ui.kf1;
import org.telegram.ui.oy;
public final class y implements gj0, iy {
    public final a1 f39704a;
    public final boolean[] f39705b;
    public final String f39706c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;

    public y(a1 a1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f39704a = a1Var;
        this.f39705b = zArr;
        this.f39706c = str;
        this.d = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(oy oyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f39705b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f39704a;
            MessagesController.getInstance(a1Var.J);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.R);
            String str = this.f39706c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(a1Var.J).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(a1Var.J).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new w(a1Var, str, 2));
        }
    }

    @Override
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f39705b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f39704a;
            MessagesController.getInstance(a1Var.J);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.R);
            String str = this.f39706c;
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(a1Var.J).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(a1Var.J).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new w(a1Var, str, 1));
        }
        oyVar.finishFragment();
        return true;
    }
}
