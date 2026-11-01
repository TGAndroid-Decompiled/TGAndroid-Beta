package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.nb1;
import org.telegram.ui.th0;
import org.telegram.ui.tx;
import org.telegram.ui.zx;
public final class y implements th0, tx {
    public final z0 f43049a;
    public final boolean[] f43050b;
    public final String f43051c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final x0 e;

    public y(z0 z0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, x0 x0Var) {
        this.f43049a = z0Var;
        this.f43050b = zArr;
        this.f43051c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = x0Var;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f43050b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            z0 z0Var = this.f43049a;
            wp.r1(z0Var.M);
            tL_messages_sendBotRequestedPeer.peer = wp.m1(z0Var.U);
            String str = this.f43051c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(wp.r1(z0Var.M).i1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(z0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new a3.b(1), new s(z0Var, this.e, str, 2));
        }
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f43050b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            z0 z0Var = this.f43049a;
            wp.r1(z0Var.M);
            tL_messages_sendBotRequestedPeer.peer = wp.m1(z0Var.U);
            String str = this.f43051c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((hs) obj).f16109a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(wp.r1(z0Var.M).i1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(z0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new a3.b(1), new s(z0Var, this.e, str, 1));
        }
        zxVar.finishFragment();
        return true;
    }
}
