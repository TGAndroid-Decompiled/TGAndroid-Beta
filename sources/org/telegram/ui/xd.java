package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class xd implements RequestDelegate {
    public final int f39960a;
    public final me f39961b;

    public xd(me meVar, int i10) {
        this.f39960a = i10;
        this.f39961b = meVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39960a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new yt0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    me meVar = this.f39961b;
                    AndroidUtilities.runOnUIThread(new rd(meVar, 4));
                    MessagesController.getInstance(meVar.f36058v0).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final me meVar2 = this.f39961b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    aa1 f02 = oa1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    me meVar3 = meVar2;
                                    meVar3.l1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    meVar3.f36048m1 = oa1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    aa1 aa1Var = meVar3.l1;
                                    if (aa1Var != null) {
                                        aa1Var.f32536n = true;
                                    }
                                    meVar3.f36043g1 = tL_payments_starsRevenueStats.usd_rate;
                                    meVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    meVar3.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.mr.h).withEndAction(new rd(meVar3, 6)).start();
                                    meVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z4 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                me meVar4 = meVar2;
                                if (z4) {
                                    meVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
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
                final me meVar3 = this.f39961b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    aa1 f02 = oa1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    me meVar32 = meVar3;
                                    meVar32.l1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    meVar32.f36048m1 = oa1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    aa1 aa1Var = meVar32.l1;
                                    if (aa1Var != null) {
                                        aa1Var.f32536n = true;
                                    }
                                    meVar32.f36043g1 = tL_payments_starsRevenueStats.usd_rate;
                                    meVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    meVar32.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.mr.h).withEndAction(new rd(meVar32, 6)).start();
                                    meVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z4 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                me meVar4 = meVar3;
                                if (z4) {
                                    meVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
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
