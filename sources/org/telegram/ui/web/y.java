package org.telegram.ui.web;

import di.p7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.sg0;
import org.telegram.ui.tw;
import org.telegram.ui.z91;
import org.telegram.ui.zw;
public final class y implements sg0, tw {
    public final x0 f51333a;
    public final boolean[] f51334b;
    public final String f51335c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final p7 f51336e;

    public y(x0 x0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, p7 p7Var) {
        this.f51333a = x0Var;
        this.f51334b = zArr;
        this.f51335c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.f51336e = p7Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(zw zwVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            this.f51334b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            x0 x0Var = this.f51333a;
            qp.s1(x0Var.M);
            tL_messages_sendBotRequestedPeer.peer = qp.n1(x0Var.U);
            String str = this.f51335c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(qp.s1(x0Var.M).j1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(x0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new r(x0Var, this.f51336e, str, 2));
        }
    }

    @Override
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.f51334b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            x0 x0Var = this.f51333a;
            qp.s1(x0Var.M);
            tL_messages_sendBotRequestedPeer.peer = qp.n1(x0Var.U);
            String str = this.f51335c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((xr) obj).f26524a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(qp.s1(x0Var.M).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(x0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new r(x0Var, this.f51336e, str, 1));
        }
        zwVar.finishFragment();
        return true;
    }
}
