package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class yd implements RequestDelegate {
    public final int f44458a;
    public final oe f44459b;

    public yd(oe oeVar, int i10) {
        this.f44458a = i10;
        this.f44459b = oeVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44458a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new pu0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    oe oeVar = this.f44459b;
                    AndroidUtilities.runOnUIThread(new sd(oeVar, 4));
                    MessagesController.getInstance(oeVar.f40682y0).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final oe oeVar2 = this.f44459b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    pa1 f02 = db1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    oe oeVar3 = oeVar2;
                                    oeVar3.f40671o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    oeVar3.f40672p1 = db1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    pa1 pa1Var = oeVar3.f40671o1;
                                    if (pa1Var != null) {
                                        pa1Var.f40903n = true;
                                    }
                                    oeVar3.f40667j1 = tL_payments_starsRevenueStats.usd_rate;
                                    oeVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    oeVar3.f40660c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.js.h).withEndAction(new sd(oeVar3, 6)).start();
                                    oeVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                oe oeVar4 = oeVar2;
                                if (z10) {
                                    oeVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    oeVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final oe oeVar3 = this.f44459b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    pa1 f02 = db1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    oe oeVar32 = oeVar3;
                                    oeVar32.f40671o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    oeVar32.f40672p1 = db1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    pa1 pa1Var = oeVar32.f40671o1;
                                    if (pa1Var != null) {
                                        pa1Var.f40903n = true;
                                    }
                                    oeVar32.f40667j1 = tL_payments_starsRevenueStats.usd_rate;
                                    oeVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    oeVar32.f40660c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.js.h).withEndAction(new sd(oeVar32, 6)).start();
                                    oeVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                oe oeVar4 = oeVar3;
                                if (z10) {
                                    oeVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    oeVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
