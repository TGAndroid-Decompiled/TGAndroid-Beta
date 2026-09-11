package zh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ia;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ba;
import org.telegram.ui.ke;
public final class o {
    public static volatile o[] f52346m = new o[4];
    public static final Object[] f52347n = new Object[4];
    public final int f52348a;
    public final HashMap f52349b = new HashMap();
    public final HashMap f52350c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap f52351e = new HashMap();
    public final HashMap f52352f = new HashMap();
    public final HashMap f52353g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean f52354i;
    public ArrayList f52355j;
    public boolean f52356k;
    public ArrayList f52357l;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            f52347n[i10] = new Object();
        }
    }

    public o(int i10) {
        this.f52348a = i10;
    }

    public static o g(int i10) {
        o oVar;
        o oVar2 = f52346m[i10];
        if (oVar2 == null) {
            synchronized (f52347n[i10]) {
                try {
                    oVar = f52346m[i10];
                    if (oVar == null) {
                        o[] oVarArr = f52346m;
                        o oVar3 = new o(i10);
                        oVarArr[i10] = oVar3;
                        oVar = oVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return oVar;
        }
        return oVar2;
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

    public final l d(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f52353g;
        l lVar = (l) hashMap.get(valueOf);
        if (lVar == null) {
            Long valueOf2 = Long.valueOf(j3);
            l lVar2 = new l(this.f52348a, j3);
            hashMap.put(valueOf2, lVar2);
            return lVar2;
        }
        return lVar;
    }

    public final m e(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.h;
        m mVar = (m) hashMap.get(valueOf);
        if (mVar == null) {
            Long valueOf2 = Long.valueOf(j3);
            m mVar2 = new m(this.f52348a, j3);
            hashMap.put(valueOf2, mVar2);
            return mVar2;
        }
        return mVar;
    }

    public final void f(Context context, long j3, long j10, Utilities.Callback callback) {
        l lVar = (l) this.f52353g.get(Long.valueOf(j3));
        if (lVar != null) {
            ArrayList arrayList = lVar.f52176e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j10) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.f52348a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j3);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j10);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new ia(this, b2Var, j10, callback, 6));
        b2Var.f20237g0 = true;
        b2Var.setOnCancelListener(new ba(this, sendRequest, 9));
        b2Var.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j3, boolean z10) {
        Long l4 = (Long) this.f52349b.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f52350c.get(Long.valueOf(j3));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i10 = this.f52348a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new h(this, j3, 0));
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
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.f52351e.get(Long.valueOf(j3));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.j6.I.q();
        int i11 = this.f52348a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i11).getInputPeer(j3);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j3);
        if (chatFull != null) {
            i10 = chatFull.stats_dc;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsRevenueStats, new h(this, j3, 1), null, null, 0, i10, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final n k(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f52352f;
        n nVar = (n) hashMap.get(valueOf);
        if (nVar == null) {
            Long valueOf2 = Long.valueOf(j3);
            n nVar2 = new n();
            hashMap.put(valueOf2, nVar2);
            return nVar2;
        }
        return nVar;
    }

    public final void l(long j3) {
        n k10 = k(j3);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.f52285a[i10].clear();
                k10.f52287c[i10] = null;
                zArr[i10] = false;
                k10.f52288e[i10] = false;
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
        if (!this.f52354i && this.f52355j == null) {
            this.f52354i = true;
            ConnectionsManager.getInstance(this.f52348a).sendRequest(new TL_bots.getAdminedBots(), new i(this, 0));
        }
    }

    public final void o() {
        if (!this.f52356k && this.f52357l == null) {
            this.f52356k = true;
            ConnectionsManager.getInstance(this.f52348a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new i(this, 1));
        }
    }

    public final void p(int i10, long j3) {
        boolean z10;
        n k10 = k(j3);
        boolean[] zArr = k10.d;
        if (!zArr[i10] && !k10.f52288e[i10]) {
            boolean z11 = true;
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            int i11 = this.f52348a;
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
            String str = k10.f52287c[i10];
            tL_payments_getStarsTransactions.offset = str;
            if (str == null) {
                tL_payments_getStarsTransactions.offset = "";
            }
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new bi.s7(this, k10, i10, j3, 6));
        }
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId < 0) {
            ke keVar = ke.f38011x1;
            if (keVar != null && keVar.f38038z0 == DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
                ke keVar2 = ke.f38011x1;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
                keVar2.g0(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
                ke.f38011x1.e0();
                return;
            }
            return;
        }
        TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
        if (h != null) {
            h.status = tL_updateStarsRevenueStatus.status;
            NotificationCenter.getInstance(this.f52348a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
        }
        l(peerDialogId);
    }

    public final void r(long j3) {
        boolean z10;
        Long l4 = (Long) this.f52349b.get(Long.valueOf(j3));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 30000) {
            z10 = false;
        } else {
            z10 = true;
        }
        h(j3, z10);
    }
}
