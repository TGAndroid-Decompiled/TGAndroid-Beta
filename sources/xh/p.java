package xh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qa;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ba;
import org.telegram.ui.le;
public final class p {
    public static volatile p[] f45841m = new p[4];
    public static final Object[] f45842n = new Object[4];
    public final int f45843a;
    public final HashMap f45844b = new HashMap();
    public final HashMap f45845c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f45846f = new HashMap();
    public final HashMap f45847g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f45848i;
    public ArrayList f45849j;
    public boolean f45850k;
    public ArrayList f45851l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f45842n[i10] = new Object();
        }
    }

    public p(int i10) {
        this.f45843a = i10;
    }

    public static p g(int i10) {
        p pVar;
        p pVar2 = f45841m[i10];
        if (pVar2 == null) {
            synchronized (f45842n[i10]) {
                try {
                    pVar = f45841m[i10];
                    if (pVar == null) {
                        p[] pVarArr = f45841m;
                        p pVar3 = new p(i10);
                        pVarArr[i10] = pVar3;
                        pVar = pVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return pVar;
        }
        return pVar2;
    }

    public final boolean a(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j3, false);
        if (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final boolean b(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j10 = j(j3, false);
        if (j10 == null || (tL_starsRevenueStatus = j10.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final TL_stars.StarsAmount c(long j3) {
        TLRPC.TL_payments_starsRevenueStats h = h(j3, false);
        if (h == null) {
            return TL_stars.StarsAmount.ofStars(0L);
        }
        return h.status.current_balance;
    }

    public final m d(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f45847g;
        m mVar = (m) hashMap.get(valueOf);
        if (mVar == null) {
            Long valueOf2 = Long.valueOf(j3);
            m mVar2 = new m(this.f45843a, j3);
            hashMap.put(valueOf2, mVar2);
            return mVar2;
        }
        return mVar;
    }

    public final n e(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.h;
        n nVar = (n) hashMap.get(valueOf);
        if (nVar == null) {
            Long valueOf2 = Long.valueOf(j3);
            n nVar2 = new n(this.f45843a, j3);
            hashMap.put(valueOf2, nVar2);
            return nVar2;
        }
        return nVar;
    }

    public final void f(Context context, long j3, long j10, Utilities.Callback callback) {
        m mVar = (m) this.f45847g.get(Long.valueOf(j3));
        if (mVar != null) {
            ArrayList arrayList = mVar.e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j10) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.f45843a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j3);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j10);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new qa(this, d2Var, j10, callback, 6));
        d2Var.f17621g0 = true;
        d2Var.setOnCancelListener(new ba(this, sendRequest, 9));
        d2Var.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j3, boolean z10) {
        Long l4 = (Long) this.f45844b.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f45845c.get(Long.valueOf(j3));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i10 = this.f45843a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new i(this, j3, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j10 = j(j3, false);
        if (j10 != null && (tL_starsRevenueStatus = j10.status) != null && (starsAmount = tL_starsRevenueStatus.current_balance) != null) {
            return starsAmount.amount;
        }
        return 0L;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j3, boolean z10) {
        int i10;
        Long l4 = (Long) this.d.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j3));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i11 = this.f45843a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i11).getInputPeer(j3);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j3);
        if (chatFull != null) {
            i10 = chatFull.stats_dc;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsRevenueStats, new i(this, j3, 1), null, null, 0, i10, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final o k(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f45846f;
        o oVar = (o) hashMap.get(valueOf);
        if (oVar == null) {
            Long valueOf2 = Long.valueOf(j3);
            o oVar2 = new o();
            hashMap.put(valueOf2, oVar2);
            return oVar2;
        }
        return oVar;
    }

    public final void l(long j3) {
        o k10 = k(j3);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.f45783a[i10].clear();
                k10.f45785c[i10] = null;
                zArr[i10] = false;
                k10.e[i10] = false;
                p(i10, j3);
            }
        }
    }

    public final boolean m(long j3) {
        if (j(j3, false) == null) {
            return false;
        }
        return true;
    }

    public final void n() {
        if (!this.f45848i && this.f45849j == null) {
            this.f45848i = true;
            ConnectionsManager.getInstance(this.f45843a).sendRequest(new TL_bots.getAdminedBots(), new j(this, 0));
        }
    }

    public final void o() {
        if (!this.f45850k && this.f45851l == null) {
            this.f45850k = true;
            ConnectionsManager.getInstance(this.f45843a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new j(this, 1));
        }
    }

    public final void p(int i10, long j3) {
        boolean z10;
        o k10 = k(j3);
        boolean[] zArr = k10.d;
        if (!zArr[i10] && !k10.e[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i11 = this.f45843a;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i10 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            String str = k10.f45785c[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new org.telegram.messenger.u0(this, k10, i10, j3, 5));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId < 0) {
            le leVar = le.f34660x1;
            if (leVar != null && leVar.f34687z0 == DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
                le leVar2 = le.f34660x1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                leVar2.g0(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                le.f34660x1.e0();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            NotificationCenter.getInstance(this.f45843a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
        }
        l(peerDialogId);
    }

    public final void r(long j3) {
        boolean z10;
        Long l4 = (Long) this.f45844b.get(Long.valueOf(j3));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 30000) {
            z10 = false;
        } else {
            z10 = true;
        }
        h(j3, z10);
    }
}
