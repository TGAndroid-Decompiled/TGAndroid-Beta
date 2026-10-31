package rh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.c70;
import org.telegram.ui.ba;
import org.telegram.ui.le;
public final class r {
    public static volatile r[] f47381m = new r[4];
    public static final Object[] f47382n = new Object[4];
    public final int f47383a;
    public final HashMap f47384b = new HashMap();
    public final HashMap f47385c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f47386f = new HashMap();
    public final HashMap f47387g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f47388i;
    public ArrayList f47389j;
    public boolean f47390k;
    public ArrayList f47391l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f47382n[i10] = new Object();
        }
    }

    public r(int i10) {
        this.f47383a = i10;
    }

    public static r g(int i10) {
        r rVar;
        r rVar2 = f47381m[i10];
        if (rVar2 == null) {
            synchronized (f47382n[i10]) {
                try {
                    rVar = f47381m[i10];
                    if (rVar == null) {
                        r[] rVarArr = f47381m;
                        r rVar3 = new r(i10);
                        rVarArr[i10] = rVar3;
                        rVar = rVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return rVar;
        }
        return rVar2;
    }

    public final boolean a(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j10, false);
        if (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final boolean b(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j11 = j(j10, false);
        if (j11 == null || (tL_starsRevenueStatus = j11.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) {
            return false;
        }
        return true;
    }

    public final TL_stars.StarsAmount c(long j10) {
        TLRPC.TL_payments_starsRevenueStats h = h(j10, false);
        if (h == null) {
            return TL_stars.StarsAmount.ofStars(0L);
        }
        return h.status.current_balance;
    }

    public final n d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f47387g;
        n nVar = (n) hashMap.get(valueOf);
        if (nVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            n nVar2 = new n(this.f47383a, j10);
            hashMap.put(valueOf2, nVar2);
            return nVar2;
        }
        return nVar;
    }

    public final p e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        p pVar = (p) hashMap.get(valueOf);
        if (pVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            p pVar2 = new p(this.f47383a, j10);
            hashMap.put(valueOf2, pVar2);
            return pVar2;
        }
        return pVar;
    }

    public final void f(Context context, long j10, long j11, q20 q20Var) {
        n nVar = (n) this.f47387g.get(Long.valueOf(j10));
        if (nVar != null) {
            ArrayList arrayList = nVar.e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j11) {
                    q20Var.a((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.f47383a;
        getconnectedstarrefbot.peer = vp.r1(i11).i1(j10);
        getconnectedstarrefbot.bot = vp.r1(i11).n1(j11);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new c70(this, x1Var, j11, q20Var));
        x1Var.f21488i0 = true;
        x1Var.setOnCancelListener(new ba(this, sendRequest, 9));
        x1Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l4 = (Long) this.f47384b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f47385c.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.t6.I.q();
        int i10 = this.f47383a;
        tL_payments_getStarsRevenueStats.peer = vp.r1(i10).i1(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new j(this, j10, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j11 = j(j10, false);
        if (j11 != null && (tL_starsRevenueStatus = j11.status) != null && (starsAmount = tL_starsRevenueStatus.current_balance) != null) {
            return starsAmount.amount;
        }
        return 0L;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j10, boolean z10) {
        int i10;
        Long l4 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.t6.I.q();
        int i11 = this.f47383a;
        tL_payments_getStarsRevenueStats.peer = vp.r1(i11).i1(j10);
        TLRPC.ChatFull M0 = vp.r1(i11).M0(-j10);
        if (M0 != null) {
            i10 = M0.stats_dc;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsRevenueStats, new j(this, j10, 1), null, null, 0, i10, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final q k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f47386f;
        q qVar = (q) hashMap.get(valueOf);
        if (qVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            q qVar2 = new q();
            hashMap.put(valueOf2, qVar2);
            return qVar2;
        }
        return qVar;
    }

    public final void l(long j10) {
        q k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.f47331a[i10].clear();
                k10.f47333c[i10] = null;
                zArr[i10] = false;
                k10.e[i10] = false;
                p(i10, j10);
            }
        }
    }

    public final boolean m(long j10) {
        if (j(j10, false) == null) {
            return false;
        }
        return true;
    }

    public final void n() {
        if (!this.f47388i && this.f47389j == null) {
            this.f47388i = true;
            ConnectionsManager.getInstance(this.f47383a).sendRequest(new TL_bots.getAdminedBots(), new l(this, 1));
        }
    }

    public final void o() {
        if (!this.f47390k && this.f47391l == null) {
            this.f47390k = true;
            ConnectionsManager.getInstance(this.f47383a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new l(this, 0));
        }
    }

    public final void p(int i10, long j10) {
        boolean z10;
        q k10 = k(j10);
        boolean[] zArr = k10.d;
        if (!zArr[i10] && !k10.e[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i11 = this.f47383a;
            tL_payments_getStarsTransactions.peer = vp.r1(i11).i1(j10);
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
            String str = k10.f47333c[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new org.telegram.ui.Components.o2(i10, 2, j10, this, k10));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long o10 = org.telegram.messenger.o5.o(tL_updateStarsRevenueStatus.peer);
        if (o10 < 0) {
            le leVar = le.f39190t1;
            if (leVar != null && leVar.f39208p0 == org.telegram.messenger.o5.o(tL_updateStarsRevenueStatus.peer)) {
                le leVar2 = le.f39190t1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                leVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                le.f39190t1.J();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(o10, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            zs.f(this.f47383a).k(zs.C3, Long.valueOf(o10));
        }
        l(o10);
    }

    public final void r(long j10) {
        boolean z10;
        Long l4 = (Long) this.f47384b.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 30000) {
            z10 = false;
        } else {
            z10 = true;
        }
        h(j10, z10);
    }
}
