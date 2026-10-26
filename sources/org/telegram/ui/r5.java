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
public final class r5 extends qg.b {
    public final x5 d;

    public r5(x5 x5Var) {
        this.d = x5Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return ((w5) this.d.f45645c0.get(e1Var.b())).f47041b;
    }

    @Override
    public final int h() {
        return this.d.f45645c0.size();
    }

    @Override
    public final int j(int i10) {
        return ((w5) this.d.f45645c0.get(i10)).f47040a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        x5 x5Var = this.d;
        int i14 = x5Var.S;
        TLRPC.Chat chat = x5Var.f45651i0;
        ArrayList arrayList = x5Var.f45645c0;
        int i15 = e1Var.f47741f;
        View view = e1Var.f47738a;
        if (i15 != 4 && i15 != 14 && i15 != 15) {
            if (i15 != 1 && i15 != 12 && i15 != 16) {
                if (i15 == 0) {
                    q91 q91Var = (q91) view;
                    q91Var.a(Integer.toString(x5Var.T.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = x5Var.T.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) x5Var.T.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            q91Var.a(str, 1, concat, LocaleController.getString(i13));
                            q91Var.a(String.valueOf(x5Var.T.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = x5Var.T;
                            q91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            q91Var.setPadding(AndroidUtilities.dp(23.0f), q91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), q91Var.getPaddingBottom());
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    q91Var.a("~0", 1, "0%", LocaleController.getString(i12));
                    q91Var.a(String.valueOf(x5Var.T.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = x5Var.T;
                    q91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    q91Var.setPadding(AndroidUtilities.dp(23.0f), q91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), q91Var.getPaddingBottom());
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((w5) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    ah.b bVar = (ah.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((w5) arrayList.get(i10)).f44980f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                    i9Var.setText(((w5) arrayList.get(i10)).f44979c);
                    i9Var.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.875f, -1));
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
                    if (x5Var.f45646d0 == 0) {
                        c5Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", x5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        c5Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", x5Var.f45644b0, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.r90) view).setLink(((w5) arrayList.get(i10)).f44979c);
                    return;
                } else if (i15 == 11) {
                    w5 w5Var = (w5) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = w5Var.e;
                    boolean z10 = w5Var.f44980f;
                    ah.c cVar = (ah.c) view;
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
                    if (x5Var.V.getTag() == null || ((Integer) x5Var.V.getTag()).intValue() != Objects.hash(Integer.valueOf(x5Var.f45656o0), Integer.valueOf(x5Var.f45655n0))) {
                        x5Var.V.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(x5Var.f45656o0), Integer.valueOf(x5Var.f45655n0))));
                        x5Var.V.f();
                        x5Var.V.a(0, LocaleController.formatPluralString("BoostingBoostsCount", x5Var.f45656o0, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = x5Var.f45655n0) > 0 && i11 != x5Var.f45656o0) {
                            x5Var.V.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        x5Var.V.setInitialTabId(x5Var.f45646d0);
                        x5Var.V.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            mg.c cVar2 = (mg.c) view;
            cVar2.setTitle(((w5) arrayList.get(i10)).f44979c);
            cVar2.c(false);
            if (e1Var.f47741f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View f7Var;
        di.i4 i4Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var2;
        x5 x5Var = this.d;
        switch (i10) {
            case 0:
                i4Var = new q91(x5Var.getParentActivity(), 2);
                break;
            case 1:
            case 16:
                mg.c cVar = new mg.c(x5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                i4Var = cVar;
                break;
            case 2:
                f7Var = new org.telegram.ui.Cells.f7(viewGroup.getContext(), 0, 0);
                i4Var = f7Var;
                break;
            case 3:
                org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(x5Var.getParentActivity(), x5Var, null, false, false);
                r90Var.d.setVisibility(8);
                r90Var.f32170a.setGravity(17);
                r90Var.h.setVisibility(8);
                r90Var.v.setVisibility(8);
                r90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                i4Var = r90Var;
                break;
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                i4Var = new ah.b(x5Var.getParentActivity());
                break;
            case 6:
                Context context = viewGroup.getContext();
                u6Var = ((org.telegram.ui.ActionBar.r2) x5Var).resourceProvider;
                f7Var = new org.telegram.ui.Cells.i9(context, 20, u6Var);
                i4Var = f7Var;
                break;
            case 7:
                i4Var = new org.telegram.ui.Cells.x3(x5Var.getParentActivity(), 8);
                break;
            case 8:
                di.i4 i4Var2 = new di.i4(x5Var.getParentActivity(), 7);
                TextView textView = new TextView(x5Var.getParentActivity());
                if (ChatObject.isChannelAndNotMegaGroup(x5Var.f45651i0)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                d3.o(i11, textView, 1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23748y6, null);
                textView.setGravity(17);
                i4Var2.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                i4Var = i4Var2;
                break;
            case 9:
                q5 q5Var = new q5(x5Var.getParentActivity(), 0);
                q5Var.a(org.telegram.ui.ActionBar.y6.f23692v6, org.telegram.ui.ActionBar.y6.f23673u6);
                i4Var = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(x5Var.getParentActivity());
                v8Var.o(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                v8Var.f25599s = 64;
                int i12 = org.telegram.ui.ActionBar.y6.f23597q6;
                v8Var.g(i12, i12);
                i4Var = v8Var;
                break;
            case 11:
                i4Var = new ah.c(x5Var.getParentActivity());
                break;
            case 12:
                mg.c cVar2 = new mg.c(x5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                i4Var = cVar2;
                break;
            case 13:
                Activity parentActivity = x5Var.getParentActivity();
                u6Var2 = ((org.telegram.ui.ActionBar.r2) x5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, u6Var2);
                x5Var.V = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.y6.f23292a;
                int i14 = org.telegram.ui.ActionBar.y6.Fh;
                int i15 = org.telegram.ui.ActionBar.y6.Eh;
                int i16 = org.telegram.ui.ActionBar.y6.f23292a;
                scrollSlidingTextTabStrip.L = i14;
                scrollSlidingTextTabStrip.M = i15;
                scrollSlidingTextTabStrip.updateColors();
                bh.p pVar = new bh.p(this, x5Var.getParentActivity());
                x5Var.V.setDelegate(new f(this, 6));
                pVar.addView(x5Var.V, org.telegram.ui.Components.gb1.g(48.0f, -2));
                i4Var = pVar;
                break;
            case 14:
                i4Var = x5Var.k0(x5Var.getParentActivity());
                break;
            case 15:
                bi.cc ccVar = new bi.cc(this, x5Var.getParentActivity(), 9);
                ccVar.setTag(-33024);
                i4Var = ccVar;
                break;
        }
        return ic.a.n(i4Var, i4Var, -1, -2);
    }
}
