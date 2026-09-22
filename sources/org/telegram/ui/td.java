package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class td implements RequestDelegate {
    public final int f37637a;
    public final je f37638b;

    public td(je jeVar, int i10) {
        this.f37637a = i10;
        this.f37638b = jeVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37637a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new mu0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    je jeVar = this.f37638b;
                    AndroidUtilities.runOnUIThread(new nd(jeVar, 4));
                    MessagesController.getInstance(jeVar.f34894y0).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final je jeVar2 = this.f37638b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    la1 f02 = za1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    je jeVar3 = jeVar2;
                                    jeVar3.f34883o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    jeVar3.f34884p1 = za1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    la1 la1Var = jeVar3.f34883o1;
                                    if (la1Var != null) {
                                        la1Var.f35377n = true;
                                    }
                                    jeVar3.f34879j1 = tL_payments_starsRevenueStats.usd_rate;
                                    jeVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    jeVar3.f34872c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.qr.h).withEndAction(new nd(jeVar3, 6)).start();
                                    jeVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                je jeVar4 = jeVar2;
                                if (z10) {
                                    jeVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    jeVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final je jeVar3 = this.f37638b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    la1 f02 = za1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    je jeVar32 = jeVar3;
                                    jeVar32.f34883o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    jeVar32.f34884p1 = za1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    la1 la1Var = jeVar32.f34883o1;
                                    if (la1Var != null) {
                                        la1Var.f35377n = true;
                                    }
                                    jeVar32.f34879j1 = tL_payments_starsRevenueStats.usd_rate;
                                    jeVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    jeVar32.f34872c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.qr.h).withEndAction(new nd(jeVar32, 6)).start();
                                    jeVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                je jeVar4 = jeVar3;
                                if (z10) {
                                    jeVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    jeVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
