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
public final class t5 extends bg.c {
    public final a6 d;

    public t5(a6 a6Var) {
        this.d = a6Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return ((z5) this.d.X.get(l1Var.b())).f1831b;
    }

    @Override
    public final int h() {
        return this.d.X.size();
    }

    @Override
    public final int j(int i10) {
        return ((z5) this.d.X.get(i10)).f1830a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        a6 a6Var = this.d;
        int i14 = a6Var.N;
        TLRPC.Chat chat = a6Var.f32470d0;
        ArrayList arrayList = a6Var.X;
        int i15 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    ia1 ia1Var = (ia1) view;
                    ia1Var.a(Integer.toString(a6Var.O.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = a6Var.O.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) a6Var.O.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            ia1Var.a(str, 1, concat, LocaleController.getString(i13));
                            ia1Var.a(String.valueOf(a6Var.O.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a6Var.O;
                            ia1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            ia1Var.setPadding(AndroidUtilities.dp(23.0f), ia1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), ia1Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    ia1Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    ia1Var.a(String.valueOf(a6Var.O.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = a6Var.O;
                    ia1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    ia1Var.setPadding(AndroidUtilities.dp(23.0f), ia1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), ia1Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((z5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    lg.b bVar = (lg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((z5) arrayList.get(i10)).f40398f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    z8Var.setText(((z5) arrayList.get(i10)).f40397c);
                    z8Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (a6Var.Y == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", a6Var.U, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", a6Var.W, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.x80) view).setLink(((z5) arrayList.get(i10)).f40397c);
                    return;
                } else if (i15 == 11) {
                    z5 z5Var = (z5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = z5Var.e;
                    boolean z4 = z5Var.f40398f;
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
                    if (a6Var.Q.getTag() == null || ((Integer) a6Var.Q.getTag()).intValue() != Objects.hash(Integer.valueOf(a6Var.f32476j0), Integer.valueOf(a6Var.f32475i0))) {
                        a6Var.Q.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(a6Var.f32476j0), Integer.valueOf(a6Var.f32475i0))));
                        a6Var.Q.g();
                        a6Var.Q.a(0, LocaleController.formatPluralString("BoostingBoostsCount", a6Var.f32476j0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = a6Var.f32475i0) > 0 && i11 != a6Var.f32476j0) {
                            a6Var.Q.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        a6Var.Q.setInitialTabId(a6Var.Y);
                        a6Var.Q.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            xf.c cVar2 = (xf.c) view;
            cVar2.setTitle(((z5) arrayList.get(i10)).f40397c);
            cVar2.c(false);
            if (l1Var.f5777f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View y6Var;
        dh.d dVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var2;
        a6 a6Var = this.d;
        switch (i10) {
            case 0:
                dVar = new ia1(a6Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                xf.c cVar = new xf.c(a6Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                dVar = cVar;
                break;
            case 2:
                y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), 0, 0);
                dVar = y6Var;
                break;
            case 3:
                org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(a6Var.getParentActivity(), a6Var, null, false, false);
                x80Var.d.setVisibility(8);
                x80Var.f30533a.setGravity(17);
                x80Var.h.setVisibility(8);
                x80Var.v.setVisibility(8);
                x80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                dVar = x80Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                dVar = new lg.b(a6Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                f6Var = ((org.telegram.ui.ActionBar.p2) a6Var).resourceProvider;
                y6Var = new org.telegram.ui.Cells.z8(context, 20, f6Var);
                dVar = y6Var;
                break;
            case 7:
                dVar = new org.telegram.ui.Cells.r3(a6Var.getParentActivity(), 8);
                break;
            case 8:
                dh.d dVar2 = new dh.d(a6Var.getParentActivity(), 7);
                TextView textView = new TextView(a6Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(a6Var.f32470d0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                ai.s(org.telegram.ui.ActionBar.j6.f20256y6, null, false, textView, 17);
                dVar2.addView(textView, k7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                dVar = dVar2;
                break;
            case 9:
                s5 s5Var = new s5(a6Var.getParentActivity(), 0);
                s5Var.a(org.telegram.ui.ActionBar.j6.f20200v6, org.telegram.ui.ActionBar.j6.f20182u6);
                dVar = s5Var;
                break;
            case 10:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(a6Var.getParentActivity());
                n8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                n8Var.f21443s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.f20115q6;
                n8Var.e(i12, i12);
                dVar = n8Var;
                break;
            case 11:
                dVar = new lg.c(a6Var.getParentActivity());
                break;
            case 12:
                xf.c cVar2 = new xf.c(a6Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                dVar = cVar2;
                break;
            case 13:
                Activity parentActivity = a6Var.getParentActivity();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) a6Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, f6Var2);
                a6Var.Q = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.Fh;
                int i14 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.J = i14;
                scrollSlidingTextTabStrip.e();
                ah.e eVar = new ah.e(this, a6Var.getParentActivity());
                a6Var.Q.setDelegate(new h(this, 6));
                eVar.addView(a6Var.Q, k7.b6.c(48.0f, -2));
                dVar = eVar;
                break;
            case 14:
                dVar = a6Var.r0(a6Var.getParentActivity());
                break;
            case 15:
                eg.h0 h0Var = new eg.h0(this, a6Var.getParentActivity(), 4);
                h0Var.setTag(-33024);
                dVar = h0Var;
                break;
        }
        return ai.n(dVar, dVar, -1, -2);
    }
}
