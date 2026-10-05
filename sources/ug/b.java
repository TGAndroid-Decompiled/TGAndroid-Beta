package ug;

import ai.z5;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import ii.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.web.x1;
import s4.c1;
import tg.u;
import vg.d0;
import vg.i;
import vg.l;
import vg.r;
import vg.v;
import vg.w;
import vg.x;
import vg.y;
import yh.h7;
public final class b extends og.b {
    public final d6 d;
    public zl0 f47654f;
    public u h;
    public u f47655n;
    public r f47656r;
    public u f47657s;
    public TLRPC.Chat v;
    public ArrayList f47653e = new ArrayList();
    public final HashMap f47658w = new HashMap();

    public b(d6 d6Var) {
        this.d = d6Var;
        q1 q1Var = new q1(this, 16);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new x1(26, messagesStorage, q1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f46542f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20047id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f47658w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20047id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.f47653e.size(); i10++) {
            if (((a) this.f47653e.get(i10)).f17192a == 7) {
                m(i10);
            }
        }
    }

    @Override
    public final int h() {
        return this.f47653e.size();
    }

    @Override
    public final int j(int i10) {
        return ((a) this.f47653e.get(i10)).f17192a;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j3;
        boolean z11;
        int i13 = c1Var.f46542f;
        View view = c1Var.f46538a;
        a aVar = (a) this.f47653e.get(i10);
        if (i13 != 0) {
            if (i13 != 2) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
                if (i13 != 5) {
                    if (i13 != 6) {
                        if (i13 != 7) {
                            String str = "";
                            switch (i13) {
                                case 9:
                                    vg.g gVar = (vg.g) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(chat, aVar.f47648i, aVar.f47647g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f47648i, aVar.f47647g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.f47645e;
                                        gVar.f(chat3, aVar.f47648i, aVar.f47647g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f47655n);
                                    return;
                                case 10:
                                    ((vg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    vg.u uVar = (vg.u) view;
                                    int i14 = aVar.f47651l;
                                    boolean z12 = aVar.f17193b;
                                    boolean z13 = aVar.f47647g;
                                    List list = (List) aVar.f47646f;
                                    TLRPC.Chat chat4 = this.v;
                                    z5 z5Var = uVar.d;
                                    uVar.f48346r = i14;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i14 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i12 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i12 = R.string.BoostingAllMembers;
                                        }
                                        z5Var.k(LocaleController.formatString(i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i11 = R.string.BoostingNewMembers;
                                        }
                                        z5Var.k(LocaleController.formatString(i11, new Object[0]));
                                    }
                                    uVar.f48295f.a(z12, false);
                                    uVar.setDivider(z13);
                                    uVar.f48294e.setTextColor(i6.v0(i6.f21012n5, uVar.f48291a));
                                    if (list.size() == 0) {
                                        uVar.setSubtitle(uVar.e(LocaleController.getString(R.string.BoostingFromAllCountries)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            uVar.setSubtitle(uVar.e(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            uVar.setSubtitle(uVar.e(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            uVar.setSubtitle(uVar.e(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        uVar.setSubtitle(uVar.e(LocaleController.formatPluralString("BoostingFromCountriesCount", list.size(), new Object[0])));
                                        return;
                                    }
                                case 12:
                                    i iVar = (i) view;
                                    TLObject tLObject = aVar.f47652m;
                                    int i15 = aVar.f47648i;
                                    int i16 = aVar.f47649j;
                                    long j10 = aVar.h;
                                    CharSequence charSequence = aVar.f47644c;
                                    boolean z14 = aVar.f47647g;
                                    boolean z15 = aVar.f17193b;
                                    z5 z5Var2 = iVar.d;
                                    iVar.f48316s = tLObject;
                                    if (i15 >= 12) {
                                        z5Var2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        z5Var2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    BillingController billingController = BillingController.getInstance();
                                    if (i16 > 0) {
                                        j3 = j10 / i16;
                                    } else {
                                        j3 = j10;
                                    }
                                    sb2.append(billingController.formatCurrency(j3, charSequence.toString()));
                                    sb2.append(" x ");
                                    sb2.append(i16);
                                    iVar.setSubtitle(sb2.toString());
                                    i5 i5Var = iVar.f48315r;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j10 = 0;
                                    }
                                    i5Var.l(billingController2.formatCurrency(j10, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f48295f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f47644c);
                                    int i17 = aVar.f47648i;
                                    p6 p6Var = xVar.f48356r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    p6Var.a();
                                    p6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((vg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f47646f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f47644c;
                                    boolean z16 = aVar.f17193b;
                                    boolean z17 = aVar.f47647g;
                                    yVar.K = aVar.f47651l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f47648i);
                                    lVar.setAfterTextChangedListener(this.f47657s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f47652m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f47648i;
                                    long j11 = aVar.h;
                                    boolean z18 = aVar.f17193b;
                                    TextView textView = wVar.f48352f;
                                    p6 p6Var2 = wVar.d;
                                    p6 p6Var3 = wVar.f48351e;
                                    if (wVar.f48354r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f48348a.a(z18, z11);
                                    wVar.f48354r = tL_starsGiveawayOption;
                                    if (z11) {
                                        p6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        p6Var2.c(wVar.h, false, true);
                                        p6Var3.c(wVar.f48353n, z11, true);
                                        textView.setText("");
                                    } else {
                                        p6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        p6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f48355s = i19;
                                    if (!z11) {
                                        wVar.v.d(i19, true);
                                    }
                                    wVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        d0 d0Var = (d0) view;
                        d0Var.setText(aVar.f47644c);
                        d0Var.setBackground(aVar.f47647g);
                        return;
                    }
                    ((m4) view).setText(aVar.f47644c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f47650k;
                int i20 = aVar.f47648i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f48347a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            vg.d dVar = (vg.d) view;
            int i22 = aVar.f47651l;
            int i23 = aVar.f47648i;
            TLRPC.User user = (TLRPC.User) aVar.f47646f;
            boolean z19 = aVar.f17193b;
            w9 w9Var = dVar.f48293c;
            d6 d6Var = dVar.f48291a;
            z5 z5Var3 = dVar.d;
            i5 i5Var2 = dVar.f48294e;
            h9 h9Var = dVar.f48292b;
            if (dVar.f48309r == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f48309r = i22;
            if (i22 == 0) {
                z5Var3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                i5Var2.setTextColor(i6.v0(i6.f21086r5, d6Var));
                h9Var.g(16);
                h9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(i6.V0(dVar.getContext(), R.drawable.greydivider_bottom, i6.f20791b7));
            } else if (i22 == 1) {
                z5Var3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), i5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                i5Var2.setTextColor(i6.v0(i6.f21012n5, d6Var));
                h9Var.g(6);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(i6.V0(dVar.getContext(), R.drawable.greydivider_top, i6.f20791b7));
            } else if (i22 == 2) {
                z5Var3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), i5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                i5Var2.setTextColor(i6.v0(i6.f21012n5, d6Var));
                h9Var.g(25);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(i6.V0(dVar.getContext(), R.drawable.greydivider_bottom, i6.f20791b7));
            } else if (i22 == 3) {
                z5Var3.k(r8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                i5Var2.setTextColor(i6.v0(i6.f21086r5, d6Var));
                h9Var.g(26);
                h9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(i6.V0(dVar.getContext(), R.drawable.greydivider_top, i6.f20791b7));
            }
            dVar.f48295f.a(z19, z10);
            w9Var.setImageDrawable(h9Var);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f47656r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f47656r.setStars(aVar.f47647g);
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        h7 h7Var;
        boolean z10;
        Context context = viewGroup.getContext();
        d6 d6Var = this.d;
        switch (i10) {
            case 2:
                h7Var = new vg.d(context, d6Var);
                break;
            case 3:
                h7Var = new View(context);
                break;
            case 4:
                h7Var = new b7(context, i6.v0(i6.f20771a7, d6Var), 0);
                break;
            case 5:
                h7Var = new v(context, d6Var);
                break;
            case 6:
                View m4Var = new m4(context, i6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(i6.v0(i6.f20899h5, d6Var));
                h7Var = m4Var;
                break;
            case 7:
                h7Var = new d0(context, d6Var);
                break;
            case 8:
                h7Var = new vg.b(context, d6Var);
                break;
            case 9:
                h7Var = new vg.g(context, d6Var);
                break;
            case 10:
                h7Var = new vg.h(context, d6Var);
                break;
            case 11:
                vg.c cVar = new vg.c(context, d6Var);
                cVar.f48293c.setVisibility(8);
                h7Var = cVar;
                break;
            case 12:
                h7Var = new i(context, d6Var);
                break;
            case 13:
                View xVar = new x(context, d6Var);
                xVar.setBackgroundColor(i6.v0(i6.f20899h5, d6Var));
                h7Var = xVar;
                break;
            case 14:
                h7Var = new vg.d(context, d6Var);
                break;
            case 15:
                w8 w8Var = new w8(context, d6Var);
                w8Var.setHeight(50);
                h7Var = w8Var;
                break;
            case 16:
                h7Var = new l(context, d6Var);
                break;
            case 17:
                h7Var = new w(context, d6Var);
                break;
            case 18:
                h7 h7Var2 = new h7(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (h7Var2.f51440c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h7Var2.f51440c = -1;
                p6 p6Var = h7Var2.f51438a;
                p6Var.c(string, z10, true);
                int w02 = i6.w0(null, i6.f21030o6, false);
                p6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = h7Var2.f51439b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(tr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                h7Var2.d = false;
                h7Var2.setWillNotDraw(true);
                h7Var = h7Var2;
                break;
            default:
                h7Var = new r(context, d6Var);
                break;
        }
        return e2.k(h7Var, h7Var, -1, -2);
    }
}
