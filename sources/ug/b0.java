package ug;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.c5;
import bi.x5;
import com.google.android.gms.internal.vision.e2;
import di.kd;
import fi.k3;
import fi.v4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.t2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.in0;
import org.telegram.ui.x20;
import rg.p2;
import sg.o1;
import zh.e7;
import zh.s5;
public final class b0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f47096a0;
    public final TLRPC.Chat f47097b0;
    public final ArrayList f47098c0;
    public final ArrayList f47099d0;
    public final ArrayList f47100e0;
    public final ArrayList f47101f0;
    public vg.b f47102g0;
    public int f47103h0;
    public int f47104i0;
    public int f47105j0;
    public boolean f47106k0;
    public int f47107l0;
    public long m0;
    public int f47108n0;
    public int f47109o0;
    public long f47110p0;
    public final wg.a f47111q0;
    public o0.a f47112r0;
    public int f47113s0;
    public k f47114t0;
    public final TL_stories.PrepaidGiveaway f47115u0;
    public String f47116v0;
    public boolean f47117w0;
    public boolean f47118x0;
    public final u f47119y0;

    public b0(n2 n2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(n2Var, false);
        List asList;
        List asList2;
        this.X = new ArrayList();
        if (t.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Y = asList;
        if (t.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Z = asList2;
        this.f47096a0 = Arrays.asList(750, 10000, 50000);
        this.f47098c0 = new ArrayList();
        this.f47099d0 = new ArrayList();
        this.f47100e0 = new ArrayList();
        this.f47101f0 = new ArrayList();
        int i10 = wg.d.f48551s;
        this.f47103h0 = 2;
        this.f47104i0 = 0;
        int i11 = wg.u.f48588s;
        this.f47105j0 = 0;
        this.f47107l0 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i12 = calendar.get(12);
        while (i12 % 5 != 0) {
            i12++;
        }
        calendar.set(12, i12);
        this.m0 = calendar.getTimeInMillis();
        this.f47108n0 = 2;
        this.f47109o0 = 2;
        this.f47116v0 = "";
        this.f47118x0 = true;
        this.f47119y0 = new u(this, 0);
        this.f47115u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        N();
        ((ViewGroup.MarginLayoutParams) this.f24674e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f24674e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = wg.d.f48551s;
            this.f47103h0 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(pr.h);
        jVar.C = false;
        jVar.f45805m = false;
        this.d.setItemAnimator(jVar);
        ll0 ll0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new x5(23, this, n2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f47097b0 = chat;
        vg.b bVar = this.f47102g0;
        ArrayList arrayList = this.X;
        ll0 ll0Var2 = this.d;
        v vVar = new v(this);
        v vVar2 = new v(this);
        v vVar3 = new v(this);
        bVar.f47822e = arrayList;
        bVar.v = chat;
        bVar.f47823f = ll0Var2;
        bVar.h = vVar;
        bVar.f47824n = vVar2;
        bVar.f47826s = vVar3;
        a0(false, false);
        wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
        this.f47111q0 = aVar;
        aVar.setOnClickListener(new ir(this, prepaidGiveaway, j3, n2Var));
        Z(false);
        this.containerView.addView(aVar, w7.x5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        t.j(this.currentAccount, chat, new w(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, n2 n2Var) {
        boolean z10;
        String str;
        int i10;
        boolean z11;
        String str2;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j10;
        ArrayList arrayList = b0Var.f47100e0;
        ArrayList arrayList2 = b0Var.f47098c0;
        TLRPC.Chat chat = b0Var.f47097b0;
        ArrayList arrayList3 = b0Var.f47099d0;
        ArrayList arrayList4 = b0Var.f47101f0;
        wg.a aVar = b0Var.f47111q0;
        if (!aVar.f48523a.N) {
            if (b0Var.Y()) {
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                } else {
                    tL_prepaidStarsGiveaway = null;
                }
                if (tL_prepaidStarsGiveaway != null) {
                    j10 = tL_prepaidStarsGiveaway.stars;
                } else {
                    j10 = 0;
                }
                t2 t2Var = new t2(b0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j3, j10, 8);
                n2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    b2 b2Var = alertDialog$Builder.f20225a;
                    b2Var.R = string;
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new p2(t2Var, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(8));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i11 = b0Var.f47103h0;
            int i12 = wg.d.f48551s;
            String str3 = "inapp";
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(b0Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption W = b0Var.W(b0Var.f47110p0);
                    int U = b0Var.U();
                    if (W != null) {
                        aVar.f48523a.setLoading(true);
                        int i13 = b0Var.f47105j0;
                        int i14 = wg.u.f48588s;
                        if (i13 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        s5 y3 = s5.y(b0Var.currentAccount, false);
                        int l4 = t.l(b0Var.m0);
                        boolean z12 = b0Var.f47118x0;
                        boolean z13 = b0Var.f47117w0;
                        String str4 = b0Var.f47116v0;
                        bi.f0 f0Var = new bi.f0(21, b0Var, W);
                        int i15 = y3.f52597a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            n2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                s5.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                s5.e0(findActivity, null);
                                return;
                            }
                        }
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                        Activity activity = findActivity;
                        tL_inputStorePaymentStarsGiveaway.stars = W.stars;
                        MessagesController.getInstance(i15);
                        tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj = arrayList2.get(i16);
                                i16++;
                                ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                MessagesController.getInstance(i15);
                                arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                            }
                        }
                        int size2 = arrayList.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            Object obj2 = arrayList.get(i17);
                            i17++;
                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
                        }
                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                        }
                        if (z13) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                            tL_inputStorePaymentStarsGiveaway.prize_description = str4;
                        }
                        tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i15).getNextRandomId();
                        tL_inputStorePaymentStarsGiveaway.until_date = l4;
                        tL_inputStorePaymentStarsGiveaway.currency = W.currency;
                        tL_inputStorePaymentStarsGiveaway.amount = W.amount;
                        tL_inputStorePaymentStarsGiveaway.users = U;
                        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str2 = W.store_product) != null) {
                            ?? obj3 = new Object();
                            obj3.f4369b = "inapp";
                            obj3.f4368a = str2;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(obj3.a()), new a1.d(y3, f0Var, tL_inputStorePaymentStarsGiveaway, activity, 22));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = k3.p(s5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new c5(y3, f0Var, tL_inputInvoiceStars, 26));
                    }
                }
            } else if (b0Var.f47104i0 == 1) {
                ArrayList b10 = t.b(arrayList3.size(), arrayList4);
                for (int i18 = 0; i18 < b10.size(); i18++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                    if (tL_premiumGiftCodeOption.months == b0Var.f47107l0 && arrayList3.size() > 0) {
                        if (t.h()) {
                            Context context = b0Var.getContext();
                            f6 f6Var = b0Var.resourcesProvider;
                            if (tL_premiumGiftCodeOption.store_product == null) {
                                ArrayList arrayList6 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i19 = 0;
                                while (i19 < size3) {
                                    Object obj4 = arrayList4.get(i19);
                                    i19++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                        arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                    }
                                }
                                String join = TextUtils.join(", ", arrayList6);
                                int i20 = tL_premiumGiftCodeOption.users;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, f6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                b2 b2Var2 = alertDialog$Builder2.f20225a;
                                b2Var2.R = string2;
                                b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i20, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new t0.a(5));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        t.k(arrayList3, tL_premiumGiftCodeOption, b0Var.f47097b0, null, n2Var, new w(b0Var, 0), new w(b0Var, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = t.b(b0Var.U(), arrayList4);
                int i21 = 0;
                while (i21 < b11.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                    if (tL_premiumGiftCodeOption3.months == b0Var.f47107l0) {
                        if (t.h()) {
                            List list = b0Var.Y;
                            Context context2 = b0Var.getContext();
                            f6 f6Var2 = b0Var.resourcesProvider;
                            w wVar = new w(b0Var, 2);
                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                ArrayList arrayList7 = new ArrayList();
                                int size4 = arrayList4.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    Object obj5 = arrayList4.get(i22);
                                    i22++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                        arrayList7.add(tL_premiumGiftCodeOption4);
                                    }
                                }
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                int size5 = arrayList7.size();
                                int i23 = 0;
                                while (i23 < size5) {
                                    Object obj6 = arrayList7.get(i23);
                                    i23++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                    int i24 = tL_premiumGiftCodeOption3.users;
                                    int i25 = tL_premiumGiftCodeOption6.users;
                                    if (i24 > i25 && i25 > tL_premiumGiftCodeOption5.users) {
                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                    }
                                }
                                String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                                int i26 = tL_premiumGiftCodeOption3.users;
                                int i27 = tL_premiumGiftCodeOption5.users;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, f6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                b2 b2Var3 = alertDialog$Builder3.f20225a;
                                b2Var3.R = string3;
                                b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i26, formatPluralString, Integer.valueOf(i27)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new sg.x(3, wVar, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new t0.a(5));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i28 = b0Var.f47105j0;
                        int i29 = wg.u.f48588s;
                        if (i28 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l10 = t.l(b0Var.m0);
                        aVar.b(true);
                        boolean z14 = b0Var.f47118x0;
                        boolean z15 = b0Var.f47117w0;
                        String str5 = b0Var.f47116v0;
                        w wVar2 = new w(b0Var, 3);
                        String str6 = str3;
                        w wVar3 = new w(b0Var, 4);
                        if (!t.h()) {
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                            tL_inputStorePaymentPremiumGiveaway.prize_description = str5;
                            tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                            int i30 = tL_inputStorePaymentPremiumGiveaway.flags;
                            tL_inputStorePaymentPremiumGiveaway.flags = i30 | 6;
                            if (z15) {
                                tL_inputStorePaymentPremiumGiveaway.flags = i30 | 22;
                            }
                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                            int size6 = arrayList2.size();
                            int i31 = 0;
                            while (i31 < size6) {
                                Object obj7 = arrayList2.get(i31);
                                int i32 = i31 + 1;
                                TLObject tLObject = (TLObject) obj7;
                                if (tLObject instanceof TLRPC.Chat) {
                                    i10 = i32;
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f19896id));
                                } else {
                                    i10 = i32;
                                }
                                i31 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19896id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19896id);
                            tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                            tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                            int size7 = arrayList.size();
                            int i33 = 0;
                            while (i33 < size7) {
                                Object obj8 = arrayList.get(i33);
                                i33++;
                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
                            }
                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                            JSONObject p10 = k3.p(n2Var.getResourceProvider(), false);
                            if (p10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = p10.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new kd(wVar3, messagesController, tL_inputInvoicePremiumGiftCode, n2Var, wVar2, 12));
                            return;
                        }
                        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                        tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                        tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                        tL_inputStorePaymentPremiumGiveaway2.prize_description = str5;
                        tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                        int i34 = tL_inputStorePaymentPremiumGiveaway2.flags;
                        tL_inputStorePaymentPremiumGiveaway2.flags = i34 | 6;
                        if (z15) {
                            tL_inputStorePaymentPremiumGiveaway2.flags = i34 | 22;
                        }
                        tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                        int size8 = arrayList2.size();
                        int i35 = 0;
                        while (i35 < size8) {
                            Object obj9 = arrayList2.get(i35);
                            i35++;
                            TLObject tLObject2 = (TLObject) obj9;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                str = str6;
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f19896id));
                            } else {
                                str = str6;
                            }
                            str6 = str;
                        }
                        String str7 = str6;
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f19896id);
                        int size9 = arrayList.size();
                        int i36 = 0;
                        while (i36 < size9) {
                            Object obj10 = arrayList.get(i36);
                            i36++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                        }
                        ?? obj11 = new Object();
                        obj11.f4369b = str7;
                        obj11.f4368a = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj11.a()), new org.telegram.ui.Components.e1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, wVar3, wVar2, n2Var, 3));
                        return;
                    }
                    i21++;
                    str3 = str3;
                }
            }
        }
    }

    public static void Q(b0 b0Var, n2 n2Var, View view) {
        org.telegram.ui.Components.c5 c5Var;
        boolean z10;
        o0.a aVar;
        boolean z11;
        ArrayList arrayList = b0Var.f47099d0;
        u uVar = b0Var.f47119y0;
        if (view instanceof wg.y) {
            wg.y yVar = (wg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.f23517e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = wg.y.L;
            if (type == 0) {
                b0Var.f47118x0 = z13;
                b0Var.a0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                b0Var.f47117w0 = z13;
                b0Var.a0(false, false);
                vg.b bVar = b0Var.f47102g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f47822e.size()) {
                        break;
                    }
                    vg.a aVar2 = (vg.a) bVar.f47822e.get(i11);
                    if (aVar2.f44098a == 15) {
                        int i12 = aVar2.f47820l;
                        int i13 = wg.y.L;
                        if (i12 == 1) {
                            if (!z12) {
                                bVar.o(i11 + 1);
                            } else {
                                bVar.u(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                b0Var.f47102g0.G();
                if (!b0Var.f47117w0) {
                    AndroidUtilities.runOnUIThread(uVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(uVar);
                }
            }
        }
        if (view instanceof wg.c) {
            if (view instanceof wg.d) {
                int selectedType = ((wg.d) view).getSelectedType();
                int i14 = wg.d.f48551s;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        o0.a aVar3 = b0Var.f47112r0;
                        if (aVar3 != null) {
                            ((a1) aVar3.f16796b).V(1, arrayList);
                            ((n) aVar3.f16797c).f47182b.D(1);
                        }
                    } else {
                        b0Var.f47104i0 = selectedType;
                        b0Var.a0(true, true);
                        b0Var.Z(true);
                        b0Var.N();
                    }
                } else if (selectedType == 2 && b0Var.f47103h0 == selectedType) {
                    o0.a aVar4 = b0Var.f47112r0;
                    if (aVar4 != null) {
                        ((a1) aVar4.f16796b).V(1, arrayList);
                        ((n) aVar4.f16797c).f47182b.D(1);
                        return;
                    }
                    return;
                } else {
                    b0Var.f47103h0 = selectedType;
                    b0Var.a0(true, true);
                    b0Var.Z(true);
                    b0Var.N();
                }
            } else {
                wg.c cVar = (wg.c) view;
                ll0 ll0Var = b0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < ll0Var.getChildCount(); i15++) {
                        View childAt = ll0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            wg.c cVar2 = (wg.c) childAt;
                            if (childAt == cVar) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            cVar2.c(z11, true);
                        }
                    }
                }
            }
        }
        if (view instanceof wg.u) {
            int selectedType2 = ((wg.u) view).getSelectedType();
            if (b0Var.f47105j0 == selectedType2 && (aVar = b0Var.f47112r0) != null) {
                ((a1) aVar.f16796b).V(3, b0Var.f47100e0);
                ((n) aVar.f16797c).f47182b.D(1);
            }
            b0Var.f47105j0 = selectedType2;
            b0Var.a0(false, false);
        } else if (view instanceof wg.i) {
            b0Var.f47107l0 = ((TLRPC.TL_premiumGiftCodeOption) ((wg.i) view).getGifCode()).months;
            b0Var.a0(false, false);
            b0Var.f47102g0.G();
        } else if (view instanceof wg.h) {
            Context context = n2Var.getContext();
            long j3 = b0Var.m0;
            v vVar = new v(b0Var);
            f6 f6Var = b0Var.resourcesProvider;
            org.telegram.ui.Components.c5 c5Var2 = new org.telegram.ui.Components.c5(f6Var);
            a3 a3Var = new a3(context, f6Var);
            a3Var.a();
            vc0 vc0Var = new vc0(context, f6Var);
            int i16 = c5Var2.f24914a;
            vc0Var.setTextColor(i16);
            vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            vc0Var.setItemCount(5);
            ?? vc0Var2 = new vc0(context, f6Var);
            vc0Var2.setWrapSelectorWheel(true);
            vc0Var2.setAllItemsCount(24);
            vc0Var2.setItemCount(5);
            vc0Var2.setTextColor(i16);
            vc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            vc0Var2.setTag("HOUR");
            ?? vc0Var3 = new vc0(context, f6Var);
            vc0Var3.setWrapSelectorWheel(true);
            vc0Var3.setAllItemsCount(60);
            vc0Var3.setItemCount(5);
            vc0Var3.setTextColor(i16);
            vc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            c4 c4Var = new c4(context, c5Var2, vc0Var, (h) vc0Var2, (i) vc0Var3);
            c4Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            c4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            e2.m(20.0f, 1, textView);
            frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new ci.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            c4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            in0 in0Var = new in0(context, 3);
            long j10 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
            vc0Var.setMinValue(0);
            vc0Var.setMaxValue(i18 - 1);
            vc0Var.setWrapSelectorWheel(false);
            vc0Var.setTag("DAY");
            vc0Var.setFormatter(new x20(currentTimeMillis, calendar, i17, 1));
            tc0 v4Var = new v4(c4Var, (h) vc0Var2, (i) vc0Var3, i19, i20, vc0Var);
            vc0Var.setOnValueChangedListener(v4Var);
            vc0Var2.setMinValue(0);
            vc0Var2.setMaxValue(23);
            linearLayout.addView((View) vc0Var2, w7.x5.l(0.2f, 0, 270));
            vc0Var2.setFormatter(new t0.a(6));
            vc0Var2.setOnValueChangedListener(v4Var);
            vc0Var3.setMinValue(0);
            vc0Var3.setMaxValue(11);
            vc0Var3.setValue(0);
            vc0Var3.setFormatter(new t0.a(7));
            linearLayout.addView((View) vc0Var3, w7.x5.l(0.3f, 0, 270));
            vc0Var3.setOnValueChangedListener(v4Var);
            if (j3 > 0) {
                c5Var = c5Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                vc0Var3.setValue(calendar.get(12) / 5);
                vc0Var2.setValue(calendar.get(11));
                vc0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                vc0Var.getValue();
                v4Var.s(vc0Var, vc0Var.getValue());
                vc0Var2.getValue();
                v4Var.s(vc0Var2, vc0Var2.getValue());
            } else {
                c5Var = c5Var2;
            }
            in0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            in0Var.setGravity(17);
            in0Var.setTextColor(c5Var.f24919g);
            in0Var.setTextSize(1, 14.0f);
            in0Var.setTypeface(AndroidUtilities.bold());
            in0Var.setBackground(y5.e(new float[]{8.0f}, c5Var.h));
            in0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            c4Var.addView(in0Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
            in0Var.setOnClickListener(new org.telegram.ui.Components.n0(calendar, vc0Var, vc0Var2, vc0Var3, vVar, a3Var));
            a3Var.b(c4Var);
            f3 f3Var = a3Var.f20231a;
            f3Var.show();
            int i21 = c5Var.f24915b;
            f3Var.setBackgroundColor(i21);
            f3Var.fixNavigationBar(i21);
            if (i0.a.f(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(f3Var, z10);
        } else if (view instanceof wg.b) {
            o0.a aVar5 = b0Var.f47112r0;
            if (aVar5 != null) {
                ((a1) aVar5.f16796b).V(2, b0Var.f47098c0);
                ((n) aVar5.f16797c).f47182b.D(1);
            }
        } else if (view instanceof wg.w) {
            TL_stars.TL_starsGiveawayOption option = ((wg.w) view).getOption();
            if (option != null) {
                b0Var.f47110p0 = option.stars;
                b0Var.a0(true, true);
                b0Var.Z(true);
                b0Var.N();
            }
        } else if (view instanceof e7) {
            b0Var.f47106k0 = true;
            b0Var.a0(true, true);
        }
    }

    public static void R(b0 b0Var) {
        o1 o1Var = new o1(b0Var.f24676n, b0Var.currentAccount, null, b0Var.resourcesProvider);
        o1Var.setOnDismissListener(new x(b0Var, 1));
        o1Var.setOnShowListener(new y(b0Var, 1));
        o1Var.show();
    }

    public static void S(b0 b0Var) {
        o1 o1Var = new o1(b0Var.f24676n, b0Var.currentAccount, null, b0Var.resourcesProvider);
        o1Var.setOnDismissListener(new x(b0Var, 0));
        o1Var.setOnShowListener(new y(b0Var, 0));
        o1Var.show();
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        this.f47113s0 = i10;
    }

    public final ArrayList T(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(j3);
        if (W != null) {
            for (int i10 = 0; i10 < W.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = W.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int U() {
        int i10 = this.f47103h0;
        int i11 = wg.d.f48551s;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f47108n0)).intValue();
        }
        List X = X();
        int i12 = this.f47109o0;
        if (i12 < 0 || i12 >= X.size()) {
            this.f47109o0 = 0;
        }
        if (this.f47109o0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.f47109o0)).intValue();
    }

    public final int V() {
        int U;
        int g10;
        int i10 = this.f47103h0;
        int i11 = wg.d.f48551s;
        if (i10 == 2) {
            U = ((Integer) this.Y.get(this.f47108n0)).intValue();
            g10 = t.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.f47110p0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = t.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j3) {
        ArrayList v = s5.y(this.currentAccount, false).v();
        if (v != null) {
            for (int i10 = 0; i10 < v.size(); i10++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i10);
                if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j3) {
                    return tL_starsGiveawayOption;
                }
            }
            return null;
        }
        return null;
    }

    public final List X() {
        int i10 = this.f47103h0;
        int i11 = wg.d.f48551s;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.f47110p0);
        if (W != null) {
            for (int i12 = 0; i12 < W.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = W.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean Y() {
        if (this.f47115u0 != null) {
            return true;
        }
        return false;
    }

    public final void Z(boolean z10) {
        boolean z11;
        boolean Y = Y();
        wg.a aVar = this.f47111q0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f47115u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(t.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f47104i0;
        int i11 = wg.d.f48551s;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.f47099d0;
        int g10 = t.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f48526e = true;
        di.d dVar = aVar.f48523a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f48524b.setBackgroundColor(j6.v0(j6.f20761h5, aVar.f48525c));
    }

    public final void a0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ug.b0.a0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ll0 ll0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (ll0Var = this.d) != null && ll0Var.G) {
            a0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        k kVar = this.f47114t0;
        if (kVar != null) {
            kVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        vg.b bVar = new vg.b(this.resourcesProvider);
        this.f47102g0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f47104i0;
        int i11 = wg.d.f48551s;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
