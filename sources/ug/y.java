package ug;

import ai.ha;
import ai.j2;
import ai.s9;
import ai.sc;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.x4;
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
import org.telegram.messenger.x2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.h20;
import org.telegram.ui.tm0;
import sg.m1;
import w7.z5;
public final class y extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List f48240a0;
    public final TLRPC.Chat f48241b0;
    public final ArrayList f48242c0;
    public final ArrayList f48243d0;
    public final ArrayList f48244e0;
    public final ArrayList f48245f0;
    public vg.b f48246g0;
    public int f48247h0;
    public int f48248i0;
    public int f48249j0;
    public boolean f48250k0;
    public int f48251l0;
    public long m0;
    public int f48252n0;
    public int f48253o0;
    public long f48254p0;
    public final wg.a f48255q0;
    public n2.e f48256r0;
    public int f48257s0;
    public i f48258t0;
    public final TL_stories.PrepaidGiveaway f48259u0;
    public String f48260v0;
    public boolean f48261w0;
    public boolean f48262x0;
    public final r f48263y0;

    public y(o2 o2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(o2Var, false);
        List asList;
        List asList2;
        this.X = new ArrayList();
        if (q.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Y = asList;
        if (q.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Z = asList2;
        this.f48240a0 = Arrays.asList(750, 10000, 50000);
        this.f48242c0 = new ArrayList();
        this.f48243d0 = new ArrayList();
        this.f48244e0 = new ArrayList();
        this.f48245f0 = new ArrayList();
        int i10 = wg.d.v;
        this.f48247h0 = 2;
        this.f48248i0 = 0;
        int i11 = wg.u.v;
        this.f48249j0 = 0;
        this.f48251l0 = 12;
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
        this.f48252n0 = 2;
        this.f48253o0 = 2;
        this.f48260v0 = "";
        this.f48262x0 = true;
        this.f48263y0 = new r(this, 0);
        this.f48259u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        N();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = wg.d.v;
            this.f48247h0 = 3;
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.f46377m = false;
        this.d.setItemAnimator(kVar);
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new x4(23, this, o2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f48241b0 = chat;
        vg.b bVar = this.f48246g0;
        ArrayList arrayList = this.X;
        mm0 mm0Var2 = this.d;
        s sVar = new s(this);
        s sVar2 = new s(this);
        s sVar3 = new s(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f48796f = mm0Var2;
        bVar.h = sVar;
        bVar.f48797n = sVar2;
        bVar.f48799s = sVar3;
        a0(false, false);
        wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
        this.f48255q0 = aVar;
        aVar.setOnClickListener(new ur(this, prepaidGiveaway, j10, o2Var));
        Z(false);
        this.containerView.addView(aVar, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        q.j(this.currentAccount, chat, new t(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(y yVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, o2 o2Var) {
        boolean z10;
        int i10;
        boolean z11;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j11;
        ArrayList arrayList = yVar.f48244e0;
        ArrayList arrayList2 = yVar.f48242c0;
        TLRPC.Chat chat = yVar.f48241b0;
        ArrayList arrayList3 = yVar.f48243d0;
        ArrayList arrayList4 = yVar.f48245f0;
        wg.a aVar = yVar.f48255q0;
        if (!aVar.f49389a.Q) {
            if (yVar.Y()) {
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
                x2 x2Var = new x2(yVar, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, j11, 8);
                o2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    c2 c2Var = alertDialog$Builder.f20678a;
                    c2Var.R = string;
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new qg.g0(x2Var, 21));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(27));
                    alertDialog$Builder.p();
                    return;
                }
                return;
            }
            int i11 = yVar.f48247h0;
            int i12 = wg.d.v;
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(yVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.J1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption W = yVar.W(yVar.f48254p0);
                    int U = yVar.U();
                    if (W != null) {
                        aVar.f49389a.setLoading(true);
                        int i13 = yVar.f48249j0;
                        int i14 = wg.u.v;
                        if (i13 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ha y3 = ha.y(yVar.currentAccount, false);
                        int l4 = q.l(yVar.m0);
                        boolean z12 = yVar.f48262x0;
                        boolean z13 = yVar.f48261w0;
                        String str2 = yVar.f48260v0;
                        r1 r1Var = new r1(6, yVar, W);
                        int i15 = y3.f1413a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            o2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                ha.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                ha.e0(findActivity, null);
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
                            obj3.f4700b = "inapp";
                            obj3.f4699a = str;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(obj3.a()), new a1.d(y3, r1Var, tL_inputStorePaymentStarsGiveaway, activity, 2));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject q6 = d3.q(ha.I(), false);
                        if (q6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = q6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new j2(y3, r1Var, tL_inputInvoiceStars, 4));
                    }
                }
            } else if (yVar.f48248i0 == 1) {
                ArrayList b10 = q.b(arrayList3.size(), arrayList4);
                for (int i18 = 0; i18 < b10.size(); i18++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                    if (tL_premiumGiftCodeOption.months == yVar.f48251l0 && arrayList3.size() > 0) {
                        if (q.h()) {
                            Context context = yVar.getContext();
                            g6 g6Var = yVar.resourcesProvider;
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
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, g6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                c2 c2Var2 = alertDialog$Builder2.f20678a;
                                c2Var2.R = string2;
                                c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i20, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(24));
                                alertDialog$Builder2.p();
                                return;
                            }
                        }
                        aVar.b(true);
                        q.k(arrayList3, tL_premiumGiftCodeOption, yVar.f48241b0, null, o2Var, new t(yVar, 0), new t(yVar, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = q.b(yVar.U(), arrayList4);
                for (int i21 = 0; i21 < b11.size(); i21++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                    if (tL_premiumGiftCodeOption3.months == yVar.f48251l0) {
                        if (q.h()) {
                            List list = yVar.Y;
                            Context context2 = yVar.getContext();
                            g6 g6Var2 = yVar.resourcesProvider;
                            t tVar = new t(yVar, 2);
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
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, g6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                c2 c2Var3 = alertDialog$Builder3.f20678a;
                                c2Var3.R = string3;
                                c2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i26, formatPluralString, Integer.valueOf(i27)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new e8(16, tVar, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(24));
                                alertDialog$Builder3.p();
                                return;
                            }
                        }
                        int i28 = yVar.f48249j0;
                        int i29 = wg.u.v;
                        if (i28 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l10 = q.l(yVar.m0);
                        aVar.b(true);
                        boolean z14 = yVar.f48262x0;
                        boolean z15 = yVar.f48261w0;
                        String str3 = yVar.f48260v0;
                        t tVar2 = new t(yVar, 3);
                        t tVar3 = new t(yVar, 4);
                        if (!q.h()) {
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
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f20343id));
                                } else {
                                    i10 = i32;
                                }
                                i31 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20343id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20343id);
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
                            JSONObject q10 = d3.q(o2Var.getResourceProvider(), false);
                            if (q10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = q10.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new s9(tVar3, messagesController, tL_inputInvoicePremiumGiftCode, o2Var, tVar2, 13));
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
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f20343id));
                            }
                        }
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f20343id);
                        int size9 = arrayList.size();
                        int i36 = 0;
                        while (i36 < size9) {
                            Object obj10 = arrayList.get(i36);
                            i36++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                        }
                        ?? obj11 = new Object();
                        obj11.f4700b = "inapp";
                        obj11.f4699a = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(obj11.a()), new org.telegram.ui.Components.c1(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, tVar3, tVar2, o2Var, 3));
                        return;
                    }
                }
            }
        }
    }

    public static void Q(y yVar, o2 o2Var, View view) {
        c5 c5Var;
        boolean z10;
        n2.e eVar;
        boolean z11;
        ArrayList arrayList = yVar.f48243d0;
        r rVar = yVar.f48263y0;
        if (view instanceof wg.y) {
            wg.y yVar2 = (wg.y) view;
            int type = yVar2.getType();
            boolean z12 = yVar2.e.h;
            boolean z13 = !z12;
            yVar2.setChecked(z13);
            int i10 = wg.y.L;
            if (type == 0) {
                yVar.f48262x0 = z13;
                yVar.a0(false, false);
            } else if (type == 1) {
                yVar2.setDivider(z13);
                yVar.f48261w0 = z13;
                yVar.a0(false, false);
                vg.b bVar = yVar.f48246g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    vg.a aVar = (vg.a) bVar.e.get(i11);
                    if (aVar.f44713a == 15) {
                        int i12 = aVar.f48794l;
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
                yVar.f48246g0.G();
                if (!yVar.f48261w0) {
                    AndroidUtilities.runOnUIThread(rVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(rVar);
                }
            }
        }
        if (view instanceof wg.c) {
            if (view instanceof wg.d) {
                int selectedType = ((wg.d) view).getSelectedType();
                int i14 = wg.d.v;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        n2.e eVar2 = yVar.f48256r0;
                        if (eVar2 != null) {
                            ((x0) eVar2.f17102b).V(1, arrayList);
                            ((l) eVar2.f17103c).f48145b.D(1);
                        }
                    } else {
                        yVar.f48248i0 = selectedType;
                        yVar.a0(true, true);
                        yVar.Z(true);
                        yVar.N();
                    }
                } else if (selectedType == 2 && yVar.f48247h0 == selectedType) {
                    n2.e eVar3 = yVar.f48256r0;
                    if (eVar3 != null) {
                        ((x0) eVar3.f17102b).V(1, arrayList);
                        ((l) eVar3.f17103c).f48145b.D(1);
                        return;
                    }
                    return;
                } else {
                    yVar.f48247h0 = selectedType;
                    yVar.a0(true, true);
                    yVar.Z(true);
                    yVar.N();
                }
            } else {
                wg.c cVar = (wg.c) view;
                mm0 mm0Var = yVar.d;
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
            if (yVar.f48249j0 == selectedType2 && (eVar = yVar.f48256r0) != null) {
                ((x0) eVar.f17102b).V(3, yVar.f48244e0);
                ((l) eVar.f17103c).f48145b.D(1);
            }
            yVar.f48249j0 = selectedType2;
            yVar.a0(false, false);
        } else if (view instanceof wg.i) {
            yVar.f48251l0 = ((TLRPC.TL_premiumGiftCodeOption) ((wg.i) view).getGifCode()).months;
            yVar.a0(false, false);
            yVar.f48246g0.G();
        } else if (view instanceof wg.h) {
            Context context = o2Var.getContext();
            long j10 = yVar.m0;
            s sVar = new s(yVar);
            g6 g6Var = yVar.resourcesProvider;
            c5 c5Var2 = new c5(g6Var);
            b3 b3Var = new b3(context, g6Var);
            b3Var.a();
            qd0 qd0Var = new qd0(context, g6Var);
            int i16 = c5Var2.f25238a;
            qd0Var.setTextColor(i16);
            qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            qd0Var.setItemCount(5);
            ?? qd0Var2 = new qd0(context, g6Var);
            qd0Var2.setWrapSelectorWheel(true);
            qd0Var2.setAllItemsCount(24);
            qd0Var2.setItemCount(5);
            qd0Var2.setTextColor(i16);
            qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            qd0Var2.setTag("HOUR");
            ?? qd0Var3 = new qd0(context, g6Var);
            qd0Var3.setWrapSelectorWheel(true);
            qd0Var3.setAllItemsCount(60);
            qd0Var3.setItemCount(5);
            qd0Var3.setTextColor(i16);
            qd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            c4 c4Var = new c4(context, c5Var2, qd0Var, (f) qd0Var2, (g) qd0Var3);
            c4Var.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            c4Var.addView(frameLayout, z5.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            k3.m(20.0f, 1, textView);
            frameLayout.addView(textView, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new di.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            c4Var.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            tm0 tm0Var = new tm0(context, 3);
            long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j11);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(qd0Var, z5.l(0.5f, 0, 270));
            qd0Var.setMinValue(0);
            qd0Var.setMaxValue(i18 - 1);
            qd0Var.setWrapSelectorWheel(false);
            qd0Var.setTag("DAY");
            qd0Var.setFormatter(new h20(currentTimeMillis, calendar, i17, 1));
            od0 j4Var = new j4(c4Var, (f) qd0Var2, (g) qd0Var3, i19, i20, qd0Var);
            qd0Var.setOnValueChangedListener(j4Var);
            qd0Var2.setMinValue(0);
            qd0Var2.setMaxValue(23);
            linearLayout.addView((View) qd0Var2, z5.l(0.2f, 0, 270));
            qd0Var2.setFormatter(new s0.b(25));
            qd0Var2.setOnValueChangedListener(j4Var);
            qd0Var3.setMinValue(0);
            qd0Var3.setMaxValue(11);
            qd0Var3.setValue(0);
            qd0Var3.setFormatter(new s0.b(26));
            linearLayout.addView((View) qd0Var3, z5.l(0.3f, 0, 270));
            qd0Var3.setOnValueChangedListener(j4Var);
            if (j10 > 0) {
                c5Var = c5Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j10);
                qd0Var3.setValue(calendar.get(12) / 5);
                qd0Var2.setValue(calendar.get(11));
                qd0Var.setValue((int) ((j10 - calendar.getTimeInMillis()) / 86400000));
                qd0Var.getValue();
                j4Var.n(qd0Var, qd0Var.getValue());
                qd0Var2.getValue();
                j4Var.n(qd0Var2, qd0Var2.getValue());
            } else {
                c5Var = c5Var2;
            }
            tm0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            tm0Var.setGravity(17);
            tm0Var.setTextColor(c5Var.f25242g);
            tm0Var.setTextSize(1, 14.0f);
            tm0Var.setTypeface(AndroidUtilities.bold());
            tm0Var.setBackground(a6.e(new float[]{8.0f}, c5Var.h));
            tm0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            c4Var.addView(tm0Var, z5.t(-1, 48, 83, 16, 15, 16, 16));
            tm0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, qd0Var, qd0Var2, qd0Var3, sVar, b3Var));
            b3Var.b(c4Var);
            h3 h3Var = b3Var.f20728a;
            h3Var.show();
            int i21 = c5Var.f25239b;
            h3Var.setBackgroundColor(i21);
            h3Var.fixNavigationBar(i21);
            if (i0.a.h(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(h3Var, z10);
        } else if (view instanceof wg.b) {
            n2.e eVar4 = yVar.f48256r0;
            if (eVar4 != null) {
                ((x0) eVar4.f17102b).V(2, yVar.f48242c0);
                ((l) eVar4.f17103c).f48145b.D(1);
            }
        } else if (view instanceof wg.w) {
            TL_stars.TL_starsGiveawayOption option = ((wg.w) view).getOption();
            if (option != null) {
                yVar.f48254p0 = option.stars;
                yVar.a0(true, true);
                yVar.Z(true);
                yVar.N();
            }
        } else if (view instanceof sc) {
            yVar.f48250k0 = true;
            yVar.a0(true, true);
        }
    }

    public static void R(y yVar) {
        m1 m1Var = new m1(yVar.f25029n, yVar.currentAccount, null, yVar.resourcesProvider);
        m1Var.setOnDismissListener(new u(yVar, 1));
        m1Var.setOnShowListener(new v(yVar, 1));
        m1Var.show();
    }

    public static void S(y yVar) {
        m1 m1Var = new m1(yVar.f25029n, yVar.currentAccount, null, yVar.resourcesProvider);
        m1Var.setOnDismissListener(new u(yVar, 0));
        m1Var.setOnShowListener(new v(yVar, 0));
        m1Var.show();
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        this.f48257s0 = i10;
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
        int i10 = this.f48247h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.f48252n0)).intValue();
        }
        List X = X();
        int i12 = this.f48253o0;
        if (i12 < 0 || i12 >= X.size()) {
            this.f48253o0 = 0;
        }
        if (this.f48253o0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.f48253o0)).intValue();
    }

    public final int V() {
        int U;
        int g10;
        int i10 = this.f48247h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            U = ((Integer) this.Y.get(this.f48252n0)).intValue();
            g10 = q.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.f48254p0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = q.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList v = ha.y(this.currentAccount, false).v();
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
        int i10 = this.f48247h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.f48254p0);
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
        if (this.f48259u0 != null) {
            return true;
        }
        return false;
    }

    public final void Z(boolean z10) {
        boolean z11;
        boolean Y = Y();
        wg.a aVar = this.f48255q0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f48259u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(q.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f48248i0;
        int i11 = wg.d.v;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.f48243d0;
        int g10 = q.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.e = true;
        ei.d dVar = aVar.f49389a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.i(LocaleController.getString(R.string.GiftPremium), z10, true);
        r6.i(k6.f21254h5, aVar.f49390b, aVar.f49391c);
    }

    public final void a0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ug.y.a0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mm0 mm0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (mm0Var = this.d) != null && mm0Var.G) {
            a0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        i iVar = this.f48258t0;
        if (iVar != null) {
            iVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        vg.b bVar = new vg.b(this.resourcesProvider);
        this.f48246g0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence z() {
        int i10 = this.f48248i0;
        int i11 = wg.d.v;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
