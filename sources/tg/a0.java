package tg;

import ai.n6;
import ai.s5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.gd;
import com.google.android.gms.internal.vision.e2;
import ei.l3;
import ei.v4;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dn0;
import org.telegram.ui.x20;
import w7.z5;
import yh.h7;
import yh.u5;
public final class a0 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f46965a0;
    public final TLRPC.Chat f46966b0;
    public final ArrayList f46967c0;
    public final ArrayList f46968d0;
    public final ArrayList f46969e0;
    public final ArrayList f46970f0;
    public ug.b f46971g0;
    public int f46972h0;
    public int f46973i0;
    public int f46974j0;
    public boolean f46975k0;
    public int f46976l0;
    public long m0;
    public int f46977n0;
    public int f46978o0;
    public long f46979p0;
    public final vg.a f46980q0;
    public o0.a f46981r0;
    public int f46982s0;
    public j f46983t0;
    public final TL_stories.PrepaidGiveaway f46984u0;
    public String f46985v0;
    public boolean f46986w0;
    public boolean f46987x0;
    public final t f46988y0;

    public a0(n2 n2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(n2Var, false);
        List asList;
        List asList2;
        this.X = new ArrayList();
        if (s.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Y = asList;
        if (s.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Z = asList2;
        this.f46965a0 = Arrays.asList(750, 10000, 50000);
        this.f46967c0 = new ArrayList();
        this.f46968d0 = new ArrayList();
        this.f46969e0 = new ArrayList();
        this.f46970f0 = new ArrayList();
        int i10 = vg.d.f48308s;
        this.f46972h0 = 2;
        this.f46973i0 = 0;
        int i11 = vg.u.f48345s;
        this.f46974j0 = 0;
        this.f46976l0 = 12;
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
        this.f46977n0 = 2;
        this.f46978o0 = 2;
        this.f46985v0 = "";
        this.f46987x0 = true;
        this.f46988y0 = new t(this, 0);
        this.f46984u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        L();
        ((ViewGroup.MarginLayoutParams) this.f25355e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f25355e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = vg.d.f48308s;
            this.f46972h0 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(tr.h);
        jVar.C = false;
        jVar.f46577m = false;
        this.d.setItemAnimator(jVar);
        zl0 zl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new n6(23, this, n2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f46966b0 = chat;
        ug.b bVar = this.f46971g0;
        ArrayList arrayList = this.X;
        zl0 zl0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.f47653e = arrayList;
        bVar.v = chat;
        bVar.f47654f = zl0Var2;
        bVar.h = uVar;
        bVar.f47655n = uVar2;
        bVar.f47657s = uVar3;
        Z(false, false);
        vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
        this.f46980q0 = aVar;
        aVar.setOnClickListener(new mr(this, prepaidGiveaway, j3, n2Var));
        Y(false);
        this.containerView.addView(aVar, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.currentAccount, chat, new v(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void N(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, n2 n2Var) {
        boolean z10;
        String str;
        int i10;
        boolean z11;
        String str2;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j10;
        ArrayList arrayList = a0Var.f46969e0;
        ArrayList arrayList2 = a0Var.f46967c0;
        TLRPC.Chat chat = a0Var.f46966b0;
        ArrayList arrayList3 = a0Var.f46968d0;
        ArrayList arrayList4 = a0Var.f46970f0;
        vg.a aVar = a0Var.f46980q0;
        if (!aVar.f48280a.N) {
            if (a0Var.X()) {
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
                t2 t2Var = new t2(a0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j3, j10, 8);
                n2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    b2 b2Var = alertDialog$Builder.f20377a;
                    b2Var.R = string;
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new r2.s(t2Var, 9));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(27));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i11 = a0Var.f46972h0;
            int i12 = vg.d.f48308s;
            String str3 = "inapp";
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption U = a0Var.U(a0Var.f46979p0);
                    int S = a0Var.S();
                    if (U != null) {
                        aVar.f48280a.setLoading(true);
                        int i13 = a0Var.f46974j0;
                        int i14 = vg.u.f48345s;
                        if (i13 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        u5 y3 = u5.y(a0Var.currentAccount, false);
                        int l4 = s.l(a0Var.m0);
                        boolean z12 = a0Var.f46987x0;
                        boolean z13 = a0Var.f46986w0;
                        String str4 = a0Var.f46985v0;
                        ai.m0 m0Var = new ai.m0(21, a0Var, U);
                        int i15 = y3.f52085a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            n2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                u5.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                u5.e0(findActivity, null);
                                return;
                            }
                        }
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                        Activity activity = findActivity;
                        tL_inputStorePaymentStarsGiveaway.stars = U.stars;
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
                        tL_inputStorePaymentStarsGiveaway.currency = U.currency;
                        tL_inputStorePaymentStarsGiveaway.amount = U.amount;
                        tL_inputStorePaymentStarsGiveaway.users = S;
                        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str2 = U.store_product) != null) {
                            ?? obj3 = new Object();
                            obj3.f4149b = "inapp";
                            obj3.f4148a = str2;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(obj3.a()), new a1.d(y3, m0Var, tL_inputStorePaymentStarsGiveaway, activity, 22));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = l3.p(u5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new s5(y3, m0Var, tL_inputInvoiceStars, 26));
                    }
                }
            } else if (a0Var.f46973i0 == 1) {
                ArrayList b10 = s.b(arrayList3.size(), arrayList4);
                for (int i18 = 0; i18 < b10.size(); i18++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                    if (tL_premiumGiftCodeOption.months == a0Var.f46976l0 && arrayList3.size() > 0) {
                        if (s.h()) {
                            Context context = a0Var.getContext();
                            d6 d6Var = a0Var.resourcesProvider;
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
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, d6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                b2 b2Var2 = alertDialog$Builder2.f20377a;
                                b2Var2.R = string2;
                                b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i20, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(24));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.f46966b0, null, n2Var, new v(a0Var, 0), new v(a0Var, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = s.b(a0Var.S(), arrayList4);
                int i21 = 0;
                while (i21 < b11.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                    if (tL_premiumGiftCodeOption3.months == a0Var.f46976l0) {
                        if (s.h()) {
                            List list = a0Var.Y;
                            Context context2 = a0Var.getContext();
                            d6 d6Var2 = a0Var.resourcesProvider;
                            v vVar = new v(a0Var, 2);
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
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, d6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                b2 b2Var3 = alertDialog$Builder3.f20377a;
                                b2Var3.R = string3;
                                b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i26, formatPluralString, Integer.valueOf(i27)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new rg.x(3, vVar, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(24));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i28 = a0Var.f46974j0;
                        int i29 = vg.u.f48345s;
                        if (i28 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l10 = s.l(a0Var.m0);
                        aVar.b(true);
                        boolean z14 = a0Var.f46987x0;
                        boolean z15 = a0Var.f46986w0;
                        String str5 = a0Var.f46985v0;
                        v vVar2 = new v(a0Var, 3);
                        String str6 = str3;
                        v vVar3 = new v(a0Var, 4);
                        if (!s.h()) {
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
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f20047id));
                                } else {
                                    i10 = i32;
                                }
                                i31 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20047id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20047id);
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
                            JSONObject p10 = l3.p(n2Var.getResourceProvider(), false);
                            if (p10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = p10.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new gd(vVar3, messagesController, tL_inputInvoicePremiumGiftCode, n2Var, vVar2, 12));
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
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f20047id));
                            } else {
                                str = str6;
                            }
                            str6 = str;
                        }
                        String str7 = str6;
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f20047id);
                        int size9 = arrayList.size();
                        int i36 = 0;
                        while (i36 < size9) {
                            Object obj10 = arrayList.get(i36);
                            i36++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                        }
                        ?? obj11 = new Object();
                        obj11.f4149b = str7;
                        obj11.f4148a = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj11.a()), new org.telegram.ui.Components.d1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, vVar3, vVar2, n2Var, 3));
                        return;
                    }
                    i21++;
                    str3 = str3;
                }
            }
        }
    }

    public static void O(a0 a0Var, n2 n2Var, View view) {
        c5 c5Var;
        boolean z10;
        o0.a aVar;
        boolean z11;
        ArrayList arrayList = a0Var.f46968d0;
        t tVar = a0Var.f46988y0;
        if (view instanceof vg.y) {
            vg.y yVar = (vg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.f23699e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = vg.y.L;
            if (type == 0) {
                a0Var.f46987x0 = z13;
                a0Var.Z(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                a0Var.f46986w0 = z13;
                a0Var.Z(false, false);
                ug.b bVar = a0Var.f46971g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f47653e.size()) {
                        break;
                    }
                    ug.a aVar2 = (ug.a) bVar.f47653e.get(i11);
                    if (aVar2.f17192a == 15) {
                        int i12 = aVar2.f47651l;
                        int i13 = vg.y.L;
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
                a0Var.f46971g0.G();
                if (!a0Var.f46986w0) {
                    AndroidUtilities.runOnUIThread(tVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(tVar);
                }
            }
        }
        if (view instanceof vg.c) {
            if (view instanceof vg.d) {
                int selectedType = ((vg.d) view).getSelectedType();
                int i14 = vg.d.f48308s;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        o0.a aVar3 = a0Var.f46981r0;
                        if (aVar3 != null) {
                            ((z0) aVar3.f16937b).T(1, arrayList);
                            ((m) aVar3.f16938c).f47053b.E(1);
                        }
                    } else {
                        a0Var.f46973i0 = selectedType;
                        a0Var.Z(true, true);
                        a0Var.Y(true);
                        a0Var.L();
                    }
                } else if (selectedType == 2 && a0Var.f46972h0 == selectedType) {
                    o0.a aVar4 = a0Var.f46981r0;
                    if (aVar4 != null) {
                        ((z0) aVar4.f16937b).T(1, arrayList);
                        ((m) aVar4.f16938c).f47053b.E(1);
                        return;
                    }
                    return;
                } else {
                    a0Var.f46972h0 = selectedType;
                    a0Var.Z(true, true);
                    a0Var.Y(true);
                    a0Var.L();
                }
            } else {
                vg.c cVar = (vg.c) view;
                zl0 zl0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < zl0Var.getChildCount(); i15++) {
                        View childAt = zl0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            vg.c cVar2 = (vg.c) childAt;
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
        if (view instanceof vg.u) {
            int selectedType2 = ((vg.u) view).getSelectedType();
            if (a0Var.f46974j0 == selectedType2 && (aVar = a0Var.f46981r0) != null) {
                ((z0) aVar.f16937b).T(3, a0Var.f46969e0);
                ((m) aVar.f16938c).f47053b.E(1);
            }
            a0Var.f46974j0 = selectedType2;
            a0Var.Z(false, false);
        } else if (view instanceof vg.i) {
            a0Var.f46976l0 = ((TLRPC.TL_premiumGiftCodeOption) ((vg.i) view).getGifCode()).months;
            a0Var.Z(false, false);
            a0Var.f46971g0.G();
        } else if (view instanceof vg.h) {
            Context context = n2Var.getContext();
            long j3 = a0Var.m0;
            u uVar = new u(a0Var);
            d6 d6Var = a0Var.resourcesProvider;
            c5 c5Var2 = new c5(d6Var);
            a3 a3Var = new a3(context, d6Var);
            a3Var.a();
            gd0 gd0Var = new gd0(context, d6Var);
            int i16 = c5Var2.f25263a;
            gd0Var.setTextColor(i16);
            gd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            gd0Var.setItemCount(5);
            ?? gd0Var2 = new gd0(context, d6Var);
            gd0Var2.setWrapSelectorWheel(true);
            gd0Var2.setAllItemsCount(24);
            gd0Var2.setItemCount(5);
            gd0Var2.setTextColor(i16);
            gd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            gd0Var2.setTag("HOUR");
            ?? gd0Var3 = new gd0(context, d6Var);
            gd0Var3.setWrapSelectorWheel(true);
            gd0Var3.setAllItemsCount(60);
            gd0Var3.setItemCount(5);
            gd0Var3.setTextColor(i16);
            gd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            c4 c4Var = new c4(context, c5Var2, gd0Var, (g) gd0Var2, (h) gd0Var3);
            c4Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            c4Var.addView(frameLayout, z5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            e2.l(20.0f, 1, textView);
            frameLayout.addView(textView, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new bi.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            c4Var.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            dn0 dn0Var = new dn0(context, 3);
            long j10 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(gd0Var, z5.l(0.5f, 0, 270));
            gd0Var.setMinValue(0);
            gd0Var.setMaxValue(i18 - 1);
            gd0Var.setWrapSelectorWheel(false);
            gd0Var.setTag("DAY");
            gd0Var.setFormatter(new x20(currentTimeMillis, calendar, i17, 1));
            ed0 v4Var = new v4(c4Var, (g) gd0Var2, (h) gd0Var3, i19, i20, gd0Var);
            gd0Var.setOnValueChangedListener(v4Var);
            gd0Var2.setMinValue(0);
            gd0Var2.setMaxValue(23);
            linearLayout.addView((View) gd0Var2, z5.l(0.2f, 0, 270));
            gd0Var2.setFormatter(new s0.b(25));
            gd0Var2.setOnValueChangedListener(v4Var);
            gd0Var3.setMinValue(0);
            gd0Var3.setMaxValue(11);
            gd0Var3.setValue(0);
            gd0Var3.setFormatter(new s0.b(26));
            linearLayout.addView((View) gd0Var3, z5.l(0.3f, 0, 270));
            gd0Var3.setOnValueChangedListener(v4Var);
            if (j3 > 0) {
                c5Var = c5Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                gd0Var3.setValue(calendar.get(12) / 5);
                gd0Var2.setValue(calendar.get(11));
                gd0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                gd0Var.getValue();
                v4Var.q(gd0Var, gd0Var.getValue());
                gd0Var2.getValue();
                v4Var.q(gd0Var2, gd0Var2.getValue());
            } else {
                c5Var = c5Var2;
            }
            dn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            dn0Var.setGravity(17);
            dn0Var.setTextColor(c5Var.f25268g);
            dn0Var.setTextSize(1, 14.0f);
            dn0Var.setTypeface(AndroidUtilities.bold());
            dn0Var.setBackground(x5.e(new float[]{8.0f}, c5Var.h));
            dn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            c4Var.addView(dn0Var, z5.t(-1, 48, 83, 16, 15, 16, 16));
            dn0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, gd0Var, gd0Var2, gd0Var3, uVar, a3Var));
            a3Var.b(c4Var);
            f3 f3Var = a3Var.f20383a;
            f3Var.show();
            int i21 = c5Var.f25264b;
            f3Var.setBackgroundColor(i21);
            f3Var.fixNavigationBar(i21);
            if (i0.a.f(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(f3Var, z10);
        } else if (view instanceof vg.b) {
            o0.a aVar5 = a0Var.f46981r0;
            if (aVar5 != null) {
                ((z0) aVar5.f16937b).T(2, a0Var.f46967c0);
                ((m) aVar5.f16938c).f47053b.E(1);
            }
        } else if (view instanceof vg.w) {
            TL_stars.TL_starsGiveawayOption option = ((vg.w) view).getOption();
            if (option != null) {
                a0Var.f46979p0 = option.stars;
                a0Var.Z(true, true);
                a0Var.Y(true);
                a0Var.L();
            }
        } else if (view instanceof h7) {
            a0Var.f46975k0 = true;
            a0Var.Z(true, true);
        }
    }

    public static void P(a0 a0Var) {
        rg.m1 m1Var = new rg.m1(a0Var.f25357n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        m1Var.setOnDismissListener(new w(a0Var, 1));
        m1Var.setOnShowListener(new x(a0Var, 1));
        m1Var.show();
    }

    public static void Q(a0 a0Var) {
        rg.m1 m1Var = new rg.m1(a0Var.f25357n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        m1Var.setOnDismissListener(new w(a0Var, 0));
        m1Var.setOnShowListener(new x(a0Var, 0));
        m1Var.show();
    }

    @Override
    public final void B(Canvas canvas, int i10) {
        this.f46982s0 = i10;
    }

    public final ArrayList R(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption U = U(j3);
        if (U != null) {
            for (int i10 = 0; i10 < U.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = U.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int S() {
        int i10 = this.f46972h0;
        int i11 = vg.d.f48308s;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f46977n0)).intValue();
        }
        List W = W();
        int i12 = this.f46978o0;
        if (i12 < 0 || i12 >= W.size()) {
            this.f46978o0 = 0;
        }
        if (this.f46978o0 >= W.size()) {
            return 0;
        }
        return ((Integer) W.get(this.f46978o0)).intValue();
    }

    public final int T() {
        int S;
        int g10;
        int i10 = this.f46972h0;
        int i11 = vg.d.f48308s;
        if (i10 == 2) {
            S = ((Integer) this.Y.get(this.f46977n0)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption U = U(this.f46979p0);
            if (U != null) {
                return U.yearly_boosts;
            }
            S = S();
            g10 = s.g();
        }
        return g10 * S;
    }

    public final TL_stars.TL_starsGiveawayOption U(long j3) {
        ArrayList v = u5.y(this.currentAccount, false).v();
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

    public final List W() {
        int i10 = this.f46972h0;
        int i11 = vg.d.f48308s;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption U = U(this.f46979p0);
        if (U != null) {
            for (int i12 = 0; i12 < U.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = U.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean X() {
        if (this.f46984u0 != null) {
            return true;
        }
        return false;
    }

    public final void Y(boolean z10) {
        boolean z11;
        boolean X = X();
        vg.a aVar = this.f46980q0;
        if (X) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f46984u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(s.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f46973i0;
        int i11 = vg.d.f48308s;
        if (i10 == 0) {
            aVar.a(T(), z10);
            return;
        }
        ArrayList arrayList = this.f46968d0;
        int g10 = s.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f48283e = true;
        ci.d dVar = aVar.f48280a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f48281b.setBackgroundColor(i6.v0(i6.f20899h5, aVar.f48282c));
    }

    public final void Z(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: tg.a0.Z(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zl0 zl0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (zl0Var = this.d) != null && zl0Var.G) {
            Z(true, true);
        }
    }

    @Override
    public final void dismiss() {
        j jVar = this.f46983t0;
        if (jVar != null) {
            jVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        ug.b bVar = new ug.b(this.resourcesProvider);
        this.f46971g0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f46973i0;
        int i11 = vg.d.f48308s;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
