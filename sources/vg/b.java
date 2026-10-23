package vg;

import ai.sc;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ci.k4;
import com.google.android.gms.internal.play_billing.k3;
import ig.k0;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.w9;
import s4.b1;
import ug.s;
import wg.d0;
import wg.i;
import wg.l;
import wg.r;
import wg.u;
import wg.v;
import wg.w;
import wg.x;
import wg.y;
public final class b extends pg.b {
    public final g6 d;
    public mm0 f48796f;
    public s h;
    public s f48797n;
    public r f48798r;
    public s f48799s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap f48800w = new HashMap();

    public b(g6 g6Var) {
        this.d = g6Var;
        k0 k0Var = new k0(this, 22);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new u2.k0(6, messagesStorage, k0Var));
    }

    @Override
    public final boolean D(b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20343id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f48800w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20343id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).f44713a == 7) {
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
        return ((a) this.e.get(i10)).f44713a;
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j10;
        boolean z11;
        int i13 = b1Var.f46346f;
        View view = b1Var.f46343a;
        a aVar = (a) this.e.get(i10);
        if (i13 != 0) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
            if (i13 != 2) {
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
                                            gVar.f(chat, aVar.f48791i, aVar.f48790g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f48791i, aVar.f48790g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.e;
                                        gVar.f(chat3, aVar.f48791i, aVar.f48790g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f48797n);
                                    return;
                                case 10:
                                    ((wg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    u uVar = (u) view;
                                    int i14 = aVar.f48794l;
                                    boolean z12 = aVar.f44714b;
                                    boolean z13 = aVar.f48790g;
                                    List list = (List) aVar.f48789f;
                                    TLRPC.Chat chat4 = this.v;
                                    k4 k4Var = uVar.d;
                                    uVar.f49450s = i14;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i14 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i12 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i12 = R.string.BoostingAllMembers;
                                        }
                                        k4Var.k(LocaleController.formatString(i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i11 = R.string.BoostingNewMembers;
                                        }
                                        k4Var.k(LocaleController.formatString(i11, new Object[0]));
                                    }
                                    uVar.f49402f.a(z12, false);
                                    uVar.setDivider(z13);
                                    r6.Z(uVar.e, k6.f21365n5, uVar.f49399a);
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
                                    TLObject tLObject = aVar.f48795m;
                                    int i15 = aVar.f48791i;
                                    int i16 = aVar.f48792j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f48788c;
                                    boolean z14 = aVar.f48790g;
                                    boolean z15 = aVar.f44714b;
                                    k4 k4Var2 = iVar.d;
                                    iVar.v = tLObject;
                                    if (i15 >= 12) {
                                        k4Var2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        k4Var2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
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
                                    n5 n5Var = iVar.f49425s;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j11 = 0;
                                    }
                                    n5Var.l(billingController2.formatCurrency(j11, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f49402f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f48788c);
                                    int i17 = aVar.f48791i;
                                    q6 q6Var = xVar.f49460r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    q6Var.a();
                                    q6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((wg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f48789f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f48788c;
                                    boolean z16 = aVar.f44714b;
                                    boolean z17 = aVar.f48790g;
                                    yVar.K = aVar.f48794l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f48791i);
                                    lVar.setAfterTextChangedListener(this.f48799s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f48795m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f48791i;
                                    long j12 = aVar.h;
                                    boolean z18 = aVar.f44714b;
                                    TextView textView = wVar.f49456f;
                                    q6 q6Var2 = wVar.d;
                                    q6 q6Var3 = wVar.e;
                                    if (wVar.f49458r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f49453a.a(z18, z11);
                                    wVar.f49458r = tL_starsGiveawayOption;
                                    if (z11) {
                                        q6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        q6Var2.c(wVar.h, false, true);
                                        q6Var3.c(wVar.f49457n, z11, true);
                                        textView.setText("");
                                    } else {
                                        q6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        q6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j12, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f49459s = i19;
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
                        d0Var.setText(aVar.f48788c);
                        d0Var.setBackground(aVar.f48790g);
                        return;
                    }
                    ((l4) view).setText(aVar.f48788c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f48793k;
                int i20 = aVar.f48791i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f49451a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            wg.d dVar = (wg.d) view;
            int i22 = aVar.f48794l;
            int i23 = aVar.f48791i;
            TLRPC.User user = (TLRPC.User) aVar.f48789f;
            boolean z19 = aVar.f44714b;
            w9 w9Var = dVar.f49401c;
            g6 g6Var = dVar.f49399a;
            k4 k4Var3 = dVar.d;
            n5 n5Var2 = dVar.e;
            h9 h9Var = dVar.f49400b;
            if (dVar.f49415s == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f49415s = i22;
            if (i22 == 0) {
                k4Var3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                r6.Z(n5Var2, k6.f21439r5, g6Var);
                h9Var.g(16);
                h9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                r6.b0(R.drawable.greydivider_bottom, k6.f21145b7, dVar.getContext(), dVar, null);
            } else if (i22 == 1) {
                k4Var3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), n5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                r6.Z(n5Var2, k6.f21365n5, g6Var);
                h9Var.g(6);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                r6.b0(R.drawable.greydivider_top, k6.f21145b7, dVar.getContext(), dVar, null);
            } else if (i22 == 2) {
                k4Var3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), n5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                r6.Z(n5Var2, k6.f21365n5, g6Var);
                h9Var.g(25);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                r6.b0(R.drawable.greydivider_bottom, k6.f21145b7, dVar.getContext(), dVar, null);
            } else if (i22 == 3) {
                k4Var3.k(r8.b(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                r6.Z(n5Var2, k6.f21439r5, g6Var);
                h9Var.g(26);
                h9Var.i(-146917, -625593);
                dVar.setDivider(false);
                r6.b0(R.drawable.greydivider_top, k6.f21145b7, dVar.getContext(), dVar, null);
            }
            dVar.f49402f.a(z19, z10);
            w9Var.setImageDrawable(h9Var);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f48798r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f48798r.setStars(aVar.f48790g);
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        sc scVar;
        boolean z10;
        Context context = viewGroup.getContext();
        g6 g6Var = this.d;
        switch (i10) {
            case 2:
                scVar = new wg.d(context, g6Var);
                break;
            case 3:
                scVar = new View(context);
                break;
            case 4:
                int i11 = k6.f21125a7;
                View b7Var = new b7(context, k6.w0(i11, g6Var), 0);
                r6.i(i11, b7Var, g6Var);
                scVar = b7Var;
                break;
            case 5:
                scVar = new v(context, g6Var);
                break;
            case 6:
                View l4Var = new l4(context, k6.L6, 21, 15, 3, false, false, this.d);
                r6.i(k6.f21254h5, l4Var, g6Var);
                scVar = l4Var;
                break;
            case 7:
                scVar = new d0(context, g6Var);
                break;
            case 8:
                scVar = new wg.b(context, g6Var);
                break;
            case 9:
                scVar = new wg.g(context, g6Var);
                break;
            case 10:
                scVar = new wg.h(context, g6Var);
                break;
            case 11:
                wg.c cVar = new wg.c(context, g6Var);
                cVar.f49401c.setVisibility(8);
                scVar = cVar;
                break;
            case 12:
                scVar = new i(context, g6Var);
                break;
            case 13:
                View xVar = new x(context, g6Var);
                r6.i(k6.f21254h5, xVar, g6Var);
                scVar = xVar;
                break;
            case 14:
                scVar = new wg.d(context, g6Var);
                break;
            case 15:
                w8 w8Var = new w8(context, g6Var);
                w8Var.setHeight(50);
                scVar = w8Var;
                break;
            case 16:
                scVar = new l(context, g6Var);
                break;
            case 17:
                scVar = new w(context, g6Var);
                break;
            case 18:
                sc scVar2 = new sc(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (scVar2.f2176c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                scVar2.f2176c = -1;
                q6 q6Var = scVar2.f2174a;
                q6Var.c(string, z10, true);
                int i12 = k6.f21386o6;
                k6.v0(i12);
                r6.a0(q6Var, i12, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = scVar2.f2175b;
                r6.t(imageView, i12, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(bs.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                scVar2.d = false;
                scVar2.setWillNotDraw(true);
                scVar = scVar2;
                break;
            default:
                scVar = new r(context, g6Var);
                break;
        }
        return k3.l(scVar, scVar, -1, -2);
    }
}
