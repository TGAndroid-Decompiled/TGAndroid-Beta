package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class td implements RequestDelegate {
    public final int f41620a;
    public final le f41621b;

    public td(le leVar, int i10) {
        this.f41620a = i10;
        this.f41621b = leVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41620a) {
            case 0:
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new qr0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    le leVar = this.f41621b;
                    org.telegram.messenger.i0.g3(new md(leVar, 3));
                    org.telegram.messenger.wp.r1(leVar.f39215o0).L3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final le leVar2 = this.f41621b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        le leVar3 = leVar2;
                        switch (i10) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    leVar3.l1 = s61.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.dd.L0(2131748417, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    leVar3.f39212m1 = s61.i0(statsGraph, org.telegram.messenger.dd.L0(2131748416, null), 2, false);
                                    e61 e61Var = leVar3.l1;
                                    if (e61Var != null) {
                                        e61Var.f36758n = true;
                                    }
                                    leVar3.f39207g1 = tL_payments_starsRevenueStats.usd_rate;
                                    leVar3.L(true, tL_payments_starsRevenueStats.status);
                                    leVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new md(leVar3, 5)).start();
                                    leVar3.E();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    leVar3.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                } else {
                                    leVar3.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final le leVar3 = this.f41621b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        le leVar32 = leVar3;
                        switch (i10) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    leVar32.l1 = s61.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.dd.L0(2131748417, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    leVar32.f39212m1 = s61.i0(statsGraph, org.telegram.messenger.dd.L0(2131748416, null), 2, false);
                                    e61 e61Var = leVar32.l1;
                                    if (e61Var != null) {
                                        e61Var.f36758n = true;
                                    }
                                    leVar32.f39207g1 = tL_payments_starsRevenueStats.usd_rate;
                                    leVar32.L(true, tL_payments_starsRevenueStats.status);
                                    leVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new md(leVar32, 5)).start();
                                    leVar32.E();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    leVar32.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                } else {
                                    leVar32.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
