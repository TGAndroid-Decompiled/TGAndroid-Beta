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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.web.g2;
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
import yh.e7;
public final class b extends og.b {
    public final e6 d;
    public yl0 f44041f;
    public u h;
    public u f44042n;
    public r f44043r;
    public u f44044s;
    public TLRPC.Chat v;
    public ArrayList e = new ArrayList();
    public final HashMap f44045w = new HashMap();

    public b(e6 e6Var) {
        this.d = e6Var;
        q1 q1Var = new q1(this, 16);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new g2(23, messagesStorage, q1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18329id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f44045w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f18329id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).f15754a == 7) {
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
        return ((a) this.e.get(i10)).f15754a;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j3;
        boolean z11;
        int i13 = c1Var.f43008f;
        View view = c1Var.f43005a;
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
                                    vg.g gVar = (vg.g) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(chat, aVar.f44036i, aVar.f44035g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f44036i, aVar.f44035g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.e;
                                        gVar.f(chat3, aVar.f44036i, aVar.f44035g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f44042n);
                                    return;
                                case 10:
                                    ((vg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    vg.u uVar = (vg.u) view;
                                    int i14 = aVar.f44039l;
                                    boolean z12 = aVar.f15755b;
                                    boolean z13 = aVar.f44035g;
                                    List list = (List) aVar.f44034f;
                                    TLRPC.Chat chat4 = this.v;
                                    z5 z5Var = uVar.d;
                                    uVar.f44683r = i14;
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
                                    uVar.f44637f.a(z12, false);
                                    uVar.setDivider(z13);
                                    uVar.e.setTextColor(i6.v0(i6.f19241n5, uVar.f44634a));
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
                                    TLObject tLObject = aVar.f44040m;
                                    int i15 = aVar.f44036i;
                                    int i16 = aVar.f44037j;
                                    long j10 = aVar.h;
                                    CharSequence charSequence = aVar.f44033c;
                                    boolean z14 = aVar.f44035g;
                                    boolean z15 = aVar.f15755b;
                                    z5 z5Var2 = iVar.d;
                                    iVar.f44657s = tLObject;
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
                                    j5 j5Var = iVar.f44656r;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j10 = 0;
                                    }
                                    j5Var.l(billingController2.formatCurrency(j10, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f44637f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f44033c);
                                    int i17 = aVar.f44036i;
                                    p6 p6Var = xVar.f44692r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    p6Var.a();
                                    p6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((vg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f44034f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f44033c;
                                    boolean z16 = aVar.f15755b;
                                    boolean z17 = aVar.f44035g;
                                    yVar.K = aVar.f44039l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f44036i);
                                    lVar.setAfterTextChangedListener(this.f44044s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f44040m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f44036i;
                                    long j11 = aVar.h;
                                    boolean z18 = aVar.f15755b;
                                    TextView textView = wVar.f44688f;
                                    p6 p6Var2 = wVar.d;
                                    p6 p6Var3 = wVar.e;
                                    if (wVar.f44690r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f44685a.a(z18, z11);
                                    wVar.f44690r = tL_starsGiveawayOption;
                                    if (z11) {
                                        p6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        p6Var2.c(wVar.h, false, true);
                                        p6Var3.c(wVar.f44689n, z11, true);
                                        textView.setText("");
                                    } else {
                                        p6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        p6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f44691s = i19;
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
                        d0Var.setText(aVar.f44033c);
                        d0Var.setBackground(aVar.f44035g);
                        return;
                    }
                    ((m4) view).setText(aVar.f44033c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f44038k;
                int i20 = aVar.f44036i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f44684a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            vg.d dVar = (vg.d) view;
            int i22 = aVar.f44039l;
            int i23 = aVar.f44036i;
            TLRPC.User user = (TLRPC.User) aVar.f44034f;
            boolean z19 = aVar.f15755b;
            w9 w9Var = dVar.f44636c;
            e6 e6Var = dVar.f44634a;
            z5 z5Var3 = dVar.d;
            j5 j5Var2 = dVar.e;
            h9 h9Var = dVar.f44635b;
            if (dVar.f44650r == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f44650r = i22;
            if (i22 == 0) {
                z5Var3.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                j5Var2.setTextColor(i6.v0(i6.f19315r5, e6Var));
                h9Var.g(16);
                h9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(i6.V0(dVar.getContext(), R.drawable.greydivider_bottom, i6.f19021b7));
            } else if (i22 == 1) {
                z5Var3.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), j5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                j5Var2.setTextColor(i6.v0(i6.f19241n5, e6Var));
                h9Var.g(6);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(i6.V0(dVar.getContext(), R.drawable.greydivider_top, i6.f19021b7));
            } else if (i22 == 2) {
                z5Var3.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), j5Var2.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                j5Var2.setTextColor(i6.v0(i6.f19241n5, e6Var));
                h9Var.g(25);
                h9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(i6.V0(dVar.getContext(), R.drawable.greydivider_bottom, i6.f19021b7));
            } else if (i22 == 3) {
                z5Var3.k(r8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                j5Var2.setTextColor(i6.v0(i6.f19315r5, e6Var));
                h9Var.g(26);
                h9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(i6.V0(dVar.getContext(), R.drawable.greydivider_top, i6.f19021b7));
            }
            dVar.f44637f.a(z19, z10);
            w9Var.setImageDrawable(h9Var);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f44043r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f44043r.setStars(aVar.f44035g);
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        e7 e7Var;
        boolean z10;
        Context context = viewGroup.getContext();
        e6 e6Var = this.d;
        switch (i10) {
            case 2:
                e7Var = new vg.d(context, e6Var);
                break;
            case 3:
                e7Var = new View(context);
                break;
            case 4:
                e7Var = new b7(context, i6.v0(i6.f19001a7, e6Var), 0);
                break;
            case 5:
                e7Var = new v(context, e6Var);
                break;
            case 6:
                View m4Var = new m4(context, i6.L6, 21, 15, 3, false, false, this.d);
                m4Var.setBackgroundColor(i6.v0(i6.f19128h5, e6Var));
                e7Var = m4Var;
                break;
            case 7:
                e7Var = new d0(context, e6Var);
                break;
            case 8:
                e7Var = new vg.b(context, e6Var);
                break;
            case 9:
                e7Var = new vg.g(context, e6Var);
                break;
            case 10:
                e7Var = new vg.h(context, e6Var);
                break;
            case 11:
                vg.c cVar = new vg.c(context, e6Var);
                cVar.f44636c.setVisibility(8);
                e7Var = cVar;
                break;
            case 12:
                e7Var = new i(context, e6Var);
                break;
            case 13:
                View xVar = new x(context, e6Var);
                xVar.setBackgroundColor(i6.v0(i6.f19128h5, e6Var));
                e7Var = xVar;
                break;
            case 14:
                e7Var = new vg.d(context, e6Var);
                break;
            case 15:
                w8 w8Var = new w8(context, e6Var);
                w8Var.setHeight(50);
                e7Var = w8Var;
                break;
            case 16:
                e7Var = new l(context, e6Var);
                break;
            case 17:
                e7Var = new w(context, e6Var);
                break;
            case 18:
                e7 e7Var2 = new e7(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (e7Var2.f47395c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e7Var2.f47395c = -1;
                p6 p6Var = e7Var2.f47393a;
                p6Var.c(string, z10, true);
                int w02 = i6.w0(null, i6.f19259o6, false);
                p6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = e7Var2.f47394b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(sr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                e7Var2.d = false;
                e7Var2.setWillNotDraw(true);
                e7Var = e7Var2;
                break;
            default:
                e7Var = new r(context, e6Var);
                break;
        }
        return e2.k(e7Var, e7Var, -1, -2);
    }
}
