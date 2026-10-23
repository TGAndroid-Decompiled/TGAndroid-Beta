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
    public final y5 d;

    public s5(y5 y5Var) {
        this.d = y5Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return ((x5) this.d.f43716c0.get(b1Var.b())).f44714b;
    }

    @Override
    public final int h() {
        return this.d.f43716c0.size();
    }

    @Override
    public final int j(int i10) {
        return ((x5) this.d.f43716c0.get(i10)).f44713a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        y5 y5Var = this.d;
        int i14 = y5Var.S;
        TLRPC.Chat chat = y5Var.f43722i0;
        ArrayList arrayList = y5Var.f43716c0;
        int i15 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    o91 o91Var = (o91) view;
                    o91Var.a(Integer.toString(y5Var.T.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = y5Var.T.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) y5Var.T.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            o91Var.a(str, 1, concat, LocaleController.getString(i13));
                            o91Var.a(String.valueOf(y5Var.T.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y5Var.T;
                            o91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            o91Var.setPadding(AndroidUtilities.dp(23.0f), o91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), o91Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    o91Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    o91Var.a(String.valueOf(y5Var.T.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = y5Var.T;
                    o91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    o91Var.setPadding(AndroidUtilities.dp(23.0f), o91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), o91Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((x5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    zg.b bVar = (zg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((x5) arrayList.get(i10)).f43497f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(((x5) arrayList.get(i10)).f43496c);
                    e9Var.setTextColor(org.telegram.ui.ActionBar.k6.o1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (y5Var.f43717d0 == 0) {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", y5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", y5Var.f43715b0, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.r90) view).setLink(((x5) arrayList.get(i10)).f43496c);
                    return;
                } else if (i15 == 11) {
                    x5 x5Var = (x5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = x5Var.e;
                    boolean z10 = x5Var.f43497f;
                    zg.c cVar = (zg.c) view;
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
                    if (y5Var.V.getTag() == null || ((Integer) y5Var.V.getTag()).intValue() != Objects.hash(Integer.valueOf(y5Var.f43727o0), Integer.valueOf(y5Var.f43726n0))) {
                        y5Var.V.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(y5Var.f43727o0), Integer.valueOf(y5Var.f43726n0))));
                        y5Var.V.f();
                        y5Var.V.a(0, LocaleController.formatPluralString("BoostingBoostsCount", y5Var.f43727o0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = y5Var.f43726n0) > 0 && i11 != y5Var.f43727o0) {
                            y5Var.V.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        y5Var.V.setInitialTabId(y5Var.f43717d0);
                        y5Var.V.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            lg.c cVar2 = (lg.c) view;
            cVar2.setTitle(((x5) arrayList.get(i10)).f43496c);
            cVar2.c(false);
            if (b1Var.f46346f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View b7Var;
        ci.h4 h4Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var2;
        y5 y5Var = this.d;
        switch (i10) {
            case 0:
                h4Var = new o91(y5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                lg.c cVar = new lg.c(y5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                h4Var = cVar;
                break;
            case 2:
                b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
                h4Var = b7Var;
                break;
            case 3:
                org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(y5Var.getParentActivity(), y5Var, null, false, false);
                r90Var.d.setVisibility(8);
                r90Var.f30123a.setGravity(17);
                r90Var.h.setVisibility(8);
                r90Var.v.setVisibility(8);
                r90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                h4Var = r90Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                h4Var = new zg.b(y5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                g6Var = ((org.telegram.ui.ActionBar.o2) y5Var).resourceProvider;
                b7Var = new org.telegram.ui.Cells.e9(context, 20, g6Var);
                h4Var = b7Var;
                break;
            case 7:
                h4Var = new org.telegram.ui.Cells.s3(y5Var.getParentActivity(), 8);
                break;
            case 8:
                ci.h4 h4Var2 = new ci.h4(y5Var.getParentActivity(), 7);
                TextView textView = new TextView(y5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(y5Var.f43722i0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                org.telegram.messenger.sl.n(i11, textView, 1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21571y6, null);
                textView.setGravity(17);
                h4Var2.addView(textView, w7.z5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                h4Var = h4Var2;
                break;
            case 9:
                r5 r5Var = new r5(y5Var.getParentActivity(), 0);
                r5Var.a(org.telegram.ui.ActionBar.k6.f21516v6, org.telegram.ui.ActionBar.k6.f21499u6);
                h4Var = r5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(y5Var.getParentActivity());
                r8Var.o(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.f23114s = 64;
                int i12 = org.telegram.ui.ActionBar.k6.q6;
                r8Var.g(i12, i12);
                h4Var = r8Var;
                break;
            case 11:
                h4Var = new zg.c(y5Var.getParentActivity());
                break;
            case 12:
                lg.c cVar2 = new lg.c(y5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                h4Var = cVar2;
                break;
            case 13:
                Activity parentActivity = y5Var.getParentActivity();
                g6Var2 = ((org.telegram.ui.ActionBar.o2) y5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, g6Var2);
                y5Var.V = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.k6.f21118a;
                int i14 = org.telegram.ui.ActionBar.k6.Fh;
                int i15 = org.telegram.ui.ActionBar.k6.Eh;
                int i16 = org.telegram.ui.ActionBar.k6.f21118a;
                scrollSlidingTextTabStrip.L = i14;
                scrollSlidingTextTabStrip.M = i15;
                scrollSlidingTextTabStrip.updateColors();
                ah.v vVar = new ah.v(this, y5Var.getParentActivity());
                y5Var.V.setDelegate(new f(this, 6));
                vVar.addView(y5Var.V, w7.z5.c(48.0f, -2));
                h4Var = vVar;
                break;
            case 14:
                h4Var = y5Var.r0(y5Var.getParentActivity());
                break;
            case 15:
                ai.jc jcVar = new ai.jc(this, y5Var.getParentActivity(), 9);
                jcVar.setTag(-33024);
                h4Var = jcVar;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(h4Var, h4Var, -1, -2);
    }
}
