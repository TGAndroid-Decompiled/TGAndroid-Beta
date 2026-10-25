package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bi.jc;
import di.l4;
import ig.o;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.y9;
import s4.e1;
import vg.u;
import xg.d0;
import xg.i;
import xg.l;
import xg.r;
import xg.v;
import xg.w;
import xg.x;
import xg.y;
public final class b extends qg.b {
    public final u6 d;
    public mm0 f51168f;
    public u h;
    public u f51169n;
    public r f51170r;
    public u f51171s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap f51172w = new HashMap();

    public b(u6 u6Var) {
        this.d = u6Var;
        o oVar = new o(this, 26);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new sg.u(22, messagesStorage, oVar));
    }

    @Override
    public final boolean D(e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22027id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f51172w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f22027id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).f47037a == 7) {
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
        return ((a) this.e.get(i10)).f47037a;
    }

    @Override
    public final void v(e1 e1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j10;
        boolean z11;
        int i13 = e1Var.f47738f;
        View view = e1Var.f47735a;
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
                                    xg.g gVar = (xg.g) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(chat, aVar.f51163i, aVar.f51162g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f51163i, aVar.f51162g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.e;
                                        gVar.f(chat3, aVar.f51163i, aVar.f51162g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f51169n);
                                    return;
                                case 10:
                                    ((xg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    xg.u uVar = (xg.u) view;
                                    int i14 = aVar.f51166l;
                                    boolean z12 = aVar.f47038b;
                                    boolean z13 = aVar.f51162g;
                                    List list = (List) aVar.f51161f;
                                    TLRPC.Chat chat4 = this.v;
                                    l4 l4Var = uVar.d;
                                    uVar.f51809s = i14;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i14 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i12 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i12 = R.string.BoostingAllMembers;
                                        }
                                        l4Var.k(LocaleController.formatString(i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i11 = R.string.BoostingNewMembers;
                                        }
                                        l4Var.k(LocaleController.formatString(i11, new Object[0]));
                                    }
                                    uVar.f51761f.a(z12, false);
                                    uVar.setDivider(z13);
                                    f7.Y(uVar.e, y6.f23537n5, uVar.f51758a);
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
                                    TLObject tLObject = aVar.f51167m;
                                    int i15 = aVar.f51163i;
                                    int i16 = aVar.f51164j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f51160c;
                                    boolean z14 = aVar.f51162g;
                                    boolean z15 = aVar.f47038b;
                                    l4 l4Var2 = iVar.d;
                                    iVar.v = tLObject;
                                    if (i15 >= 12) {
                                        l4Var2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        l4Var2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
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
                                    b6 b6Var = iVar.f51784s;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j11 = 0;
                                    }
                                    b6Var.l(billingController2.formatCurrency(j11, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f51761f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f51160c);
                                    int i17 = aVar.f51163i;
                                    s6 s6Var = xVar.f51819r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    s6Var.a();
                                    s6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((xg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f51161f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f51160c;
                                    boolean z16 = aVar.f47038b;
                                    boolean z17 = aVar.f51162g;
                                    yVar.K = aVar.f51166l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f51163i);
                                    lVar.setAfterTextChangedListener(this.f51171s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f51167m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f51163i;
                                    long j12 = aVar.h;
                                    boolean z18 = aVar.f47038b;
                                    TextView textView = wVar.f51815f;
                                    s6 s6Var2 = wVar.d;
                                    s6 s6Var3 = wVar.e;
                                    if (wVar.f51817r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f51812a.a(z18, z11);
                                    wVar.f51817r = tL_starsGiveawayOption;
                                    if (z11) {
                                        s6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        s6Var2.c(wVar.h, false, true);
                                        s6Var3.c(wVar.f51816n, z11, true);
                                        textView.setText("");
                                    } else {
                                        s6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        s6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j12, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f51818s = i19;
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
                        d0Var.setText(aVar.f51160c);
                        d0Var.setBackground(aVar.f51162g);
                        return;
                    }
                    ((q4) view).setText(aVar.f51160c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f51165k;
                int i20 = aVar.f51163i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f51810a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            xg.d dVar = (xg.d) view;
            int i22 = aVar.f51166l;
            int i23 = aVar.f51163i;
            TLRPC.User user = (TLRPC.User) aVar.f51161f;
            boolean z19 = aVar.f47038b;
            y9 y9Var = dVar.f51760c;
            u6 u6Var = dVar.f51758a;
            l4 l4Var3 = dVar.d;
            b6 b6Var2 = dVar.e;
            j9 j9Var = dVar.f51759b;
            if (dVar.f51774s == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f51774s = i22;
            if (i22 == 0) {
                l4Var3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                f7.Y(b6Var2, y6.f23612r5, u6Var);
                j9Var.g(16);
                j9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                f7.a0(R.drawable.greydivider_bottom, y6.f23316b7, dVar.getContext(), dVar, null);
            } else if (i22 == 1) {
                l4Var3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), b6Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                f7.Y(b6Var2, y6.f23537n5, u6Var);
                j9Var.g(6);
                j9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                f7.a0(R.drawable.greydivider_top, y6.f23316b7, dVar.getContext(), dVar, null);
            } else if (i22 == 2) {
                l4Var3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), b6Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                f7.Y(b6Var2, y6.f23537n5, u6Var);
                j9Var.g(25);
                j9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                f7.a0(R.drawable.greydivider_bottom, y6.f23316b7, dVar.getContext(), dVar, null);
            } else if (i22 == 3) {
                l4Var3.k(v8.b(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                f7.Y(b6Var2, y6.f23612r5, u6Var);
                j9Var.g(26);
                j9Var.i(-146917, -625593);
                dVar.setDivider(false);
                f7.a0(R.drawable.greydivider_top, y6.f23316b7, dVar.getContext(), dVar, null);
            }
            dVar.f51761f.a(z19, z10);
            y9Var.setImageDrawable(j9Var);
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f51170r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f51170r.setStars(aVar.f51162g);
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i10) {
        jc jcVar;
        boolean z10;
        Context context = viewGroup.getContext();
        u6 u6Var = this.d;
        switch (i10) {
            case 2:
                jcVar = new xg.d(context, u6Var);
                break;
            case 3:
                jcVar = new View(context);
                break;
            case 4:
                int i11 = y6.f23297a7;
                View f7Var = new org.telegram.ui.Cells.f7(context, y6.w0(i11, u6Var), 0);
                f7.i(i11, f7Var, u6Var);
                jcVar = f7Var;
                break;
            case 5:
                jcVar = new v(context, u6Var);
                break;
            case 6:
                View q4Var = new q4(context, y6.L6, 21, 15, 3, false, false, this.d);
                f7.i(y6.f23425h5, q4Var, u6Var);
                jcVar = q4Var;
                break;
            case 7:
                jcVar = new d0(context, u6Var);
                break;
            case 8:
                jcVar = new xg.b(context, u6Var);
                break;
            case 9:
                jcVar = new xg.g(context, u6Var);
                break;
            case 10:
                jcVar = new xg.h(context, u6Var);
                break;
            case 11:
                xg.c cVar = new xg.c(context, u6Var);
                cVar.f51760c.setVisibility(8);
                jcVar = cVar;
                break;
            case 12:
                jcVar = new i(context, u6Var);
                break;
            case 13:
                View xVar = new x(context, u6Var);
                f7.i(y6.f23425h5, xVar, u6Var);
                jcVar = xVar;
                break;
            case 14:
                jcVar = new xg.d(context, u6Var);
                break;
            case 15:
                a9 a9Var = new a9(context, u6Var);
                a9Var.setHeight(50);
                jcVar = a9Var;
                break;
            case 16:
                jcVar = new l(context, u6Var);
                break;
            case 17:
                jcVar = new w(context, u6Var);
                break;
            case 18:
                jc jcVar2 = new jc(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (jcVar2.f4918c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jcVar2.f4918c = -1;
                s6 s6Var = jcVar2.f4916a;
                s6Var.c(string, z10, true);
                int i12 = y6.f23558o6;
                y6.v0(i12);
                f7.Z(s6Var, i12, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = jcVar2.f4917b;
                f7.t(imageView, i12, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(ds.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                jcVar2.d = false;
                jcVar2.setWillNotDraw(true);
                jcVar = jcVar2;
                break;
            default:
                jcVar = new r(context, u6Var);
                break;
        }
        return ic.a.n(jcVar, jcVar, -1, -2);
    }
}
