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
public final class zb extends bg.c {
    public int d = -1;
    public int e = -1;
    public final bc f40752f;

    public zb(bc bcVar) {
        this.f40752f = bcVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return ((ac) this.f40752f.f32902x.get(l1Var.b())).f1809b;
    }

    @Override
    public final int h() {
        return this.f40752f.f32902x.size();
    }

    @Override
    public final int j(int i10) {
        return ((ac) this.f40752f.f32902x.get(i10)).f1808a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        bc bcVar = this.f40752f;
        int i14 = bcVar.f32895b;
        TLRPC.Chat chat = bcVar.G;
        ArrayList arrayList = bcVar.f32902x;
        int i15 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    aa1 aa1Var = (aa1) view;
                    aa1Var.a(Integer.toString(bcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
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
                            aa1Var.a(str, 1, concat, LocaleController.getString(i13));
                            aa1Var.a(String.valueOf(bcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bcVar.d;
                            aa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    aa1Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    aa1Var.a(String.valueOf(bcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = bcVar.d;
                    aa1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((ac) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    lg.b bVar = (lg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((ac) arrayList.get(i10)).f32515f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.a9) view).setText(((ac) arrayList.get(i10)).f32514c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (bcVar.f32903y == 0) {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", bcVar.f32900s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", bcVar.f32901w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.x80) view).setLink(((ac) arrayList.get(i10)).f32514c);
                    return;
                } else if (i15 == 11) {
                    ac acVar = (ac) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = acVar.e;
                    boolean z4 = acVar.f32515f;
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
                    int i16 = this.d;
                    int i17 = bcVar.M;
                    if (i16 != i17 || this.e != bcVar.L) {
                        this.d = i17;
                        this.e = bcVar.L;
                        bcVar.f32897f.g();
                        bcVar.f32897f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", bcVar.M, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = bcVar.L) > 0 && i11 != bcVar.M) {
                            bcVar.f32897f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        bcVar.f32897f.setInitialTabId(bcVar.f32903y);
                        bcVar.f32897f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            xf.c cVar2 = (xf.c) view;
            cVar2.setTitle(((ac) arrayList.get(i10)).f32514c);
            cVar2.c(false);
            if (l1Var.f5788f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ah.d dVar;
        int i11;
        bc bcVar = this.f40752f;
        org.telegram.ui.ActionBar.f6 f6Var = bcVar.e;
        ga1 ga1Var = bcVar.f32896c;
        switch (i10) {
            case 0:
                dVar = new aa1(bcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new xf.c(bcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                dVar = cVar;
                break;
            case 2:
                dVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(bcVar.getContext(), bcVar.f32896c, null, false, false);
                x80Var.d.setVisibility(8);
                x80Var.f30603a.setGravity(17);
                x80Var.h.setVisibility(8);
                x80Var.v.setVisibility(8);
                x80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                dVar = x80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(bcVar.getContext(), R.drawable.filled_limit_boost, 0, bcVar.e, 0);
                limitPreviewView.W = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(bcVar.d, false);
                dVar = limitPreviewView;
                break;
            case 5:
                dVar = new lg.b(bcVar.getContext());
                break;
            case 6:
                dVar = new org.telegram.ui.Cells.a9(viewGroup.getContext(), 20, f6Var);
                break;
            case 7:
                dVar = new org.telegram.ui.Cells.s3(bcVar.getContext(), 8);
                break;
            case 8:
                dh.d dVar2 = new dh.d(bcVar.getContext(), 9);
                TextView textView = new TextView(bcVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(bcVar.G)) {
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
                q5 q5Var = new q5(bcVar.getContext(), 1);
                q5Var.a(org.telegram.ui.ActionBar.j6.f20225v6, org.telegram.ui.ActionBar.j6.f20207u6);
                dVar = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(bcVar.getContext());
                o8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                o8Var.f21533s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.f20140q6;
                o8Var.e(i12, i12);
                dVar = o8Var;
                break;
            case 11:
                dVar = new lg.c(bcVar.getContext());
                break;
            case 12:
                View cVar2 = new xf.c(bcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                dVar = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(ga1Var.getParentActivity(), f6Var);
                bcVar.f32897f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.Fh;
                int i14 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.J = i14;
                scrollSlidingTextTabStrip.e();
                ah.d dVar3 = new ah.d(this, ga1Var.getParentActivity());
                bcVar.f32897f.setDelegate(new h(this, 11));
                dVar3.addView(bcVar.f32897f, k7.b6.c(48.0f, -2));
                dVar = dVar3;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return yh.o(dVar, dVar, -1, -2);
    }
}
