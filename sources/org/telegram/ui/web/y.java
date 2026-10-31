package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.gs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.ux;
import org.telegram.ui.vh0;
public final class y implements vh0, ux {
    public final z0 f43247a;
    public final boolean[] f43248b;
    public final String f43249c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final x0 e;

    public y(z0 z0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, x0 x0Var) {
        this.f43247a = z0Var;
        this.f43248b = zArr;
        this.f43249c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = x0Var;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int i10 = 0;
            this.f43248b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            z0 z0Var = this.f43247a;
            vp.r1(z0Var.M);
            tL_messages_sendBotRequestedPeer.peer = vp.m1(z0Var.U);
            String str = this.f43249c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(vp.r1(z0Var.M).i1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(z0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new a3.b(1), new s(z0Var, this.e, str, 2));
        }
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        if (!arrayList.isEmpty()) {
            int i12 = 0;
            this.f43248b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            z0 z0Var = this.f43247a;
            vp.r1(z0Var.M);
            tL_messages_sendBotRequestedPeer.peer = vp.m1(z0Var.U);
            String str = this.f43249c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                hashSet.add(Long.valueOf(((gs) obj).f15760a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(vp.r1(z0Var.M).i1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(z0Var.M).sendRequestTyped(tL_messages_sendBotRequestedPeer, new a3.b(1), new s(z0Var, this.e, str, 1));
        }
        ayVar.finishFragment();
        return true;
    }
}
