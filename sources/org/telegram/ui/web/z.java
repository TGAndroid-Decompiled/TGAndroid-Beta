package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.fy;
import org.telegram.ui.yi0;
import org.telegram.ui.yx;
import org.telegram.ui.ze1;
public final class z implements yi0, yx {
    public final z0 f44257a;
    public final boolean[] f44258b;
    public final String f44259c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;

    public z(z0 z0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f44257a = z0Var;
        this.f44258b = zArr;
        this.f44259c = str;
        this.d = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f44258b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            z0 z0Var = this.f44257a;
            MessagesController.getInstance(z0Var.I);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(z0Var.Q);
            String str = this.f44259c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(z0Var.I).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(z0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new w(z0Var, str, 2));
        }
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f44258b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            z0 z0Var = this.f44257a;
            MessagesController.getInstance(z0Var.I);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(z0Var.Q);
            String str = this.f44259c;
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
            ConnectionsManager.getInstance(z0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new w(z0Var, str, 1));
        }
        fyVar.finishFragment();
        return true;
    }
}
