package vg;

import ai.rc;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ci.l4;
import com.google.android.gms.internal.play_billing.k3;
import ig.l0;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.w9;
import s4.b1;
import u2.j0;
import ug.t;
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
    public final d6 d;
    public jm0 f48358f;
    public t h;
    public t f48359n;
    public r f48360r;
    public t f48361s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap f48362w = new HashMap();

    public b(d6 d6Var) {
        this.d = d6Var;
        l0 l0Var = new l0(this, 22);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new j0(6, messagesStorage, l0Var));
    }

    @Override
    public final boolean D(b1 b1Var) {
        int i10 = b1Var.f45924f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20280id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f48362w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20280id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).f44300a == 7) {
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
        return ((a) this.e.get(i10)).f44300a;
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j10;
        boolean z11;
        int i13 = b1Var.f45924f;
        View view = b1Var.f45921a;
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
                                            gVar.f(chat, aVar.f48353i, aVar.f48352g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f48353i, aVar.f48352g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.e;
                                        gVar.f(chat3, aVar.f48353i, aVar.f48352g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f48359n);
                                    return;
                                case 10:
                                    ((wg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    u uVar = (u) view;
                                    int i14 = aVar.f48356l;
                                    boolean z12 = aVar.f44301b;
                                    boolean z13 = aVar.f48352g;
                                    List list = (List) aVar.f48351f;
                                    TLRPC.Chat chat4 = this.v;
                                    l4 l4Var = uVar.d;
                                    uVar.f49008s = i14;
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
                                    uVar.f48964f.a(z12, false);
                                    uVar.setDivider(z13);
                                    uVar.e.setTextColor(h6.w0(h6.f21176n5, uVar.f48961a));
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
                                    TLObject tLObject = aVar.f48357m;
                                    int i15 = aVar.f48353i;
                                    int i16 = aVar.f48354j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f48350c;
                                    boolean z14 = aVar.f48352g;
                                    boolean z15 = aVar.f44301b;
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
                                    j5 j5Var = iVar.f48983s;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j11 = 0;
                                    }
                                    j5Var.l(billingController2.formatCurrency(j11, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f48964f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f48350c);
                                    int i17 = aVar.f48353i;
                                    q6 q6Var = xVar.f49018r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    q6Var.a();
                                    q6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((wg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f48351f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f48350c;
                                    boolean z16 = aVar.f44301b;
                                    boolean z17 = aVar.f48352g;
                                    yVar.K = aVar.f48356l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f48353i);
                                    lVar.setAfterTextChangedListener(this.f48361s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f48357m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f48353i;
                                    long j12 = aVar.h;
                                    boolean z18 = aVar.f44301b;
                                    TextView textView = wVar.f49014f;
                                    q6 q6Var2 = wVar.d;
                                    q6 q6Var3 = wVar.e;
                                    if (wVar.f49016r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f49011a.a(z18, z11);
                                    wVar.f49016r = tL_starsGiveawayOption;
                                    if (z11) {
                                        q6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        q6Var2.c(wVar.h, false, true);
                                        q6Var3.c(wVar.f49015n, z11, true);
                                        textView.setText("");
                                    } else {
                                        q6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        q6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j12, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f49017s = i19;
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
                        d0Var.setText(aVar.f48350c);
                        d0Var.setBackground(aVar.f48352g);
                        return;
                    }
                    ((org.telegram.ui.Cells.l4) view).setText(aVar.f48350c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f48355k;
                int i20 = aVar.f48353i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f49009a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            wg.d dVar = (wg.d) view;
            int i22 = aVar.f48356l;
            int i23 = aVar.f48353i;
            TLRPC.User user = (TLRPC.User) aVar.f48351f;
            boolean z19 = aVar.f44301b;
            w9 w9Var = dVar.f48963c;
            d6 d6Var = dVar.f48961a;
            l4 l4Var3 = dVar.d;
            j5 j5Var2 = dVar.e;
            h9 h9Var = dVar.f48962b;
            if (dVar.f48977s == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f48977s = i22;
            if (i22 == 0) {
                l4Var3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                j5Var2.setTextColor(h6.w0(h6.f21250r5, d6Var));
                h9Var.g(16);
                h9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(h6.W0(dVar.getContext(), R.drawable.greydivider_bottom, h6.f20956b7));
            } else if (i22 == 1) {
                l4Var3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), j5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                j5Var2.setTextColor(h6.w0(h6.f21176n5, d6Var));
                h9Var.g(6);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(h6.W0(dVar.getContext(), R.drawable.greydivider_top, h6.f20956b7));
            } else if (i22 == 2) {
                l4Var3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), j5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                j5Var2.setTextColor(h6.w0(h6.f21176n5, d6Var));
                h9Var.g(25);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(h6.W0(dVar.getContext(), R.drawable.greydivider_bottom, h6.f20956b7));
            } else if (i22 == 3) {
                l4Var3.k(q8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                j5Var2.setTextColor(h6.w0(h6.f21250r5, d6Var));
                h9Var.g(26);
                h9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(h6.W0(dVar.getContext(), R.drawable.greydivider_top, h6.f20956b7));
            }
            dVar.f48964f.a(z19, z10);
            w9Var.setImageDrawable(h9Var);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f48360r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f48360r.setStars(aVar.f48352g);
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        rc rcVar;
        boolean z10;
        Context context = viewGroup.getContext();
        d6 d6Var = this.d;
        switch (i10) {
            case 2:
                rcVar = new wg.d(context, d6Var);
                break;
            case 3:
                rcVar = new View(context);
                break;
            case 4:
                rcVar = new z6(context, h6.w0(h6.f20936a7, d6Var), 0);
                break;
            case 5:
                rcVar = new v(context, d6Var);
                break;
            case 6:
                View l4Var = new org.telegram.ui.Cells.l4(context, h6.L6, 21, 15, 3, false, false, this.d);
                l4Var.setBackgroundColor(h6.w0(h6.f21065h5, d6Var));
                rcVar = l4Var;
                break;
            case 7:
                rcVar = new d0(context, d6Var);
                break;
            case 8:
                rcVar = new wg.b(context, d6Var);
                break;
            case 9:
                rcVar = new wg.g(context, d6Var);
                break;
            case 10:
                rcVar = new wg.h(context, d6Var);
                break;
            case 11:
                wg.c cVar = new wg.c(context, d6Var);
                cVar.f48963c.setVisibility(8);
                rcVar = cVar;
                break;
            case 12:
                rcVar = new i(context, d6Var);
                break;
            case 13:
                View xVar = new x(context, d6Var);
                xVar.setBackgroundColor(h6.w0(h6.f21065h5, d6Var));
                rcVar = xVar;
                break;
            case 14:
                rcVar = new wg.d(context, d6Var);
                break;
            case 15:
                v8 v8Var = new v8(context, d6Var);
                v8Var.setHeight(50);
                rcVar = v8Var;
                break;
            case 16:
                rcVar = new l(context, d6Var);
                break;
            case 17:
                rcVar = new w(context, d6Var);
                break;
            case 18:
                rc rcVar2 = new rc(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (rcVar2.f2134c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rcVar2.f2134c = -1;
                q6 q6Var = rcVar2.f2132a;
                q6Var.c(string, z10, true);
                int x02 = h6.x0(null, h6.f21197o6, false);
                q6Var.setTextColor(x02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = rcVar2.f2133b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(bs.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                rcVar2.d = false;
                rcVar2.setWillNotDraw(true);
                rcVar = rcVar2;
                break;
            default:
                rcVar = new r(context, d6Var);
                break;
        }
        return k3.l(rcVar, rcVar, -1, -2);
    }
}
