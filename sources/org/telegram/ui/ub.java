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
public final class ub extends zf.b {
    public int d = -1;
    public int f43212e = -1;
    public final wb f43213f;

    public ub(wb wbVar) {
        this.f43213f = wbVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return ((vb) this.f43213f.f43925x.get(n1Var.b())).f50846b;
    }

    @Override
    public final int h() {
        return this.f43213f.f43925x.size();
    }

    @Override
    public final int j(int i10) {
        return ((vb) this.f43213f.f43925x.get(i10)).f50845a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        String formatString;
        int i12;
        int i13;
        wb wbVar = this.f43213f;
        int i14 = wbVar.f43917b;
        TLRPC.Chat chat = wbVar.F;
        ArrayList arrayList = wbVar.f43925x;
        int i15 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i15 != 4) {
            if (i15 != 1 && i15 != 12) {
                if (i15 == 0) {
                    n91 n91Var = (n91) view;
                    n91Var.a(Integer.toString(wbVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                    TL_stats.TL_statsPercentValue tL_statsPercentValue = wbVar.d.premium_audience;
                    if (tL_statsPercentValue != null) {
                        double d = tL_statsPercentValue.total;
                        if (d != 0.0d) {
                            String str = "≈" + ((int) wbVar.d.premium_audience.part);
                            String concat = String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%");
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                i13 = R.string.PremiumSubscribers;
                            } else {
                                i13 = R.string.PremiumMembers;
                            }
                            n91Var.a(str, 1, concat, LocaleController.getString(i13));
                            n91Var.a(String.valueOf(wbVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wbVar.d;
                            n91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                            return;
                        }
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    n91Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                    n91Var.a(String.valueOf(wbVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = wbVar.d;
                    n91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                } else if (i15 == 5) {
                    TL_stories.Boost boost = ((vb) arrayList.get(i10)).d;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(boost.user_id));
                    jg.b bVar = (jg.b) view;
                    if (boost.multiplier > 1) {
                        formatString = LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires));
                    } else {
                        formatString = LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires));
                    }
                    bVar.d(user, ContactsController.formatName(user), formatString, !((vb) arrayList.get(i10)).f43496f);
                    bVar.setStatus(boost);
                    bVar.setAvatarPadding(5);
                    return;
                } else if (i15 == 6) {
                    ((org.telegram.ui.Cells.y8) view).setText(((vb) arrayList.get(i10)).f43494c);
                    return;
                } else if (i15 == 9) {
                    org.telegram.ui.Cells.w4 w4Var = (org.telegram.ui.Cells.w4) view;
                    if (wbVar.f43926y == 0) {
                        w4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", wbVar.f43923s, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    } else {
                        w4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", wbVar.f43924w, new Object[0]), R.drawable.arrow_more, 5, false);
                        return;
                    }
                } else if (i15 == 3) {
                    ((org.telegram.ui.Components.r80) view).setLink(((vb) arrayList.get(i10)).f43494c);
                    return;
                } else if (i15 == 11) {
                    vb vbVar = (vb) arrayList.get(i10);
                    TL_stories.PrepaidGiveaway prepaidGiveaway = vbVar.f43495e;
                    boolean z10 = vbVar.f43496f;
                    jg.c cVar = (jg.c) view;
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
                    int i16 = this.d;
                    int i17 = wbVar.L;
                    if (i16 != i17 || this.f43212e != wbVar.K) {
                        this.d = i17;
                        this.f43212e = wbVar.K;
                        wbVar.f43920f.g();
                        wbVar.f43920f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", wbVar.L, new Object[0]), null);
                        if (MessagesController.getInstance(i14).giveawayGiftsPurchaseAvailable && (i11 = wbVar.K) > 0 && i11 != wbVar.L) {
                            wbVar.f43920f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                        }
                        wbVar.f43920f.setInitialTabId(wbVar.f43926y);
                        wbVar.f43920f.c();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            vf.c cVar2 = (vf.c) view;
            cVar2.setTitle(((vb) arrayList.get(i10)).f43494c);
            cVar2.c(false);
            if (n1Var.f6436f == 12) {
                cVar2.setPadding(AndroidUtilities.dp(3.0f), cVar2.getPaddingTop(), cVar2.getPaddingRight(), cVar2.getPaddingBottom());
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        bg.d1 d1Var;
        int i11;
        wb wbVar = this.f43213f;
        org.telegram.ui.ActionBar.c6 c6Var = wbVar.f43919e;
        t91 t91Var = wbVar.f43918c;
        switch (i10) {
            case 0:
                d1Var = new n91(wbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new vf.c(wbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                d1Var = cVar;
                break;
            case 2:
                d1Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(wbVar.getContext(), wbVar.f43918c, null, false, false);
                r80Var.d.setVisibility(8);
                r80Var.f32231a.setGravity(17);
                r80Var.h.setVisibility(8);
                r80Var.v.setVisibility(8);
                r80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                d1Var = r80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(wbVar.getContext(), R.drawable.filled_limit_boost, 0, wbVar.f43919e, 0);
                limitPreviewView.V = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(wbVar.d, false);
                d1Var = limitPreviewView;
                break;
            case 5:
                d1Var = new jg.b(wbVar.getContext());
                break;
            case 6:
                d1Var = new org.telegram.ui.Cells.y8(viewGroup.getContext(), 20, c6Var);
                break;
            case 7:
                d1Var = new org.telegram.ui.Cells.q3(wbVar.getContext(), 8);
                break;
            case 8:
                bh.d dVar = new bh.d(wbVar.getContext(), 10);
                TextView textView = new TextView(wbVar.getContext());
                if (ChatObject.isChannelAndNotMegaGroup(wbVar.F)) {
                    i11 = R.string.NoBoostersHint;
                } else {
                    i11 = R.string.NoBoostersGroupHint;
                }
                textView.setText(LocaleController.getString(i11));
                textView.setTextSize(1, 14.0f);
                th.s(org.telegram.ui.ActionBar.g6.f23433y6, null, false, textView, 17);
                dVar.addView(textView, i7.f6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                d1Var = dVar;
                break;
            case 9:
                o5 o5Var = new o5(wbVar.getContext(), 1);
                o5Var.a(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
                d1Var = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(wbVar.getContext());
                m8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                m8Var.f24715s = 64;
                int i12 = org.telegram.ui.ActionBar.g6.q6;
                m8Var.e(i12, i12);
                d1Var = m8Var;
                break;
            case 11:
                d1Var = new jg.c(wbVar.getContext());
                break;
            case 12:
                View cVar2 = new vf.c(wbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                d1Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(t91Var.getParentActivity(), c6Var);
                wbVar.f43920f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.g6.Fh;
                int i14 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.H = i13;
                scrollSlidingTextTabStrip.I = i14;
                scrollSlidingTextTabStrip.e();
                bg.d1 d1Var2 = new bg.d1(this, t91Var.getParentActivity());
                wbVar.f43920f.setDelegate(new h(this, 11));
                d1Var2.addView(wbVar.f43920f, i7.f6.c(48.0f, -2));
                d1Var = d1Var2;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return th.m(d1Var, d1Var, -1, -2);
    }
}
