package vg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bi.j5;
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
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.x9;
import org.telegram.ui.web.b1;
import s4.c1;
import ug.v;
import wg.d0;
import wg.h;
import wg.i;
import wg.l;
import wg.r;
import wg.u;
import wg.w;
import wg.x;
import wg.y;
import zh.e7;
public final class b extends pg.b {
    public final f6 d;
    public ll0 f47823f;
    public v h;
    public v f47824n;
    public r f47825r;
    public v f47826s;
    public TLRPC.Chat v;
    public ArrayList f47822e = new ArrayList();
    public final HashMap f47827w = new HashMap();

    public b(f6 f6Var) {
        this.d = f6Var;
        b1 b1Var = new b1(this, 13);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new ug.r(2, messagesStorage, b1Var));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f45770f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f19896id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f47827w;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f19896id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.f47822e.size(); i10++) {
            if (((a) this.f47822e.get(i10)).f44098a == 7) {
                m(i10);
            }
        }
    }

    @Override
    public final int h() {
        return this.f47822e.size();
    }

    @Override
    public final int j(int i10) {
        return ((a) this.f47822e.get(i10)).f44098a;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j3;
        boolean z11;
        int i13 = c1Var.f45770f;
        View view = c1Var.f45766a;
        a aVar = (a) this.f47822e.get(i10);
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
                                            gVar.f(chat, aVar.f47817i, aVar.f47816g, F(chat));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(chat2, aVar.f47817i, aVar.f47816g, F(chat2));
                                        }
                                    } else {
                                        TLRPC.Chat chat3 = aVar.f47814e;
                                        gVar.f(chat3, aVar.f47817i, aVar.f47816g, F(chat3));
                                    }
                                    gVar.setChatDeleteListener(this.f47824n);
                                    return;
                                case 10:
                                    ((h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    u uVar = (u) view;
                                    int i14 = aVar.f47820l;
                                    boolean z12 = aVar.f44099b;
                                    boolean z13 = aVar.f47816g;
                                    List list = (List) aVar.f47815f;
                                    TLRPC.Chat chat4 = this.v;
                                    j5 j5Var = uVar.d;
                                    uVar.f48589r = i14;
                                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                                    if (i14 == 0) {
                                        if (isChannelAndNotMegaGroup) {
                                            i12 = R.string.BoostingAllSubscribers;
                                        } else {
                                            i12 = R.string.BoostingAllMembers;
                                        }
                                        j5Var.k(LocaleController.formatString(i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (isChannelAndNotMegaGroup) {
                                            i11 = R.string.BoostingNewSubscribers;
                                        } else {
                                            i11 = R.string.BoostingNewMembers;
                                        }
                                        j5Var.k(LocaleController.formatString(i11, new Object[0]));
                                    }
                                    uVar.f48538f.a(z12, false);
                                    uVar.setDivider(z13);
                                    uVar.f48537e.setTextColor(j6.v0(j6.f20872n5, uVar.f48534a));
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
                                    TLObject tLObject = aVar.f47821m;
                                    int i15 = aVar.f47817i;
                                    int i16 = aVar.f47818j;
                                    long j10 = aVar.h;
                                    CharSequence charSequence = aVar.f47813c;
                                    boolean z14 = aVar.f47816g;
                                    boolean z15 = aVar.f44099b;
                                    j5 j5Var2 = iVar.d;
                                    iVar.f48559s = tLObject;
                                    if (i15 >= 12) {
                                        j5Var2.k(LocaleController.formatPluralString("Years", 1, new Object[0]));
                                    } else {
                                        j5Var2.k(LocaleController.formatPluralString("Months", i15, new Object[0]));
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
                                    org.telegram.ui.ActionBar.j5 j5Var3 = iVar.f48558r;
                                    BillingController billingController2 = BillingController.getInstance();
                                    if (i16 <= 0) {
                                        j10 = 0;
                                    }
                                    j5Var3.l(billingController2.formatCurrency(j10, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f48538f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f47813c);
                                    int i17 = aVar.f47817i;
                                    q6 q6Var = xVar.f48599r;
                                    if (i17 > 0) {
                                        str = LocaleController.formatPluralString("BoostingBoostsCountTitle", i17, Integer.valueOf(i17));
                                    }
                                    q6Var.a();
                                    q6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((wg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f47815f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f47813c;
                                    boolean z16 = aVar.f44099b;
                                    boolean z17 = aVar.f47816g;
                                    yVar.K = aVar.f47820l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f47817i);
                                    lVar.setAfterTextChangedListener(this.f47826s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f47821m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i18 = aVar.f47817i;
                                    long j11 = aVar.h;
                                    boolean z18 = aVar.f44099b;
                                    TextView textView = wVar.f48595f;
                                    q6 q6Var2 = wVar.d;
                                    q6 q6Var3 = wVar.f48594e;
                                    if (wVar.f48597r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f48591a.a(z18, z11);
                                    wVar.f48597r = tL_starsGiveawayOption;
                                    if (z11) {
                                        q6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        q6Var2.c(wVar.h, false, true);
                                        q6Var3.c(wVar.f48596n, z11, true);
                                        textView.setText("");
                                    } else {
                                        q6Var2.c(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false, true);
                                        q6Var3.c(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j11, ','), z11, true);
                                        textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i19 = i18 + 1;
                                    wVar.f48598s = i19;
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
                        d0Var.setText(aVar.f47813c);
                        d0Var.setBackground(aVar.f47816g);
                        return;
                    }
                    ((l4) view).setText(aVar.f47813c);
                    return;
                }
                wg.v vVar = (wg.v) view;
                List list2 = aVar.f47819k;
                int i20 = aVar.f47817i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i21 = 0; i21 < list2.size(); i21++) {
                    strArr[i21] = String.valueOf((Integer) list2.get(i21));
                }
                vVar.f48590a.b(i20, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            wg.d dVar = (wg.d) view;
            int i22 = aVar.f47820l;
            int i23 = aVar.f47817i;
            TLRPC.User user = (TLRPC.User) aVar.f47815f;
            boolean z19 = aVar.f44099b;
            x9 x9Var = dVar.f48536c;
            f6 f6Var = dVar.f48534a;
            j5 j5Var4 = dVar.d;
            org.telegram.ui.ActionBar.j5 j5Var5 = dVar.f48537e;
            i9 i9Var = dVar.f48535b;
            if (dVar.f48552r == i22) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f48552r = i22;
            if (i22 == 0) {
                j5Var4.k(LocaleController.getString(R.string.BoostingCreateGiveaway));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                j5Var5.setTextColor(j6.v0(j6.f20942r5, f6Var));
                i9Var.g(16);
                i9Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_bottom, j6.f20654b7));
            } else if (i22 == 1) {
                j5Var4.k(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), j5Var5.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                j5Var5.setTextColor(j6.v0(j6.f20872n5, f6Var));
                i9Var.g(6);
                i9Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_top, j6.f20654b7));
            } else if (i22 == 2) {
                j5Var4.k(LocaleController.getString(R.string.BoostingPremium));
                if (i23 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(Emoji.replaceEmoji(UserObject.getUserName(user), j5Var5.getPaint().getFontMetricsInt(), false)));
                } else if (i23 > 0) {
                    dVar.setSubtitle(dVar.e(LocaleController.formatPluralString("Recipient", i23, new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                j5Var5.setTextColor(j6.v0(j6.f20872n5, f6Var));
                i9Var.g(25);
                i9Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_bottom, j6.f20654b7));
            } else if (i22 == 3) {
                j5Var4.k(r8.a(LocaleController.getString(R.string.BoostingStars)));
                dVar.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                j5Var5.setTextColor(j6.v0(j6.f20942r5, f6Var));
                i9Var.g(26);
                i9Var.i(-146917, -625593);
                dVar.setDivider(false);
                dVar.setBackground(j6.V0(dVar.getContext(), R.drawable.greydivider_top, j6.f20654b7));
            }
            dVar.f48538f.a(z19, z10);
            x9Var.setImageDrawable(i9Var);
            x9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f47825r = rVar;
        rVar.setBoostViaGifsText(this.v);
        this.f47825r.setStars(aVar.f47816g);
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        e7 e7Var;
        boolean z10;
        Context context = viewGroup.getContext();
        f6 f6Var = this.d;
        switch (i10) {
            case 2:
                e7Var = new wg.d(context, f6Var);
                break;
            case 3:
                e7Var = new View(context);
                break;
            case 4:
                e7Var = new a7(context, j6.v0(j6.f20634a7, f6Var), 0);
                break;
            case 5:
                e7Var = new wg.v(context, f6Var);
                break;
            case 6:
                View l4Var = new l4(context, j6.L6, 21, 15, 3, false, false, this.d);
                l4Var.setBackgroundColor(j6.v0(j6.f20761h5, f6Var));
                e7Var = l4Var;
                break;
            case 7:
                e7Var = new d0(context, f6Var);
                break;
            case 8:
                e7Var = new wg.b(context, f6Var);
                break;
            case 9:
                e7Var = new wg.g(context, f6Var);
                break;
            case 10:
                e7Var = new h(context, f6Var);
                break;
            case 11:
                wg.c cVar = new wg.c(context, f6Var);
                cVar.f48536c.setVisibility(8);
                e7Var = cVar;
                break;
            case 12:
                e7Var = new i(context, f6Var);
                break;
            case 13:
                View xVar = new x(context, f6Var);
                xVar.setBackgroundColor(j6.v0(j6.f20761h5, f6Var));
                e7Var = xVar;
                break;
            case 14:
                e7Var = new wg.d(context, f6Var);
                break;
            case 15:
                w8 w8Var = new w8(context, f6Var);
                w8Var.setHeight(50);
                e7Var = w8Var;
                break;
            case 16:
                e7Var = new l(context, f6Var);
                break;
            case 17:
                e7Var = new w(context, f6Var);
                break;
            case 18:
                e7 e7Var2 = new e7(context);
                String string = LocaleController.getString(R.string.NotifyMoreOptions);
                if (e7Var2.f51870c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e7Var2.f51870c = -1;
                q6 q6Var = e7Var2.f51868a;
                q6Var.c(string, z10, true);
                int w02 = j6.w0(null, j6.f20889o6, false);
                q6Var.setTextColor(w02);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN);
                ImageView imageView = e7Var2.f51869b;
                imageView.setColorFilter(porterDuffColorFilter);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(pr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                e7Var2.d = false;
                e7Var2.setWillNotDraw(true);
                e7Var = e7Var2;
                break;
            default:
                e7Var = new r(context, f6Var);
                break;
        }
        return e2.l(e7Var, e7Var, -1, -2);
    }
}
