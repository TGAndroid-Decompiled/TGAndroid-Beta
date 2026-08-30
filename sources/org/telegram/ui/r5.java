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
public final class r5 extends bg.c {
    public final y5 d;

    public r5(y5 y5Var) {
        this.d = y5Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return ((x5) this.d.X.get(l1Var.b())).f1809b;
    }

    @Override
    public final int h() {
        return this.d.X.size();
    }

    @Override
    public final int j(int i10) {
        return ((x5) this.d.X.get(i10)).f1808a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        y5 y5Var = this.d;
        int i14 = y5Var.N;
        TLRPC.Chat chat = y5Var.f40389d0;
        ArrayList arrayList = y5Var.X;
        int i15 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    aa1 aa1Var = (aa1) view;
                    aa1Var.a(Integer.toString(y5Var.O.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = y5Var.O.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) y5Var.O.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            aa1Var.a(str, 1, concat, LocaleController.getString(i13));
                            aa1Var.a(String.valueOf(y5Var.O.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var.O;
                            aa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            aa1Var.setPadding(AndroidUtilities.dp(23.0f), aa1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), aa1Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    aa1Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    aa1Var.a(String.valueOf(y5Var.O.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = y5Var.O;
                    aa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    aa1Var.setPadding(AndroidUtilities.dp(23.0f), aa1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), aa1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((x5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    lg.b bVar = (lg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((x5) arrayList.get(i10)).f39859f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    a9Var.setText(((x5) arrayList.get(i10)).f39858c);
                    a9Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (y5Var.Y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", y5Var.U, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", y5Var.W, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.x80) view).setLink(((x5) arrayList.get(i10)).f39858c);
                    return;
                } else if (i15 == 11) {
                    x5 x5Var = (x5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = x5Var.e;
                    boolean z4 = x5Var.f39859f;
                    lg.c cVar = (lg.c) view;
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
                    if (y5Var.Q.getTag() == null || ((Integer) y5Var.Q.getTag()).intValue() != Objects.hash(Integer.valueOf(y5Var.f40395j0), Integer.valueOf(y5Var.f40394i0))) {
                        y5Var.Q.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(y5Var.f40395j0), Integer.valueOf(y5Var.f40394i0))));
                        y5Var.Q.g();
                        y5Var.Q.a(0, LocaleController.formatPluralString("BoostingBoostsCount", y5Var.f40395j0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = y5Var.f40394i0) > 0 && i11 != y5Var.f40395j0) {
                            y5Var.Q.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        y5Var.Q.setInitialTabId(y5Var.Y);
                        y5Var.Q.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            xf.c cVar2 = (xf.c) view;
            cVar2.setTitle(((x5) arrayList.get(i10)).f39858c);
            cVar2.c(false);
            if (l1Var.f5788f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z6Var;
        dh.d dVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var2;
        y5 y5Var = this.d;
        switch (i10) {
            case 0:
                dVar = new aa1(y5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                xf.c cVar = new xf.c(y5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                dVar = cVar;
                break;
            case 2:
                z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
                dVar = z6Var;
                break;
            case 3:
                org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(y5Var.getParentActivity(), y5Var, null, false, false);
                x80Var.d.setVisibility(8);
                x80Var.f30603a.setGravity(17);
                x80Var.h.setVisibility(8);
                x80Var.v.setVisibility(8);
                x80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                dVar = x80Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                dVar = new lg.b(y5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                f6Var = ((org.telegram.ui.ActionBar.p2) y5Var).resourceProvider;
                z6Var = new org.telegram.ui.Cells.a9(context, 20, f6Var);
                dVar = z6Var;
                break;
            case 7:
                dVar = new org.telegram.ui.Cells.s3(y5Var.getParentActivity(), 8);
                break;
            case 8:
                dh.d dVar2 = new dh.d(y5Var.getParentActivity(), 7);
                TextView textView = new TextView(y5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(y5Var.f40389d0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                yh.t(org.telegram.ui.ActionBar.j6.f20281y6, null, false, textView, 17);
                dVar2.addView(textView, k7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                dVar = dVar2;
                break;
            case 9:
                q5 q5Var = new q5(y5Var.getParentActivity(), 0);
                q5Var.a(org.telegram.ui.ActionBar.j6.f20225v6, org.telegram.ui.ActionBar.j6.f20207u6);
                dVar = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(y5Var.getParentActivity());
                o8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                o8Var.f21533s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.f20140q6;
                o8Var.e(i12, i12);
                dVar = o8Var;
                break;
            case 11:
                dVar = new lg.c(y5Var.getParentActivity());
                break;
            case 12:
                xf.c cVar2 = new xf.c(y5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                dVar = cVar2;
                break;
            case 13:
                Activity parentActivity = y5Var.getParentActivity();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) y5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, f6Var2);
                y5Var.Q = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.Fh;
                int i14 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.J = i14;
                scrollSlidingTextTabStrip.e();
                ah.d dVar3 = new ah.d(this, y5Var.getParentActivity());
                y5Var.Q.setDelegate(new h(this, 6));
                dVar3.addView(y5Var.Q, k7.b6.c(48.0f, -2));
                dVar = dVar3;
                break;
            case 14:
                dVar = y5Var.r0(y5Var.getParentActivity());
                break;
            case 15:
                eg.h0 h0Var = new eg.h0(this, y5Var.getParentActivity(), 4);
                h0Var.setTag(-33024);
                dVar = h0Var;
                break;
        }
        return yh.o(dVar, dVar, -1, -2);
    }
}
