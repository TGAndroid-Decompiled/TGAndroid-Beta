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
import bi.e5;
import bi.z5;
import di.fd;
import fi.k3;
import fi.u4;
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
import org.telegram.messenger.w2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b30;
import org.telegram.ui.mn0;
import w7.a6;
import zh.n5;
import zh.y6;
public final class a0 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f46254a0;
    public final TLRPC.Chat f46255b0;
    public final ArrayList f46256c0;
    public final ArrayList f46257d0;
    public final ArrayList f46258e0;
    public final ArrayList f46259f0;
    public vg.b f46260g0;
    public int f46261h0;
    public int f46262i0;
    public int f46263j0;
    public boolean f46264k0;
    public int f46265l0;
    public long m0;
    public int f46266n0;
    public int f46267o0;
    public long f46268p0;
    public final wg.a f46269q0;
    public n6.o f46270r0;
    public int f46271s0;
    public k f46272t0;
    public final TL_stories.PrepaidGiveaway f46273u0;
    public String f46274v0;
    public boolean f46275w0;
    public boolean f46276x0;
    public final t f46277y0;

    public a0(m2 m2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(m2Var, false);
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
        this.f46254a0 = Arrays.asList(750, 10000, 50000);
        this.f46256c0 = new ArrayList();
        this.f46257d0 = new ArrayList();
        this.f46258e0 = new ArrayList();
        this.f46259f0 = new ArrayList();
        int i10 = wg.d.v;
        this.f46261h0 = 2;
        this.f46262i0 = 0;
        int i11 = wg.u.v;
        this.f46263j0 = 0;
        this.f46265l0 = 12;
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
        this.f46266n0 = 2;
        this.f46267o0 = 2;
        this.f46274v0 = "";
        this.f46276x0 = true;
        this.f46277y0 = new t(this, 0);
        this.f46273u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        O();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = wg.d.v;
            this.f46261h0 = 3;
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(es.h);
        kVar.C = false;
        kVar.f44872m = false;
        this.d.setItemAnimator(kVar);
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new z5(23, this, m2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f46255b0 = chat;
        vg.b bVar = this.f46260g0;
        ArrayList arrayList = this.X;
        mm0 mm0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f46962f = mm0Var2;
        bVar.h = uVar;
        bVar.f46963n = uVar2;
        bVar.f46965s = uVar3;
        b0(false, false);
        wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
        this.f46269q0 = aVar;
        aVar.setOnClickListener(new xr(this, prepaidGiveaway, j10, m2Var));
        a0(false);
        this.containerView.addView(aVar, a6.a(68.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        s.j(this.currentAccount, chat, new v(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void Q(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, m2 m2Var) {
        boolean z10;
        v vVar;
        int i10;
        int i11;
        boolean z11;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j11;
        ArrayList arrayList = a0Var.f46258e0;
        ArrayList arrayList2 = a0Var.f46256c0;
        TLRPC.Chat chat = a0Var.f46255b0;
        ArrayList arrayList3 = a0Var.f46257d0;
        ArrayList arrayList4 = a0Var.f46259f0;
        wg.a aVar = a0Var.f46269q0;
        if (!aVar.f47555a.N) {
            if (a0Var.Z()) {
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                } else {
                    tL_prepaidStarsGiveaway = null;
                }
                if (tL_prepaidStarsGiveaway != null) {
                    j11 = tL_prepaidStarsGiveaway.stars;
                } else {
                    j11 = 0;
                }
                w2 w2Var = new w2(a0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, j11, 8);
                m2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    a2 a2Var = alertDialog$Builder.f19548a;
                    a2Var.R = string;
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new rg.b0(w2Var, 12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(11));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i12 = a0Var.f46261h0;
            int i13 = wg.d.v;
            char c10 = 3;
            if (i12 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption X = a0Var.X(a0Var.f46268p0);
                    int V = a0Var.V();
                    if (X != null) {
                        aVar.f47555a.setLoading(true);
                        int i14 = a0Var.f46263j0;
                        int i15 = wg.u.v;
                        if (i14 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        n5 y3 = n5.y(a0Var.currentAccount, false);
                        int l4 = s.l(a0Var.m0);
                        boolean z12 = a0Var.f46276x0;
                        boolean z13 = a0Var.f46275w0;
                        String str2 = a0Var.f46274v0;
                        rh.s sVar = new rh.s(1, a0Var, X);
                        int i16 = y3.f50864a;
                        if (!MessagesController.getInstance(i16).starsPurchaseAvailable()) {
                            m2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                n5.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                n5.e0(findActivity, null);
                                return;
                            }
                        }
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                        Activity activity = findActivity;
                        tL_inputStorePaymentStarsGiveaway.stars = X.stars;
                        MessagesController.getInstance(i16);
                        tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                Object obj = arrayList2.get(i17);
                                i17++;
                                ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                MessagesController.getInstance(i16);
                                arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                            }
                        }
                        int size2 = arrayList.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj2 = arrayList.get(i18);
                            i18++;
                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
                        }
                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                        }
                        if (z13) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                            tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                        }
                        tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i16).getNextRandomId();
                        tL_inputStorePaymentStarsGiveaway.until_date = l4;
                        tL_inputStorePaymentStarsGiveaway.currency = X.currency;
                        tL_inputStorePaymentStarsGiveaway.amount = X.amount;
                        tL_inputStorePaymentStarsGiveaway.users = V;
                        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = X.store_product) != null) {
                            c5.a aVar2 = new c5.a();
                            aVar2.f4324c = "inapp";
                            aVar2.f4323b = str;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(aVar2.a()), new a1.d(y3, sVar, tL_inputStorePaymentStarsGiveaway, activity, 22));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = k3.q(n5.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new e5(y3, sVar, tL_inputInvoiceStars, 26));
                    }
                }
            } else if (a0Var.f46262i0 == 1) {
                ArrayList b10 = s.b(arrayList3.size(), arrayList4);
                for (int i19 = 0; i19 < b10.size(); i19++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i19);
                    if (tL_premiumGiftCodeOption.months == a0Var.f46265l0 && arrayList3.size() > 0) {
                        if (s.h()) {
                            Context context = a0Var.getContext();
                            c6 c6Var = a0Var.resourcesProvider;
                            if (tL_premiumGiftCodeOption.store_product == null) {
                                ArrayList arrayList6 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i20 = 0;
                                while (i20 < size3) {
                                    Object obj3 = arrayList4.get(i20);
                                    i20++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                        arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                    }
                                }
                                String join = TextUtils.join(", ", arrayList6);
                                int i21 = tL_premiumGiftCodeOption.users;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, c6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                a2 a2Var2 = alertDialog$Builder2.f19548a;
                                a2Var2.R = string2;
                                a2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i21, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new t0.a(8));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.f46255b0, null, m2Var, new v(a0Var, 0), new v(a0Var, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = s.b(a0Var.V(), arrayList4);
                int i22 = 0;
                while (i22 < b11.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i22);
                    if (tL_premiumGiftCodeOption3.months == a0Var.f46265l0) {
                        if (s.h()) {
                            List list = a0Var.Y;
                            Context context2 = a0Var.getContext();
                            c6 c6Var2 = a0Var.resourcesProvider;
                            v vVar2 = new v(a0Var, 2);
                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                ArrayList arrayList7 = new ArrayList();
                                int size4 = arrayList4.size();
                                int i23 = 0;
                                while (i23 < size4) {
                                    Object obj4 = arrayList4.get(i23);
                                    i23++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                        arrayList7.add(tL_premiumGiftCodeOption4);
                                    }
                                }
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                int size5 = arrayList7.size();
                                int i24 = 0;
                                while (i24 < size5) {
                                    Object obj5 = arrayList7.get(i24);
                                    i24++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                    int i25 = tL_premiumGiftCodeOption3.users;
                                    int i26 = tL_premiumGiftCodeOption6.users;
                                    if (i25 > i26 && i26 > tL_premiumGiftCodeOption5.users) {
                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                    }
                                }
                                String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                                int i27 = tL_premiumGiftCodeOption3.users;
                                int i28 = tL_premiumGiftCodeOption5.users;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, c6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                a2 a2Var3 = alertDialog$Builder3.f19548a;
                                a2Var3.R = string3;
                                a2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i27, formatPluralString, Integer.valueOf(i28)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new org.telegram.ui.web.c0(12, vVar2, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new t0.a(8));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i29 = a0Var.f46263j0;
                        int i30 = wg.u.v;
                        if (i29 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l10 = s.l(a0Var.m0);
                        aVar.b(true);
                        boolean z14 = a0Var.f46276x0;
                        boolean z15 = a0Var.f46275w0;
                        String str3 = a0Var.f46274v0;
                        v vVar3 = new v(a0Var, 3);
                        v vVar4 = new v(a0Var, 4);
                        if (!s.h()) {
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                            tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                            tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                            int i31 = tL_inputStorePaymentPremiumGiveaway.flags;
                            tL_inputStorePaymentPremiumGiveaway.flags = i31 | 6;
                            if (z15) {
                                tL_inputStorePaymentPremiumGiveaway.flags = i31 | 22;
                            }
                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                            int size6 = arrayList2.size();
                            int i32 = 0;
                            while (i32 < size6) {
                                Object obj6 = arrayList2.get(i32);
                                int i33 = i32 + 1;
                                TLObject tLObject = (TLObject) obj6;
                                if (tLObject instanceof TLRPC.Chat) {
                                    i11 = i33;
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f19216id));
                                } else {
                                    i11 = i33;
                                }
                                i32 = i11;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19216id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19216id);
                            tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                            tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                            int size7 = arrayList.size();
                            int i34 = 0;
                            while (i34 < size7) {
                                Object obj7 = arrayList.get(i34);
                                i34++;
                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                            }
                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                            JSONObject q10 = k3.q(m2Var.getResourceProvider(), false);
                            if (q10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = q10.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new fd(vVar4, messagesController, tL_inputInvoicePremiumGiftCode, m2Var, vVar3, 12));
                            return;
                        }
                        v vVar5 = vVar3;
                        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                        tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                        tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                        tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                        tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                        int i35 = tL_inputStorePaymentPremiumGiveaway2.flags;
                        tL_inputStorePaymentPremiumGiveaway2.flags = i35 | 6;
                        if (z15) {
                            tL_inputStorePaymentPremiumGiveaway2.flags = i35 | 22;
                        }
                        tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                        int size8 = arrayList2.size();
                        int i36 = 0;
                        while (i36 < size8) {
                            Object obj8 = arrayList2.get(i36);
                            i36++;
                            TLObject tLObject2 = (TLObject) obj8;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                vVar = vVar5;
                                i10 = size8;
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f19216id));
                            } else {
                                vVar = vVar5;
                                i10 = size8;
                            }
                            vVar5 = vVar;
                            size8 = i10;
                        }
                        v vVar6 = vVar5;
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f19216id);
                        int size9 = arrayList.size();
                        int i37 = 0;
                        while (i37 < size9) {
                            Object obj9 = arrayList.get(i37);
                            i37++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                        }
                        c5.a aVar3 = new c5.a();
                        aVar3.f4324c = "inapp";
                        aVar3.f4323b = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(aVar3.a()), new org.telegram.ui.Components.d1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, vVar4, vVar6, m2Var, 3));
                        return;
                    }
                    i22++;
                    c10 = c10;
                }
            }
        }
    }

    public static void R(a0 a0Var, m2 m2Var, View view) {
        org.telegram.ui.Components.e5 e5Var;
        boolean z10;
        n6.o oVar;
        boolean z11;
        ArrayList arrayList = a0Var.f46257d0;
        t tVar = a0Var.f46277y0;
        if (view instanceof wg.y) {
            wg.y yVar = (wg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = wg.y.L;
            if (type == 0) {
                a0Var.f46276x0 = z13;
                a0Var.b0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                a0Var.f46275w0 = z13;
                a0Var.b0(false, false);
                vg.b bVar = a0Var.f46260g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    vg.a aVar = (vg.a) bVar.e.get(i11);
                    if (aVar.f43203a == 15) {
                        int i12 = aVar.f46960l;
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
                a0Var.f46260g0.G();
                if (!a0Var.f46275w0) {
                    AndroidUtilities.runOnUIThread(tVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(tVar);
                }
            }
        }
        if (view instanceof wg.c) {
            if (view instanceof wg.d) {
                int selectedType = ((wg.d) view).getSelectedType();
                int i14 = wg.d.v;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        n6.o oVar2 = a0Var.f46270r0;
                        if (oVar2 != null) {
                            ((z0) oVar2.f16131b).W(1, arrayList);
                            ((n) oVar2.f16132c).f46365b.D(1);
                        }
                    } else {
                        a0Var.f46262i0 = selectedType;
                        a0Var.b0(true, true);
                        a0Var.a0(true);
                        a0Var.O();
                    }
                } else if (selectedType == 2 && a0Var.f46261h0 == selectedType) {
                    n6.o oVar3 = a0Var.f46270r0;
                    if (oVar3 != null) {
                        ((z0) oVar3.f16131b).W(1, arrayList);
                        ((n) oVar3.f16132c).f46365b.D(1);
                        return;
                    }
                    return;
                } else {
                    a0Var.f46261h0 = selectedType;
                    a0Var.b0(true, true);
                    a0Var.a0(true);
                    a0Var.O();
                }
            } else {
                wg.c cVar = (wg.c) view;
                mm0 mm0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < mm0Var.getChildCount(); i15++) {
                        View childAt = mm0Var.getChildAt(i15);
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
            if (a0Var.f46263j0 == selectedType2 && (oVar = a0Var.f46270r0) != null) {
                ((z0) oVar.f16131b).W(3, a0Var.f46258e0);
                ((n) oVar.f16132c).f46365b.D(1);
            }
            a0Var.f46263j0 = selectedType2;
            a0Var.b0(false, false);
        } else if (view instanceof wg.i) {
            a0Var.f46265l0 = ((TLRPC.TL_premiumGiftCodeOption) ((wg.i) view).getGifCode()).months;
            a0Var.b0(false, false);
            a0Var.f46260g0.G();
        } else if (view instanceof wg.h) {
            Context context = m2Var.getContext();
            long j10 = a0Var.m0;
            u uVar = new u(a0Var);
            c6 c6Var = a0Var.resourcesProvider;
            org.telegram.ui.Components.e5 e5Var2 = new org.telegram.ui.Components.e5(c6Var);
            z2 z2Var = new z2(context, c6Var);
            z2Var.a();
            ud0 ud0Var = new ud0(context, c6Var);
            int i16 = e5Var2.f24611a;
            ud0Var.setTextColor(i16);
            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            ud0Var.setItemCount(5);
            ?? ud0Var2 = new ud0(context, c6Var);
            ud0Var2.setWrapSelectorWheel(true);
            ud0Var2.setAllItemsCount(24);
            ud0Var2.setItemCount(5);
            ud0Var2.setTextColor(i16);
            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            ud0Var2.setTag("HOUR");
            ?? ud0Var3 = new ud0(context, c6Var);
            ud0Var3.setWrapSelectorWheel(true);
            ud0Var3.setAllItemsCount(60);
            ud0Var3.setItemCount(5);
            ud0Var3.setTextColor(i16);
            ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            e4 e4Var = new e4(context, e5Var2, ud0Var, (h) ud0Var2, (i) ud0Var3);
            e4Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            e4Var.addView(frameLayout, a6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
            frameLayout.addView(textView, a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
            textView.setOnTouchListener(new ci.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            e4Var.addView(linearLayout, a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            mn0 mn0Var = new mn0(context, 3);
            long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j11);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(ud0Var, a6.l(0.5f, 0, 270));
            ud0Var.setMinValue(0);
            ud0Var.setMaxValue(i18 - 1);
            ud0Var.setWrapSelectorWheel(false);
            ud0Var.setTag("DAY");
            ud0Var.setFormatter(new b30(currentTimeMillis, calendar, i17, 1));
            sd0 u4Var = new u4(e4Var, (h) ud0Var2, (i) ud0Var3, i19, i20, ud0Var);
            ud0Var.setOnValueChangedListener(u4Var);
            ud0Var2.setMinValue(0);
            ud0Var2.setMaxValue(23);
            linearLayout.addView((View) ud0Var2, a6.l(0.2f, 0, 270));
            ud0Var2.setFormatter(new t0.a(9));
            ud0Var2.setOnValueChangedListener(u4Var);
            ud0Var3.setMinValue(0);
            ud0Var3.setMaxValue(11);
            ud0Var3.setValue(0);
            ud0Var3.setFormatter(new t0.a(10));
            linearLayout.addView((View) ud0Var3, a6.l(0.3f, 0, 270));
            ud0Var3.setOnValueChangedListener(u4Var);
            if (j10 > 0) {
                e5Var = e5Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j10);
                ud0Var3.setValue(calendar.get(12) / 5);
                ud0Var2.setValue(calendar.get(11));
                ud0Var.setValue((int) ((j10 - calendar.getTimeInMillis()) / 86400000));
                ud0Var.getValue();
                u4Var.r(ud0Var, ud0Var.getValue());
                ud0Var2.getValue();
                u4Var.r(ud0Var2, ud0Var2.getValue());
            } else {
                e5Var = e5Var2;
            }
            mn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            mn0Var.setGravity(17);
            mn0Var.setTextColor(e5Var.f24615g);
            mn0Var.setTextSize(1, 14.0f);
            mn0Var.setTypeface(AndroidUtilities.bold());
            mn0Var.setBackground(w5.e(new float[]{8.0f}, e5Var.h));
            mn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            e4Var.addView(mn0Var, a6.t(-1, 48, 83, 16, 15, 16, 16));
            mn0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, ud0Var, ud0Var2, ud0Var3, uVar, z2Var));
            z2Var.b(e4Var);
            e3 e3Var = z2Var.f20838a;
            e3Var.show();
            int i21 = e5Var.f24612b;
            e3Var.setBackgroundColor(i21);
            e3Var.fixNavigationBar(i21);
            if (i0.a.f(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(e3Var, z10);
        } else if (view instanceof wg.b) {
            n6.o oVar4 = a0Var.f46270r0;
            if (oVar4 != null) {
                ((z0) oVar4.f16131b).W(2, a0Var.f46256c0);
                ((n) oVar4.f16132c).f46365b.D(1);
            }
        } else if (view instanceof wg.w) {
            TL_stars.TL_starsGiveawayOption option = ((wg.w) view).getOption();
            if (option != null) {
                a0Var.f46268p0 = option.stars;
                a0Var.b0(true, true);
                a0Var.a0(true);
                a0Var.O();
            }
        } else if (view instanceof y6) {
            a0Var.f46264k0 = true;
            a0Var.b0(true, true);
        }
    }

    public static void S(a0 a0Var) {
        sg.m1 m1Var = new sg.m1(a0Var.f24345n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        m1Var.setOnDismissListener(new w(a0Var, 1));
        m1Var.setOnShowListener(new x(a0Var, 1));
        m1Var.show();
    }

    public static void T(a0 a0Var) {
        sg.m1 m1Var = new sg.m1(a0Var.f24345n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        m1Var.setOnDismissListener(new w(a0Var, 0));
        m1Var.setOnShowListener(new x(a0Var, 0));
        m1Var.show();
    }

    @Override
    public final CharSequence A() {
        int i10 = this.f46262i0;
        int i11 = wg.d.v;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    @Override
    public final void E(Canvas canvas, int i10) {
        this.f46271s0 = i10;
    }

    public final ArrayList U(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(j10);
        if (X != null) {
            for (int i10 = 0; i10 < X.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = X.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int V() {
        int i10 = this.f46261h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f46266n0)).intValue();
        }
        List Y = Y();
        int i12 = this.f46267o0;
        if (i12 < 0 || i12 >= Y.size()) {
            this.f46267o0 = 0;
        }
        if (this.f46267o0 >= Y.size()) {
            return 0;
        }
        return ((Integer) Y.get(this.f46267o0)).intValue();
    }

    public final int W() {
        int V;
        int g10;
        int i10 = this.f46261h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            V = ((Integer) this.Y.get(this.f46266n0)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption X = X(this.f46268p0);
            if (X != null) {
                return X.yearly_boosts;
            }
            V = V();
            g10 = s.g();
        }
        return g10 * V;
    }

    public final TL_stars.TL_starsGiveawayOption X(long j10) {
        ArrayList v = n5.y(this.currentAccount, false).v();
        if (v != null) {
            for (int i10 = 0; i10 < v.size(); i10++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i10);
                if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                    return tL_starsGiveawayOption;
                }
            }
            return null;
        }
        return null;
    }

    public final List Y() {
        int i10 = this.f46261h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(this.f46268p0);
        if (X != null) {
            for (int i12 = 0; i12 < X.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = X.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean Z() {
        if (this.f46273u0 != null) {
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean Z = Z();
        wg.a aVar = this.f46269q0;
        if (Z) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f46273u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(s.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f46262i0;
        int i11 = wg.d.v;
        if (i10 == 0) {
            aVar.a(W(), z10);
            return;
        }
        ArrayList arrayList = this.f46257d0;
        int g10 = s.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.e = true;
        di.d dVar = aVar.f47555a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f47556b.setBackgroundColor(g6.w0(g6.f19972h5, aVar.f47557c));
    }

    public final void b0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ug.a0.b0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mm0 mm0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (mm0Var = this.d) != null && mm0Var.G) {
            b0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        k kVar = this.f46272t0;
        if (kVar != null) {
            kVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        vg.b bVar = new vg.b(this.resourcesProvider);
        this.f46260g0 = bVar;
        return bVar;
    }
}
