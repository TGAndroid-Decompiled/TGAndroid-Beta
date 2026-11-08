package org.telegram.ui.web;

import di.o7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.pg0;
import org.telegram.ui.qw;
import org.telegram.ui.w91;
import org.telegram.ui.ww;
public final class y implements pg0, qw {
    public final x0 f51398a;
    public final boolean[] f51399b;
    public final String f51400c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final o7 f51401e;

    public y(x0 x0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, o7 o7Var) {
        this.f51398a = x0Var;
        this.f51399b = zArr;
        this.f51400c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.f51401e = o7Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ww wwVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            this.f51399b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            x0 x0Var = this.f51398a;
            qp.s1(x0Var.M);
            tL_messages_sendBotRequestedPeer.peer = qp.n1(x0Var.U);
            String str = this.f51400c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(qp.s1(x0Var.M).j1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(x0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new r(x0Var, this.f51401e, str, 2));
        }
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.f51399b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            x0 x0Var = this.f51398a;
            qp.s1(x0Var.M);
            tL_messages_sendBotRequestedPeer.peer = qp.n1(x0Var.U);
            String str = this.f51400c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((xr) obj).f26520a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(qp.s1(x0Var.M).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(x0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new r(x0Var, this.f51401e, str, 1));
        }
        wwVar.finishFragment();
        return true;
    }
}
