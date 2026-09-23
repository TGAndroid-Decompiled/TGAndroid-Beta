package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class zb extends og.b {
    public int d = -1;
    public int e = -1;
    public final bc f40097f;

    public zb(bc bcVar) {
        this.f40097f = bcVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return ((ac) this.f40097f.f32073x.get(c1Var.b())).f15509b;
    }

    @Override
    public final int h() {
        return this.f40097f.f32073x.size();
    }

    @Override
    public final int j(int i10) {
        return ((ac) this.f40097f.f32073x.get(i10)).f15508a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        bc bcVar = this.f40097f;
        int i14 = bcVar.f32066b;
        TLRPC.Chat chat = bcVar.J;
        ArrayList arrayList = bcVar.f32073x;
        int i15 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    la1 la1Var = (la1) view;
                    la1Var.a(Integer.toString(bcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = bcVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) bcVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            la1Var.a(str, 1, concat, LocaleController.getString(i13));
                            la1Var.a(String.valueOf(bcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bcVar.d;
                            la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    la1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    la1Var.a(String.valueOf(bcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = bcVar.d;
                    la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((ac) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((ac) arrayList.get(i10)).f31729f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.f9) view).setText(((ac) arrayList.get(i10)).f31728c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (bcVar.f32074y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", bcVar.f32071s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", bcVar.f32072w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.w80) view).setLink(((ac) arrayList.get(i10)).f31728c);
                    return;
                } else if (i15 == 11) {
                    ac acVar = (ac) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = acVar.e;
                    boolean z10 = acVar.f31729f;
                    yg.c cVar = (yg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 13) {
                    int i16 = this.d;
                    int i17 = bcVar.P;
                    if (i16 != i17 || this.e != bcVar.O) {
                        this.d = i17;
                        this.e = bcVar.O;
                        bcVar.f32068f.g();
                        bcVar.f32068f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", bcVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = bcVar.O) > 0 && i11 != bcVar.P) {
                            bcVar.f32068f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        bcVar.f32068f.setInitialTabId(bcVar.f32074y);
                        bcVar.f32068f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((ac) arrayList.get(i10)).f31728c);
            cVar2.c(false);
            if (c1Var.f42630f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ci.m6 m6Var;
        int i11;
        bc bcVar = this.f40097f;
        org.telegram.ui.ActionBar.d6 d6Var = bcVar.e;
        ra1 ra1Var = bcVar.f32067c;
        switch (i10) {
            case 0:
                m6Var = new la1(bcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new kg.c(bcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                m6Var = cVar;
                break;
            case 2:
                m6Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(bcVar.getContext(), bcVar.f32067c, null, false, false);
                w80Var.d.setVisibility(8);
                w80Var.f29567a.setGravity(17);
                w80Var.h.setVisibility(8);
                w80Var.v.setVisibility(8);
                w80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                m6Var = w80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(bcVar.getContext(), R.drawable.filled_limit_boost, 0, bcVar.e, 0);
                limitPreviewView.f22077c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(bcVar.d, false);
                m6Var = limitPreviewView;
                break;
            case 5:
                m6Var = new yg.b(bcVar.getContext());
                break;
            case 6:
                m6Var = new org.telegram.ui.Cells.f9(viewGroup.getContext(), 20, d6Var);
                break;
            case 7:
                m6Var = new org.telegram.ui.Cells.t3(bcVar.getContext(), 8);
                break;
            case 8:
                ai.w5 w5Var = new ai.w5(bcVar.getContext(), 9);
                TextView textView = new TextView(bcVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(bcVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f19170y6, null, false, textView, 17);
                w5Var.addView(textView, w7.x5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                m6Var = w5Var;
                break;
            case 9:
                o5 o5Var = new o5(bcVar.getContext(), 1);
                o5Var.a(org.telegram.ui.ActionBar.h6.f19118v6, org.telegram.ui.ActionBar.h6.f19100u6);
                m6Var = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(bcVar.getContext());
                s8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                s8Var.f20932s = 64;
                int i12 = org.telegram.ui.ActionBar.h6.q6;
                s8Var.e(i12, i12);
                m6Var = s8Var;
                break;
            case 11:
                m6Var = new yg.c(bcVar.getContext());
                break;
            case 12:
                View cVar2 = new kg.c(bcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                m6Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(ra1Var.getParentActivity(), d6Var);
                bcVar.f32068f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.h6.Fh;
                int i14 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var2 = new ci.m6(this, ra1Var.getParentActivity());
                bcVar.f32068f.setDelegate(new g(this, 11));
                m6Var2.addView(bcVar.f32068f, w7.x5.c(48.0f, -2));
                m6Var = m6Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.k(m6Var, m6Var, -1, -2);
    }
}
