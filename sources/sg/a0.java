package sg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.k6;
import bi.wa;
import bi.ze;
import com.google.android.gms.internal.vision.e2;
import di.n3;
import di.y4;
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
import org.telegram.messenger.x2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fz0;
import org.telegram.ui.hn0;
import org.telegram.ui.y20;
import w7.a6;
import xh.i7;
import xh.v5;
public final class a0 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f41846a0;
    public final TLRPC.Chat f41847b0;
    public final ArrayList f41848c0;
    public final ArrayList f41849d0;
    public final ArrayList f41850e0;
    public final ArrayList f41851f0;
    public tg.b f41852g0;
    public int f41853h0;
    public int f41854i0;
    public int f41855j0;
    public boolean f41856k0;
    public int f41857l0;
    public long m0;
    public int f41858n0;
    public int f41859o0;
    public long f41860p0;
    public final ug.a f41861q0;
    public n7.a1 f41862r0;
    public int f41863s0;
    public j f41864t0;
    public final TL_stories.PrepaidGiveaway f41865u0;
    public String f41866v0;
    public boolean f41867w0;
    public boolean f41868x0;
    public final t f41869y0;

    public a0(p2 p2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(p2Var, false);
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
        this.f41846a0 = Arrays.asList(750, 10000, 50000);
        this.f41848c0 = new ArrayList();
        this.f41849d0 = new ArrayList();
        this.f41850e0 = new ArrayList();
        this.f41851f0 = new ArrayList();
        int i10 = ug.d.f42690s;
        this.f41853h0 = 2;
        this.f41854i0 = 0;
        int i11 = ug.u.f42723s;
        this.f41855j0 = 0;
        this.f41857l0 = 12;
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
        this.f41858n0 = 2;
        this.f41859o0 = 2;
        this.f41866v0 = "";
        this.f41868x0 = true;
        this.f41869y0 = new t(this, 0);
        this.f41865u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        N();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = ug.d.f42690s;
            this.f41853h0 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        this.d.setItemAnimator(jVar);
        vl0 vl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new ai.b0(22, this, p2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f41847b0 = chat;
        tg.b bVar = this.f41852g0;
        ArrayList arrayList = this.X;
        vl0 vl0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f42145f = vl0Var2;
        bVar.h = uVar;
        bVar.f42146n = uVar2;
        bVar.f42148s = uVar3;
        a0(false, false);
        ug.a aVar = new ug.a(getContext(), this.resourcesProvider);
        this.f41861q0 = aVar;
        aVar.setOnClickListener(new pr(this, prepaidGiveaway, j3, p2Var));
        Z(false);
        this.containerView.addView(aVar, a6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.currentAccount, chat, new v(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, p2 p2Var) {
        boolean z10;
        int i10;
        boolean z11;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j10;
        ArrayList arrayList = a0Var.f41850e0;
        ArrayList arrayList2 = a0Var.f41848c0;
        TLRPC.Chat chat = a0Var.f41847b0;
        ArrayList arrayList3 = a0Var.f41849d0;
        ArrayList arrayList4 = a0Var.f41851f0;
        ug.a aVar = a0Var.f41861q0;
        if (!aVar.f42665a.N) {
            if (a0Var.Y()) {
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
                x2 x2Var = new x2(a0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j3, j10, 8);
                p2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string;
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new org.telegram.tgnet.j(x2Var, 25));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(25));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i11 = a0Var.f41853h0;
            int i12 = ug.d.f42690s;
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption W = a0Var.W(a0Var.f41860p0);
                    int U = a0Var.U();
                    if (W != null) {
                        aVar.f42665a.setLoading(true);
                        int i13 = a0Var.f41855j0;
                        int i14 = ug.u.f42723s;
                        if (i13 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        v5 y3 = v5.y(a0Var.currentAccount, false);
                        int l4 = s.l(a0Var.m0);
                        boolean z12 = a0Var.f41868x0;
                        boolean z13 = a0Var.f41867w0;
                        String str2 = a0Var.f41866v0;
                        k6 k6Var = new k6(19, a0Var, W);
                        int i15 = y3.f46176a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            p2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                v5.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                v5.e0(findActivity, null);
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
                            tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                        }
                        tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i15).getNextRandomId();
                        tL_inputStorePaymentStarsGiveaway.until_date = l4;
                        tL_inputStorePaymentStarsGiveaway.currency = W.currency;
                        tL_inputStorePaymentStarsGiveaway.amount = W.amount;
                        tL_inputStorePaymentStarsGiveaway.users = U;
                        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = W.store_product) != null) {
                            ?? obj3 = new Object();
                            obj3.f4256b = "inapp";
                            obj3.f4255a = str;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(obj3.a()), new a1.d(y3, k6Var, tL_inputStorePaymentStarsGiveaway, activity, 22));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p5 = n3.p(v5.I(), false);
                        if (p5 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p5.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new wa(y3, k6Var, tL_inputInvoiceStars, 25));
                        return;
                    }
                    return;
                }
                return;
            }
            int i18 = 22;
            if (a0Var.f41854i0 == 1) {
                ArrayList b10 = s.b(arrayList3.size(), arrayList4);
                for (int i19 = 0; i19 < b10.size(); i19++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i19);
                    if (tL_premiumGiftCodeOption.months == a0Var.f41857l0 && arrayList3.size() > 0) {
                        if (s.h()) {
                            Context context = a0Var.getContext();
                            f6 f6Var = a0Var.resourcesProvider;
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
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, f6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                d2 d2Var2 = alertDialog$Builder2.f17528a;
                                d2Var2.R = string2;
                                d2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i21, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(22));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.f41847b0, null, p2Var, new v(a0Var, 0), new v(a0Var, 1));
                        return;
                    }
                }
                return;
            }
            ArrayList b11 = s.b(a0Var.U(), arrayList4);
            int i22 = 0;
            while (i22 < b11.size()) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i22);
                if (tL_premiumGiftCodeOption3.months == a0Var.f41857l0) {
                    if (s.h()) {
                        List list = a0Var.Y;
                        Context context2 = a0Var.getContext();
                        f6 f6Var2 = a0Var.resourcesProvider;
                        v vVar = new v(a0Var, 2);
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
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, f6Var2);
                            String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            d2 d2Var3 = alertDialog$Builder3.f17528a;
                            d2Var3.R = string3;
                            d2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i27, formatPluralString, Integer.valueOf(i28)));
                            alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new fz0(27, vVar, tL_premiumGiftCodeOption5));
                            alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(i18));
                            alertDialog$Builder3.o();
                            return;
                        }
                    }
                    int i29 = a0Var.f41855j0;
                    int i30 = ug.u.f42723s;
                    if (i29 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int l10 = s.l(a0Var.m0);
                    aVar.b(true);
                    boolean z14 = a0Var.f41868x0;
                    boolean z15 = a0Var.f41867w0;
                    String str3 = a0Var.f41866v0;
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
                                i10 = i33;
                                tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f17195id));
                            } else {
                                i10 = i33;
                            }
                            i32 = i10;
                        }
                        tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f17195id);
                        tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f17195id);
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
                        JSONObject p10 = n3.p(p2Var.getResourceProvider(), false);
                        if (p10 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                            tL_dataJSON2.data = p10.toString();
                            tL_payments_getPaymentForm2.flags |= 1;
                        }
                        tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                        connectionsManager.sendRequest(tL_payments_getPaymentForm2, new ze(vVar3, messagesController, tL_inputInvoicePremiumGiftCode, p2Var, vVar2, 12));
                        return;
                    }
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
                            tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f17195id));
                        }
                    }
                    tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f17195id);
                    int size9 = arrayList.size();
                    int i37 = 0;
                    while (i37 < size9) {
                        Object obj10 = arrayList.get(i37);
                        i37++;
                        tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                    }
                    ?? obj11 = new Object();
                    obj11.f4256b = "inapp";
                    obj11.f4255a = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(obj11.a()), new org.telegram.ui.Components.f1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, vVar3, vVar2, p2Var, 3));
                    return;
                }
                i22++;
                i18 = 22;
            }
        }
    }

    public static void Q(a0 a0Var, p2 p2Var, View view) {
        b4 b4Var;
        boolean z10;
        n7.a1 a1Var;
        boolean z11;
        ArrayList arrayList = a0Var.f41849d0;
        t tVar = a0Var.f41869y0;
        if (view instanceof ug.y) {
            ug.y yVar = (ug.y) view;
            int type = yVar.getType();
            boolean z12 = yVar.e.h;
            boolean z13 = !z12;
            yVar.setChecked(z13);
            int i10 = ug.y.L;
            if (type == 0) {
                a0Var.f41868x0 = z13;
                a0Var.a0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z13);
                a0Var.f41867w0 = z13;
                a0Var.a0(false, false);
                tg.b bVar = a0Var.f41852g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    tg.a aVar = (tg.a) bVar.e.get(i11);
                    if (aVar.f14046a == 15) {
                        int i12 = aVar.f42143l;
                        int i13 = ug.y.L;
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
                a0Var.f41852g0.G();
                if (!a0Var.f41867w0) {
                    AndroidUtilities.runOnUIThread(tVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(tVar);
                }
            }
        }
        if (view instanceof ug.c) {
            if (view instanceof ug.d) {
                int selectedType = ((ug.d) view).getSelectedType();
                int i14 = ug.d.f42690s;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        n7.a1 a1Var2 = a0Var.f41862r0;
                        if (a1Var2 != null) {
                            ((c1) a1Var2.f13938b).V(1, arrayList);
                            ((m) a1Var2.f13939c).f41953b.D(1);
                        }
                    } else {
                        a0Var.f41854i0 = selectedType;
                        a0Var.a0(true, true);
                        a0Var.Z(true);
                        a0Var.N();
                    }
                } else if (selectedType == 2 && a0Var.f41853h0 == selectedType) {
                    n7.a1 a1Var3 = a0Var.f41862r0;
                    if (a1Var3 != null) {
                        ((c1) a1Var3.f13938b).V(1, arrayList);
                        ((m) a1Var3.f13939c).f41953b.D(1);
                        return;
                    }
                    return;
                } else {
                    a0Var.f41853h0 = selectedType;
                    a0Var.a0(true, true);
                    a0Var.Z(true);
                    a0Var.N();
                }
            } else {
                ug.c cVar = (ug.c) view;
                vl0 vl0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < vl0Var.getChildCount(); i15++) {
                        View childAt = vl0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ug.c cVar2 = (ug.c) childAt;
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
        if (view instanceof ug.u) {
            int selectedType2 = ((ug.u) view).getSelectedType();
            if (a0Var.f41855j0 == selectedType2 && (a1Var = a0Var.f41862r0) != null) {
                ((c1) a1Var.f13938b).V(3, a0Var.f41850e0);
                ((m) a1Var.f13939c).f41953b.D(1);
            }
            a0Var.f41855j0 = selectedType2;
            a0Var.a0(false, false);
        } else if (view instanceof ug.i) {
            a0Var.f41857l0 = ((TLRPC.TL_premiumGiftCodeOption) ((ug.i) view).getGifCode()).months;
            a0Var.a0(false, false);
            a0Var.f41852g0.G();
        } else if (view instanceof ug.h) {
            Context context = p2Var.getContext();
            long j3 = a0Var.m0;
            u uVar = new u(a0Var);
            f6 f6Var = a0Var.resourcesProvider;
            b5 b5Var = new b5(f6Var);
            c3 c3Var = new c3(context, f6Var);
            c3Var.a();
            dd0 dd0Var = new dd0(context, f6Var);
            int i16 = b5Var.f21721a;
            dd0Var.setTextColor(i16);
            dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            dd0Var.setItemCount(5);
            ?? dd0Var2 = new dd0(context, f6Var);
            dd0Var2.setWrapSelectorWheel(true);
            dd0Var2.setAllItemsCount(24);
            dd0Var2.setItemCount(5);
            dd0Var2.setTextColor(i16);
            dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            dd0Var2.setTag("HOUR");
            ?? dd0Var3 = new dd0(context, f6Var);
            dd0Var3.setWrapSelectorWheel(true);
            dd0Var3.setAllItemsCount(60);
            dd0Var3.setItemCount(5);
            dd0Var3.setTextColor(i16);
            dd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            b4 b4Var2 = new b4(context, b5Var, dd0Var, (g) dd0Var2, (h) dd0Var3);
            b4Var2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            b4Var2.addView(frameLayout, a6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            e2.k(20.0f, 1, textView);
            frameLayout.addView(textView, a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new ai.h(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            b4Var2.addView(linearLayout, a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            hn0 hn0Var = new hn0(context, 2);
            long j10 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j10);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(dd0Var, a6.l(0.5f, 0, 270));
            dd0Var.setMinValue(0);
            dd0Var.setMaxValue(i18 - 1);
            dd0Var.setWrapSelectorWheel(false);
            dd0Var.setTag("DAY");
            dd0Var.setFormatter(new y20(currentTimeMillis, calendar, i17, 1));
            bd0 y4Var = new y4(b4Var2, (g) dd0Var2, (h) dd0Var3, i19, i20, dd0Var);
            dd0Var.setOnValueChangedListener(y4Var);
            dd0Var2.setMinValue(0);
            dd0Var2.setMaxValue(23);
            linearLayout.addView((View) dd0Var2, a6.l(0.2f, 0, 270));
            dd0Var2.setFormatter(new s0.b(23));
            dd0Var2.setOnValueChangedListener(y4Var);
            dd0Var3.setMinValue(0);
            dd0Var3.setMaxValue(11);
            dd0Var3.setValue(0);
            dd0Var3.setFormatter(new s0.b(24));
            linearLayout.addView((View) dd0Var3, a6.l(0.3f, 0, 270));
            dd0Var3.setOnValueChangedListener(y4Var);
            if (j3 > 0) {
                b4Var = b4Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j3);
                dd0Var3.setValue(calendar.get(12) / 5);
                dd0Var2.setValue(calendar.get(11));
                dd0Var.setValue((int) ((j3 - calendar.getTimeInMillis()) / 86400000));
                dd0Var.getValue();
                y4Var.q(dd0Var, dd0Var.getValue());
                dd0Var2.getValue();
                y4Var.q(dd0Var2, dd0Var2.getValue());
            } else {
                b4Var = b4Var2;
            }
            hn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            hn0Var.setGravity(17);
            hn0Var.setTextColor(b5Var.f21725g);
            hn0Var.setTextSize(1, 14.0f);
            hn0Var.setTypeface(AndroidUtilities.bold());
            hn0Var.setBackground(z5.e(new float[]{8.0f}, b5Var.h));
            hn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            b4Var.addView(hn0Var, a6.t(-1, 48, 83, 16, 15, 16, 16));
            hn0Var.setOnClickListener(new org.telegram.ui.Components.o0(calendar, dd0Var, dd0Var2, dd0Var3, uVar, c3Var));
            c3Var.b(b4Var);
            h3 h3Var = c3Var.f17571a;
            h3Var.show();
            int i21 = b5Var.f21722b;
            h3Var.setBackgroundColor(i21);
            h3Var.fixNavigationBar(i21);
            if (i0.a.f(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(h3Var, z10);
        } else if (view instanceof ug.b) {
            n7.a1 a1Var4 = a0Var.f41862r0;
            if (a1Var4 != null) {
                ((c1) a1Var4.f13938b).V(2, a0Var.f41848c0);
                ((m) a1Var4.f13939c).f41953b.D(1);
            }
        } else if (view instanceof ug.w) {
            TL_stars.TL_starsGiveawayOption option = ((ug.w) view).getOption();
            if (option != null) {
                a0Var.f41860p0 = option.stars;
                a0Var.a0(true, true);
                a0Var.Z(true);
                a0Var.N();
            }
        } else if (view instanceof i7) {
            a0Var.f41856k0 = true;
            a0Var.a0(true, true);
        }
    }

    public static void R(a0 a0Var) {
        qg.m1 m1Var = new qg.m1(a0Var.f21452n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        m1Var.setOnDismissListener(new w(a0Var, 1));
        m1Var.setOnShowListener(new x(a0Var, 1));
        m1Var.show();
    }

    public static void S(a0 a0Var) {
        qg.m1 m1Var = new qg.m1(a0Var.f21452n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        m1Var.setOnDismissListener(new w(a0Var, 0));
        m1Var.setOnShowListener(new x(a0Var, 0));
        m1Var.show();
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        this.f41863s0 = i10;
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
        int i10 = this.f41853h0;
        int i11 = ug.d.f42690s;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f41858n0)).intValue();
        }
        List X = X();
        int i12 = this.f41859o0;
        if (i12 < 0 || i12 >= X.size()) {
            this.f41859o0 = 0;
        }
        if (this.f41859o0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.f41859o0)).intValue();
    }

    public final int V() {
        int U;
        int g10;
        int i10 = this.f41853h0;
        int i11 = ug.d.f42690s;
        if (i10 == 2) {
            U = ((Integer) this.Y.get(this.f41858n0)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.f41860p0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = s.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j3) {
        ArrayList v = v5.y(this.currentAccount, false).v();
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
        int i10 = this.f41853h0;
        int i11 = ug.d.f42690s;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.f41860p0);
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
        if (this.f41865u0 != null) {
            return true;
        }
        return false;
    }

    public final void Z(boolean z10) {
        boolean z11;
        boolean Y = Y();
        ug.a aVar = this.f41861q0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f41865u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(s.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f41854i0;
        int i11 = ug.d.f42690s;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.f41849d0;
        int g10 = s.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.e = true;
        bi.d dVar = aVar.f42665a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f42666b.setBackgroundColor(j6.v0(j6.f17998h5, aVar.f42667c));
    }

    public final void a0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.a0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vl0 vl0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (vl0Var = this.d) != null && vl0Var.G) {
            a0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        j jVar = this.f41864t0;
        if (jVar != null) {
            jVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        tg.b bVar = new tg.b(this.resourcesProvider);
        this.f41852g0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f41854i0;
        int i11 = ug.d.f42690s;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
