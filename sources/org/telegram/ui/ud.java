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
    public final int f41934a;
    public final ie f41935b;

    public ud(ie ieVar, int i10) {
        this.f41934a = i10;
        this.f41935b = ieVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41934a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new st0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    ie ieVar = this.f41935b;
                    AndroidUtilities.runOnUIThread(new od(ieVar, 4));
                    MessagesController.getInstance(ieVar.f37955y0).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final ie ieVar2 = this.f41935b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    b91 f02 = p91.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ie ieVar3 = ieVar2;
                                    ieVar3.f37944o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ieVar3.f37945p1 = p91.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    b91 b91Var = ieVar3.f37944o1;
                                    if (b91Var != null) {
                                        b91Var.f35552n = true;
                                    }
                                    ieVar3.f37940j1 = tL_payments_starsRevenueStats.usd_rate;
                                    ieVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    ieVar3.f37933c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.bs.h).withEndAction(new od(ieVar3, 6)).start();
                                    ieVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ie ieVar4 = ieVar2;
                                if (z10) {
                                    ieVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    ieVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final ie ieVar3 = this.f41935b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    b91 f02 = p91.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    ie ieVar32 = ieVar3;
                                    ieVar32.f37944o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    ieVar32.f37945p1 = p91.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    b91 b91Var = ieVar32.f37944o1;
                                    if (b91Var != null) {
                                        b91Var.f35552n = true;
                                    }
                                    ieVar32.f37940j1 = tL_payments_starsRevenueStats.usd_rate;
                                    ieVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    ieVar32.f37933c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.bs.h).withEndAction(new od(ieVar32, 6)).start();
                                    ieVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                ie ieVar4 = ieVar3;
                                if (z10) {
                                    ieVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    ieVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
