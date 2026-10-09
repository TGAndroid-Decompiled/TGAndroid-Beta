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
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gn0;
import org.telegram.ui.v20;
import qg.x1;
import w7.x5;
import yh.m5;
import yh.y6;
public final class a0 extends eb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f48266a0;
    public final TLRPC.Chat f48267b0;
    public final ArrayList f48268c0;
    public final ArrayList f48269d0;
    public final ArrayList f48270e0;
    public final ArrayList f48271f0;
    public ug.b f48272g0;
    public int f48273h0;
    public int f48274i0;
    public int f48275j0;
    public boolean f48276k0;
    public int f48277l0;
    public long m0;
    public int f48278n0;
    public int f48279o0;
    public long f48280p0;
    public final vg.a f48281q0;
    public b5 f48282r0;
    public int f48283s0;
    public j f48284t0;
    public final TL_stories.PrepaidGiveaway f48285u0;
    public String f48286v0;
    public boolean f48287w0;
    public boolean f48288x0;
    public final t f48289y0;

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
        this.f48266a0 = Arrays.asList(750, 10000, 50000);
        this.f48268c0 = new ArrayList();
        this.f48269d0 = new ArrayList();
        this.f48270e0 = new ArrayList();
        this.f48271f0 = new ArrayList();
        int i10 = vg.d.v;
        this.f48273h0 = 2;
        this.f48274i0 = 0;
        int i11 = vg.u.v;
        this.f48275j0 = 0;
        this.f48277l0 = 12;
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
        this.f48278n0 = 2;
        this.f48279o0 = 2;
        this.f48286v0 = "";
        this.f48288x0 = true;
        this.f48289y0 = new t(this, 0);
        this.f48285u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        O();
        ((ViewGroup.MarginLayoutParams) this.f26023e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f26023e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = vg.d.v;
            this.f48273h0 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(hs.h);
        jVar.C = false;
        jVar.f47698m = false;
        this.d.setItemAnimator(jVar);
        qm0 qm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new o6(23, this, n2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f48267b0 = chat;
        ug.b bVar = this.f48272g0;
        ArrayList arrayList = this.X;
        qm0 qm0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.f48911e = arrayList;
        bVar.v = chat;
        bVar.f48912f = qm0Var2;
        bVar.h = uVar;
        bVar.f48913n = uVar2;
        bVar.f48915s = uVar3;
        b0(false, false);
        vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
        this.f48281q0 = aVar;
        aVar.setOnClickListener(new as(this, prepaidGiveaway, j3, n2Var));
        a0(false);
        this.containerView.addView(aVar, x5.a(68.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        s.j(this.currentAccount, chat, new v(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void Q(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, n2 n2Var) {
        boolean z10;
        int i10;
        boolean z11;
        String str;
        long j10;
        ArrayList arrayList = a0Var.f48270e0;
        ArrayList arrayList2 = a0Var.f48268c0;
        TLRPC.Chat chat = a0Var.f48267b0;
        ArrayList arrayList3 = a0Var.f48269d0;
        ArrayList arrayList4 = a0Var.f48271f0;
        vg.a aVar = a0Var.f48281q0;
        if (!aVar.f49563a.N) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = null;
            if (a0Var.Z()) {
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                }
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway2 = tL_prepaidStarsGiveaway;
                if (tL_prepaidStarsGiveaway2 != null) {
                    j10 = tL_prepaidStarsGiveaway2.stars;
                } else {
                    j10 = 0;
                }
                t2 t2Var = new t2(a0Var, prepaidGiveaway, tL_prepaidStarsGiveaway2, j3, j10, 8);
                n2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    b2 b2Var = alertDialog$Builder.f20374a;
                    b2Var.R = string;
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new r5.d(t2Var, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(12));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i11 = a0Var.f48273h0;
            int i12 = vg.d.v;
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption X = a0Var.X(a0Var.f48280p0);
                    int V = a0Var.V();
                    if (X != null) {
                        aVar.f49563a.setLoading(true);
                        int i13 = a0Var.f48275j0;
                        int i14 = vg.u.v;
                        if (i13 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        m5 y3 = m5.y(a0Var.currentAccount, false);
                        int l4 = s.l(a0Var.m0);
                        boolean z12 = a0Var.f48288x0;
                        boolean z13 = a0Var.f48287w0;
                        String str2 = a0Var.f48286v0;
                        qh.r rVar = new qh.r(1, a0Var, X);
                        int i15 = y3.f52880a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            n2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                m5.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                m5.e0(findActivity, null);
                                return;
                            }
                        }
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
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
                            c5.a aVar2 = new c5.a();
                            aVar2.f4199c = "inapp";
                            aVar2.f4198b = str;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(aVar2.a()), new a1.d(y3, rVar, tL_inputStorePaymentStarsGiveaway, findActivity, 22));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = k3.q(m5.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new t5(y3, rVar, tL_inputInvoiceStars, 26));
                    }
                }
            } else if (a0Var.f48274i0 == 1) {
                ArrayList b10 = s.b(arrayList3.size(), arrayList4);
                for (int i18 = 0; i18 < b10.size(); i18++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                    if (tL_premiumGiftCodeOption.months == a0Var.f48277l0 && arrayList3.size() > 0) {
                        if (s.h()) {
                            Context context = a0Var.getContext();
                            e6 e6Var = a0Var.resourcesProvider;
                            if (tL_premiumGiftCodeOption.store_product == null) {
                                ArrayList arrayList6 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i19 = 0;
                                while (i19 < size3) {
                                    Object obj3 = arrayList4.get(i19);
                                    i19++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                        arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                    }
                                }
                                String join = TextUtils.join(", ", arrayList6);
                                int i20 = tL_premiumGiftCodeOption.users;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, e6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                b2 b2Var2 = alertDialog$Builder2.f20374a;
                                b2Var2.R = string2;
                                b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i20, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(9));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.f48267b0, null, n2Var, new v(a0Var, 0), new v(a0Var, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = s.b(a0Var.V(), arrayList4);
                for (int i21 = 0; i21 < b11.size(); i21++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                    if (tL_premiumGiftCodeOption3.months == a0Var.f48277l0) {
                        if (s.h()) {
                            List list = a0Var.Y;
                            Context context2 = a0Var.getContext();
                            e6 e6Var2 = a0Var.resourcesProvider;
                            v vVar = new v(a0Var, 2);
                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                ArrayList arrayList7 = new ArrayList();
                                int size4 = arrayList4.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    Object obj4 = arrayList4.get(i22);
                                    i22++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                        arrayList7.add(tL_premiumGiftCodeOption4);
                                    }
                                }
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                int size5 = arrayList7.size();
                                int i23 = 0;
                                while (i23 < size5) {
                                    Object obj5 = arrayList7.get(i23);
                                    i23++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                    int i24 = tL_premiumGiftCodeOption3.users;
                                    int i25 = tL_premiumGiftCodeOption6.users;
                                    if (i24 > i25 && i25 > tL_premiumGiftCodeOption5.users) {
                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                    }
                                }
                                String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                                int i26 = tL_premiumGiftCodeOption3.users;
                                int i27 = tL_premiumGiftCodeOption5.users;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, e6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                b2 b2Var3 = alertDialog$Builder3.f20374a;
                                b2Var3.R = string3;
                                b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i26, formatPluralString, Integer.valueOf(i27)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new x1(6, vVar, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(9));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i28 = a0Var.f48275j0;
                        int i29 = vg.u.v;
                        if (i28 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l10 = s.l(a0Var.m0);
                        aVar.b(true);
                        boolean z14 = a0Var.f48288x0;
                        boolean z15 = a0Var.f48287w0;
                        String str3 = a0Var.f48286v0;
                        v vVar2 = new v(a0Var, 3);
                        v vVar3 = new v(a0Var, 4);
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
                                Object obj6 = arrayList2.get(i31);
                                int i32 = i31 + 1;
                                TLObject tLObject = (TLObject) obj6;
                                if (tLObject instanceof TLRPC.Chat) {
                                    i10 = i32;
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f20038id));
                                } else {
                                    i10 = i32;
                                }
                                i31 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20038id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20038id);
                            tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                            tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                            int size7 = arrayList.size();
                            int i33 = 0;
                            while (i33 < size7) {
                                Object obj7 = arrayList.get(i33);
                                i33++;
                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                            }
                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                            JSONObject q10 = k3.q(n2Var.getResourceProvider(), false);
                            if (q10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = q10.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new hd(vVar3, messagesController, tL_inputInvoicePremiumGiftCode, n2Var, vVar2, 12));
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
                            Object obj8 = arrayList2.get(i35);
                            i35++;
                            TLObject tLObject2 = (TLObject) obj8;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f20038id));
                            }
                        }
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f20038id);
                        int size9 = arrayList.size();
                        int i36 = 0;
                        while (i36 < size9) {
                            Object obj9 = arrayList.get(i36);
                            i36++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                        }
                        c5.a aVar3 = new c5.a();
                        aVar3.f4199c = "inapp";
                        aVar3.f4198b = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(aVar3.a()), new org.telegram.ui.Components.d1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, vVar3, vVar2, n2Var, 3));
                        return;
                    }
                }
            }
        }
    }

    public static void R(a0 a0Var, n2 n2Var, View view) {
        e5 e5Var;
        boolean z10;
        b5 b5Var;
        boolean z11;
        ArrayList arrayList = a0Var.f48269d0;
        t tVar = a0Var.f48289y0;
        if (view instanceof vg.y) {
            vg.y yVar = (vg.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.f23688e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = vg.y.L;
            if (type == 0) {
                a0Var.f48288x0 = z13;
                a0Var.b0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                a0Var.f48287w0 = z13;
                a0Var.b0(false, false);
                ug.b bVar = a0Var.f48272g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f48911e.size()) {
                        break;
                    }
                    ug.a aVar = (ug.a) bVar.f48911e.get(i11);
                    if (aVar.f17125a == 15) {
                        int i12 = aVar.f48909l;
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
                a0Var.f48272g0.G();
                if (!a0Var.f48287w0) {
                    AndroidUtilities.runOnUIThread(tVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(tVar);
                }
            }
        }
        if (view instanceof vg.c) {
            if (view instanceof vg.d) {
                int selectedType = ((vg.d) view).getSelectedType();
                int i14 = vg.d.v;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        b5 b5Var2 = a0Var.f48282r0;
                        if (b5Var2 != null) {
                            ((z0) b5Var2.f20461b).W(1, arrayList);
                            ((m) b5Var2.f20462c).f48352b.D(1);
                        }
                    } else {
                        a0Var.f48274i0 = selectedType;
                        a0Var.b0(true, true);
                        a0Var.a0(true);
                        a0Var.O();
                    }
                } else if (selectedType == 2 && a0Var.f48273h0 == selectedType) {
                    b5 b5Var3 = a0Var.f48282r0;
                    if (b5Var3 != null) {
                        ((z0) b5Var3.f20461b).W(1, arrayList);
                        ((m) b5Var3.f20462c).f48352b.D(1);
                        return;
                    }
                    return;
                } else {
                    a0Var.f48273h0 = selectedType;
                    a0Var.b0(true, true);
                    a0Var.a0(true);
                    a0Var.O();
                }
            } else {
                vg.c cVar = (vg.c) view;
                qm0 qm0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < qm0Var.getChildCount(); i15++) {
                        View childAt = qm0Var.getChildAt(i15);
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
            if (a0Var.f48275j0 == selectedType2 && (b5Var = a0Var.f48282r0) != null) {
                ((z0) b5Var.f20461b).W(3, a0Var.f48270e0);
                ((m) b5Var.f20462c).f48352b.D(1);
            }
            a0Var.f48275j0 = selectedType2;
            a0Var.b0(false, false);
        } else if (view instanceof vg.i) {
            a0Var.f48277l0 = ((TLRPC.TL_premiumGiftCodeOption) ((vg.i) view).getGifCode()).months;
            a0Var.b0(false, false);
            a0Var.f48272g0.G();
        } else if (view instanceof vg.h) {
            Context context = n2Var.getContext();
            long j3 = a0Var.m0;
            u uVar = new u(a0Var);
            e6 e6Var = a0Var.resourcesProvider;
            e5 e5Var2 = new e5(e6Var);
            a3 a3Var = new a3(context, e6Var);
            a3Var.a();
            ud0 ud0Var = new ud0(context, e6Var);
            int i16 = e5Var2.f25949a;
            ud0Var.setTextColor(i16);
            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            ud0Var.setItemCount(5);
            ?? ud0Var2 = new ud0(context, e6Var);
            ud0Var2.setWrapSelectorWheel(true);
            ud0Var2.setAllItemsCount(24);
            ud0Var2.setItemCount(5);
            ud0Var2.setTextColor(i16);
            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            ud0Var2.setTag("HOUR");
            ?? ud0Var3 = new ud0(context, e6Var);
            ud0Var3.setWrapSelectorWheel(true);
            ud0Var3.setAllItemsCount(60);
            ud0Var3.setItemCount(5);
            ud0Var3.setTextColor(i16);
            ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            e4 e4Var = new e4(context, e5Var2, ud0Var, (g) ud0Var2, (h) ud0Var3);
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
            gn0 gn0Var = new gn0(context, 3);
            long j10 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(ud0Var, x5.l(0.5f, 0, 270));
            ud0Var.setMinValue(0);
            ud0Var.setMaxValue(i18 - 1);
            ud0Var.setWrapSelectorWheel(false);
            ud0Var.setTag("DAY");
            ud0Var.setFormatter(new v20(currentTimeMillis, calendar, i17, 1));
            sd0 t4Var = new t4(e4Var, (g) ud0Var2, (h) ud0Var3, i19, i20, ud0Var);
            ud0Var.setOnValueChangedListener(t4Var);
            ud0Var2.setMinValue(0);
            ud0Var2.setMaxValue(23);
            linearLayout.addView((View) ud0Var2, x5.l(0.2f, 0, 270));
            ud0Var2.setFormatter(new s0.b(10));
            ud0Var2.setOnValueChangedListener(t4Var);
            ud0Var3.setMinValue(0);
            ud0Var3.setMaxValue(11);
            ud0Var3.setValue(0);
            ud0Var3.setFormatter(new s0.b(11));
            linearLayout.addView((View) ud0Var3, x5.l(0.3f, 0, 270));
            ud0Var3.setOnValueChangedListener(t4Var);
            if (j3 > 0) {
                e5Var = e5Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                ud0Var3.setValue(calendar.get(12) / 5);
                ud0Var2.setValue(calendar.get(11));
                ud0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                ud0Var.getValue();
                t4Var.r(ud0Var, ud0Var.getValue());
                ud0Var2.getValue();
                t4Var.r(ud0Var2, ud0Var2.getValue());
            } else {
                e5Var = e5Var2;
            }
            gn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            gn0Var.setGravity(17);
            gn0Var.setTextColor(e5Var.f25954g);
            gn0Var.setTextSize(1, 14.0f);
            gn0Var.setTypeface(AndroidUtilities.bold());
            gn0Var.setBackground(y5.e(new float[]{8.0f}, e5Var.h));
            gn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            e4Var.addView(gn0Var, x5.t(-1, 48, 83, 16, 15, 16, 16));
            gn0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, ud0Var, ud0Var2, ud0Var3, uVar, a3Var));
            a3Var.b(e4Var);
            f3 f3Var = a3Var.f20380a;
            f3Var.show();
            int i21 = e5Var.f25950b;
            f3Var.setBackgroundColor(i21);
            f3Var.fixNavigationBar(i21);
            if (i0.a.f(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(f3Var, z10);
        } else if (view instanceof vg.b) {
            b5 b5Var4 = a0Var.f48282r0;
            if (b5Var4 != null) {
                ((z0) b5Var4.f20461b).W(2, a0Var.f48268c0);
                ((m) b5Var4.f20462c).f48352b.D(1);
            }
        } else if (view instanceof vg.w) {
            TL_stars.TL_starsGiveawayOption option = ((vg.w) view).getOption();
            if (option != null) {
                a0Var.f48280p0 = option.stars;
                a0Var.b0(true, true);
                a0Var.a0(true);
                a0Var.O();
            }
        } else if (view instanceof y6) {
            a0Var.f48276k0 = true;
            a0Var.b0(true, true);
        }
    }

    public static void S(a0 a0Var) {
        rg.l1 l1Var = new rg.l1(a0Var.f26025n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        l1Var.setOnDismissListener(new w(a0Var, 1));
        l1Var.setOnShowListener(new x(a0Var, 1));
        l1Var.show();
    }

    public static void T(a0 a0Var) {
        rg.l1 l1Var = new rg.l1(a0Var.f26025n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        l1Var.setOnDismissListener(new w(a0Var, 0));
        l1Var.setOnShowListener(new x(a0Var, 0));
        l1Var.show();
    }

    @Override
    public final CharSequence B() {
        int i10 = this.f48274i0;
        int i11 = vg.d.v;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    @Override
    public final void E(Canvas canvas, int i10) {
        this.f48283s0 = i10;
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
        int i10 = this.f48273h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f48278n0)).intValue();
        }
        List Y = Y();
        int i12 = this.f48279o0;
        if (i12 < 0 || i12 >= Y.size()) {
            this.f48279o0 = 0;
        }
        if (this.f48279o0 >= Y.size()) {
            return 0;
        }
        return ((Integer) Y.get(this.f48279o0)).intValue();
    }

    public final int W() {
        int V;
        int g10;
        int i10 = this.f48273h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            V = ((Integer) this.Y.get(this.f48278n0)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption X = X(this.f48280p0);
            if (X != null) {
                return X.yearly_boosts;
            }
            V = V();
            g10 = s.g();
        }
        return g10 * V;
    }

    public final TL_stars.TL_starsGiveawayOption X(long j3) {
        ArrayList v = m5.y(this.currentAccount, false).v();
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
        int i10 = this.f48273h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(this.f48280p0);
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
        if (this.f48285u0 != null) {
            return true;
        }
        return false;
    }

    public final void a0(boolean z10) {
        boolean z11;
        boolean Z = Z();
        vg.a aVar = this.f48281q0;
        if (Z) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f48285u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(s.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f48274i0;
        int i11 = vg.d.v;
        if (i10 == 0) {
            aVar.a(W(), z10);
            return;
        }
        ArrayList arrayList = this.f48269d0;
        int g10 = s.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f49566e = true;
        ci.d dVar = aVar.f49563a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f49564b.setBackgroundColor(i6.w0(i6.f20868h5, aVar.f49565c));
    }

    public final void b0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: tg.a0.b0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        qm0 qm0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (qm0Var = this.d) != null && qm0Var.G) {
            b0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        j jVar = this.f48284t0;
        if (jVar != null) {
            jVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        ug.b bVar = new ug.b(this.resourcesProvider);
        this.f48272g0 = bVar;
        return bVar;
    }
}
