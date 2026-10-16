package org.telegram.ui.web;

import bi.n9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.kg1;
import org.telegram.ui.sy;
import org.telegram.ui.vj0;
import org.telegram.ui.yy;
public final class c0 implements vj0, sy {
    public final c1 f40978a;
    public final boolean[] f40979b;
    public final String f40980c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final n9 e;

    public c0(c1 c1Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, n9 n9Var) {
        this.f40978a = c1Var;
        this.f40979b = zArr;
        this.f40980c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = n9Var;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f40979b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            c1 c1Var = this.f40978a;
            MessagesController.getInstance(c1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(c1Var.U);
            String str = this.f40980c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(c1Var.M).getInputPeer(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(c1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new u(c1Var, this.e, str, 2));
        }
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, kg1 kg1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f40979b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            c1 c1Var = this.f40978a;
            MessagesController.getInstance(c1Var.M);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(c1Var.U);
            String str = this.f40980c;
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
            ConnectionsManager.getInstance(c1Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new Object(), new u(c1Var, this.e, str, 1));
        }
        yyVar.finishFragment();
        return true;
    }
}
