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

public final class wb extends xf.b {
    public int d = -1;

    public int f43685e = -1;

    public final yb f43686f;

    public wb(yb ybVar) {
        this.f43686f = ybVar;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return ((xb) this.f43686f.f44761x.get(o1Var.b())).f49414b;
    }

    @Override
    public final int h() {
        return this.f43686f.f44761x.size();
    }

    @Override
    public final int j(int i10) {
        return ((xb) this.f43686f.f44761x.get(i10)).f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
        yb ybVar = this.f43686f;
        int i13 = ybVar.f44753b;
        TLRPC.Chat chat = ybVar.F;
        ArrayList arrayList = ybVar.f44761x;
        int i14 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i14 == 4) {
            return;
        }
        if (i14 == 1 || i14 == 12) {
            tf.c cVar = (tf.c) view;
            cVar.setTitle(((xb) arrayList.get(i10)).f44368c);
            cVar.c(false);
            if (o1Var.f5793f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i14 == 0) {
            k91 k91Var = (k91) view;
            k91Var.a(Integer.toString(ybVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = ybVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    k91Var.a("≈" + ((int) ybVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.PremiumSubscribers;
                    } else {
                        i12 = R.string.PremiumMembers;
                    }
                    k91Var.a("≈0", 1, "0%", LocaleController.getString(i12));
                }
            } else {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.PremiumSubscribers;
                } else {
                    i12 = R.string.PremiumMembers;
                }
                k91Var.a("≈0", 1, "0%", LocaleController.getString(i12));
            }
            k91Var.a(String.valueOf(ybVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ybVar.d;
            k91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i14 == 5) {
            TL_stories.Boost boost = ((xb) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(boost.user_id));
            hg.b bVar = (hg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((xb) arrayList.get(i10)).f44370f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i14 == 6) {
            ((org.telegram.ui.Cells.x8) view).setText(((xb) arrayList.get(i10)).f44368c);
            return;
        }
        if (i14 == 9) {
            org.telegram.ui.Cells.v4 v4Var = (org.telegram.ui.Cells.v4) view;
            if (ybVar.f44762y == 0) {
                v4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", ybVar.f44759s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                v4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", ybVar.f44760w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i14 == 3) {
            ((org.telegram.ui.Components.i80) view).setLink(((xb) arrayList.get(i10)).f44368c);
            return;
        }
        if (i14 == 11) {
            xb xbVar = (xb) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = xbVar.f44369e;
            boolean z10 = xbVar.f44370f;
            hg.c cVar2 = (hg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i14 == 13) {
            int i15 = this.d;
            int i16 = ybVar.L;
            if (i15 == i16 && this.f43685e == ybVar.K) {
                return;
            }
            this.d = i16;
            this.f43685e = ybVar.K;
            ybVar.f44756f.g();
            ybVar.f44756f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ybVar.L, new Object[0]), null);
            if (MessagesController.getInstance(i13).giveawayGiftsPurchaseAvailable && (i11 = ybVar.K) > 0 && i11 != ybVar.L) {
                ybVar.f44756f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            ybVar.f44756f.setInitialTabId(ybVar.f44762y);
            ybVar.f44756f.c();
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        yb ybVar = this.f43686f;
        org.telegram.ui.ActionBar.c6 c6Var = ybVar.f44755e;
        q91 q91Var = ybVar.f44754c;
        switch (i10) {
            case 0:
                x8Var = new k91(ybVar.getContext(), 2);
                break;
            case 1:
                tf.c cVar = new tf.c(ybVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                x8Var = cVar;
                break;
            case 2:
                x8Var = new org.telegram.ui.Cells.w6(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(ybVar.getContext(), ybVar.f44754c, null, false, false);
                i80Var.d.setVisibility(8);
                i80Var.f29269a.setGravity(17);
                i80Var.h.setVisibility(8);
                i80Var.v.setVisibility(8);
                i80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                x8Var = i80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ybVar.getContext(), R.drawable.filled_limit_boost, 0, ybVar.f44755e, 0);
                limitPreviewView.V = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(ybVar.d, false);
                x8Var = limitPreviewView;
                break;
            case 5:
                x8Var = new hg.b(ybVar.getContext());
                break;
            case 6:
                x8Var = new org.telegram.ui.Cells.x8(viewGroup.getContext(), 20, c6Var);
                break;
            case 7:
                x8Var = new org.telegram.ui.Cells.q3(ybVar.getContext(), 8);
                break;
            case 8:
                ag.d dVar = new ag.d(ybVar.getContext(), 8);
                TextView textView = new TextView(ybVar.getContext());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(ybVar.F) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.f23423y6, null, false, textView, 17);
                dVar.addView(textView, h7.z5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                x8Var = dVar;
                break;
            case 9:
                o5 o5Var = new o5(ybVar.getContext(), 1);
                o5Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                x8Var = o5Var;
                break;
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(ybVar.getContext());
                l8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                l8Var.f24635s = 64;
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                l8Var.e(i11, i11);
                x8Var = l8Var;
                break;
            case 11:
                x8Var = new hg.c(ybVar.getContext());
                break;
            case 12:
                tf.c cVar2 = new tf.c(ybVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                x8Var = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(q91Var.getParentActivity(), c6Var);
                ybVar.f44756f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.g6.Fh;
                int i13 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.H = i12;
                scrollSlidingTextTabStrip.I = i13;
                scrollSlidingTextTabStrip.d();
                ag.y1 y1Var = new ag.y1(this, q91Var.getParentActivity());
                ybVar.f44756f.setDelegate(new g(this, 11));
                y1Var.addView(ybVar.f44756f, h7.z5.c(48.0f, -2));
                x8Var = y1Var;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return org.telegram.ui.Cells.pa.l(x8Var, x8Var, -1, -2);
    }
}
