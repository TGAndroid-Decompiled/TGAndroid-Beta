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
public final class t5 extends pg.b {
    public final z5 d;

    public t5(z5 z5Var) {
        this.d = z5Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return ((y5) this.d.f43588a0.get(b1Var.b())).f44335b;
    }

    @Override
    public final int h() {
        return this.d.f43588a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((y5) this.d.f43588a0.get(i10)).f44334a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        z5 z5Var = this.d;
        int i14 = z5Var.Q;
        TLRPC.Chat chat = z5Var.f43594g0;
        ArrayList arrayList = z5Var.f43588a0;
        int i15 = b1Var.f45961f;
        View view = b1Var.f45958a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    l91 l91Var = (l91) view;
                    l91Var.a(Integer.toString(z5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
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
                            l91Var.a(str, 1, concat, LocaleController.getString(i13));
                            l91Var.a(String.valueOf(z5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z5Var.R;
                            l91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            l91Var.setPadding(AndroidUtilities.dp(23.0f), l91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), l91Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    l91Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    l91Var.a(String.valueOf(z5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = z5Var.R;
                    l91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    l91Var.setPadding(AndroidUtilities.dp(23.0f), l91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), l91Var.getPaddingBottom());
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
                    bVar.e(user, ContactsController.formatName(user), formatString, !((y5) arrayList.get(i10)).f43350f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    d9Var.setText(((y5) arrayList.get(i10)).f43349c);
                    d9Var.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (z5Var.f43589b0 == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", z5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", z5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.q90) view).setLink(((y5) arrayList.get(i10)).f43349c);
                    return;
                } else if (i15 == 11) {
                    y5 y5Var = (y5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = y5Var.e;
                    boolean z10 = y5Var.f43350f;
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
                    if (z5Var.T.getTag() == null || ((Integer) z5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(z5Var.m0), Integer.valueOf(z5Var.f43599l0))) {
                        z5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(z5Var.m0), Integer.valueOf(z5Var.f43599l0))));
                        z5Var.T.g();
                        z5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", z5Var.m0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = z5Var.f43599l0) > 0 && i11 != z5Var.m0) {
                            z5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        z5Var.T.setInitialTabId(z5Var.f43589b0);
                        z5Var.T.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            lg.c cVar2 = (lg.c) view;
            cVar2.setTitle(((y5) arrayList.get(i10)).f43349c);
            cVar2.c(false);
            if (b1Var.f45961f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View z6Var;
        ci.i4 i4Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var2;
        z5 z5Var = this.d;
        switch (i10) {
            case 0:
                i4Var = new l91(z5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                lg.c cVar = new lg.c(z5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                i4Var = cVar;
                break;
            case 2:
                z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
                i4Var = z6Var;
                break;
            case 3:
                org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(z5Var.getParentActivity(), z5Var, null, false, false);
                q90Var.d.setVisibility(8);
                q90Var.f29603a.setGravity(17);
                q90Var.h.setVisibility(8);
                q90Var.v.setVisibility(8);
                q90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                i4Var = q90Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                i4Var = new zg.b(z5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                d6Var = ((org.telegram.ui.ActionBar.n2) z5Var).resourceProvider;
                z6Var = new org.telegram.ui.Cells.d9(context, 20, d6Var);
                i4Var = z6Var;
                break;
            case 7:
                i4Var = new org.telegram.ui.Cells.s3(z5Var.getParentActivity(), 8);
                break;
            case 8:
                ci.i4 i4Var2 = new ci.i4(z5Var.getParentActivity(), 7);
                TextView textView = new TextView(z5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(z5Var.f43594g0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.kk.j(14.0f, i11, 1, textView);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.h6.f21381y6, null, false, textView, 17);
                i4Var2.addView(textView, w7.z5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                i4Var = i4Var2;
                break;
            case 9:
                s5 s5Var = new s5(z5Var.getParentActivity(), 0);
                s5Var.a(org.telegram.ui.ActionBar.h6.f21326v6, org.telegram.ui.ActionBar.h6.f21309u6);
                i4Var = s5Var;
                break;
            case 10:
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(z5Var.getParentActivity());
                q8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                q8Var.f22791s = 64;
                int i12 = org.telegram.ui.ActionBar.h6.q6;
                q8Var.e(i12, i12);
                i4Var = q8Var;
                break;
            case 11:
                i4Var = new zg.c(z5Var.getParentActivity());
                break;
            case 12:
                lg.c cVar2 = new lg.c(z5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                i4Var = cVar2;
                break;
            case 13:
                Activity parentActivity = z5Var.getParentActivity();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) z5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, d6Var2);
                z5Var.T = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.h6.Fh;
                int i14 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.d();
                ah.v vVar = new ah.v(this, z5Var.getParentActivity());
                z5Var.T.setDelegate(new g(this, 6));
                vVar.addView(z5Var.T, w7.z5.d(48.0f, -2));
                i4Var = vVar;
                break;
            case 14:
                i4Var = z5Var.r0(z5Var.getParentActivity());
                break;
            case 15:
                ai.ic icVar = new ai.ic(this, z5Var.getParentActivity(), 10);
                icVar.setTag(-33024);
                i4Var = icVar;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(i4Var, i4Var, -1, -2);
    }
}
