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
import org.telegram.ui.fg1;
import org.telegram.ui.oy;
import org.telegram.ui.tj0;
import org.telegram.ui.uy;
public final class c0 implements tj0, oy {
    public final d1 f38862a;
    public final boolean[] f38863b;
    public final String f38864c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final da e;

    public c0(d1 d1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, da daVar) {
        this.f38862a = d1Var;
        this.f38863b = zArr;
        this.f38864c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = daVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f38863b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            d1 d1Var = this.f38862a;
            MessagesController.getInstance(d1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(d1Var.U);
            String str = this.f38864c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(d1Var.M).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(d1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new v(d1Var, this.e, str, 2));
        }
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f38863b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            d1 d1Var = this.f38862a;
            MessagesController.getInstance(d1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(d1Var.U);
            String str = this.f38864c;
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
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(d1Var.M).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(d1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new v(d1Var, this.e, str, 1));
        }
        uyVar.finishFragment();
        return true;
    }
}
