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
    public final int f37536a;
    public final le f37537b;

    public vd(le leVar, int i10) {
        this.f37536a = i10;
        this.f37537b = leVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37536a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new mu0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    le leVar = this.f37537b;
                    AndroidUtilities.runOnUIThread(new pd(leVar, 4));
                    MessagesController.getInstance(leVar.f34686y0).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final le leVar2 = this.f37537b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ra1 f02 = fb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    le leVar3 = leVar2;
                                    leVar3.f34675o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    leVar3.f34676p1 = fb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    ra1 ra1Var = leVar3.f34675o1;
                                    if (ra1Var != null) {
                                        ra1Var.f36322n = true;
                                    }
                                    leVar3.f34671j1 = tL_payments_starsRevenueStats.usd_rate;
                                    leVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    leVar3.f34664c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.wr.h).withEndAction(new pd(leVar3, 6)).start();
                                    leVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                le leVar4 = leVar2;
                                if (z10) {
                                    leVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    leVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final le leVar3 = this.f37537b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ra1 f02 = fb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    le leVar32 = leVar3;
                                    leVar32.f34675o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    leVar32.f34676p1 = fb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    ra1 ra1Var = leVar32.f34675o1;
                                    if (ra1Var != null) {
                                        ra1Var.f36322n = true;
                                    }
                                    leVar32.f34671j1 = tL_payments_starsRevenueStats.usd_rate;
                                    leVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    leVar32.f34664c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.wr.h).withEndAction(new pd(leVar32, 6)).start();
                                    leVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                le leVar4 = leVar3;
                                if (z10) {
                                    leVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    leVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
