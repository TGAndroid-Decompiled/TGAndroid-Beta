package org.telegram.ui.web;

import ei.p7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hp;
import org.telegram.messenger.pr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.jg0;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;
public final class z implements jg0, nw {
    public final w0 f51126a;
    public final boolean[] f51127b;
    public final String f51128c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final p7 f51129e;

    public z(w0 w0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, p7 p7Var) {
        this.f51126a = w0Var;
        this.f51127b = zArr;
        this.f51128c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.f51129e = p7Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(uw uwVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            this.f51127b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            w0 w0Var = this.f51126a;
            hp.s1(w0Var.N);
            tL_messages_sendBotRequestedPeer.peer = hp.n1(w0Var.V);
            String str = this.f51128c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(hp.s1(w0Var.N).j1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(w0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new c3.b(1), new t(w0Var, this.f51129e, str, 2));
        }
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        if (!arrayList.isEmpty()) {
            int i11 = 0;
            this.f51127b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            w0 w0Var = this.f51126a;
            hp.s1(w0Var.N);
            tL_messages_sendBotRequestedPeer.peer = hp.n1(w0Var.V);
            String str = this.f51128c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                hashSet.add(Long.valueOf(((pr) obj).f24797a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(hp.s1(w0Var.N).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(w0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new c3.b(1), new t(w0Var, this.f51129e, str, 1));
        }
        uwVar.finishFragment();
        return true;
    }
}
