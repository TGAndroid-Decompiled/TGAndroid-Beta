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
public final class vb extends wf.b {
    public int d = -1;
    public int f43420e = -1;
    public final xb f43421f;

    public vb(xb xbVar) {
        this.f43421f = xbVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return ((wb) this.f43421f.f44454x.get(q1Var.b())).f48815b;
    }

    @Override
    public final int h() {
        return this.f43421f.f44454x.size();
    }

    @Override
    public final int j(int i9) {
        return ((wb) this.f43421f.f44454x.get(i9)).f48814a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        String formatString;
        int i11;
        int i12;
        xb xbVar = this.f43421f;
        int i13 = xbVar.f44446b;
        TLRPC.Chat chat = xbVar.F;
        ArrayList arrayList = xbVar.f44454x;
        int i14 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i14 != 4) {
            if (i14 != 1 && i14 != 12) {
                if (i14 == 0) {
                    m91 m91Var = (m91) view;
                    m91Var.a(Integer.toString(xbVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = xbVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) xbVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i12 = R.string.PremiumSubscribers;
                            } else {
                                i12 = R.string.PremiumMembers;
                            }
                            m91Var.a(str, 1, concat, LocaleController.getString(i12));
                            m91Var.a(String.valueOf(xbVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xbVar.d;
                            m91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = R.string.PremiumSubscribers;
                    } else {
                        i11 = R.string.PremiumMembers;
                    }
                    m91Var.a("≈0", 1, "0%", LocaleController.getString(i11));
                    m91Var.a(String.valueOf(xbVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = xbVar.d;
                    m91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i14 == 5) {
                    TL_stories.Boost boost = ((wb) arrayList.get(i9)).d;
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(boost.user_id));
                    gg.b bVar = (gg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.e(user, ContactsController.formatName(user), formatString, !((wb) arrayList.get(i9)).f43719f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i14 == 6) {
                    ((org.telegram.ui.Cells.b9) view).setText(((wb) arrayList.get(i9)).f43717c);
                    return;
                } else if (i14 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (xbVar.f44455y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", xbVar.f44452s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", xbVar.f44453w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i14 == 3) {
                    ((org.telegram.ui.Components.e80) view).setLink(((wb) arrayList.get(i9)).f43717c);
                    return;
                } else if (i14 == 11) {
                    wb wbVar = (wb) arrayList.get(i9);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = wbVar.f43718e;
                    boolean z10 = wbVar.f43719f;
                    gg.c cVar = (gg.c) view;
                    if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
                    } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        cVar.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
                    }
                    cVar.setImage(prepaidGiveaway);
                    cVar.setAvatarPadding(5);
                    return;
                } else if (i14 == 13) {
                    int i15 = this.d;
                    int i16 = xbVar.L;
                    if (i15 != i16 || this.f43420e != xbVar.K) {
                        this.d = i16;
                        this.f43420e = xbVar.K;
                        xbVar.f44449f.g();
                        xbVar.f44449f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", xbVar.L, new Object[0]), null);
                        if (MessagesController.getInstance(i13).giveawayGiftsPurchaseAvailable && (i10 = xbVar.K) > 0 && i10 != xbVar.L) {
                            xbVar.f44449f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i10, new Object[0]), null);
                        }
                        xbVar.f44449f.setInitialTabId(xbVar.f44455y);
                        xbVar.f44449f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            sf.c cVar2 = (sf.c) view;
            cVar2.setTitle(((wb) arrayList.get(i9)).f43717c);
            cVar2.c(false);
            if (q1Var.f5505f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        fh.v vVar;
        int i10;
        xb xbVar = this.f43421f;
        org.telegram.ui.ActionBar.b6 b6Var = xbVar.f44448e;
        s91 s91Var = xbVar.f44447c;
        switch (i9) {
            case 0:
                vVar = new m91(xbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new sf.c(xbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                vVar = cVar;
                break;
            case 2:
                vVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(xbVar.getContext(), xbVar.f44447c, null, false, false);
                e80Var.d.setVisibility(8);
                e80Var.f27967a.setGravity(17);
                e80Var.h.setVisibility(8);
                e80Var.v.setVisibility(8);
                e80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                vVar = e80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(xbVar.getContext(), R.drawable.filled_limit_boost, 0, xbVar.f44448e, 0);
                limitPreviewView.V = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(xbVar.d, false);
                vVar = limitPreviewView;
                break;
            case 5:
                vVar = new gg.b(xbVar.getContext());
                break;
            case 6:
                vVar = new org.telegram.ui.Cells.b9(viewGroup.getContext(), 20, b6Var);
                break;
            case 7:
                vVar = new org.telegram.ui.Cells.t3(xbVar.getContext(), 8);
                break;
            case 8:
                dh.g gVar = new dh.g(xbVar.getContext(), 8);
                TextView textView = new TextView(xbVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(xbVar.F)) {
                    i10 = R.string.NoBoostersHint;
                } else {
                    i10 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i10));
                textView.setTextSize(1, 14.0f);
                j3.r0.w(org.telegram.ui.ActionBar.f6.f23369y6, null, false, textView, 17);
                gVar.addView(textView, g7.e6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                vVar = gVar;
                break;
            case 9:
                n5 n5Var = new n5(xbVar.getContext(), 1);
                n5Var.a(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                vVar = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(xbVar.getContext());
                p8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                p8Var.f24879s = 64;
                int i11 = org.telegram.ui.ActionBar.f6.f23229q6;
                p8Var.e(i11, i11);
                vVar = p8Var;
                break;
            case 11:
                vVar = new gg.c(xbVar.getContext());
                break;
            case 12:
                View cVar2 = new sf.c(xbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                vVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(s91Var.getParentActivity(), b6Var);
                xbVar.f44449f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.f6.Fh;
                int i13 = org.telegram.ui.ActionBar.f6.Eh;
                scrollSlidingTextTabStrip.H = i12;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.d();
                fh.v vVar2 = new fh.v(this, s91Var.getParentActivity());
                xbVar.f44449f.setDelegate(new g(this, 11));
                vVar2.addView(xbVar.f44449f, g7.e6.c(48.0f, -2));
                vVar = vVar2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return j3.r0.s(vVar, vVar, -1, -2);
    }
}
