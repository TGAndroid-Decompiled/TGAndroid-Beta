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
    public final int f42083a;
    public final me f42084b;

    public wd(me meVar, int i10) {
        this.f42083a = i10;
        this.f42084b = meVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42083a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new hu0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    me meVar = this.f42084b;
                    AndroidUtilities.runOnUIThread(new pd(meVar, 3));
                    MessagesController.getInstance(meVar.f38594o0).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final me meVar2 = this.f42084b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    fa1 d02 = ta1.d0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    me meVar3 = meVar2;
                                    meVar3.l1 = d02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    meVar3.f38591m1 = ta1.d0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    fa1 fa1Var = meVar3.l1;
                                    if (fa1Var != null) {
                                        fa1Var.f36255n = true;
                                    }
                                    meVar3.f38586g1 = tL_payments_starsRevenueStats.usd_rate;
                                    meVar3.L(true, tL_payments_starsRevenueStats.status);
                                    meVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.tr.h).withEndAction(new pd(meVar3, 5)).start();
                                    meVar3.E();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                me meVar4 = meVar2;
                                if (z10) {
                                    meVar4.D((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    meVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final me meVar3 = this.f42084b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    fa1 d02 = ta1.d0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    me meVar32 = meVar3;
                                    meVar32.l1 = d02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    meVar32.f38591m1 = ta1.d0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    fa1 fa1Var = meVar32.l1;
                                    if (fa1Var != null) {
                                        fa1Var.f36255n = true;
                                    }
                                    meVar32.f38586g1 = tL_payments_starsRevenueStats.usd_rate;
                                    meVar32.L(true, tL_payments_starsRevenueStats.status);
                                    meVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.tr.h).withEndAction(new pd(meVar32, 5)).start();
                                    meVar32.E();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                me meVar4 = meVar3;
                                if (z10) {
                                    meVar4.D((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    meVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
