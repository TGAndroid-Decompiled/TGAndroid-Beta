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
public final class xb extends hg.c {
    public int d = -1;
    public int e = -1;
    public final zb f43299f;

    public xb(zb zbVar) {
        this.f43299f = zbVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((yb) this.f43299f.f43883y.get(c1Var.b())).f7682b;
    }

    @Override
    public final int b() {
        return this.f43299f.f43883y.size();
    }

    @Override
    public final int d(int i10) {
        return ((yb) this.f43299f.f43883y.get(i10)).f7681a;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        String a02;
        zb zbVar = this.f43299f;
        int i12 = zbVar.f43875b;
        TLRPC.Chat chat = zbVar.I;
        ArrayList arrayList = zbVar.f43883y;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i13 != 4) {
            if (i13 != 1 && i13 != 12) {
                if (i13 == 0) {
                    m61 m61Var = (m61) view;
                    m61Var.a(Integer.toString(zbVar.d.level), 0, null, org.telegram.messenger.dd.L0(2131753159, null));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = zbVar.d.premium_audience;
                    int i14 = 2131747054;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) zbVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (org.telegram.messenger.w3.V(chat)) {
                                i14 = 2131746944;
                            }
                            m61Var.a(str, 1, concat, org.telegram.messenger.dd.L0(i14, null));
                            m61Var.a(String.valueOf(zbVar.d.boosts), 2, null, org.telegram.messenger.dd.L0(2131753162, null));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = zbVar.d;
                            m61Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.dd.L0(2131753157, null));
                            return;
                        }
                    }
                    if (org.telegram.messenger.w3.V(chat)) {
                        i14 = 2131746944;
                    }
                    m61Var.a("≈0", 1, "0%", org.telegram.messenger.dd.L0(i14, null));
                    m61Var.a(String.valueOf(zbVar.d.boosts), 2, null, org.telegram.messenger.dd.L0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = zbVar.d;
                    m61Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.dd.L0(2131753157, null));
                    return;
                } else if (i13 == 5) {
                    TL_stories.Boost boost = ((yb) arrayList.get(i10)).d;
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(i12).Z1(Long.valueOf(boost.user_id));
                    rg.b bVar = (rg.b) view;
                    if (boost.multiplier > 1) {
                        a02 = org.telegram.messenger.dd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.dd.r(boost.expires, false));
                    } else {
                        a02 = org.telegram.messenger.dd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.dd.r(boost.expires, false));
                    }
                    bVar.d(Z1, org.telegram.messenger.i5.p(Z1), a02, !((yb) arrayList.get(i10)).f43629f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 6) {
                    ((org.telegram.ui.Cells.b9) view).setText(((yb) arrayList.get(i10)).f43628c);
                    return;
                } else if (i13 == 9) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (zbVar.D == 0) {
                        b5Var.b(2131230871, 5, org.telegram.messenger.dd.G(zbVar.f43880s, "BoostingShowMoreBoosts", new Object[0]), false);
                        return;
                    } else {
                        b5Var.b(2131230871, 5, org.telegram.messenger.dd.G(zbVar.f43882x, "BoostingShowMoreGifts", new Object[0]), false);
                        return;
                    }
                } else if (i13 == 3) {
                    ((org.telegram.ui.Components.j80) view).setLink(((yb) arrayList.get(i10)).f43628c);
                    return;
                } else if (i13 == 11) {
                    yb ybVar = (yb) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = ybVar.e;
                    boolean z10 = ybVar.f43629f;
                    rg.c cVar = (rg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, org.telegram.messenger.dd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.dd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.dd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, org.telegram.messenger.dd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.dd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i13 == 13) {
                    int i15 = this.d;
                    int i16 = zbVar.O;
                    if (i15 != i16 || this.e != zbVar.N) {
                        this.d = i16;
                        this.e = zbVar.N;
                        zbVar.f43877f.f();
                        zbVar.f43877f.a(0, org.telegram.messenger.dd.G(zbVar.O, "BoostingBoostsCount", new Object[0]), null);
                        if (org.telegram.messenger.wp.r1(i12).f19222q4 && (i11 = zbVar.N) > 0 && i11 != zbVar.O) {
                            zbVar.f43877f.a(1, org.telegram.messenger.dd.G(i11, "BoostingGiftsCount", new Object[0]), null);
                        }
                        zbVar.f43877f.setInitialTabId(zbVar.D);
                        zbVar.f43877f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            dg.d dVar = (dg.d) view;
            dVar.setTitle(((yb) arrayList.get(i10)).f43628c);
            dVar.c(false);
            if (c1Var.f47912f == 12) {
                dVar.setPadding(org.telegram.messenger.i0.L(3.0f), dVar.getPaddingTop(), dVar.getPaddingRight(), dVar.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        fg.i iVar;
        int i11;
        zb zbVar = this.f43299f;
        org.telegram.ui.ActionBar.p6 p6Var = zbVar.e;
        s61 s61Var = zbVar.f43876c;
        switch (i10) {
            case 0:
                iVar = new m61(zbVar.getContext(), 2);
                break;
            case 1:
                View dVar = new dg.d(zbVar.getContext(), null);
                dVar.setPadding(dVar.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar.getRight(), org.telegram.messenger.i0.L(16.0f));
                iVar = dVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i12 = org.telegram.ui.ActionBar.t6.f20873a7;
                View c7Var = new org.telegram.ui.Cells.c7(context, org.telegram.ui.ActionBar.t6.x0(null, i12, false), 0);
                org.telegram.ui.ActionBar.a7.i(i12, c7Var, null);
                iVar = c7Var;
                break;
            case 3:
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(zbVar.getContext(), zbVar.f43876c, null, false, false);
                j80Var.d.setVisibility(8);
                j80Var.f27301a.setGravity(17);
                j80Var.h.setVisibility(8);
                j80Var.f27308w.setVisibility(8);
                j80Var.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(24.0f));
                iVar = j80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, zbVar.getContext(), zbVar.e);
                limitPreviewView.f24103c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f));
                limitPreviewView.g(zbVar.d, false);
                iVar = limitPreviewView;
                break;
            case 5:
                iVar = new rg.b(zbVar.getContext());
                break;
            case 6:
                iVar = new org.telegram.ui.Cells.b9(20, viewGroup.getContext(), p6Var);
                break;
            case 7:
                iVar = new org.telegram.ui.Cells.x3(zbVar.getContext(), 8);
                break;
            case 8:
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(zbVar.getContext(), 12);
                TextView textView = new TextView(zbVar.getContext());
                if (org.telegram.messenger.w3.V(zbVar.I)) {
                    i11 = 2131748251;
                } else {
                    i11 = 2131748252;
                }
                textView.setText(org.telegram.messenger.dd.L0(i11, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21312y6, null);
                textView.setGravity(17);
                a5Var.addView(textView, w7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                iVar = a5Var;
                break;
            case 9:
                l5 l5Var = new l5(zbVar.getContext(), 1);
                l5Var.a(org.telegram.ui.ActionBar.t6.f21260v6, org.telegram.ui.ActionBar.t6.f21243u6);
                iVar = l5Var;
                break;
            case 10:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(zbVar.getContext());
                p8Var.o(2131232171, org.telegram.messenger.dd.a0("BoostingGetBoostsViaGifts", null, 2131753512, new Object[0]), false);
                p8Var.f22464s = 64;
                int i13 = org.telegram.ui.ActionBar.t6.q6;
                p8Var.g(i13, i13);
                iVar = p8Var;
                break;
            case 11:
                iVar = new rg.c(zbVar.getContext());
                break;
            case 12:
                View dVar2 = new dg.d(zbVar.getContext(), null);
                dVar2.setPadding(dVar2.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar2.getRight(), org.telegram.messenger.i0.L(8.0f));
                iVar = dVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(s61Var.getParentActivity(), p6Var);
                zbVar.f43877f = scrollSlidingTextTabStrip;
                int i14 = org.telegram.ui.ActionBar.t6.f20866a;
                int i15 = org.telegram.ui.ActionBar.t6.ti;
                int i16 = org.telegram.ui.ActionBar.t6.si;
                int i17 = org.telegram.ui.ActionBar.t6.f20866a;
                scrollSlidingTextTabStrip.L = i15;
                scrollSlidingTextTabStrip.M = i16;
                scrollSlidingTextTabStrip.updateColors();
                fg.i iVar2 = new fg.i(this, s61Var.getParentActivity());
                zbVar.f43877f.setDelegate(new e(this, 9));
                iVar2.addView(zbVar.f43877f, w7.b6.c(48.0f, -2));
                iVar = iVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return sc.e.o(iVar, iVar, -1, -2);
    }
}
