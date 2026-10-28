package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class wd implements RequestDelegate {
    public final int f44635a;
    public final ke f44636b;

    public wd(ke keVar, int i10) {
        this.f44635a = i10;
        this.f44636b = keVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44635a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new bu0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    ke keVar = this.f44636b;
                    AndroidUtilities.runOnUIThread(new pd(keVar, 3));
                    MessagesController.getInstance(keVar.f40769o0).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final ke keVar2 = this.f44636b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    k91 e02 = y91.e0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ke keVar3 = keVar2;
                                    keVar3.l1 = e02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    keVar3.f40766m1 = y91.e0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    k91 k91Var = keVar3.l1;
                                    if (k91Var != null) {
                                        k91Var.f40714n = true;
                                    }
                                    keVar3.f40761g1 = tL_payments_starsRevenueStats.usd_rate;
                                    keVar3.L(true, tL_payments_starsRevenueStats.status);
                                    keVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new pd(keVar3, 5)).start();
                                    keVar3.E();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ke keVar4 = keVar2;
                                if (z10) {
                                    keVar4.D((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    keVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final ke keVar3 = this.f44636b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    k91 e02 = y91.e0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ke keVar32 = keVar3;
                                    keVar32.l1 = e02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    keVar32.f40766m1 = y91.e0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    k91 k91Var = keVar32.l1;
                                    if (k91Var != null) {
                                        k91Var.f40714n = true;
                                    }
                                    keVar32.f40761g1 = tL_payments_starsRevenueStats.usd_rate;
                                    keVar32.L(true, tL_payments_starsRevenueStats.status);
                                    keVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new pd(keVar32, 5)).start();
                                    keVar32.E();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ke keVar4 = keVar3;
                                if (z10) {
                                    keVar4.D((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    keVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
