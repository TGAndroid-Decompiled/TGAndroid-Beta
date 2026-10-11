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
    public int f44663e = -1;
    public final bc f44664f;

    public zb(bc bcVar) {
        this.f44664f = bcVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return ((ac) this.f44664f.f36374x.get(d1Var.b())).f17212b;
    }

    @Override
    public final int h() {
        return this.f44664f.f36374x.size();
    }

    @Override
    public final int j(int i10) {
        return ((ac) this.f44664f.f36374x.get(i10)).f17211a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        bc bcVar = this.f44664f;
        int i14 = bcVar.f36366b;
        TLRPC.Chat chat = bcVar.J;
        ArrayList arrayList = bcVar.f36374x;
        int i15 = d1Var.f47786f;
        View view = d1Var.f47782a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    ua1 ua1Var = (ua1) view;
                    ua1Var.a(Integer.toString(bcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
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
                            ua1Var.a(str, 1, concat, LocaleController.getString(i13));
                            ua1Var.a(String.valueOf(bcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bcVar.d;
                            ua1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    ua1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    ua1Var.a(String.valueOf(bcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = bcVar.d;
                    ua1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
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
                    bVar.d(user, ContactsController.formatName(user), formatString, !((ac) arrayList.get(i10)).f36033f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.e9) view).setText(((ac) arrayList.get(i10)).f36031c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (bcVar.f36375y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", bcVar.f36372s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", bcVar.f36373w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.x90) view).setLink(((ac) arrayList.get(i10)).f36031c);
                    return;
                } else if (i15 == 11) {
                    ac acVar = (ac) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = acVar.f36032e;
                    boolean z10 = acVar.f36033f;
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
                    if (i16 != i17 || this.f44663e != bcVar.O) {
                        this.d = i17;
                        this.f44663e = bcVar.O;
                        bcVar.f36369f.g();
                        bcVar.f36369f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", bcVar.P, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = bcVar.O) > 0 && i11 != bcVar.P) {
                            bcVar.f36369f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        bcVar.f36369f.setInitialTabId(bcVar.f36375y);
                        bcVar.f36369f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((ac) arrayList.get(i10)).f36031c);
            cVar2.c(false);
            if (d1Var.f47786f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ci.m6 m6Var;
        int i11;
        bc bcVar = this.f44664f;
        org.telegram.ui.ActionBar.d6 d6Var = bcVar.f36368e;
        ab1 ab1Var = bcVar.f36367c;
        switch (i10) {
            case 0:
                m6Var = new ua1(bcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new kg.c(bcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                m6Var = cVar;
                break;
            case 2:
                m6Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(bcVar.getContext(), bcVar.f36367c, null, false, false);
                x90Var.d.setVisibility(8);
                x90Var.f32912a.setGravity(17);
                x90Var.h.setVisibility(8);
                x90Var.v.setVisibility(8);
                x90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                m6Var = x90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(bcVar.getContext(), R.drawable.filled_limit_boost, 0, bcVar.f36368e, 0);
                limitPreviewView.f24268c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(bcVar.d, false);
                m6Var = limitPreviewView;
                break;
            case 5:
                m6Var = new yg.b(bcVar.getContext());
                break;
            case 6:
                m6Var = new org.telegram.ui.Cells.e9(viewGroup.getContext(), 20, d6Var);
                break;
            case 7:
                m6Var = new org.telegram.ui.Cells.t3(bcVar.getContext(), 8);
                break;
            case 8:
                ai.x5 x5Var = new ai.x5(bcVar.getContext(), 9);
                TextView textView = new TextView(bcVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(bcVar.J)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.ai.j(14.0f, i11, 1, textView);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f21207y6, null, false, textView, 17);
                x5Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                m6Var = x5Var;
                break;
            case 9:
                m5 m5Var = new m5(bcVar.getContext(), 1);
                m5Var.a(org.telegram.ui.ActionBar.h6.f21154v6, org.telegram.ui.ActionBar.h6.f21136u6);
                m6Var = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(bcVar.getContext());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f22752s = 64;
                int i12 = org.telegram.ui.ActionBar.h6.q6;
                r8Var.e(i12, i12);
                m6Var = r8Var;
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
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(ab1Var.getParentActivity(), d6Var);
                bcVar.f36369f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.h6.Fh;
                int i14 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var2 = new ci.m6(this, ab1Var.getParentActivity());
                bcVar.f36369f.setDelegate(new g(this, 11));
                m6Var2.addView(bcVar.f36369f, w7.x5.d(48.0f, -2));
                m6Var = m6Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.k(m6Var, m6Var, -1, -2);
    }
}
