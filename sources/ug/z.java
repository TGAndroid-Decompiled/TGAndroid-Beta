package ug;

import ai.ga;
import ai.j2;
import ai.rc;
import ai.s9;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.y4;
import com.google.android.gms.internal.play_billing.k3;
import gi.d3;
import gi.j4;
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
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d4;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.e20;
import org.telegram.ui.kd0;
import w7.z5;
public final class z extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f47798a0;
    public final TLRPC.Chat f47799b0;
    public final ArrayList f47800c0;
    public final ArrayList f47801d0;
    public final ArrayList f47802e0;
    public final ArrayList f47803f0;
    public vg.b f47804g0;
    public int f47805h0;
    public int f47806i0;
    public int f47807j0;
    public boolean f47808k0;
    public int f47809l0;
    public long m0;
    public int f47810n0;
    public int f47811o0;
    public long f47812p0;
    public final wg.a f47813q0;
    public n2.e f47814r0;
    public int f47815s0;
    public j f47816t0;
    public final TL_stories.PrepaidGiveaway f47817u0;
    public String f47818v0;
    public boolean f47819w0;
    public boolean f47820x0;
    public final s f47821y0;

    public z(n2 n2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(n2Var, false);
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
        this.f47798a0 = Arrays.asList(750, 10000, 50000);
        this.f47800c0 = new ArrayList();
        this.f47801d0 = new ArrayList();
        this.f47802e0 = new ArrayList();
        this.f47803f0 = new ArrayList();
        int i10 = wg.d.v;
        this.f47805h0 = 2;
        this.f47806i0 = 0;
        int i11 = wg.u.v;
        this.f47807j0 = 0;
        this.f47809l0 = 12;
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
        this.f47810n0 = 2;
        this.f47811o0 = 2;
        this.f47818v0 = "";
        this.f47820x0 = true;
        this.f47821y0 = new s(this, 0);
        this.f47817u0 = prepaidGiveaway;
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
            this.f47805h0 = 3;
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.f45946m = false;
        this.d.setItemAnimator(kVar);
        im0 im0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        im0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new y4(23, this, n2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f47799b0 = chat;
        vg.b bVar = this.f47804g0;
        ArrayList arrayList = this.X;
        im0 im0Var2 = this.d;
        t tVar = new t(this);
        t tVar2 = new t(this);
        t tVar3 = new t(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f48349f = im0Var2;
        bVar.h = tVar;
        bVar.f48350n = tVar2;
        bVar.f48352s = tVar3;
        b0(false, false);
        wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
        this.f47813q0 = aVar;
        aVar.setOnClickListener(new ur(this, prepaidGiveaway, j10, n2Var));
        a0(false);
        this.containerView.addView(aVar, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        r.j(this.currentAccount, chat, new u(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void Q(z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, n2 n2Var) {
        boolean z10;
        int i10;
        boolean z11;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j11;
        ArrayList arrayList = zVar.f47802e0;
        ArrayList arrayList2 = zVar.f47800c0;
        TLRPC.Chat chat = zVar.f47799b0;
        ArrayList arrayList3 = zVar.f47801d0;
        ArrayList arrayList4 = zVar.f47803f0;
        wg.a aVar = zVar.f47813q0;
        if (!aVar.f48942a.N) {
            if (zVar.Z()) {
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
                w2 w2Var = new w2(zVar, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, j11, 8);
                n2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    b2 b2Var = alertDialog$Builder.f20602a;
                    b2Var.R = string;
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new qg.h0(w2Var, 21));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sg.y(15));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i11 = zVar.f47805h0;
            int i12 = wg.d.v;
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(zVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption X = zVar.X(zVar.f47812p0);
                    int V = zVar.V();
                    if (X != null) {
                        aVar.f48942a.setLoading(true);
                        int i13 = zVar.f47807j0;
                        int i14 = wg.u.v;
                        if (i13 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ga y3 = ga.y(zVar.currentAccount, false);
                        int l4 = r.l(zVar.m0);
                        boolean z12 = zVar.f47820x0;
                        boolean z13 = zVar.f47819w0;
                        String str2 = zVar.f47818v0;
                        s1 s1Var = new s1(6, zVar, X);
                        int i15 = y3.f1363a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            n2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                ga.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                ga.e0(findActivity, null);
                                return;
                            }
                        }
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                        Activity activity = findActivity;
                        tL_inputStorePaymentStarsGiveaway.stars = X.stars;
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
                            tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                        }
                        tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i15).getNextRandomId();
                        tL_inputStorePaymentStarsGiveaway.until_date = l4;
                        tL_inputStorePaymentStarsGiveaway.currency = X.currency;
                        tL_inputStorePaymentStarsGiveaway.amount = X.amount;
                        tL_inputStorePaymentStarsGiveaway.users = V;
                        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = X.store_product) != null) {
                            ?? obj3 = new Object();
                            obj3.f4695b = "inapp";
                            obj3.f4694a = str;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(obj3.a()), new a1.d(y3, s1Var, tL_inputStorePaymentStarsGiveaway, activity, 2));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = d3.q(ga.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new j2(y3, s1Var, tL_inputInvoiceStars, 4));
                    }
                }
            } else if (zVar.f47806i0 == 1) {
                ArrayList b10 = r.b(arrayList3.size(), arrayList4);
                for (int i18 = 0; i18 < b10.size(); i18++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                    if (tL_premiumGiftCodeOption.months == zVar.f47809l0 && arrayList3.size() > 0) {
                        if (r.h()) {
                            Context context = zVar.getContext();
                            d6 d6Var = zVar.resourcesProvider;
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
                                b2 b2Var2 = alertDialog$Builder2.f20602a;
                                b2Var2.R = string2;
                                b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i20, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new sg.y(12));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        r.k(arrayList3, tL_premiumGiftCodeOption, zVar.f47799b0, null, n2Var, new u(zVar, 0), new u(zVar, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = r.b(zVar.V(), arrayList4);
                for (int i21 = 0; i21 < b11.size(); i21++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                    if (tL_premiumGiftCodeOption3.months == zVar.f47809l0) {
                        if (r.h()) {
                            List list = zVar.Y;
                            Context context2 = zVar.getContext();
                            d6 d6Var2 = zVar.resourcesProvider;
                            u uVar = new u(zVar, 2);
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
                                b2 b2Var3 = alertDialog$Builder3.f20602a;
                                b2Var3.R = string3;
                                b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i26, formatPluralString, Integer.valueOf(i27)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new org.telegram.ui.web.m(14, uVar, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new sg.y(12));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i28 = zVar.f47807j0;
                        int i29 = wg.u.v;
                        if (i28 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l10 = r.l(zVar.m0);
                        aVar.b(true);
                        boolean z14 = zVar.f47820x0;
                        boolean z15 = zVar.f47819w0;
                        String str3 = zVar.f47818v0;
                        u uVar2 = new u(zVar, 3);
                        u uVar3 = new u(zVar, 4);
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
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f20273id));
                                } else {
                                    i10 = i32;
                                }
                                i31 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20273id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20273id);
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
                            JSONObject q10 = d3.q(n2Var.getResourceProvider(), false);
                            if (q10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = q10.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new s9(uVar3, messagesController, tL_inputInvoicePremiumGiftCode, n2Var, uVar2, 13));
                            return;
                        }
                        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                        tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                        tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                        tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
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
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f20273id));
                            }
                        }
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f20273id);
                        int size9 = arrayList.size();
                        int i36 = 0;
                        while (i36 < size9) {
                            Object obj10 = arrayList.get(i36);
                            i36++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                        }
                        ?? obj11 = new Object();
                        obj11.f4695b = "inapp";
                        obj11.f4694a = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj11.a()), new org.telegram.ui.Components.d1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, uVar3, uVar2, n2Var, 3));
                        return;
                    }
                }
            }
        }
    }

    public static void R(z zVar, n2 n2Var, View view) {
        boolean z10;
        n2.e eVar;
        boolean z11;
        ArrayList arrayList = zVar.f47801d0;
        s sVar = zVar.f47821y0;
        if (view instanceof wg.y) {
            wg.y yVar = (wg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = wg.y.L;
            if (type == 0) {
                zVar.f47820x0 = z13;
                zVar.b0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                zVar.f47819w0 = z13;
                zVar.b0(false, false);
                vg.b bVar = zVar.f47804g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    vg.a aVar = (vg.a) bVar.e.get(i11);
                    if (aVar.f44288a == 15) {
                        int i12 = aVar.f48347l;
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
                zVar.f47804g0.G();
                if (!zVar.f47819w0) {
                    AndroidUtilities.runOnUIThread(sVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(sVar);
                }
            }
        }
        if (view instanceof wg.c) {
            if (view instanceof wg.d) {
                int selectedType = ((wg.d) view).getSelectedType();
                int i14 = wg.d.v;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        n2.e eVar2 = zVar.f47814r0;
                        if (eVar2 != null) {
                            ((y0) eVar2.f17039b).W(1, arrayList);
                            ((m) eVar2.f17040c).f47703b.D(1);
                        }
                    } else {
                        zVar.f47806i0 = selectedType;
                        zVar.b0(true, true);
                        zVar.a0(true);
                        zVar.O();
                    }
                } else if (selectedType == 2 && zVar.f47805h0 == selectedType) {
                    n2.e eVar3 = zVar.f47814r0;
                    if (eVar3 != null) {
                        ((y0) eVar3.f17039b).W(1, arrayList);
                        ((m) eVar3.f17040c).f47703b.D(1);
                        return;
                    }
                    return;
                } else {
                    zVar.f47805h0 = selectedType;
                    zVar.b0(true, true);
                    zVar.a0(true);
                    zVar.O();
                }
            } else {
                wg.c cVar = (wg.c) view;
                im0 im0Var = zVar.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < im0Var.getChildCount(); i15++) {
                        View childAt = im0Var.getChildAt(i15);
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
            if (zVar.f47807j0 == selectedType2 && (eVar = zVar.f47814r0) != null) {
                ((y0) eVar.f17039b).W(3, zVar.f47802e0);
                ((m) eVar.f17040c).f47703b.D(1);
            }
            zVar.f47807j0 = selectedType2;
            zVar.b0(false, false);
        } else if (view instanceof wg.i) {
            zVar.f47809l0 = ((TLRPC.TL_premiumGiftCodeOption) ((wg.i) view).getGifCode()).months;
            zVar.b0(false, false);
            zVar.f47804g0.G();
        } else if (view instanceof wg.h) {
            Context context = n2Var.getContext();
            long j10 = zVar.m0;
            t tVar = new t(zVar);
            d6 d6Var = zVar.resourcesProvider;
            d5 d5Var = new d5(d6Var);
            a3 a3Var = new a3(context, d6Var);
            a3Var.a();
            od0 od0Var = new od0(context, d6Var);
            int i16 = d5Var.f25408a;
            od0Var.setTextColor(i16);
            od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            od0Var.setItemCount(5);
            ?? od0Var2 = new od0(context, d6Var);
            od0Var2.setWrapSelectorWheel(true);
            od0Var2.setAllItemsCount(24);
            od0Var2.setItemCount(5);
            od0Var2.setTextColor(i16);
            od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            od0Var2.setTag("HOUR");
            ?? od0Var3 = new od0(context, d6Var);
            od0Var3.setWrapSelectorWheel(true);
            od0Var3.setAllItemsCount(60);
            od0Var3.setItemCount(5);
            od0Var3.setTextColor(i16);
            od0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            d4 d4Var = new d4(context, d5Var, od0Var, (g) od0Var2, (h) od0Var3);
            d4Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            d4Var.addView(frameLayout, z5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            k3.m(20.0f, 1, textView);
            frameLayout.addView(textView, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new di.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            d4Var.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            kd0 kd0Var = new kd0(context, 4);
            long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j11);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(od0Var, z5.l(0.5f, 0, 270));
            od0Var.setMinValue(0);
            od0Var.setMaxValue(i18 - 1);
            od0Var.setWrapSelectorWheel(false);
            od0Var.setTag("DAY");
            od0Var.setFormatter(new e20(currentTimeMillis, calendar, i17, 1));
            md0 j4Var = new j4(d4Var, (g) od0Var2, (h) od0Var3, i19, i20, od0Var);
            od0Var.setOnValueChangedListener(j4Var);
            od0Var2.setMinValue(0);
            od0Var2.setMaxValue(23);
            linearLayout.addView((View) od0Var2, z5.l(0.2f, 0, 270));
            od0Var2.setFormatter(new sg.y(13));
            od0Var2.setOnValueChangedListener(j4Var);
            od0Var3.setMinValue(0);
            od0Var3.setMaxValue(11);
            od0Var3.setValue(0);
            od0Var3.setFormatter(new sg.y(14));
            linearLayout.addView((View) od0Var3, z5.l(0.3f, 0, 270));
            od0Var3.setOnValueChangedListener(j4Var);
            if (j10 > 0) {
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j10);
                od0Var3.setValue(calendar.get(12) / 5);
                od0Var2.setValue(calendar.get(11));
                od0Var.setValue((int) ((j10 - calendar.getTimeInMillis()) / 86400000));
                od0Var.getValue();
                j4Var.q(od0Var, od0Var.getValue());
                od0Var2.getValue();
                j4Var.q(od0Var2, od0Var2.getValue());
            }
            kd0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            kd0Var.setGravity(17);
            kd0Var.setTextColor(d5Var.f25412g);
            kd0Var.setTextSize(1, 14.0f);
            kd0Var.setTypeface(AndroidUtilities.bold());
            kd0Var.setBackground(x5.e(new float[]{8.0f}, d5Var.h));
            kd0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            d4Var.addView(kd0Var, z5.t(-1, 48, 83, 16, 15, 16, 16));
            kd0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, od0Var, od0Var2, od0Var3, tVar, a3Var));
            a3Var.b(d4Var);
            f3 f3Var = a3Var.f20610a;
            f3Var.show();
            int i21 = d5Var.f25409b;
            f3Var.setBackgroundColor(i21);
            f3Var.fixNavigationBar(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(f3Var, z10);
        } else if (view instanceof wg.b) {
            n2.e eVar4 = zVar.f47814r0;
            if (eVar4 != null) {
                ((y0) eVar4.f17039b).W(2, zVar.f47800c0);
                ((m) eVar4.f17040c).f47703b.D(1);
            }
        } else if (view instanceof wg.w) {
            TL_stars.TL_starsGiveawayOption option = ((wg.w) view).getOption();
            if (option != null) {
                zVar.f47812p0 = option.stars;
                zVar.b0(true, true);
                zVar.a0(true);
                zVar.O();
            }
        } else if (view instanceof rc) {
            zVar.f47808k0 = true;
            zVar.b0(true, true);
        }
    }

    public static void S(z zVar) {
        sg.m1 m1Var = new sg.m1(zVar.f24897n, zVar.currentAccount, null, zVar.resourcesProvider);
        m1Var.setOnDismissListener(new v(zVar, 1));
        m1Var.setOnShowListener(new w(zVar, 1));
        m1Var.show();
    }

    public static void T(z zVar) {
        sg.m1 m1Var = new sg.m1(zVar.f24897n, zVar.currentAccount, null, zVar.resourcesProvider);
        m1Var.setOnDismissListener(new v(zVar, 0));
        m1Var.setOnShowListener(new w(zVar, 0));
        m1Var.show();
    }

    @Override
    public final CharSequence A() {
        int i10 = this.f47806i0;
        int i11 = wg.d.v;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    @Override
    public final void D(Canvas canvas, int i10) {
        this.f47815s0 = i10;
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
        int i10 = this.f47805h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f47810n0)).intValue();
        }
        List Y = Y();
        int i12 = this.f47811o0;
        if (i12 < 0 || i12 >= Y.size()) {
            this.f47811o0 = 0;
        }
        if (this.f47811o0 >= Y.size()) {
            return 0;
        }
        return ((Integer) Y.get(this.f47811o0)).intValue();
    }

    public final int W() {
        int V;
        int g10;
        int i10 = this.f47805h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            V = ((Integer) this.Y.get(this.f47810n0)).intValue();
            g10 = r.g();
        } else {
            TL_stars.TL_starsGiveawayOption X = X(this.f47812p0);
            if (X != null) {
                return X.yearly_boosts;
            }
            V = V();
            g10 = r.g();
        }
        return g10 * V;
    }

    public final TL_stars.TL_starsGiveawayOption X(long j10) {
        ArrayList v = ga.y(this.currentAccount, false).v();
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
        int i10 = this.f47805h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(this.f47812p0);
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
        if (this.f47817u0 != null) {
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean Z = Z();
        wg.a aVar = this.f47813q0;
        if (Z) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f47817u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(r.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f47806i0;
        int i11 = wg.d.v;
        if (i10 == 0) {
            aVar.a(W(), z10);
            return;
        }
        ArrayList arrayList = this.f47801d0;
        int g10 = r.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.e = true;
        ei.d dVar = aVar.f48942a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f48943b.setBackgroundColor(h6.w0(h6.f21058h5, aVar.f48944c));
    }

    public final void b0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ug.z.b0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        im0 im0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (im0Var = this.d) != null && im0Var.G) {
            b0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        j jVar = this.f47816t0;
        if (jVar != null) {
            jVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        vg.b bVar = new vg.b(this.resourcesProvider);
        this.f47804g0 = bVar;
        return bVar;
    }
}
