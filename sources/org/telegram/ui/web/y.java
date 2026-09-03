package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.hj0;
import org.telegram.ui.jy;
import org.telegram.ui.py;
import org.telegram.ui.sf1;
public final class y implements hj0, jy {
    public final a1 f42736a;
    public final boolean[] f42737b;
    public final String f42738c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;

    public y(a1 a1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f42736a = a1Var;
        this.f42737b = zArr;
        this.f42738c = str;
        this.d = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(py pyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f42737b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f42736a;
            MessagesController.getInstance(a1Var.J);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.R);
            String str = this.f42738c;
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
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f42737b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f42736a;
            MessagesController.getInstance(a1Var.J);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.R);
            String str = this.f42738c;
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
        pyVar.finishFragment();
        return true;
    }
}
