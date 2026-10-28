package vg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.h2;
import bi.jc;
import bi.n9;
import di.x4;
import hi.m3;
import hi.s4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import m4.w1;
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
import org.telegram.messenger.y2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.bh1;
import org.telegram.ui.dn0;
import org.telegram.ui.l20;
public final class a0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f50153a0;
    public final TLRPC.Chat f50154b0;
    public final ArrayList f50155c0;
    public final ArrayList f50156d0;
    public final ArrayList f50157e0;
    public final ArrayList f50158f0;
    public wg.b f50159g0;
    public int f50160h0;
    public int f50161i0;
    public int f50162j0;
    public boolean f50163k0;
    public int f50164l0;
    public long m0;
    public int f50165n0;
    public int f50166o0;
    public long f50167p0;
    public final xg.a f50168q0;
    public w1 f50169r0;
    public int f50170s0;
    public k f50171t0;
    public final TL_stories.PrepaidGiveaway f50172u0;
    public String f50173v0;
    public boolean f50174w0;
    public boolean f50175x0;
    public final t f50176y0;

    public a0(r2 r2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(r2Var, false);
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
        this.f50153a0 = Arrays.asList(750, 10000, 50000);
        this.f50155c0 = new ArrayList();
        this.f50156d0 = new ArrayList();
        this.f50157e0 = new ArrayList();
        this.f50158f0 = new ArrayList();
        int i10 = xg.d.v;
        this.f50160h0 = 2;
        this.f50161i0 = 0;
        int i11 = xg.u.v;
        this.f50162j0 = 0;
        this.f50164l0 = 12;
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
        this.f50165n0 = 2;
        this.f50166o0 = 2;
        this.f50173v0 = "";
        this.f50175x0 = true;
        this.f50176y0 = new t(this, 0);
        this.f50172u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        N();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = xg.d.v;
            this.f50160h0 = 3;
        }
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(ds.h);
        lVar.C = false;
        lVar.f47798m = false;
        this.d.setItemAnimator(lVar);
        nm0 nm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new x4(23, this, r2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f50154b0 = chat;
        wg.b bVar = this.f50159g0;
        ArrayList arrayList = this.X;
        nm0 nm0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f51229f = nm0Var2;
        bVar.h = uVar;
        bVar.f51230n = uVar2;
        bVar.f51232s = uVar3;
        a0(false, false);
        xg.a aVar = new xg.a(getContext(), this.resourcesProvider);
        this.f50168q0 = aVar;
        aVar.setOnClickListener(new wr(this, prepaidGiveaway, j10, r2Var));
        Z(false);
        this.containerView.addView(aVar, kb1.h(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.currentAccount, chat, new v(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, r2 r2Var) {
        boolean z10;
        String str;
        int i10;
        boolean z11;
        String str2;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j11;
        ArrayList arrayList = a0Var.f50157e0;
        ArrayList arrayList2 = a0Var.f50155c0;
        TLRPC.Chat chat = a0Var.f50154b0;
        ArrayList arrayList3 = a0Var.f50156d0;
        ArrayList arrayList4 = a0Var.f50158f0;
        xg.a aVar = a0Var.f50168q0;
        if (!aVar.f51809a.Q) {
            if (a0Var.Y()) {
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
                y2 y2Var = new y2(a0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, j11, 8);
                r2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.R = string;
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new org.telegram.ui.Components.voip.j1(y2Var, 26));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new d(3));
                    alertDialog$Builder.p();
                    return;
                }
                return;
            }
            int i11 = a0Var.f50160h0;
            int i12 = xg.d.v;
            String str3 = "inapp";
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption W = a0Var.W(a0Var.f50167p0);
                    int U = a0Var.U();
                    if (W != null) {
                        aVar.f51809a.setLoading(true);
                        int i13 = a0Var.f50162j0;
                        int i14 = xg.u.v;
                        if (i13 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ca y3 = ca.y(a0Var.currentAccount, false);
                        int l4 = s.l(a0Var.m0);
                        boolean z12 = a0Var.f50175x0;
                        boolean z13 = a0Var.f50174w0;
                        String str4 = a0Var.f50173v0;
                        r1 r1Var = new r1(6, a0Var, W);
                        int i15 = y3.f4441a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            r2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                ca.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                ca.e0(findActivity, null);
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
                            obj3.f7929b = "inapp";
                            obj3.f7928a = str2;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(obj3.a()), new a1.d(y3, r1Var, tL_inputStorePaymentStarsGiveaway, activity, 2));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q5 = m3.q(ca.I(), false);
                        if (q5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new h2(y3, r1Var, tL_inputInvoiceStars, 4));
                    }
                }
            } else if (a0Var.f50161i0 == 1) {
                ArrayList b10 = s.b(arrayList3.size(), arrayList4);
                for (int i18 = 0; i18 < b10.size(); i18++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                    if (tL_premiumGiftCodeOption.months == a0Var.f50164l0 && arrayList3.size() > 0) {
                        if (s.h()) {
                            Context context = a0Var.getContext();
                            u6 u6Var = a0Var.resourcesProvider;
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
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, u6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                e2 e2Var2 = alertDialog$Builder2.f22369a;
                                e2Var2.R = string2;
                                e2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i20, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new d(0));
                                alertDialog$Builder2.p();
                                return;
                            }
                        }
                        aVar.b(true);
                        s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.f50154b0, null, r2Var, new v(a0Var, 0), new v(a0Var, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = s.b(a0Var.U(), arrayList4);
                int i21 = 0;
                while (i21 < b11.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                    if (tL_premiumGiftCodeOption3.months == a0Var.f50164l0) {
                        if (s.h()) {
                            List list = a0Var.Y;
                            Context context2 = a0Var.getContext();
                            u6 u6Var2 = a0Var.resourcesProvider;
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
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, u6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                e2 e2Var3 = alertDialog$Builder3.f22369a;
                                e2Var3.R = string3;
                                e2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i26, formatPluralString, Integer.valueOf(i27)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new bh1(20, vVar, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new d(0));
                                alertDialog$Builder3.p();
                                return;
                            }
                        }
                        int i28 = a0Var.f50162j0;
                        int i29 = xg.u.v;
                        if (i28 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l10 = s.l(a0Var.m0);
                        aVar.b(true);
                        boolean z14 = a0Var.f50175x0;
                        boolean z15 = a0Var.f50174w0;
                        String str5 = a0Var.f50173v0;
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
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f22028id));
                                } else {
                                    i10 = i32;
                                }
                                i31 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22028id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22028id);
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
                            JSONObject q9 = m3.q(r2Var.getResourceProvider(), false);
                            if (q9 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = q9.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new n9(vVar3, messagesController, tL_inputInvoicePremiumGiftCode, r2Var, vVar2, 13));
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
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f22028id));
                            } else {
                                str = str6;
                            }
                            str6 = str;
                        }
                        String str7 = str6;
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f22028id);
                        int size9 = arrayList.size();
                        int i36 = 0;
                        while (i36 < size9) {
                            Object obj10 = arrayList.get(i36);
                            i36++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                        }
                        ?? obj11 = new Object();
                        obj11.f7929b = str7;
                        obj11.f7928a = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj11.a()), new org.telegram.ui.Components.c1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, vVar3, vVar2, r2Var, 3));
                        return;
                    }
                    i21++;
                    str3 = str3;
                }
            }
        }
    }

    public static void Q(a0 a0Var, r2 r2Var, View view) {
        e4 e4Var;
        boolean z10;
        w1 w1Var;
        boolean z11;
        ArrayList arrayList = a0Var.f50156d0;
        t tVar = a0Var.f50176y0;
        if (view instanceof xg.y) {
            xg.y yVar = (xg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = xg.y.L;
            if (type == 0) {
                a0Var.f50175x0 = z13;
                a0Var.a0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                a0Var.f50174w0 = z13;
                a0Var.a0(false, false);
                wg.b bVar = a0Var.f50159g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    wg.a aVar = (wg.a) bVar.e.get(i11);
                    if (aVar.f47075a == 15) {
                        int i12 = aVar.f51227l;
                        int i13 = xg.y.L;
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
                a0Var.f50159g0.G();
                if (!a0Var.f50174w0) {
                    AndroidUtilities.runOnUIThread(tVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(tVar);
                }
            }
        }
        if (view instanceof xg.c) {
            if (view instanceof xg.d) {
                int selectedType = ((xg.d) view).getSelectedType();
                int i14 = xg.d.v;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        w1 w1Var2 = a0Var.f50169r0;
                        if (w1Var2 != null) {
                            ((z0) w1Var2.f18292b).V(1, arrayList);
                            ((n) w1Var2.f18293c).f50242b.E(1);
                        }
                    } else {
                        a0Var.f50161i0 = selectedType;
                        a0Var.a0(true, true);
                        a0Var.Z(true);
                        a0Var.N();
                    }
                } else if (selectedType == 2 && a0Var.f50160h0 == selectedType) {
                    w1 w1Var3 = a0Var.f50169r0;
                    if (w1Var3 != null) {
                        ((z0) w1Var3.f18292b).V(1, arrayList);
                        ((n) w1Var3.f18293c).f50242b.E(1);
                        return;
                    }
                    return;
                } else {
                    a0Var.f50160h0 = selectedType;
                    a0Var.a0(true, true);
                    a0Var.Z(true);
                    a0Var.N();
                }
            } else {
                xg.c cVar = (xg.c) view;
                nm0 nm0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < nm0Var.getChildCount(); i15++) {
                        View childAt = nm0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            xg.c cVar2 = (xg.c) childAt;
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
        if (view instanceof xg.u) {
            int selectedType2 = ((xg.u) view).getSelectedType();
            if (a0Var.f50162j0 == selectedType2 && (w1Var = a0Var.f50169r0) != null) {
                ((z0) w1Var.f18292b).V(3, a0Var.f50157e0);
                ((n) w1Var.f18293c).f50242b.E(1);
            }
            a0Var.f50162j0 = selectedType2;
            a0Var.a0(false, false);
        } else if (view instanceof xg.i) {
            a0Var.f50164l0 = ((TLRPC.TL_premiumGiftCodeOption) ((xg.i) view).getGifCode()).months;
            a0Var.a0(false, false);
            a0Var.f50159g0.G();
        } else if (view instanceof xg.h) {
            Context context = r2Var.getContext();
            long j10 = a0Var.m0;
            u uVar = new u(a0Var);
            u6 u6Var = a0Var.resourcesProvider;
            d5 d5Var = new d5(u6Var);
            e3 e3Var = new e3(context, u6Var);
            e3Var.a();
            nd0 nd0Var = new nd0(context, u6Var);
            int i16 = d5Var.f27339a;
            nd0Var.setTextColor(i16);
            nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            nd0Var.setItemCount(5);
            ?? nd0Var2 = new nd0(context, u6Var);
            nd0Var2.setWrapSelectorWheel(true);
            nd0Var2.setAllItemsCount(24);
            nd0Var2.setItemCount(5);
            nd0Var2.setTextColor(i16);
            nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            nd0Var2.setTag("HOUR");
            ?? nd0Var3 = new nd0(context, u6Var);
            nd0Var3.setWrapSelectorWheel(true);
            nd0Var3.setAllItemsCount(60);
            nd0Var3.setItemCount(5);
            nd0Var3.setTextColor(i16);
            nd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            e4 e4Var2 = new e4(context, d5Var, nd0Var, (h) nd0Var2, (i) nd0Var3);
            e4Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            e4Var2.addView(frameLayout, kb1.x(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            ic.a.o(20.0f, 1, textView);
            frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new ei.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            e4Var2.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            dn0 dn0Var = new dn0(context, 3);
            long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j11);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(nd0Var, kb1.p(0.5f, 0, 270));
            nd0Var.setMinValue(0);
            nd0Var.setMaxValue(i18 - 1);
            nd0Var.setWrapSelectorWheel(false);
            nd0Var.setTag("DAY");
            nd0Var.setFormatter(new l20(currentTimeMillis, calendar, i17, 1));
            ld0 s4Var = new s4(e4Var2, (h) nd0Var2, (i) nd0Var3, i19, i20, nd0Var);
            nd0Var.setOnValueChangedListener(s4Var);
            nd0Var2.setMinValue(0);
            nd0Var2.setMaxValue(23);
            linearLayout.addView((View) nd0Var2, kb1.p(0.2f, 0, 270));
            nd0Var2.setFormatter(new d(1));
            nd0Var2.setOnValueChangedListener(s4Var);
            nd0Var3.setMinValue(0);
            nd0Var3.setMaxValue(11);
            nd0Var3.setValue(0);
            nd0Var3.setFormatter(new d(2));
            linearLayout.addView((View) nd0Var3, kb1.p(0.3f, 0, 270));
            nd0Var3.setOnValueChangedListener(s4Var);
            if (j10 > 0) {
                e4Var = e4Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j10);
                nd0Var3.setValue(calendar.get(12) / 5);
                nd0Var2.setValue(calendar.get(11));
                nd0Var.setValue((int) ((j10 - calendar.getTimeInMillis()) / 86400000));
                nd0Var.getValue();
                s4Var.q(nd0Var, nd0Var.getValue());
                nd0Var2.getValue();
                s4Var.q(nd0Var2, nd0Var2.getValue());
            } else {
                e4Var = e4Var2;
            }
            dn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            dn0Var.setGravity(17);
            dn0Var.setTextColor(d5Var.f27343g);
            dn0Var.setTextSize(1, 14.0f);
            dn0Var.setTypeface(AndroidUtilities.bold());
            dn0Var.setBackground(o6.e(new float[]{8.0f}, d5Var.h));
            dn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            e4Var.addView(dn0Var, kb1.x(-1, 48, 83, 16, 15, 16, 16));
            dn0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, nd0Var, nd0Var2, nd0Var3, uVar, e3Var));
            e3Var.b(e4Var);
            k3 k3Var = e3Var.f22602a;
            k3Var.show();
            int i21 = d5Var.f27340b;
            k3Var.setBackgroundColor(i21);
            k3Var.fixNavigationBar(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(k3Var, z10);
        } else if (view instanceof xg.b) {
            w1 w1Var4 = a0Var.f50169r0;
            if (w1Var4 != null) {
                ((z0) w1Var4.f18292b).V(2, a0Var.f50155c0);
                ((n) w1Var4.f18293c).f50242b.E(1);
            }
        } else if (view instanceof xg.w) {
            TL_stars.TL_starsGiveawayOption option = ((xg.w) view).getOption();
            if (option != null) {
                a0Var.f50167p0 = option.stars;
                a0Var.a0(true, true);
                a0Var.Z(true);
                a0Var.N();
            }
        } else if (view instanceof jc) {
            a0Var.f50163k0 = true;
            a0Var.a0(true, true);
        }
    }

    public static void R(a0 a0Var) {
        tg.m1 m1Var = new tg.m1(a0Var.f26793n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        m1Var.setOnDismissListener(new w(a0Var, 1));
        m1Var.setOnShowListener(new x(a0Var, 1));
        m1Var.show();
    }

    public static void S(a0 a0Var) {
        tg.m1 m1Var = new tg.m1(a0Var.f26793n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        m1Var.setOnDismissListener(new w(a0Var, 0));
        m1Var.setOnShowListener(new x(a0Var, 0));
        m1Var.show();
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        this.f50170s0 = i10;
    }

    public final ArrayList T(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(j10);
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
        int i10 = this.f50160h0;
        int i11 = xg.d.v;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f50165n0)).intValue();
        }
        List X = X();
        int i12 = this.f50166o0;
        if (i12 < 0 || i12 >= X.size()) {
            this.f50166o0 = 0;
        }
        if (this.f50166o0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.f50166o0)).intValue();
    }

    public final int V() {
        int U;
        int g7;
        int i10 = this.f50160h0;
        int i11 = xg.d.v;
        if (i10 == 2) {
            U = ((Integer) this.Y.get(this.f50165n0)).intValue();
            g7 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.f50167p0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g7 = s.g();
        }
        return g7 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList v = ca.y(this.currentAccount, false).v();
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

    public final List X() {
        int i10 = this.f50160h0;
        int i11 = xg.d.v;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.f50167p0);
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
        if (this.f50172u0 != null) {
            return true;
        }
        return false;
    }

    public final void Z(boolean z10) {
        boolean z11;
        boolean Y = Y();
        xg.a aVar = this.f50168q0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f50172u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(s.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f50161i0;
        int i11 = xg.d.v;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.f50156d0;
        int g7 = s.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.e = true;
        fi.d dVar = aVar.f51809a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g7, z10);
        dVar.i(LocaleController.getString(R.string.GiftPremium), z10, true);
        f7.i(y6.f23428h5, aVar.f51810b, aVar.f51811c);
    }

    public final void a0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: vg.a0.a0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        nm0 nm0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (nm0Var = this.d) != null && nm0Var.G) {
            a0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        k kVar = this.f50171t0;
        if (kVar != null) {
            kVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        wg.b bVar = new wg.b(this.resourcesProvider);
        this.f50159g0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f50161i0;
        int i11 = xg.d.v;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
