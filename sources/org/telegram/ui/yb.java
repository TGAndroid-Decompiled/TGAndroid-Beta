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
public final class yb extends cg.c {
    public int d = -1;
    public int f43596e = -1;
    public final ac f43597f;

    public yb(ac acVar) {
        this.f43597f = acVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return ((zb) this.f43597f.f35127x.get(m1Var.b())).f2506b;
    }

    @Override
    public final int h() {
        return this.f43597f.f35127x.size();
    }

    @Override
    public final int j(int i10) {
        return ((zb) this.f43597f.f35127x.get(i10)).f2505a;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        ac acVar = this.f43597f;
        int i14 = acVar.f35119b;
        TLRPC.Chat chat = acVar.G;
        ArrayList arrayList = acVar.f35127x;
        int i15 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    ba1 ba1Var = (ba1) view;
                    ba1Var.a(Integer.toString(acVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = acVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) acVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            ba1Var.a(str, 1, concat, LocaleController.getString(i13));
                            ba1Var.a(String.valueOf(acVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = acVar.d;
                            ba1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    ba1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    ba1Var.a(String.valueOf(acVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = acVar.d;
                    ba1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((zb) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    mg.b bVar = (mg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((zb) arrayList.get(i10)).f43885f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.a9) view).setText(((zb) arrayList.get(i10)).f43883c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (acVar.f35128y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", acVar.f35125s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", acVar.f35126w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.y80) view).setLink(((zb) arrayList.get(i10)).f43883c);
                    return;
                } else if (i15 == 11) {
                    zb zbVar = (zb) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = zbVar.f43884e;
                    boolean z4 = zbVar.f43885f;
                    mg.c cVar = (mg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z4);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z4);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 13) {
                    int i16 = this.d;
                    int i17 = acVar.M;
                    if (i16 != i17 || this.f43596e != acVar.L) {
                        this.d = i17;
                        this.f43596e = acVar.L;
                        acVar.f35122f.g();
                        acVar.f35122f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", acVar.M, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = acVar.L) > 0 && i11 != acVar.M) {
                            acVar.f35122f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        acVar.f35122f.setInitialTabId(acVar.f35128y);
                        acVar.f35122f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            yf.c cVar2 = (yf.c) view;
            cVar2.setTitle(((zb) arrayList.get(i10)).f43883c);
            cVar2.c(false);
            if (m1Var.f5879f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ag.l lVar;
        int i11;
        ac acVar = this.f43597f;
        org.telegram.ui.ActionBar.g6 g6Var = acVar.f35121e;
        ha1 ha1Var = acVar.f35120c;
        switch (i10) {
            case 0:
                lVar = new ba1(acVar.getContext(), 2);
                break;
            case 1:
                View cVar = new yf.c(acVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                lVar = cVar;
                break;
            case 2:
                lVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(acVar.getContext(), acVar.f35120c, null, false, false);
                y80Var.d.setVisibility(8);
                y80Var.f33404a.setGravity(17);
                y80Var.h.setVisibility(8);
                y80Var.v.setVisibility(8);
                y80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                lVar = y80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(acVar.getContext(), R.drawable.filled_limit_boost, 0, acVar.f35121e, 0);
                limitPreviewView.W = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(acVar.d, false);
                lVar = limitPreviewView;
                break;
            case 5:
                lVar = new mg.b(acVar.getContext());
                break;
            case 6:
                lVar = new org.telegram.ui.Cells.a9(viewGroup.getContext(), 20, g6Var);
                break;
            case 7:
                lVar = new org.telegram.ui.Cells.s3(acVar.getContext(), 8);
                break;
            case 8:
                eh.d dVar = new eh.d(acVar.getContext(), 9);
                TextView textView = new TextView(acVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(acVar.G)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                yh.t(org.telegram.ui.ActionBar.k6.f22036y6, null, false, textView, 17);
                dVar.addView(textView, k7.c6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                lVar = dVar;
                break;
            case 9:
                q5 q5Var = new q5(acVar.getContext(), 1);
                q5Var.a(org.telegram.ui.ActionBar.k6.f21979v6, org.telegram.ui.ActionBar.k6.f21961u6);
                lVar = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(acVar.getContext());
                o8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                o8Var.f23317s = 64;
                int i12 = org.telegram.ui.ActionBar.k6.f21894q6;
                o8Var.e(i12, i12);
                lVar = o8Var;
                break;
            case 11:
                lVar = new mg.c(acVar.getContext());
                break;
            case 12:
                View cVar2 = new yf.c(acVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                lVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(ha1Var.getParentActivity(), g6Var);
                acVar.f35122f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.k6.Fh;
                int i14 = org.telegram.ui.ActionBar.k6.Eh;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.J = i14;
                scrollSlidingTextTabStrip.e();
                ag.l lVar2 = new ag.l(this, ha1Var.getParentActivity());
                acVar.f35122f.setDelegate(new h(this, 11));
                lVar2.addView(acVar.f35122f, k7.c6.c(48.0f, -2));
                lVar = lVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return yh.o(lVar, lVar, -1, -2);
    }
}
