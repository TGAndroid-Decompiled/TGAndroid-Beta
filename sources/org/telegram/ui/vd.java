package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class vd implements RequestDelegate {
    public final int f42206a;
    public final ke f42207b;

    public vd(ke keVar, int i10) {
        this.f42206a = i10;
        this.f42207b = keVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42206a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new tt0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    ke keVar = this.f42207b;
                    AndroidUtilities.runOnUIThread(new pd(keVar, 4));
                    MessagesController.getInstance(keVar.f38379v0).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final ke keVar2 = this.f42207b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    t91 f02 = ha1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ke keVar3 = keVar2;
                                    keVar3.l1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    keVar3.f38369m1 = ha1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    t91 t91Var = keVar3.l1;
                                    if (t91Var != null) {
                                        t91Var.f41553n = true;
                                    }
                                    keVar3.f38364g1 = tL_payments_starsRevenueStats.usd_rate;
                                    keVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    keVar3.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.pr.h).withEndAction(new pd(keVar3, 6)).start();
                                    keVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z4 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ke keVar4 = keVar2;
                                if (z4) {
                                    keVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
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
                final ke keVar3 = this.f42207b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    t91 f02 = ha1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ke keVar32 = keVar3;
                                    keVar32.l1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    keVar32.f38369m1 = ha1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    t91 t91Var = keVar32.l1;
                                    if (t91Var != null) {
                                        t91Var.f41553n = true;
                                    }
                                    keVar32.f38364g1 = tL_payments_starsRevenueStats.usd_rate;
                                    keVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    keVar32.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.pr.h).withEndAction(new pd(keVar32, 6)).start();
                                    keVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z4 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ke keVar4 = keVar3;
                                if (z4) {
                                    keVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
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
