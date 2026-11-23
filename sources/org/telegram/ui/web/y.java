package org.telegram.ui.web;

import fi.f7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.bx;
import org.telegram.ui.sg0;
import org.telegram.ui.vw;
import org.telegram.ui.w91;
public final class y implements sg0, vw {
    public final v0 f53641a;
    public final boolean[] f53642b;
    public final String f53643c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final f7 f53644e;

    public y(v0 v0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, f7 f7Var) {
        this.f53641a = v0Var;
        this.f53642b = zArr;
        this.f53643c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.f53644e = f7Var;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public boolean O(bx bxVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            this.f53642b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            v0 v0Var = this.f53641a;
            mp.u1(v0Var.N);
            tL_messages_sendBotRequestedPeer.peer = mp.p1(v0Var.V);
            String str = this.f53643c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(mp.u1(v0Var.N).l1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new s(v0Var, this.f53644e, str, 2));
        }
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.f53642b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            v0 v0Var = this.f53641a;
            mp.u1(v0Var.N);
            tL_messages_sendBotRequestedPeer.peer = mp.p1(v0Var.V);
            String str = this.f53643c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((sr) obj).f26946a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(mp.u1(v0Var.N).l1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new s(v0Var, this.f53644e, str, 1));
        }
        bxVar.finishFragment();
        return true;
    }
}
