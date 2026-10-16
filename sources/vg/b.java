package vg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bi.l5;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ji.p1;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.z9;
import s4.b1;
import ug.u;
import wg.d0;
import wg.i;
import wg.l;
import wg.r;
import wg.v;
import wg.w;
import wg.x;
import wg.y;
import zh.y6;
public final class b extends pg.b {
    public final c6 d;
    public mm0 f46962f;
    public u h;
    public u f46963n;
    public r f46964r;
    public u f46965s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap f46966w = new HashMap();

    public b(c6 c6Var) {
        this.d = c6Var;
        p1 p1Var = new p1(this, 16);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new s9.b(13, messagesStorage, p1Var));
    }

    @Override
    public final boolean D(b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18916id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f46966w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f18916id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).f42904a == 7) {
                m(i10);
            }
        }
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final int j(int i10) {
        return ((a) this.e.get(i10)).f42904a;
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j10;
        boolean z11;
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        a aVar = (a) this.e.get(i10);
        if (i13 != 0) {
            if (i13 != 2) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
                if (i13 != 5) {
                    if (i13 != 6) {
                        if (i13 != 7) {
                            String str = "";
                            switch (i13) {
                                case 9:
                                    wg.g gVar = (wg.g) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(chat, aVar.f46957i, aVar.f46956g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f46957i, aVar.f46956g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.e;
                                        gVar.f(chat3, aVar.f46957i, aVar.f46956g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f46963n);
                                    return;
                                case 10:
                                    ((wg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    wg.u uVar = (wg.u) view;
                                    int i14 = aVar.f46960l;
                                    boolean z12 = aVar.f42905b;
                                    boolean z13 = aVar.f46956g;
                                    List list = (List) aVar.f46955f;
                                    TLRPC.Chat chat4 = this.v;
                                    l5 l5Var = uVar.d;
                                    uVar.f47611s = i14;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i14 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i12 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i12 = R.string.BoostingAllMembers;
                                        }
                                        l5Var.k(LocaleController.formatString(i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i11 = R.string.BoostingNewMembers;
                                        }
                                        l5Var.k(LocaleController.formatString(i11, new Object[0]));
                                    }
                                    uVar.f47567f.a(z12, false);
                                    uVar.setDivider(z13);
                                    uVar.e.setTextColor(g6.w0(g6.f19783n5, uVar.f47564a));
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
                                    TLObject tLObject = aVar.f46961m;
                                    int i15 = aVar.f46957i;
                                    int i16 = aVar.f46958j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f46954c;
                                    boolean z14 = aVar.f46956g;
                                    boolean z15 = aVar.f42905b;
                                    l5 l5Var2 = iVar.d;
                                    iVar.v = tLObject;
                                    if (i15 >= 12) {
                                        l5Var2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        l5Var2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    BillingController billingController = BillingController.getInstance();
                                    if (i16 > 0) {
                                        j10 = j11 / i16;
                                    } else {
                                        j10 = j11;
                                    }
                                    sb2.append(billingController.formatCurrency(j10, charSequence.toString()));
                                    sb2.append(" x ");
                                    sb2.append(i16);
                                    iVar.setSubtitle(sb2.toString());
                                    h5 h5Var = iVar.f47586s;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j11 = 0;
                                    }
                                    h5Var.l(billingController2.formatCurrency(j11, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f47567f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f46954c);
                                    int i17 = aVar.f46957i;
                                    s6 s6Var = xVar.f47621r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    s6Var.a();
                                    s6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((wg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f46955f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f46954c;
                                    boolean z16 = aVar.f42905b;
                                    boolean z17 = aVar.f46956g;
                                    yVar.K = aVar.f46960l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f46957i);
                                    lVar.setAfterTextChangedListener(this.f46965s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f46961m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f46957i;
                                    long j12 = aVar.h;
                                    boolean z18 = aVar.f42905b;
                                    TextView textView = wVar.f47617f;
                                    s6 s6Var2 = wVar.d;
                                    s6 s6Var3 = wVar.e;
                                    if (wVar.f47619r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f47614a.a(z18, z11);
                                    wVar.f47619r = tL_starsGiveawayOption;
                                    if (z11) {
                                        s6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        s6Var2.c(wVar.h, false, true);
                                        s6Var3.c(wVar.f47618n, z11, true);
                                        textView.setText("");
                                    } else {
                                        s6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        s6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j12, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f47620s = i19;
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
                        d0Var.setText(aVar.f46954c);
                        d0Var.setBackground(aVar.f46956g);
                        return;
                    }
                    ((m4) view).setText(aVar.f46954c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f46959k;
                int i20 = aVar.f46957i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f47612a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            wg.d dVar = (wg.d) view;
            int i22 = aVar.f46960l;
            int i23 = aVar.f46957i;
            TLRPC.User user = (TLRPC.User) aVar.f46955f;
            boolean z19 = aVar.f42905b;
            z9 z9Var = dVar.f47566c;
            c6 c6Var = dVar.f47564a;
            l5 l5Var3 = dVar.d;
            h5 h5Var2 = dVar.e;
            k9 k9Var = dVar.f47565b;
            if (dVar.f47580s == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f47580s = i22;
            if (i22 == 0) {
                l5Var3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var2.setTextColor(g6.w0(g6.f19857r5, c6Var));
                k9Var.g(16);
                k9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(g6.W0(dVar.getContext(), R.drawable.greydivider_bottom, g6.f19563b7));
            } else if (i22 == 1) {
                l5Var3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                h5Var2.setTextColor(g6.w0(g6.f19783n5, c6Var));
                k9Var.g(6);
                k9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(g6.W0(dVar.getContext(), R.drawable.greydivider_top, g6.f19563b7));
            } else if (i22 == 2) {
                l5Var3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                h5Var2.setTextColor(g6.w0(g6.f19783n5, c6Var));
                k9Var.g(25);
                k9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(g6.W0(dVar.getContext(), R.drawable.greydivider_bottom, g6.f19563b7));
            } else if (i22 == 3) {
                l5Var3.k(r8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var2.setTextColor(g6.w0(g6.f19857r5, c6Var));
                k9Var.g(26);
                k9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(g6.W0(dVar.getContext(), R.drawable.greydivider_top, g6.f19563b7));
            }
            dVar.f47567f.a(z19, z10);
            z9Var.setImageDrawable(k9Var);
            z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f46964r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f46964r.setStars(aVar.f46956g);
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        y6 y6Var;
        boolean z10;
        Context context = viewGroup.getContext();
        c6 c6Var = this.d;
        switch (i10) {
            case 2:
                y6Var = new wg.d(context, c6Var);
                break;
            case 3:
                y6Var = new View(context);
                break;
            case 4:
                y6Var = new a7(context, g6.w0(g6.f19543a7, c6Var), 0);
                break;
            case 5:
                y6Var = new v(context, c6Var);
                break;
            case 6:
                View m4Var = new m4(context, g6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(g6.w0(g6.f19672h5, c6Var));
                y6Var = m4Var;
                break;
            case 7:
                y6Var = new d0(context, c6Var);
                break;
            case 8:
                y6Var = new wg.b(context, c6Var);
                break;
            case 9:
                y6Var = new wg.g(context, c6Var);
                break;
            case 10:
                y6Var = new wg.h(context, c6Var);
                break;
            case 11:
                wg.c cVar = new wg.c(context, c6Var);
                cVar.f47566c.setVisibility(8);
                y6Var = cVar;
                break;
            case 12:
                y6Var = new i(context, c6Var);
                break;
            case 13:
                View xVar = new x(context, c6Var);
                xVar.setBackgroundColor(g6.w0(g6.f19672h5, c6Var));
                y6Var = xVar;
                break;
            case 14:
                y6Var = new wg.d(context, c6Var);
                break;
            case 15:
                w8 w8Var = new w8(context, c6Var);
                w8Var.setHeight(50);
                y6Var = w8Var;
                break;
            case 16:
                y6Var = new l(context, c6Var);
                break;
            case 17:
                y6Var = new w(context, c6Var);
                break;
            case 18:
                y6 y6Var2 = new y6(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (y6Var2.f51342c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y6Var2.f51342c = -1;
                s6 s6Var = y6Var2.f51340a;
                s6Var.c(string, z10, true);
                int x02 = g6.x0(null, g6.f19804o6, false);
                s6Var.setTextColor(x02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = y6Var2.f51341b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(es.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                y6Var2.d = false;
                y6Var2.setWillNotDraw(true);
                y6Var = y6Var2;
                break;
            default:
                y6Var = new r(context, c6Var);
                break;
        }
        return k3.l(y6Var, y6Var, -1, -2);
    }
}
