package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class rb extends rg.b {
    public int d = -1;
    public int f49330e = -1;
    public final tb f49331f;

    public rb(tb tbVar) {
        this.f49331f = tbVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return ((sb) this.f49331f.f50223y.get(d1Var.b())).f54544b;
    }

    @Override
    public final int b() {
        return this.f49331f.f50223y.size();
    }

    @Override
    public final int d(int i7) {
        return ((sb) this.f49331f.f50223y.get(i7)).f54543a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        String a02;
        tb tbVar = this.f49331f;
        int i11 = tbVar.f50214b;
        TLRPC.Chat chat = tbVar.I;
        ArrayList arrayList = tbVar.f50223y;
        int i12 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i12 != 4) {
            if (i12 != 1 && i12 != 12) {
                if (i12 == 0) {
                    y41 y41Var = (y41) view;
                    y41Var.a(Integer.toString(tbVar.d.level), 0, null, org.telegram.messenger.id.M0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = tbVar.d.premium_audience;
                    int i13 = 2131747039;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) tbVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (org.telegram.messenger.t3.V(chat)) {
                                i13 = 2131746929;
                            }
                            y41Var.a(str, 1, concat, org.telegram.messenger.id.M0(i13, null));
                            y41Var.a(String.valueOf(tbVar.d.boosts), 2, null, org.telegram.messenger.id.M0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = tbVar.d;
                            y41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.id.M0(2131753157, null));
                            return;
                        }
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i13 = 2131746929;
                    }
                    y41Var.a("≈0", 1, "0%", org.telegram.messenger.id.M0(i13, null));
                    y41Var.a(String.valueOf(tbVar.d.boosts), 2, null, org.telegram.messenger.id.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = tbVar.d;
                    y41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.id.M0(2131753157, null));
                    return;
                } else if (i12 == 5) {
                    TL_stories.Boost boost = ((sb) arrayList.get(i7)).d;
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(boost.user_id));
                    bh.b bVar = (bh.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.id.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.id.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.id.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.id.r(boost.expires, false));
                    }
                    bVar.d(a22, org.telegram.messenger.g5.p(a22), a02, !((sb) arrayList.get(i7)).f49807f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i12 == 6) {
                    ((org.telegram.ui.Cells.z8) view).setText(((sb) arrayList.get(i7)).f49805c);
                    return;
                } else if (i12 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (tbVar.D == 0) {
                        x4Var.b(2131230871, 5, org.telegram.messenger.id.G(tbVar.f50220s, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        x4Var.b(2131230871, 5, org.telegram.messenger.id.G(tbVar.f50222x, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i12 == 3) {
                    ((org.telegram.ui.Components.q70) view).setLink(((sb) arrayList.get(i7)).f49805c);
                    return;
                } else if (i12 == 11) {
                    sb sbVar = (sb) arrayList.get(i7);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = sbVar.f49806e;
                    boolean z9 = sbVar.f49807f;
                    bh.c cVar = (bh.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, org.telegram.messenger.id.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.id.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.id.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z9);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, org.telegram.messenger.id.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.id.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z9);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i12 == 13) {
                    int i14 = this.d;
                    int i15 = tbVar.O;
                    if (i14 != i15 || this.f49330e != tbVar.N) {
                        this.d = i15;
                        this.f49330e = tbVar.N;
                        tbVar.f50217f.f();
                        tbVar.f50217f.a(0, org.telegram.messenger.id.G(tbVar.O, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.qp.s1(i11).f24869p4 && (i10 = tbVar.N) > 0 && i10 != tbVar.O) {
                            tbVar.f50217f.a(1, org.telegram.messenger.id.G(i10, "BoostingGiftsCount", new Object[0]), null);
                        }
                        tbVar.f50217f.setInitialTabId(tbVar.D);
                        tbVar.f50217f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            ng.c cVar2 = (ng.c) view;
            cVar2.setTitle(((sb) arrayList.get(i7)).f49805c);
            cVar2.c(false);
            if (d1Var.f57056f == 12) {
                cVar2.setPadding(org.telegram.messenger.g0.L(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        bi.x5 x5Var;
        int i10;
        tb tbVar = this.f49331f;
        org.telegram.ui.ActionBar.h6 h6Var = tbVar.f50216e;
        e51 e51Var = tbVar.f50215c;
        switch (i7) {
            case 0:
                x5Var = new y41(tbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new ng.c(tbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                x5Var = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i11 = org.telegram.ui.ActionBar.m6.f27834a7;
                View y6Var = new org.telegram.ui.Cells.y6(context, org.telegram.ui.ActionBar.m6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.t6.h(i11, y6Var, null);
                x5Var = y6Var;
                break;
            case 3:
                org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(tbVar.getContext(), tbVar.f50215c, null, false, false);
                q70Var.d.setVisibility(8);
                q70Var.f37155a.setGravity(17);
                q70Var.h.setVisibility(8);
                q70Var.f37163w.setVisibility(8);
                q70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                x5Var = q70Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, tbVar.getContext(), tbVar.f50216e);
                limitPreviewView.f31470c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f));
                limitPreviewView.g(tbVar.d, false);
                x5Var = limitPreviewView;
                break;
            case 5:
                x5Var = new bh.b(tbVar.getContext());
                break;
            case 6:
                x5Var = new org.telegram.ui.Cells.z8(20, viewGroup.getContext(), h6Var);
                break;
            case 7:
                x5Var = new org.telegram.ui.Cells.v3(tbVar.getContext(), 8);
                break;
            case 8:
                di.b4 b4Var = new di.b4(tbVar.getContext(), 8);
                TextView textView = new TextView(tbVar.getContext());
                if (org.telegram.messenger.t3.V(tbVar.I)) {
                    i10 = 2131748234;
                } else {
                    i10 = 2131748235;
                }
                textView.setText(org.telegram.messenger.id.M0(i10, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28282y6, null);
                textView.setGravity(17);
                b4Var.addView(textView, c8.ha.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                x5Var = b4Var;
                break;
            case 9:
                m5 m5Var = new m5(tbVar.getContext(), 1);
                m5Var.a(org.telegram.ui.ActionBar.m6.f28225v6, org.telegram.ui.ActionBar.m6.f28206u6);
                x5Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(tbVar.getContext());
                m8Var.o(2131232172, org.telegram.messenger.id.a0("BoostingGetBoostsViaGifts", null, 2131753512, new Object[0]), false);
                m8Var.f29589s = 64;
                int i12 = org.telegram.ui.ActionBar.m6.f28130q6;
                m8Var.g(i12, i12);
                x5Var = m8Var;
                break;
            case 11:
                x5Var = new bh.c(tbVar.getContext());
                break;
            case 12:
                View cVar2 = new ng.c(tbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                x5Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(e51Var.getParentActivity(), h6Var);
                tbVar.f50217f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.m6.f27826a;
                int i14 = org.telegram.ui.ActionBar.m6.f28198ti;
                int i15 = org.telegram.ui.ActionBar.m6.f28179si;
                int i16 = org.telegram.ui.ActionBar.m6.f27826a;
                scrollSlidingTextTabStrip.L = i14;
                scrollSlidingTextTabStrip.M = i15;
                scrollSlidingTextTabStrip.updateColors();
                bi.x5 x5Var2 = new bi.x5(this, e51Var.getParentActivity());
                tbVar.f50217f.setDelegate(new f(this, 9));
                x5Var2.addView(tbVar.f50217f, c8.ha.c(48.0f, -2));
                x5Var = x5Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return jg.g.r(x5Var, x5Var, -1, -2);
    }
}
