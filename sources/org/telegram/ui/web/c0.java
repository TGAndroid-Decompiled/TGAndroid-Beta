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
import org.telegram.ui.af1;
import org.telegram.ui.bj0;
import org.telegram.ui.cy;
import org.telegram.ui.ux;
public final class c0 implements bj0, ux {
    public final a1 f45202a;
    public final boolean[] f45203b;
    public final String f45204c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final x7 e;

    public c0(a1 a1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, x7 x7Var) {
        this.f45202a = a1Var;
        this.f45203b = zArr;
        this.f45204c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = x7Var;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(cy cyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f45203b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f45202a;
            MessagesController.getInstance(a1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.U);
            String str = this.f45204c;
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
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f45203b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            a1 a1Var = this.f45202a;
            MessagesController.getInstance(a1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(a1Var.U);
            String str = this.f45204c;
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
