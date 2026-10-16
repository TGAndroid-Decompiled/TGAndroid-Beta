package zh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.o80;
import org.telegram.ui.ga;
import org.telegram.ui.qe;
public final class p {
    public static volatile p[] f50957m = new p[4];
    public static final Object[] f50958n = new Object[4];
    public final int f50959a;
    public final HashMap f50960b = new HashMap();
    public final HashMap f50961c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f50962f = new HashMap();
    public final HashMap f50963g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f50964i;
    public ArrayList f50965j;
    public boolean f50966k;
    public ArrayList f50967l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f50958n[i10] = new Object();
        }
    }

    public p(int i10) {
        this.f50959a = i10;
    }

    public static p g(int i10) {
        p pVar;
        p pVar2 = f50957m[i10];
        if (pVar2 == null) {
            synchronized (f50958n[i10]) {
                try {
                    pVar = f50957m[i10];
                    if (pVar == null) {
                        p[] pVarArr = f50957m;
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

    public final l d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f50963g;
        l lVar = (l) hashMap.get(valueOf);
        if (lVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            l lVar2 = new l(this.f50959a, j10);
            hashMap.put(valueOf2, lVar2);
            return lVar2;
        }
        return lVar;
    }

    public final n e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        n nVar = (n) hashMap.get(valueOf);
        if (nVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            n nVar2 = new n(this.f50959a, j10);
            hashMap.put(valueOf2, nVar2);
            return nVar2;
        }
        return nVar;
    }

    public final void f(Context context, long j10, long j11, Utilities.Callback callback) {
        l lVar = (l) this.f50963g.get(Long.valueOf(j10));
        if (lVar != null) {
            ArrayList arrayList = lVar.e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j11) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.f50959a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j11);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new o80(this, a2Var, j11, callback));
        a2Var.f19269g0 = true;
        a2Var.setOnCancelListener(new ga(this, sendRequest, 9));
        a2Var.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l4 = (Long) this.f50960b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f50961c.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
        int i10 = this.f50959a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new h(this, j10, 0));
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
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
        int i11 = this.f50959a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
        if (chatFull != null) {
            i10 = chatFull.stats_dc;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsRevenueStats, new h(this, j10, 1), null, null, 0, i10, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final o k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f50962f;
        o oVar = (o) hashMap.get(valueOf);
        if (oVar == null) {
            Long valueOf2 = Long.valueOf(j10);
            o oVar2 = new o();
            hashMap.put(valueOf2, oVar2);
            return oVar2;
        }
        return oVar;
    }

    public final void l(long j10) {
        o k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.f50894a[i10].clear();
                k10.f50896c[i10] = null;
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
        if (!this.f50964i && this.f50965j == null) {
            this.f50964i = true;
            ConnectionsManager.getInstance(this.f50959a).sendRequest(new TL_bots.getAdminedBots(), new i(this, 0));
        }
    }

    public final void o() {
        if (!this.f50966k && this.f50967l == null) {
            this.f50966k = true;
            ConnectionsManager.getInstance(this.f50959a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new i(this, 1));
        }
    }

    public final void p(int i10, long j10) {
        boolean z10;
        o k10 = k(j10);
        boolean[] zArr = k10.d;
        if (!zArr[i10] && !k10.e[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i11 = this.f50959a;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
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
            String str = k10.f50896c[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new bi.w7(this, k10, i10, j10, 6));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId < 0) {
            qe qeVar = qe.f39115x1;
            if (qeVar != null && qeVar.f39142z0 == DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
                qe qeVar2 = qe.f39115x1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                qeVar2.g0(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                qe.f39115x1.e0();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            NotificationCenter.getInstance(this.f50959a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
        }
        l(peerDialogId);
    }

    public final void r(long j10) {
        boolean z10;
        Long l4 = (Long) this.f50960b.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 30000) {
            z10 = false;
        } else {
            z10 = true;
        }
        h(j10, z10);
    }
}
