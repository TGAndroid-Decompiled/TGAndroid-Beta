package ug;

import ai.a6;
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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.web.f2;
import s4.d1;
import tg.t;
import vg.d0;
import vg.i;
import vg.l;
import vg.r;
import vg.u;
import vg.v;
import vg.w;
import vg.x;
import vg.y;
import yh.y6;
public final class b extends og.b {
    public final d6 d;
    public sm0 f48999f;
    public t h;
    public t f49000n;
    public r f49001r;
    public t f49002s;
    public TLRPC.Chat v;
    public ArrayList f48998e = new ArrayList();
    public final HashMap f49003w = new HashMap();

    public b(d6 d6Var) {
        this.d = d6Var;
        q1 q1Var = new q1(this, 16);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new f2(27, messagesStorage, q1Var));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20032id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f49003w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20032id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.f48998e.size(); i10++) {
            if (((a) this.f48998e.get(i10)).f17175a == 7) {
                m(i10);
            }
        }
    }

    @Override
    public final int h() {
        return this.f48998e.size();
    }

    @Override
    public final int j(int i10) {
        return ((a) this.f48998e.get(i10)).f17175a;
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j3;
        boolean z11;
        int i13 = d1Var.f47752f;
        View view = d1Var.f47748a;
        a aVar = (a) this.f48998e.get(i10);
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
                                            gVar.f(chat, aVar.f48993i, aVar.f48992g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f48993i, aVar.f48992g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.f48990e;
                                        gVar.f(chat3, aVar.f48993i, aVar.f48992g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f49000n);
                                    return;
                                case 10:
                                    ((vg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    u uVar = (u) view;
                                    int i14 = aVar.f48996l;
                                    boolean z12 = aVar.f17176b;
                                    boolean z13 = aVar.f48992g;
                                    List list = (List) aVar.f48991f;
                                    TLRPC.Chat chat4 = this.v;
                                    a6 a6Var = uVar.d;
                                    uVar.f49714s = i14;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i14 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i12 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i12 = R.string.BoostingAllMembers;
                                        }
                                        a6Var.k(LocaleController.formatString(i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i11 = R.string.BoostingNewMembers;
                                        }
                                        a6Var.k(LocaleController.formatString(i11, new Object[0]));
                                    }
                                    uVar.f49665f.a(z12, false);
                                    uVar.setDivider(z13);
                                    uVar.f49664e.setTextColor(h6.w0(h6.f20970n5, uVar.f49661a));
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
                                    TLObject tLObject = aVar.f48997m;
                                    int i15 = aVar.f48993i;
                                    int i16 = aVar.f48994j;
                                    long j10 = aVar.h;
                                    CharSequence charSequence = aVar.f48989c;
                                    boolean z14 = aVar.f48992g;
                                    boolean z15 = aVar.f17176b;
                                    a6 a6Var2 = iVar.d;
                                    iVar.v = tLObject;
                                    if (i15 >= 12) {
                                        a6Var2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        a6Var2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
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
                                    h5 h5Var = iVar.f49685s;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j10 = 0;
                                    }
                                    h5Var.l(billingController2.formatCurrency(j10, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f49665f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f48989c);
                                    int i17 = aVar.f48993i;
                                    r6 r6Var = xVar.f49725r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    r6Var.a();
                                    r6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((vg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f48991f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f48989c;
                                    boolean z16 = aVar.f17176b;
                                    boolean z17 = aVar.f48992g;
                                    yVar.K = aVar.f48996l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f48993i);
                                    lVar.setAfterTextChangedListener(this.f49002s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f48997m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f48993i;
                                    long j11 = aVar.h;
                                    boolean z18 = aVar.f17176b;
                                    TextView textView = wVar.f49721f;
                                    r6 r6Var2 = wVar.d;
                                    r6 r6Var3 = wVar.f49720e;
                                    if (wVar.f49723r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f49717a.a(z18, z11);
                                    wVar.f49723r = tL_starsGiveawayOption;
                                    if (z11) {
                                        r6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        r6Var2.c(wVar.h, false, true);
                                        r6Var3.c(wVar.f49722n, z11, true);
                                        textView.setText("");
                                    } else {
                                        r6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        r6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f49724s = i19;
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
                        d0Var.setText(aVar.f48989c);
                        d0Var.setBackground(aVar.f48992g);
                        return;
                    }
                    ((m4) view).setText(aVar.f48989c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f48995k;
                int i20 = aVar.f48993i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f49715a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            vg.d dVar = (vg.d) view;
            int i22 = aVar.f48996l;
            int i23 = aVar.f48993i;
            TLRPC.User user = (TLRPC.User) aVar.f48991f;
            boolean z19 = aVar.f17176b;
            y9 y9Var = dVar.f49663c;
            d6 d6Var = dVar.f49661a;
            a6 a6Var3 = dVar.d;
            h5 h5Var2 = dVar.f49664e;
            j9 j9Var = dVar.f49662b;
            if (dVar.f49679s == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f49679s = i22;
            if (i22 == 0) {
                a6Var3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var2.setTextColor(h6.w0(h6.f21044r5, d6Var));
                j9Var.g(16);
                j9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(h6.W0(dVar.getContext(), R.drawable.greydivider_bottom, h6.f20750b7));
            } else if (i22 == 1) {
                a6Var3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                h5Var2.setTextColor(h6.w0(h6.f20970n5, d6Var));
                j9Var.g(6);
                j9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(h6.W0(dVar.getContext(), R.drawable.greydivider_top, h6.f20750b7));
            } else if (i22 == 2) {
                a6Var3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), h5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                h5Var2.setTextColor(h6.w0(h6.f20970n5, d6Var));
                j9Var.g(25);
                j9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(h6.W0(dVar.getContext(), R.drawable.greydivider_bottom, h6.f20750b7));
            } else if (i22 == 3) {
                a6Var3.k(r8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                h5Var2.setTextColor(h6.w0(h6.f21044r5, d6Var));
                j9Var.g(26);
                j9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(h6.W0(dVar.getContext(), R.drawable.greydivider_top, h6.f20750b7));
            }
            dVar.f49665f.a(z19, z10);
            y9Var.setImageDrawable(j9Var);
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f49001r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f49001r.setStars(aVar.f48992g);
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        y6 y6Var;
        boolean z10;
        Context context = viewGroup.getContext();
        d6 d6Var = this.d;
        switch (i10) {
            case 2:
                y6Var = new vg.d(context, d6Var);
                break;
            case 3:
                y6Var = new View(context);
                break;
            case 4:
                y6Var = new b7(context, h6.w0(h6.f20730a7, d6Var), 0);
                break;
            case 5:
                y6Var = new v(context, d6Var);
                break;
            case 6:
                View m4Var = new m4(context, h6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(h6.w0(h6.f20857h5, d6Var));
                y6Var = m4Var;
                break;
            case 7:
                y6Var = new d0(context, d6Var);
                break;
            case 8:
                y6Var = new vg.b(context, d6Var);
                break;
            case 9:
                y6Var = new vg.g(context, d6Var);
                break;
            case 10:
                y6Var = new vg.h(context, d6Var);
                break;
            case 11:
                vg.c cVar = new vg.c(context, d6Var);
                cVar.f49663c.setVisibility(8);
                y6Var = cVar;
                break;
            case 12:
                y6Var = new i(context, d6Var);
                break;
            case 13:
                View xVar = new x(context, d6Var);
                xVar.setBackgroundColor(h6.w0(h6.f20857h5, d6Var));
                y6Var = xVar;
                break;
            case 14:
                y6Var = new vg.d(context, d6Var);
                break;
            case 15:
                w8 w8Var = new w8(context, d6Var);
                w8Var.setHeight(50);
                y6Var = w8Var;
                break;
            case 16:
                y6Var = new l(context, d6Var);
                break;
            case 17:
                y6Var = new w(context, d6Var);
                break;
            case 18:
                y6 y6Var2 = new y6(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (y6Var2.f53537c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y6Var2.f53537c = -1;
                r6 r6Var = y6Var2.f53535a;
                r6Var.c(string, z10, true);
                int x02 = h6.x0(null, h6.f20989o6, false);
                r6Var.setTextColor(x02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = y6Var2.f53536b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(is.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                y6Var2.d = false;
                y6Var2.setWillNotDraw(true);
                y6Var = y6Var2;
                break;
            default:
                y6Var = new r(context, d6Var);
                break;
        }
        return e2.k(y6Var, y6Var, -1, -2);
    }
}
