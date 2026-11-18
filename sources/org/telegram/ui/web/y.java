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
import org.telegram.ui.cx;
import org.telegram.ui.tg0;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
public final class y implements tg0, ww {
    public final v0 f53408a;
    public final boolean[] f53409b;
    public final String f53410c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final f7 f53411e;

    public y(v0 v0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, f7 f7Var) {
        this.f53408a = v0Var;
        this.f53409b = zArr;
        this.f53410c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.f53411e = f7Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            this.f53409b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            v0 v0Var = this.f53408a;
            mp.u1(v0Var.N);
            tL_messages_sendBotRequestedPeer.peer = mp.p1(v0Var.V);
            String str = this.f53410c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(mp.u1(v0Var.N).l1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new s(v0Var, this.f53411e, str, 2));
        }
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.f53409b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            v0 v0Var = this.f53408a;
            mp.u1(v0Var.N);
            tL_messages_sendBotRequestedPeer.peer = mp.p1(v0Var.V);
            String str = this.f53410c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((sr) obj).f26847a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(mp.u1(v0Var.N).l1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new s(v0Var, this.f53411e, str, 1));
        }
        cxVar.finishFragment();
        return true;
    }
}
