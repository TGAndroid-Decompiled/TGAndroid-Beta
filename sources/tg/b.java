package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.web.x1;
import org.telegram.ui.web.y1;
import s4.c1;
import sg.u;
import ug.d0;
import ug.h;
import ug.i;
import ug.l;
import ug.r;
import ug.v;
import ug.w;
import ug.x;
import ug.y;
import xh.i7;
public final class b extends ng.b {
    public final f6 d;
    public vl0 f42145f;
    public u h;
    public u f42146n;
    public r f42147r;
    public u f42148s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap f42149w = new HashMap();

    public b(f6 f6Var) {
        this.d = f6Var;
        y1 y1Var = new y1(this, 9);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new x1(21, messagesStorage, y1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f17195id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f42149w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f17195id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).f14046a == 7) {
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
        return ((a) this.e.get(i10)).f14046a;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j3;
        boolean z11;
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
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
                                    ug.g gVar = (ug.g) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(chat, aVar.f42140i, aVar.f42139g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f42140i, aVar.f42139g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.e;
                                        gVar.f(chat3, aVar.f42140i, aVar.f42139g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f42146n);
                                    return;
                                case 10:
                                    ((h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    ug.u uVar = (ug.u) view;
                                    int i14 = aVar.f42143l;
                                    boolean z12 = aVar.f14047b;
                                    boolean z13 = aVar.f42139g;
                                    List list = (List) aVar.f42138f;
                                    TLRPC.Chat chat4 = this.v;
                                    f4 f4Var = uVar.d;
                                    uVar.f42724r = i14;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i14 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i12 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i12 = R.string.BoostingAllMembers;
                                        }
                                        f4Var.k(LocaleController.formatString(i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i11 = R.string.BoostingNewMembers;
                                        }
                                        f4Var.k(LocaleController.formatString(i11, new Object[0]));
                                    }
                                    uVar.f42678f.a(z12, false);
                                    uVar.setDivider(z13);
                                    uVar.e.setTextColor(j6.v0(j6.f18109n5, uVar.f42675a));
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
                                    TLObject tLObject = aVar.f42144m;
                                    int i15 = aVar.f42140i;
                                    int i16 = aVar.f42141j;
                                    long j10 = aVar.h;
                                    CharSequence charSequence = aVar.f42137c;
                                    boolean z14 = aVar.f42139g;
                                    boolean z15 = aVar.f14047b;
                                    f4 f4Var2 = iVar.d;
                                    iVar.f42698s = tLObject;
                                    if (i15 >= 12) {
                                        f4Var2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        f4Var2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
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
                                    l5 l5Var = iVar.f42697r;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j10 = 0;
                                    }
                                    l5Var.l(billingController2.formatCurrency(j10, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f42678f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f42137c);
                                    int i17 = aVar.f42140i;
                                    o6 o6Var = xVar.f42733r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    o6Var.a();
                                    o6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((ug.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f42138f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f42137c;
                                    boolean z16 = aVar.f14047b;
                                    boolean z17 = aVar.f42139g;
                                    yVar.K = aVar.f42143l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f42140i);
                                    lVar.setAfterTextChangedListener(this.f42148s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f42144m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f42140i;
                                    long j11 = aVar.h;
                                    boolean z18 = aVar.f14047b;
                                    TextView textView = wVar.f42729f;
                                    o6 o6Var2 = wVar.d;
                                    o6 o6Var3 = wVar.e;
                                    if (wVar.f42731r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f42726a.a(z18, z11);
                                    wVar.f42731r = tL_starsGiveawayOption;
                                    if (z11) {
                                        o6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        o6Var2.c(wVar.h, false, true);
                                        o6Var3.c(wVar.f42730n, z11, true);
                                        textView.setText("");
                                    } else {
                                        o6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        o6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f42732s = i19;
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
                        d0Var.setText(aVar.f42137c);
                        d0Var.setBackground(aVar.f42139g);
                        return;
                    }
                    ((m4) view).setText(aVar.f42137c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f42142k;
                int i20 = aVar.f42140i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f42725a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            ug.d dVar = (ug.d) view;
            int i22 = aVar.f42143l;
            int i23 = aVar.f42140i;
            TLRPC.User user = (TLRPC.User) aVar.f42138f;
            boolean z19 = aVar.f14047b;
            w9 w9Var = dVar.f42677c;
            f6 f6Var = dVar.f42675a;
            f4 f4Var3 = dVar.d;
            l5 l5Var2 = dVar.e;
            g9 g9Var = dVar.f42676b;
            if (dVar.f42691r == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f42691r = i22;
            if (i22 == 0) {
                f4Var3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                l5Var2.setTextColor(j6.v0(j6.f18179r5, f6Var));
                g9Var.g(16);
                g9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_bottom, j6.f17892b7));
            } else if (i22 == 1) {
                f4Var3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                l5Var2.setTextColor(j6.v0(j6.f18109n5, f6Var));
                g9Var.g(6);
                g9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_top, j6.f17892b7));
            } else if (i22 == 2) {
                f4Var3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), l5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                l5Var2.setTextColor(j6.v0(j6.f18109n5, f6Var));
                g9Var.g(25);
                g9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_bottom, j6.f17892b7));
            } else if (i22 == 3) {
                f4Var3.k(s8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                l5Var2.setTextColor(j6.v0(j6.f18179r5, f6Var));
                g9Var.g(26);
                g9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_top, j6.f17892b7));
            }
            dVar.f42678f.a(z19, z10);
            w9Var.setImageDrawable(g9Var);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f42147r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f42147r.setStars(aVar.f42139g);
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        i7 i7Var;
        boolean z10;
        Context context = viewGroup.getContext();
        f6 f6Var = this.d;
        switch (i10) {
            case 2:
                i7Var = new ug.d(context, f6Var);
                break;
            case 3:
                i7Var = new View(context);
                break;
            case 4:
                i7Var = new c7(context, j6.v0(j6.f17872a7, f6Var), 0);
                break;
            case 5:
                i7Var = new v(context, f6Var);
                break;
            case 6:
                View m4Var = new m4(context, j6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(j6.v0(j6.f17998h5, f6Var));
                i7Var = m4Var;
                break;
            case 7:
                i7Var = new d0(context, f6Var);
                break;
            case 8:
                i7Var = new ug.b(context, f6Var);
                break;
            case 9:
                i7Var = new ug.g(context, f6Var);
                break;
            case 10:
                i7Var = new h(context, f6Var);
                break;
            case 11:
                ug.c cVar = new ug.c(context, f6Var);
                cVar.f42677c.setVisibility(8);
                i7Var = cVar;
                break;
            case 12:
                i7Var = new i(context, f6Var);
                break;
            case 13:
                View xVar = new x(context, f6Var);
                xVar.setBackgroundColor(j6.v0(j6.f17998h5, f6Var));
                i7Var = xVar;
                break;
            case 14:
                i7Var = new ug.d(context, f6Var);
                break;
            case 15:
                x8 x8Var = new x8(context, f6Var);
                x8Var.setHeight(50);
                i7Var = x8Var;
                break;
            case 16:
                i7Var = new l(context, f6Var);
                break;
            case 17:
                i7Var = new w(context, f6Var);
                break;
            case 18:
                i7 i7Var2 = new i7(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (i7Var2.f45557c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i7Var2.f45557c = -1;
                o6 o6Var = i7Var2.f45555a;
                o6Var.c(string, z10, true);
                int w02 = j6.w0(null, j6.f18126o6, false);
                o6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = i7Var2.f45556b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(wr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                i7Var2.d = false;
                i7Var2.setWillNotDraw(true);
                i7Var = i7Var2;
                break;
            default:
                i7Var = new r(context, f6Var);
                break;
        }
        return e2.j(i7Var, i7Var, -1, -2);
    }
}
