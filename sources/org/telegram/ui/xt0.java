package org.telegram.ui;

import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
public final class xt0 implements Runnable {
    public final int f52101a;
    public final Object f52102b;
    public final Object f52103c;
    public final Object d;
    public final Object f52104e;
    public final Object f52105f;

    public xt0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f52101a = i3;
        this.f52102b = obj;
        this.f52103c = obj2;
        this.d = obj3;
        this.f52104e = obj4;
        this.f52105f = obj5;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.o0 o0Var;
        String i3;
        byte[] bArr;
        String str;
        int i10 = this.f52101a;
        String str2 = null;
        Object obj = this.f52105f;
        Object obj2 = this.f52104e;
        Object obj3 = this.d;
        Object obj4 = this.f52103c;
        Object obj5 = this.f52102b;
        switch (i10) {
            case 0:
                ProfileActivity.h0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 1:
                lw0 lw0Var = (lw0) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.d2 d2Var = lw0Var.f47451e;
                if (((String) obj4).equals(lw0Var.E)) {
                    if (!lw0Var.f47457x && (d2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) d2Var).P.f41126b.getImageReceiver().P0(false);
                            ((ProfileActivity) d2Var).P.d.setText(org.telegram.messenger.bd.M0(2131745486, null));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    lw0Var.f47457x = true;
                    lw0Var.f47454r = arrayList;
                    lw0Var.f47455s = arrayList2;
                    lw0Var.f47453n = arrayList3;
                    lw0Var.f();
                    if (d2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) d2Var).P.f41126b.getImageReceiver().P0(false);
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                g11 g11Var = (g11) obj5;
                g11Var.getClass();
                g11Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.p5) obj3).documentId), (TLRPC.Document) obj2, ((q01) obj).f48725w, null);
                return;
            case 3:
                q11 q11Var = (q11) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject = (TLObject) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                q11Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    q11Var.e1(user, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj5;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj4;
                org.telegram.ui.Wallet.d dVar = (org.telegram.ui.Wallet.d) obj2;
                String str3 = (String) obj;
                try {
                    ((org.telegram.ui.ActionBar.s1) obj3).dismiss();
                    if (h0Var != null && !h0Var.d()) {
                        TL_wallet.WalletState walletState = k0Var.f42721e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (o0Var = k0Var.f42720c) != null && !o0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            k0Var.f42720c.p(org.telegram.messenger.h10.i(k0Var.f42718a).e(), ((TL_wallet.TL_walletState) k0Var.f42721e).public_key, h0Var, null);
                        }
                    }
                    dVar.a(h0Var, str3);
                    if (h0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (h0Var != null) {
                        h0Var.close();
                    }
                }
            case 5:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj5;
                JSONObject jSONObject = (JSONObject) obj4;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) obj3;
                String str4 = (String) obj2;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj;
                c2Var.getClass();
                if (jSONObject == null) {
                    u10Var.a(str4);
                    return;
                } else {
                    c2Var.E(y1Var.f43456a.f27264id, y1Var.f43457b, jSONObject, u10Var);
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) obj4;
                e51 e51Var = (e51) obj2;
                ci.a3 a3Var = (ci.a3) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.h0) obj5, y1Var2.f43456a, y1Var2.h, y1Var2.f43461g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i3 = null;
                } catch (Exception e12) {
                    i3 = org.telegram.ui.Wallet.c2.i("decrypt challenge", e12);
                    bArr = null;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.e7((Object) bArr, (Object) e51Var, i3, (Object) a3Var, 7));
                return;
            case 7:
                org.telegram.ui.Wallet.c2 c2Var2 = (org.telegram.ui.Wallet.c2) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                org.telegram.ui.Wallet.y1 y1Var3 = (org.telegram.ui.Wallet.y1) obj3;
                org.telegram.messenger.u10 u10Var2 = (org.telegram.messenger.u10) obj2;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) obj;
                try {
                    String jSONObject2 = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                    if (!org.telegram.messenger.hp.s1(c2Var2.f42377a).f22999e7.edit().putString(org.telegram.ui.Wallet.c2.l(y1Var3.f43456a.f27264id, y1Var3.f43457b) + ".transfer", jSONObject2).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e13) {
                    str2 = org.telegram.ui.Wallet.c2.i("save transfer", e13);
                }
                org.telegram.messenger.g0.h3(new ai.w1(c2Var2, str2, u10Var2, y1Var3, h0Var2, sendtransfer));
                return;
            case 8:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$19((AtomicBoolean) obj4, (org.telegram.messenger.n10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 9:
                ((WalletEngine2) obj5).lambda$prepareSend$49((org.telegram.messenger.p10) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 10:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                org.telegram.messenger.g1 g1Var = (org.telegram.messenger.g1) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) obj3;
                org.telegram.messenger.d3 d3Var = (org.telegram.messenger.d3) obj2;
                if (tL_error2 != null) {
                    g1Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject2;
                    hpVar.Y3(tL_premium_myBoosts.users, false);
                    hpVar.S3(tL_premium_myBoosts.chats, false);
                    d3Var.a(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 11:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                org.telegram.messenger.u10 u10Var3 = (org.telegram.messenger.u10) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                org.telegram.messenger.hp hpVar2 = (org.telegram.messenger.hp) obj3;
                org.telegram.messenger.u10 u10Var4 = (org.telegram.messenger.u10) obj2;
                if (tL_error3 != null) {
                    u10Var3.a(tL_error3);
                    return;
                } else if (tLObject3 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject3;
                    hpVar2.Y3(tL_premium_myBoosts2.users, false);
                    hpVar2.S3(tL_premium_myBoosts2.chats, false);
                    u10Var4.a(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            case 12:
                TLObject tLObject4 = (TLObject) obj4;
                org.telegram.messenger.hp hpVar3 = (org.telegram.messenger.hp) obj5;
                ai.v1 v1Var = (ai.v1) obj3;
                xg.g gVar = (xg.g) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject4;
                    hpVar3.S3(tL_payments_checkedGiftCode.chats, false);
                    hpVar3.Y3(tL_payments_checkedGiftCode.users, false);
                    v1Var.a(tL_payments_checkedGiftCode);
                }
                gVar.a(tL_error4);
                return;
            default:
                xg.e1 e1Var = (xg.e1) obj5;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                FrameLayout frameLayout = e1Var.X1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.ac Q = new org.telegram.ui.Components.fc(frameLayout, e1Var.J0).Q(2131623989, 36, org.telegram.messenger.bd.M0(2131746864, null));
                    Q.f31792j = 5000;
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
                    org.telegram.messenger.qr.a0(e1Var.f28583a).j2(userFull, false);
                }
                if (tL_error5 != null && (str = tL_error5.text) != null && str.startsWith("FLOOD_WAIT_")) {
                    if (e1Var.getContext() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e1Var.getContext(), e1Var.J0);
                        String M0 = org.telegram.messenger.bd.M0(2131746860, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131746861, null);
                        k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743889, new org.telegram.ui.Components.fc(frameLayout, e1Var.J0), 2131624011, 36);
                return;
        }
    }

    public xt0(TLObject tLObject, org.telegram.messenger.hp hpVar, ai.v1 v1Var, xg.g gVar, TLRPC.TL_error tL_error) {
        this.f52101a = 12;
        this.f52103c = tLObject;
        this.f52102b = hpVar;
        this.d = v1Var;
        this.f52104e = gVar;
        this.f52105f = tL_error;
    }

    public xt0(TLRPC.TL_error tL_error, org.telegram.messenger.u10 u10Var, TLObject tLObject, org.telegram.messenger.hp hpVar, org.telegram.messenger.u10 u10Var2, int i3) {
        this.f52101a = i3;
        this.f52105f = tL_error;
        this.f52102b = u10Var;
        this.f52103c = tLObject;
        this.d = hpVar;
        this.f52104e = u10Var2;
    }

    public xt0(q11 q11Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.User user) {
        this.f52101a = 3;
        this.f52102b = q11Var;
        this.f52105f = tL_error;
        this.f52103c = tLObject;
        this.d = twoStepVerificationActivity;
        this.f52104e = user;
    }
}
