package org.telegram.ui.web;

import ai.da;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.nj0;
import org.telegram.ui.oy;
import org.telegram.ui.uy;
import org.telegram.ui.yf1;
public final class c0 implements nj0, oy {
    public final c1 f42122a;
    public final boolean[] f42123b;
    public final String f42124c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final da f42125e;

    public c0(c1 c1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, da daVar) {
        this.f42122a = c1Var;
        this.f42123b = zArr;
        this.f42124c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.f42125e = daVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f42123b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            c1 c1Var = this.f42122a;
            MessagesController.getInstance(c1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(c1Var.U);
            String str = this.f42124c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(c1Var.M).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(c1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new u(c1Var, this.f42125e, str, 2));
        }
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f42123b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            c1 c1Var = this.f42122a;
            MessagesController.getInstance(c1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(c1Var.U);
            String str = this.f42124c;
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
            ConnectionsManager.getInstance(c1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new u(c1Var, this.f42125e, str, 1));
        }
        uyVar.finishFragment();
        return true;
    }
}
