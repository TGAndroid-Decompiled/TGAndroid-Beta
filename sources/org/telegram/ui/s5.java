package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
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
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class s5 extends pg.b {
    public final z5 d;

    public s5(z5 z5Var) {
        this.d = z5Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return ((y5) this.d.f42479a0.get(b1Var.b())).f43204b;
    }

    @Override
    public final int h() {
        return this.d.f42479a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((y5) this.d.f42479a0.get(i10)).f43203a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        z5 z5Var = this.d;
        int i14 = z5Var.Q;
        TLRPC.Chat chat = z5Var.f42485g0;
        ArrayList arrayList = z5Var.f42479a0;
        int i15 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    bb1 bb1Var = (bb1) view;
                    bb1Var.a(Integer.toString(z5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = z5Var.R.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) z5Var.R.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            bb1Var.a(str, 1, concat, LocaleController.getString(i13));
                            bb1Var.a(String.valueOf(z5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var.R;
                            bb1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            bb1Var.setPadding(AndroidUtilities.dp(23.0f), bb1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), bb1Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    bb1Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    bb1Var.a(String.valueOf(z5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = z5Var.R;
                    bb1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    bb1Var.setPadding(AndroidUtilities.dp(23.0f), bb1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), bb1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((y5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    zg.b bVar = (zg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.e(user, ContactsController.formatName(user), formatString, !((y5) arrayList.get(i10)).f42030f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(((y5) arrayList.get(i10)).f42029c);
                    e9Var.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (z5Var.f42480b0 == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", z5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", z5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.w90) view).setLink(((y5) arrayList.get(i10)).f42029c);
                    return;
                } else if (i15 == 11) {
                    y5 y5Var = (y5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = y5Var.e;
                    boolean z10 = y5Var.f42030f;
                    zg.c cVar = (zg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 13) {
                    if (z5Var.T.getTag() == null || ((Integer) z5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(z5Var.m0), Integer.valueOf(z5Var.f42490l0))) {
                        z5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(z5Var.m0), Integer.valueOf(z5Var.f42490l0))));
                        z5Var.T.g();
                        z5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", z5Var.m0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = z5Var.f42490l0) > 0 && i11 != z5Var.m0) {
                            z5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        z5Var.T.setInitialTabId(z5Var.f42480b0);
                        z5Var.T.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            lg.c cVar2 = (lg.c) view;
            cVar2.setTitle(((y5) arrayList.get(i10)).f42029c);
            cVar2.c(false);
            if (b1Var.f44841f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        bi.i5 i5Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        z5 z5Var = this.d;
        switch (i10) {
            case 0:
                i5Var = new bb1(z5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                lg.c cVar = new lg.c(z5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                i5Var = cVar;
                break;
            case 2:
                b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
                i5Var = b7Var;
                break;
            case 3:
                org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(z5Var.getParentActivity(), z5Var, null, false, false);
                w90Var.d.setVisibility(8);
                w90Var.f30826a.setGravity(17);
                w90Var.h.setVisibility(8);
                w90Var.v.setVisibility(8);
                w90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                i5Var = w90Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                i5Var = new zg.b(z5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                c6Var = ((org.telegram.ui.ActionBar.m2) z5Var).resourceProvider;
                b7Var = new org.telegram.ui.Cells.e9(context, 20, c6Var);
                i5Var = b7Var;
                break;
            case 7:
                i5Var = new org.telegram.ui.Cells.t3(z5Var.getParentActivity(), 8);
                break;
            case 8:
                bi.i5 i5Var2 = new bi.i5(z5Var.getParentActivity(), 7);
                TextView textView = new TextView(z5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(z5Var.f42485g0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.yh.j(14.0f, i11, 1, textView);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.g6.f20288y6, null, false, textView, 17);
                i5Var2.addView(textView, w7.a6.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                i5Var = i5Var2;
                break;
            case 9:
                r5 r5Var = new r5(z5Var.getParentActivity(), 0);
                r5Var.a(org.telegram.ui.ActionBar.g6.f20233v6, org.telegram.ui.ActionBar.g6.f20216u6);
                i5Var = r5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(z5Var.getParentActivity());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f21765s = 64;
                int i12 = org.telegram.ui.ActionBar.g6.q6;
                r8Var.e(i12, i12);
                i5Var = r8Var;
                break;
            case 11:
                i5Var = new zg.c(z5Var.getParentActivity());
                break;
            case 12:
                lg.c cVar2 = new lg.c(z5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                i5Var = cVar2;
                break;
            case 13:
                Activity parentActivity = z5Var.getParentActivity();
                c6Var2 = ((org.telegram.ui.ActionBar.m2) z5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, c6Var2);
                z5Var.T = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.g6.Fh;
                int i14 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.d();
                ah.v vVar = new ah.v(this, z5Var.getParentActivity());
                z5Var.T.setDelegate(new g(this, 6));
                vVar.addView(z5Var.T, w7.a6.d(48.0f, -2));
                i5Var = vVar;
                break;
            case 14:
                i5Var = z5Var.r0(z5Var.getParentActivity());
                break;
            case 15:
                di.ab abVar = new di.ab(this, z5Var.getParentActivity(), 9);
                abVar.setTag(-33024);
                i5Var = abVar;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(i5Var, i5Var, -1, -2);
    }
}
