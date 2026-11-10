package org.telegram.ui;

import android.app.Activity;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
public final class sw0 implements Runnable {
    public final int f49971a;
    public final Object f49972b;
    public final Object f49973c;
    public final Object d;
    public final Object f49974e;
    public final Object f49975f;

    public sw0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f49971a = i7;
        this.f49972b = obj;
        this.f49973c = obj2;
        this.d = obj3;
        this.f49974e = obj4;
        this.f49975f = obj5;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.p0 p0Var;
        String i7;
        byte[] bArr;
        String str;
        int i10 = this.f49971a;
        String str2 = null;
        Object obj = this.f49975f;
        Object obj2 = this.f49974e;
        Object obj3 = this.d;
        Object obj4 = this.f49973c;
        Object obj5 = this.f49972b;
        switch (i10) {
            case 0:
                yw0 yw0Var = (yw0) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.f2 f2Var = yw0Var.f52137e;
                if (((String) obj4).equals(yw0Var.D)) {
                    if (!yw0Var.f52143x && (f2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) f2Var).O.f32366b.getImageReceiver().P0(false);
                            ((ProfileActivity) f2Var).O.d.setText(org.telegram.messenger.id.M0(2131745476, null));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    yw0Var.f52143x = true;
                    yw0Var.f52140r = arrayList;
                    yw0Var.f52141s = arrayList2;
                    yw0Var.f52139n = arrayList3;
                    yw0Var.f();
                    if (f2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) f2Var).O.f32366b.getImageReceiver().P0(false);
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                t11 t11Var = (t11) obj5;
                t11Var.getClass();
                t11Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.q5) obj3).documentId), (TLRPC.Document) obj2, ((d11) obj).f44879w, null);
                return;
            case 2:
                d21 d21Var = (d21) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                d21Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    d21Var.e1(user, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj5;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj3;
                org.telegram.ui.Wallet.d dVar = (org.telegram.ui.Wallet.d) obj;
                String str3 = (String) obj4;
                try {
                    ((org.telegram.ui.ActionBar.u1) obj2).dismiss();
                    if (i0Var != null && !i0Var.d()) {
                        TL_wallet.WalletState walletState = l0Var.f42752e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (p0Var = l0Var.f42751c) != null && !p0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            l0Var.f42751c.p(org.telegram.messenger.p10.i(l0Var.f42749a).e(), ((TL_wallet.TL_walletState) l0Var.f42752e).public_key, i0Var, null);
                        }
                    }
                    dVar.a(i0Var, str3);
                    if (i0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
            case 4:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj5;
                JSONObject jSONObject = (JSONObject) obj3;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj2;
                String str4 = (String) obj4;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                d2Var.getClass();
                if (jSONObject == null) {
                    c20Var.a(str4);
                    return;
                } else {
                    d2Var.E(z1Var.f43412a.f27222id, z1Var.f43413b, jSONObject, c20Var);
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj4;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) obj2;
                bi.n3 n3Var = (bi.n3) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.i0) obj5, z1Var2.f43412a, z1Var2.h, z1Var2.f43417g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i7 = null;
                } catch (Exception e12) {
                    i7 = org.telegram.ui.Wallet.d2.i("decrypt challenge", e12);
                    bArr = null;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.h7((Object) bArr, (Object) sVar, i7, (Object) n3Var, 7));
                return;
            case 6:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                org.telegram.ui.Wallet.z1 z1Var3 = (org.telegram.ui.Wallet.z1) obj3;
                org.telegram.messenger.c20 c20Var2 = (org.telegram.messenger.c20) obj2;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) obj;
                try {
                    String jSONObject2 = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                    if (!org.telegram.messenger.qp.s1(d2Var2.f42286a).f24778e7.edit().putString(org.telegram.ui.Wallet.d2.l(z1Var3.f43412a.f27222id, z1Var3.f43413b) + ".transfer", jSONObject2).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e13) {
                    str2 = org.telegram.ui.Wallet.d2.i("save transfer", e13);
                }
                org.telegram.messenger.g0.h3(new bi.a3(d2Var2, str2, c20Var2, z1Var3, i0Var2, sendtransfer, 22));
                return;
            case 7:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$19((AtomicBoolean) obj3, (org.telegram.messenger.v10) obj2, (TL_wallet.walletTransaction) obj, (String) obj4);
                return;
            case 8:
                ((WalletEngine2) obj5).lambda$prepareSend$49((org.telegram.messenger.x10) obj3, (TL_wallet.sendTransfer) obj2, (String) obj4, (String) obj);
                return;
            case 9:
                ((p4.g) obj4).run().b(new mo0((ui.e) obj5, (AtomicBoolean) obj3, (p4.h) obj2, (AtomicBoolean) obj, 21), m9.r.f19999a);
                return;
            case 10:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.g1 g1Var = (org.telegram.messenger.g1) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) obj2;
                org.telegram.messenger.d3 d3Var = (org.telegram.messenger.d3) obj;
                if (tL_error2 != null) {
                    g1Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject2;
                    qpVar.Y3(tL_premium_myBoosts.users, false);
                    qpVar.S3(tL_premium_myBoosts.chats, false);
                    d3Var.a(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 11:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.c20 c20Var3 = (org.telegram.messenger.c20) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                org.telegram.messenger.qp qpVar2 = (org.telegram.messenger.qp) obj2;
                org.telegram.messenger.c20 c20Var4 = (org.telegram.messenger.c20) obj;
                if (tL_error3 != null) {
                    c20Var3.a(tL_error3);
                    return;
                } else if (tLObject3 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject3;
                    qpVar2.Y3(tL_premium_myBoosts2.users, false);
                    qpVar2.S3(tL_premium_myBoosts2.chats, false);
                    c20Var4.a(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            case 12:
                TLObject tLObject4 = (TLObject) obj5;
                org.telegram.messenger.qp qpVar3 = (org.telegram.messenger.qp) obj4;
                di.s2 s2Var = (di.s2) obj3;
                wg.e eVar = (wg.e) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject4;
                    qpVar3.S3(tL_payments_checkedGiftCode.chats, false);
                    qpVar3.Y3(tL_payments_checkedGiftCode.users, false);
                    s2Var.a(tL_payments_checkedGiftCode);
                }
                eVar.a(tL_error4);
                return;
            case 13:
                wg.f1 f1Var = (wg.f1) obj5;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                FrameLayout frameLayout = f1Var.Z1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.bc Q = new org.telegram.ui.Components.gc(frameLayout, f1Var.I0).Q(2131623989, 36, org.telegram.messenger.id.M0(2131746856, null));
                    Q.f32203j = 5000;
                    Q.j();
                    return;
                }
                if (userFull != null) {
                    if (tL_birthday == null) {
                        userFull.flags2 &= -33;
                    } else {
                        userFull.flags2 |= 32;
                    }
                    userFull.birthday = tL_birthday;
                    org.telegram.messenger.yr.a0(f1Var.f28669a).j2(userFull, false);
                }
                if (tL_error5 != null && (str = tL_error5.text) != null && str.startsWith("FLOOD_WAIT_")) {
                    if (f1Var.getContext() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f1Var.getContext(), f1Var.I0);
                        String M0 = org.telegram.messenger.id.M0(2131746852, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746853, null);
                        jg.g.C(null, 2131747831, alertDialog$Builder, null);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743879, new org.telegram.ui.Components.gc(frameLayout, f1Var.I0), 2131624011, 36);
                return;
            default:
                zh.b4 b4Var = (zh.b4) obj5;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                int i11 = b4Var.T1;
                org.telegram.ui.ActionBar.f2 f2Var2 = b4Var.f35905r1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                    Activity parentActivity = f2Var2.getParentActivity();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i11);
                    q4.q qVar = new q4.q(20, false);
                    qVar.g(b4Var.Z1.h);
                    i12.l(parentActivity, a10, tL_inputStorePaymentGiftPremium, Collections.singletonList(qVar.a()));
                    return;
                } else if (tL_error6 != null) {
                    org.telegram.ui.Components.u4.c0(i11, tL_error6, f2Var2, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                } else {
                    return;
                }
        }
    }

    public sw0(Object obj, Object obj2, Object obj3, Object obj4, String str, int i7) {
        this.f49971a = i7;
        this.f49972b = obj;
        this.d = obj2;
        this.f49974e = obj3;
        this.f49975f = obj4;
        this.f49973c = str;
    }

    public sw0(Object obj, Object obj2, Object obj3, String str, Object obj4, int i7) {
        this.f49971a = i7;
        this.f49972b = obj;
        this.d = obj2;
        this.f49974e = obj3;
        this.f49973c = str;
        this.f49975f = obj4;
    }
}
