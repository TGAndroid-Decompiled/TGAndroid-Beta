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
public final class r5 extends og.b {
    public final y5 d;

    public r5(y5 y5Var) {
        this.d = y5Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return ((x5) this.d.f44300a0.get(d1Var.b())).f16878b;
    }

    @Override
    public final int h() {
        return this.d.f44300a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((x5) this.d.f44300a0.get(i10)).f16877a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        y5 y5Var = this.d;
        int i14 = y5Var.Q;
        TLRPC.Chat chat = y5Var.f44306g0;
        ArrayList arrayList = y5Var.f44300a0;
        int i15 = d1Var.f47901f;
        View view = d1Var.f47897a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    xa1 xa1Var = (xa1) view;
                    xa1Var.a(Integer.toString(y5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = y5Var.R.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) y5Var.R.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            xa1Var.a(str, 1, concat, LocaleController.getString(i13));
                            xa1Var.a(String.valueOf(y5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var.R;
                            xa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            xa1Var.setPadding(AndroidUtilities.dp(23.0f), xa1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), xa1Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    xa1Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    xa1Var.a(String.valueOf(y5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = y5Var.R;
                    xa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    xa1Var.setPadding(AndroidUtilities.dp(23.0f), xa1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), xa1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((x5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    yg.b bVar = (yg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((x5) arrayList.get(i10)).f43761f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(((x5) arrayList.get(i10)).f43759c);
                    e9Var.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (y5Var.f44301b0 == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", y5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", y5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.ba0) view).setLink(((x5) arrayList.get(i10)).f43759c);
                    return;
                } else if (i15 == 11) {
                    x5 x5Var = (x5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = x5Var.f43760e;
                    boolean z10 = x5Var.f43761f;
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
                    if (y5Var.T.getTag() == null || ((Integer) y5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(y5Var.m0), Integer.valueOf(y5Var.f44311l0))) {
                        y5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(y5Var.m0), Integer.valueOf(y5Var.f44311l0))));
                        y5Var.T.g();
                        y5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", y5Var.m0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = y5Var.f44311l0) > 0 && i11 != y5Var.m0) {
                            y5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        y5Var.T.setInitialTabId(y5Var.f44301b0);
                        y5Var.T.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            kg.c cVar2 = (kg.c) view;
            cVar2.setTitle(((x5) arrayList.get(i10)).f43759c);
            cVar2.c(false);
            if (d1Var.f47901f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View a7Var;
        ai.x5 x5Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var2;
        y5 y5Var = this.d;
        switch (i10) {
            case 0:
                x5Var = new xa1(y5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                kg.c cVar = new kg.c(y5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                x5Var = cVar;
                break;
            case 2:
                a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), 0, 0);
                x5Var = a7Var;
                break;
            case 3:
                org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(y5Var.getParentActivity(), y5Var, null, false, false);
                ba0Var.d.setVisibility(8);
                ba0Var.f24580a.setGravity(17);
                ba0Var.h.setVisibility(8);
                ba0Var.v.setVisibility(8);
                ba0Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                x5Var = ba0Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                x5Var = new yg.b(y5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                c6Var = ((org.telegram.ui.ActionBar.m2) y5Var).resourceProvider;
                a7Var = new org.telegram.ui.Cells.e9(context, 20, c6Var);
                x5Var = a7Var;
                break;
            case 7:
                x5Var = new org.telegram.ui.Cells.t3(y5Var.getParentActivity(), 8);
                break;
            case 8:
                ai.x5 x5Var2 = new ai.x5(y5Var.getParentActivity(), 7);
                TextView textView = new TextView(y5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(y5Var.f44306g0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.am.j(14.0f, i11, 1, textView);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f20946y6, null, false, textView, 17);
                x5Var2.addView(textView, w7.w5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                x5Var = x5Var2;
                break;
            case 9:
                q5 q5Var = new q5(y5Var.getParentActivity(), 0);
                q5Var.a(org.telegram.ui.ActionBar.h6.f20893v6, org.telegram.ui.ActionBar.h6.f20875u6);
                x5Var = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(y5Var.getParentActivity());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f22488s = 64;
                int i12 = org.telegram.ui.ActionBar.h6.q6;
                r8Var.e(i12, i12);
                x5Var = r8Var;
                break;
            case 11:
                x5Var = new yg.c(y5Var.getParentActivity());
                break;
            case 12:
                kg.c cVar2 = new kg.c(y5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                x5Var = cVar2;
                break;
            case 13:
                Activity parentActivity = y5Var.getParentActivity();
                c6Var2 = ((org.telegram.ui.ActionBar.m2) y5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, c6Var2);
                y5Var.T = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.h6.Fh;
                int i14 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var = new ci.m6(this, y5Var.getParentActivity());
                y5Var.T.setDelegate(new g(this, 6));
                m6Var.addView(y5Var.T, w7.w5.d(48.0f, -2));
                x5Var = m6Var;
                break;
            case 14:
                x5Var = y5Var.r0(y5Var.getParentActivity());
                break;
            case 15:
                ci.bb bbVar = new ci.bb(this, y5Var.getParentActivity(), 9);
                bbVar.setTag(-33024);
                x5Var = bbVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(x5Var, x5Var, -1, -2);
    }
}
