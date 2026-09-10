package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.rj0;
import org.telegram.ui.wy;
public final class c0 implements rj0, qy {
    public final c1 f37873a;
    public final boolean[] f37874b;
    public final String f37875c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final a1 e;

    public c0(c1 c1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, a1 a1Var) {
        this.f37873a = c1Var;
        this.f37874b = zArr;
        this.f37875c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = a1Var;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f37874b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            c1 c1Var = this.f37873a;
            MessagesController.getInstance(c1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(c1Var.U);
            String str = this.f37875c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(c1Var.M).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(c1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new v(c1Var, this.e, str, 2));
        }
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f37874b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            c1 c1Var = this.f37873a;
            MessagesController.getInstance(c1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(c1Var.U);
            String str = this.f37875c;
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(c1Var.M).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(c1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new v(c1Var, this.e, str, 1));
        }
        wyVar.finishFragment();
        return true;
    }
}
