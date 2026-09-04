package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class ud implements RequestDelegate {
    public final int f41068a;
    public final ke f41069b;

    public ud(ke keVar, int i10) {
        this.f41068a = i10;
        this.f41069b = keVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41068a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new lu0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    ke keVar = this.f41069b;
                    AndroidUtilities.runOnUIThread(new od(keVar, 4));
                    MessagesController.getInstance(keVar.f38037y0).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final ke keVar2 = this.f41069b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    na1 f02 = bb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ke keVar3 = keVar2;
                                    keVar3.f38026o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    keVar3.f38027p1 = bb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    na1 na1Var = keVar3.f38026o1;
                                    if (na1Var != null) {
                                        na1Var.f38905n = true;
                                    }
                                    keVar3.f38022j1 = tL_payments_starsRevenueStats.usd_rate;
                                    keVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    keVar3.f38015c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.pr.h).withEndAction(new od(keVar3, 6)).start();
                                    keVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ke keVar4 = keVar2;
                                if (z10) {
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
                final ke keVar3 = this.f41069b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    na1 f02 = bb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ke keVar32 = keVar3;
                                    keVar32.f38026o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    keVar32.f38027p1 = bb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    na1 na1Var = keVar32.f38026o1;
                                    if (na1Var != null) {
                                        na1Var.f38905n = true;
                                    }
                                    keVar32.f38022j1 = tL_payments_starsRevenueStats.usd_rate;
                                    keVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    keVar32.f38015c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.pr.h).withEndAction(new od(keVar32, 6)).start();
                                    keVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ke keVar4 = keVar3;
                                if (z10) {
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
