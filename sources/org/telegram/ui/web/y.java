package org.telegram.ui.web;

import fi.i7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.pg0;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
public final class y implements pg0, sw {
    public final v0 f52879a;
    public final boolean[] f52880b;
    public final String f52881c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final i7 f52882e;

    public y(v0 v0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, i7 i7Var) {
        this.f52879a = v0Var;
        this.f52880b = zArr;
        this.f52881c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.f52882e = i7Var;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            this.f52880b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            v0 v0Var = this.f52879a;
            np.s1(v0Var.N);
            tL_messages_sendBotRequestedPeer.peer = np.n1(v0Var.V);
            String str = this.f52881c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(np.s1(v0Var.N).j1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new s(v0Var, this.f52882e, str, 2));
        }
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.f52880b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            v0 v0Var = this.f52879a;
            np.s1(v0Var.N);
            tL_messages_sendBotRequestedPeer.peer = np.n1(v0Var.V);
            String str = this.f52881c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((ur) obj).f26861a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(np.s1(v0Var.N).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(v0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new d3.b(1), new s(v0Var, this.f52882e, str, 1));
        }
        ywVar.finishFragment();
        return true;
    }
}
