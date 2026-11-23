package org.telegram.ui;

import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
public final class wt0 implements Runnable {
    public final int f53524a;
    public final Object f53525b;
    public final Object f53526c;
    public final Object d;
    public final Object f53527e;
    public final Object f53528f;

    public wt0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f53524a = i7;
        this.f53525b = obj;
        this.f53526c = obj2;
        this.d = obj3;
        this.f53527e = obj4;
        this.f53528f = obj5;
    }

    @Override
    public final void run() {
        String p10;
        org.telegram.ui.Wallet.z0 z0Var;
        String i7;
        byte[] bArr;
        int i10 = this.f53524a;
        String str = null;
        Object obj = this.f53528f;
        Object obj2 = this.f53527e;
        Object obj3 = this.d;
        Object obj4 = this.f53526c;
        Object obj5 = this.f53525b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ut0 ut0Var = (ut0) obj;
                RectF rectF = ProfileActivity.Z6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    ut0Var.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131754347, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), new qi0(ut0Var, 10));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                profileActivity.showDialog(t1Var);
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                kv0 kv0Var = (kv0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
                    if (profileActivity2.f43585e1 != 0) {
                        profileActivity2.getMessagesController().c2(Long.valueOf(profileActivity2.f43585e1));
                    } else {
                        profileActivity2.getMessagesController().O0(Long.valueOf(profileActivity2.f43593f1));
                    }
                    String str2 = "@" + tL_username.username;
                    String format = org.telegram.messenger.hd.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(kv0Var.f33594x1, profileActivity2.A0);
                    if (TextUtils.isEmpty(f11)) {
                        p10 = "";
                    } else {
                        p10 = a8.p0.p("(", f11, ")");
                    }
                    org.telegram.ui.Components.gc w10 = lcVar.w(2131231182, org.telegram.messenger.g0.b4(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131750502, str2, format, f10, p10)), new tr0(11, profileActivity2, tL_collectibleInfo)));
                    jg0 jg0Var = new jg0(7, profileActivity2, tL_collectibleInfo);
                    org.telegram.ui.Components.lb lbVar = w10.f35523e;
                    if (lbVar != null) {
                        lbVar.setOnClickListener(jg0Var);
                    }
                    w10.k(false);
                    return;
                }
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.ui.Components.lc.e0(tL_error);
                return;
            case 2:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                String str3 = (String) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                RectF rectF3 = ProfileActivity.Z6;
                if (tLObject2 instanceof TL_fragment.TL_collectibleInfo) {
                    m00.a(profileActivity3.getParentActivity(), 1, str3, user2, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity3.A0);
                    return;
                } else {
                    org.telegram.ui.Components.lc.e0(tL_error2);
                    return;
                }
            case 3:
                ProfileActivity.o0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 4:
                ww0 ww0Var = (ww0) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.g2 g2Var = ww0Var.f53544e;
                if (((String) obj4).equals(ww0Var.E)) {
                    if (!ww0Var.f53550x && (g2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) g2Var).P.f37993b.getImageReceiver().P0(false);
                            ((ProfileActivity) g2Var).P.d.setText(org.telegram.messenger.hd.N0(2131745280, null));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    ww0Var.f53550x = true;
                    ww0Var.f53547r = arrayList;
                    ww0Var.f53548s = arrayList2;
                    ww0Var.f53546n = arrayList3;
                    ww0Var.f();
                    if (g2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) g2Var).P.f37993b.getImageReceiver().P0(false);
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                s11 s11Var = (s11) obj5;
                s11Var.getClass();
                s11Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.y5) obj3).documentId), (TLRPC.Document) obj2, ((c11) obj).f46389w, null);
                return;
            case 6:
                c21 c21Var = (c21) obj5;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                TLRPC.User user3 = (TLRPC.User) obj2;
                c21Var.getClass();
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    c21Var.f1(user3, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj5;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj4;
                org.telegram.ui.Wallet.e eVar = (org.telegram.ui.Wallet.e) obj2;
                String str4 = (String) obj;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                    if (r0Var != null && !r0Var.d()) {
                        TL_wallet.WalletState walletState = u0Var.f45130e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (z0Var = u0Var.f45129c) != null && !z0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            u0Var.f45129c.q(org.telegram.messenger.k10.i(u0Var.f45127a).e(), ((TL_wallet.TL_walletState) u0Var.f45130e).public_key, r0Var, null);
                        }
                    }
                    eVar.a(r0Var, str4);
                    if (r0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (r0Var != null) {
                        r0Var.close();
                    }
                }
            case 8:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) obj5;
                JSONObject jSONObject = (JSONObject) obj4;
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) obj3;
                String str5 = (String) obj2;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj;
                l2Var.getClass();
                if (jSONObject == null) {
                    y10Var.a(str5);
                    return;
                } else {
                    l2Var.E(h2Var.f44333a.f28696id, h2Var.f44334b, jSONObject, y10Var);
                    return;
                }
            case 9:
                org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) obj4;
                p51 p51Var = (p51) obj2;
                di.x2 x2Var = (di.x2) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.r0) obj5, h2Var2.f44333a, h2Var2.h, h2Var2.f44338g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i7 = null;
                } catch (Exception e12) {
                    i7 = org.telegram.ui.Wallet.l2.i("decrypt challenge", e12);
                    bArr = null;
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.v7((Object) bArr, (Object) p51Var, i7, (Object) x2Var, 6));
                return;
            case 10:
                org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                org.telegram.ui.Wallet.h2 h2Var3 = (org.telegram.ui.Wallet.h2) obj3;
                org.telegram.messenger.y10 y10Var2 = (org.telegram.messenger.y10) obj2;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) obj;
                try {
                    String jSONObject2 = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                    if (!org.telegram.messenger.np.u1(l2Var2.f44523a).h7.edit().putString(org.telegram.ui.Wallet.l2.l(h2Var3.f44333a.f28696id, h2Var3.f44334b) + ".transfer", jSONObject2).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e13) {
                    str = org.telegram.ui.Wallet.l2.i("save transfer", e13);
                }
                org.telegram.messenger.g0.g3(new bi.l2(l2Var2, str, y10Var2, h2Var3, r0Var2, sendtransfer));
                return;
            case 11:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$22((AtomicBoolean) obj4, (org.telegram.messenger.r10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 12:
                ((WalletEngine2) obj5).lambda$prepareSend$52((org.telegram.messenger.t10) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 13:
                ((p4.g) obj4).run().b(new kg0((ab.c0) obj5, (AtomicBoolean) obj3, (p4.h) obj2, (AtomicBoolean) obj, 28), m9.r.f20983a);
                return;
            case 14:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.g1 g1Var = (org.telegram.messenger.g1) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) obj2;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                if (tL_error4 != null) {
                    g1Var.a(tL_error4);
                    return;
                } else if (tLObject4 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject4;
                    npVar.f4(tL_premium_myBoosts.users, false);
                    npVar.Z3(tL_premium_myBoosts.chats, false);
                    e3Var.a(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 15:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.y10 y10Var3 = (org.telegram.messenger.y10) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.messenger.np npVar2 = (org.telegram.messenger.np) obj2;
                org.telegram.messenger.y10 y10Var4 = (org.telegram.messenger.y10) obj;
                if (tL_error5 != null) {
                    y10Var3.a(tL_error5);
                    return;
                } else if (tLObject5 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject5;
                    npVar2.f4(tL_premium_myBoosts2.users, false);
                    npVar2.Z3(tL_premium_myBoosts2.chats, false);
                    y10Var4.a(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            default:
                TLObject tLObject6 = (TLObject) obj5;
                org.telegram.messenger.np npVar3 = (org.telegram.messenger.np) obj4;
                bi.m2 m2Var = (bi.m2) obj3;
                wg.e eVar2 = (wg.e) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (tLObject6 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject6;
                    npVar3.Z3(tL_payments_checkedGiftCode.chats, false);
                    npVar3.f4(tL_payments_checkedGiftCode.users, false);
                    m2Var.a(tL_payments_checkedGiftCode);
                }
                eVar2.a(tL_error6);
                return;
        }
    }

    public wt0(c21 c21Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.User user) {
        this.f53524a = 6;
        this.f53525b = c21Var;
        this.f53526c = tL_error;
        this.d = tLObject;
        this.f53528f = twoStepVerificationActivity;
        this.f53527e = user;
    }
}
