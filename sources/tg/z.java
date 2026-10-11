package tg;

import ai.o6;
import ai.t5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.hd;
import com.google.android.gms.internal.vision.e2;
import ei.k3;
import ei.t4;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.u20;
import w7.x5;
import yh.n5;
import yh.y6;
public final class z extends db implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f48519a0;
    public final TLRPC.Chat f48520b0;
    public final ArrayList f48521c0;
    public final ArrayList f48522d0;
    public final ArrayList f48523e0;
    public final ArrayList f48524f0;
    public ug.b f48525g0;
    public int f48526h0;
    public int f48527i0;
    public int f48528j0;
    public boolean f48529k0;
    public int f48530l0;
    public long m0;
    public int f48531n0;
    public int f48532o0;
    public long f48533p0;
    public final vg.a f48534q0;
    public n7.z0 f48535r0;
    public int f48536s0;
    public j f48537t0;
    public final TL_stories.PrepaidGiveaway f48538u0;
    public String f48539v0;
    public boolean f48540w0;
    public boolean f48541x0;
    public final s f48542y0;

    public z(m2 m2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(m2Var, false);
        List asList;
        List asList2;
        this.X = new ArrayList();
        if (r.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Y = asList;
        if (r.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Z = asList2;
        this.f48519a0 = Arrays.asList(750, 10000, 50000);
        this.f48521c0 = new ArrayList();
        this.f48522d0 = new ArrayList();
        this.f48523e0 = new ArrayList();
        this.f48524f0 = new ArrayList();
        int i10 = vg.d.v;
        this.f48526h0 = 2;
        this.f48527i0 = 0;
        int i11 = vg.u.v;
        this.f48528j0 = 0;
        this.f48530l0 = 12;
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
        this.f48531n0 = 2;
        this.f48532o0 = 2;
        this.f48539v0 = "";
        this.f48541x0 = true;
        this.f48542y0 = new s(this, 0);
        this.f48538u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        O();
        ((ViewGroup.MarginLayoutParams) this.f25521e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f25521e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = vg.d.v;
            this.f48526h0 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(is.h);
        jVar.C = false;
        jVar.f47788m = false;
        this.d.setItemAnimator(jVar);
        sm0 sm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new o6(23, this, m2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f48520b0 = chat;
        ug.b bVar = this.f48525g0;
        ArrayList arrayList = this.X;
        sm0 sm0Var2 = this.d;
        t tVar = new t(this);
        t tVar2 = new t(this);
        t tVar3 = new t(this);
        bVar.f48998e = arrayList;
        bVar.v = chat;
        bVar.f48999f = sm0Var2;
        bVar.h = tVar;
        bVar.f49000n = tVar2;
        bVar.f49002s = tVar3;
        b0(false, false);
        vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
        this.f48534q0 = aVar;
        aVar.setOnClickListener(new as(this, prepaidGiveaway, j3, m2Var));
        a0(false);
        this.containerView.addView(aVar, x5.a(68.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        r.j(this.currentAccount, chat, new u(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void Q(z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, m2 m2Var) {
        boolean z10;
        u uVar;
        int i10;
        int i11;
        boolean z11;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j10;
        ArrayList arrayList = zVar.f48523e0;
        ArrayList arrayList2 = zVar.f48521c0;
        TLRPC.Chat chat = zVar.f48520b0;
        ArrayList arrayList3 = zVar.f48522d0;
        ArrayList arrayList4 = zVar.f48524f0;
        vg.a aVar = zVar.f48534q0;
        if (!aVar.f49650a.N) {
            if (zVar.Z()) {
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
                t2 t2Var = new t2(zVar, prepaidGiveaway, tL_prepaidStarsGiveaway, j3, j10, 8);
                m2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    a2 a2Var = alertDialog$Builder.f20368a;
                    a2Var.R = string;
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new r5.d(t2Var, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(14));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i12 = zVar.f48526h0;
            int i13 = vg.d.v;
            char c10 = 3;
            if (i12 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(zVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption X = zVar.X(zVar.f48533p0);
                    int V = zVar.V();
                    if (X != null) {
                        aVar.f49650a.setLoading(true);
                        int i14 = zVar.f48528j0;
                        int i15 = vg.u.v;
                        if (i14 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        n5 y3 = n5.y(zVar.currentAccount, false);
                        int l4 = r.l(zVar.m0);
                        boolean z12 = zVar.f48541x0;
                        boolean z13 = zVar.f48540w0;
                        String str2 = zVar.f48539v0;
                        qh.r rVar = new qh.r(1, zVar, X);
                        int i16 = y3.f52997a;
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
                            ?? obj3 = new Object();
                            obj3.f4198b = "inapp";
                            obj3.f4197a = str;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(obj3.a()), new a1.d(y3, rVar, tL_inputStorePaymentStarsGiveaway, activity, 22));
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
                        ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new t5(y3, rVar, tL_inputInvoiceStars, 26));
                    }
                }
            } else if (zVar.f48527i0 == 1) {
                ArrayList b10 = r.b(arrayList3.size(), arrayList4);
                for (int i19 = 0; i19 < b10.size(); i19++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i19);
                    if (tL_premiumGiftCodeOption.months == zVar.f48530l0 && arrayList3.size() > 0) {
                        if (r.h()) {
                            Context context = zVar.getContext();
                            d6 d6Var = zVar.resourcesProvider;
                            if (tL_premiumGiftCodeOption.store_product == null) {
                                ArrayList arrayList6 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i20 = 0;
                                while (i20 < size3) {
                                    Object obj4 = arrayList4.get(i20);
                                    i20++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                        arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                    }
                                }
                                String join = TextUtils.join(", ", arrayList6);
                                int i21 = tL_premiumGiftCodeOption.users;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, d6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                a2 a2Var2 = alertDialog$Builder2.f20368a;
                                a2Var2.R = string2;
                                a2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i21, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(11));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        r.k(arrayList3, tL_premiumGiftCodeOption, zVar.f48520b0, null, m2Var, new u(zVar, 0), new u(zVar, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = r.b(zVar.V(), arrayList4);
                int i22 = 0;
                while (i22 < b11.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i22);
                    if (tL_premiumGiftCodeOption3.months == zVar.f48530l0) {
                        if (r.h()) {
                            List list = zVar.Y;
                            Context context2 = zVar.getContext();
                            d6 d6Var2 = zVar.resourcesProvider;
                            u uVar2 = new u(zVar, 2);
                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                ArrayList arrayList7 = new ArrayList();
                                int size4 = arrayList4.size();
                                int i23 = 0;
                                while (i23 < size4) {
                                    Object obj5 = arrayList4.get(i23);
                                    i23++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                        arrayList7.add(tL_premiumGiftCodeOption4);
                                    }
                                }
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                int size5 = arrayList7.size();
                                int i24 = 0;
                                while (i24 < size5) {
                                    Object obj6 = arrayList7.get(i24);
                                    i24++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                    int i25 = tL_premiumGiftCodeOption3.users;
                                    int i26 = tL_premiumGiftCodeOption6.users;
                                    if (i25 > i26 && i26 > tL_premiumGiftCodeOption5.users) {
                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                    }
                                }
                                String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                                int i27 = tL_premiumGiftCodeOption3.users;
                                int i28 = tL_premiumGiftCodeOption5.users;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, d6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                a2 a2Var3 = alertDialog$Builder3.f20368a;
                                a2Var3.R = string3;
                                a2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i27, formatPluralString, Integer.valueOf(i28)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new q9.p(7, uVar2, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(11));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i29 = zVar.f48528j0;
                        int i30 = vg.u.v;
                        if (i29 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l10 = r.l(zVar.m0);
                        aVar.b(true);
                        boolean z14 = zVar.f48541x0;
                        boolean z15 = zVar.f48540w0;
                        String str3 = zVar.f48539v0;
                        u uVar3 = new u(zVar, 3);
                        u uVar4 = new u(zVar, 4);
                        if (!r.h()) {
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
                                Object obj7 = arrayList2.get(i32);
                                int i33 = i32 + 1;
                                TLObject tLObject = (TLObject) obj7;
                                if (tLObject instanceof TLRPC.Chat) {
                                    i11 = i33;
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f20032id));
                                } else {
                                    i11 = i33;
                                }
                                i32 = i11;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20032id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20032id);
                            tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                            tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                            int size7 = arrayList.size();
                            int i34 = 0;
                            while (i34 < size7) {
                                Object obj8 = arrayList.get(i34);
                                i34++;
                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
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
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new hd(uVar4, messagesController, tL_inputInvoicePremiumGiftCode, m2Var, uVar3, 12));
                            return;
                        }
                        u uVar5 = uVar3;
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
                            Object obj9 = arrayList2.get(i36);
                            i36++;
                            TLObject tLObject2 = (TLObject) obj9;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                uVar = uVar5;
                                i10 = size8;
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f20032id));
                            } else {
                                uVar = uVar5;
                                i10 = size8;
                            }
                            uVar5 = uVar;
                            size8 = i10;
                        }
                        u uVar6 = uVar5;
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f20032id);
                        int size9 = arrayList.size();
                        int i37 = 0;
                        while (i37 < size9) {
                            Object obj10 = arrayList.get(i37);
                            i37++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                        }
                        ?? obj11 = new Object();
                        obj11.f4198b = "inapp";
                        obj11.f4197a = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj11.a()), new org.telegram.ui.Components.d1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, uVar4, uVar6, m2Var, 3));
                        return;
                    }
                    i22++;
                    c10 = c10;
                }
            }
        }
    }

    public static void R(z zVar, m2 m2Var, View view) {
        e5 e5Var;
        boolean z10;
        n7.z0 z0Var;
        boolean z11;
        ArrayList arrayList = zVar.f48522d0;
        s sVar = zVar.f48542y0;
        if (view instanceof vg.y) {
            vg.y yVar = (vg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.f23680e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = vg.y.L;
            if (type == 0) {
                zVar.f48541x0 = z13;
                zVar.b0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                zVar.f48540w0 = z13;
                zVar.b0(false, false);
                ug.b bVar = zVar.f48525g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f48998e.size()) {
                        break;
                    }
                    ug.a aVar = (ug.a) bVar.f48998e.get(i11);
                    if (aVar.f17175a == 15) {
                        int i12 = aVar.f48996l;
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
                zVar.f48525g0.G();
                if (!zVar.f48540w0) {
                    AndroidUtilities.runOnUIThread(sVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(sVar);
                }
            }
        }
        if (view instanceof vg.c) {
            if (view instanceof vg.d) {
                int selectedType = ((vg.d) view).getSelectedType();
                int i14 = vg.d.v;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        n7.z0 z0Var2 = zVar.f48535r0;
                        if (z0Var2 != null) {
                            ((y0) z0Var2.f16869b).W(1, arrayList);
                            ((m) z0Var2.f16870c).f48420b.D(1);
                        }
                    } else {
                        zVar.f48527i0 = selectedType;
                        zVar.b0(true, true);
                        zVar.a0(true);
                        zVar.O();
                    }
                } else if (selectedType == 2 && zVar.f48526h0 == selectedType) {
                    n7.z0 z0Var3 = zVar.f48535r0;
                    if (z0Var3 != null) {
                        ((y0) z0Var3.f16869b).W(1, arrayList);
                        ((m) z0Var3.f16870c).f48420b.D(1);
                        return;
                    }
                    return;
                } else {
                    zVar.f48526h0 = selectedType;
                    zVar.b0(true, true);
                    zVar.a0(true);
                    zVar.O();
                }
            } else {
                vg.c cVar = (vg.c) view;
                sm0 sm0Var = zVar.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < sm0Var.getChildCount(); i15++) {
                        View childAt = sm0Var.getChildAt(i15);
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
            if (zVar.f48528j0 == selectedType2 && (z0Var = zVar.f48535r0) != null) {
                ((y0) z0Var.f16869b).W(3, zVar.f48523e0);
                ((m) z0Var.f16870c).f48420b.D(1);
            }
            zVar.f48528j0 = selectedType2;
            zVar.b0(false, false);
        } else if (view instanceof vg.i) {
            zVar.f48530l0 = ((TLRPC.TL_premiumGiftCodeOption) ((vg.i) view).getGifCode()).months;
            zVar.b0(false, false);
            zVar.f48525g0.G();
        } else if (view instanceof vg.h) {
            Context context = m2Var.getContext();
            long j3 = zVar.m0;
            t tVar = new t(zVar);
            d6 d6Var = zVar.resourcesProvider;
            e5 e5Var2 = new e5(d6Var);
            z2 z2Var = new z2(context, d6Var);
            z2Var.a();
            vd0 vd0Var = new vd0(context, d6Var);
            int i16 = e5Var2.f25856a;
            vd0Var.setTextColor(i16);
            vd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            vd0Var.setItemCount(5);
            ?? vd0Var2 = new vd0(context, d6Var);
            vd0Var2.setWrapSelectorWheel(true);
            vd0Var2.setAllItemsCount(24);
            vd0Var2.setItemCount(5);
            vd0Var2.setTextColor(i16);
            vd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            vd0Var2.setTag("HOUR");
            ?? vd0Var3 = new vd0(context, d6Var);
            vd0Var3.setWrapSelectorWheel(true);
            vd0Var3.setAllItemsCount(60);
            vd0Var3.setItemCount(5);
            vd0Var3.setTextColor(i16);
            vd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            e4 e4Var = new e4(context, e5Var2, vd0Var, (g) vd0Var2, (h) vd0Var3);
            e4Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            e4Var.addView(frameLayout, x5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            e2.l(20.0f, 1, textView);
            frameLayout.addView(textView, x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
            textView.setOnTouchListener(new bi.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            e4Var.addView(linearLayout, x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            fn0 fn0Var = new fn0(context, 3);
            long j10 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(vd0Var, x5.l(0.5f, 0, 270));
            vd0Var.setMinValue(0);
            vd0Var.setMaxValue(i18 - 1);
            vd0Var.setWrapSelectorWheel(false);
            vd0Var.setTag("DAY");
            vd0Var.setFormatter(new u20(currentTimeMillis, calendar, i17, 1));
            td0 t4Var = new t4(e4Var, (g) vd0Var2, (h) vd0Var3, i19, i20, vd0Var);
            vd0Var.setOnValueChangedListener(t4Var);
            vd0Var2.setMinValue(0);
            vd0Var2.setMaxValue(23);
            linearLayout.addView((View) vd0Var2, x5.l(0.2f, 0, 270));
            vd0Var2.setFormatter(new s0.b(12));
            vd0Var2.setOnValueChangedListener(t4Var);
            vd0Var3.setMinValue(0);
            vd0Var3.setMaxValue(11);
            vd0Var3.setValue(0);
            vd0Var3.setFormatter(new s0.b(13));
            linearLayout.addView((View) vd0Var3, x5.l(0.3f, 0, 270));
            vd0Var3.setOnValueChangedListener(t4Var);
            if (j3 > 0) {
                e5Var = e5Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                vd0Var3.setValue(calendar.get(12) / 5);
                vd0Var2.setValue(calendar.get(11));
                vd0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                vd0Var.getValue();
                t4Var.q(vd0Var, vd0Var.getValue());
                vd0Var2.getValue();
                t4Var.q(vd0Var2, vd0Var2.getValue());
            } else {
                e5Var = e5Var2;
            }
            fn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            fn0Var.setGravity(17);
            fn0Var.setTextColor(e5Var.f25861g);
            fn0Var.setTextSize(1, 14.0f);
            fn0Var.setTypeface(AndroidUtilities.bold());
            fn0Var.setBackground(w5.e(new float[]{8.0f}, e5Var.h));
            fn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            e4Var.addView(fn0Var, x5.t(-1, 48, 83, 16, 15, 16, 16));
            fn0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, vd0Var, vd0Var2, vd0Var3, tVar, z2Var));
            z2Var.b(e4Var);
            e3 e3Var = z2Var.f21710a;
            e3Var.show();
            int i21 = e5Var.f25857b;
            e3Var.setBackgroundColor(i21);
            e3Var.fixNavigationBar(i21);
            if (i0.a.f(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(e3Var, z10);
        } else if (view instanceof vg.b) {
            n7.z0 z0Var4 = zVar.f48535r0;
            if (z0Var4 != null) {
                ((y0) z0Var4.f16869b).W(2, zVar.f48521c0);
                ((m) z0Var4.f16870c).f48420b.D(1);
            }
        } else if (view instanceof vg.w) {
            TL_stars.TL_starsGiveawayOption option = ((vg.w) view).getOption();
            if (option != null) {
                zVar.f48533p0 = option.stars;
                zVar.b0(true, true);
                zVar.a0(true);
                zVar.O();
            }
        } else if (view instanceof y6) {
            zVar.f48529k0 = true;
            zVar.b0(true, true);
        }
    }

    public static void S(z zVar) {
        rg.l1 l1Var = new rg.l1(zVar.f25523n, zVar.currentAccount, null, zVar.resourcesProvider);
        l1Var.setOnDismissListener(new v(zVar, 1));
        l1Var.setOnShowListener(new w(zVar, 1));
        l1Var.show();
    }

    public static void T(z zVar) {
        rg.l1 l1Var = new rg.l1(zVar.f25523n, zVar.currentAccount, null, zVar.resourcesProvider);
        l1Var.setOnDismissListener(new v(zVar, 0));
        l1Var.setOnShowListener(new w(zVar, 0));
        l1Var.show();
    }

    @Override
    public final CharSequence B() {
        int i10 = this.f48527i0;
        int i11 = vg.d.v;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    @Override
    public final void E(Canvas canvas, int i10) {
        this.f48536s0 = i10;
    }

    public final ArrayList U(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(j3);
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
        int i10 = this.f48526h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f48531n0)).intValue();
        }
        List Y = Y();
        int i12 = this.f48532o0;
        if (i12 < 0 || i12 >= Y.size()) {
            this.f48532o0 = 0;
        }
        if (this.f48532o0 >= Y.size()) {
            return 0;
        }
        return ((Integer) Y.get(this.f48532o0)).intValue();
    }

    public final int W() {
        int V;
        int g10;
        int i10 = this.f48526h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            V = ((Integer) this.Y.get(this.f48531n0)).intValue();
            g10 = r.g();
        } else {
            TL_stars.TL_starsGiveawayOption X = X(this.f48533p0);
            if (X != null) {
                return X.yearly_boosts;
            }
            V = V();
            g10 = r.g();
        }
        return g10 * V;
    }

    public final TL_stars.TL_starsGiveawayOption X(long j3) {
        ArrayList v = n5.y(this.currentAccount, false).v();
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

    public final List Y() {
        int i10 = this.f48526h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(this.f48533p0);
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
        if (this.f48538u0 != null) {
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean Z = Z();
        vg.a aVar = this.f48534q0;
        if (Z) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f48538u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(r.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f48527i0;
        int i11 = vg.d.v;
        if (i10 == 0) {
            aVar.a(W(), z10);
            return;
        }
        ArrayList arrayList = this.f48522d0;
        int g10 = r.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f49653e = true;
        ci.d dVar = aVar.f49650a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f49651b.setBackgroundColor(h6.w0(h6.f20857h5, aVar.f49652c));
    }

    public final void b0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: tg.z.b0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        sm0 sm0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (sm0Var = this.d) != null && sm0Var.G) {
            b0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        j jVar = this.f48537t0;
        if (jVar != null) {
            jVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        ug.b bVar = new ug.b(this.resourcesProvider);
        this.f48525g0 = bVar;
        return bVar;
    }
}
