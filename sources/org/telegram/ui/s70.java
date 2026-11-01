package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class s70 implements Runnable {
    public final int f41272a = 0;
    public final Object f41273b;
    public final Object f41274c;
    public final Object d;
    public final int e;
    public final Object f41275f;
    public final Object h;
    public final Object f41276n;
    public final Object f41277r;
    public final Object f41278s;

    public s70(LaunchActivity launchActivity, TLObject tLObject, int[] iArr, int i10, y60 y60Var, Integer num, Integer num2, Long l4, Integer num3) {
        this.f41273b = launchActivity;
        this.d = tLObject;
        this.f41275f = iArr;
        this.e = i10;
        this.f41274c = y60Var;
        this.h = num;
        this.f41276n = num2;
        this.f41278s = l4;
        this.f41277r = num3;
    }

    @Override
    public final void run() {
        String H;
        int i10 = this.f41272a;
        int i11 = this.e;
        Object obj = this.f41278s;
        Object obj2 = this.f41277r;
        Object obj3 = this.f41276n;
        Object obj4 = this.h;
        Object obj5 = this.f41274c;
        Object obj6 = this.f41275f;
        Object obj7 = this.d;
        Object obj8 = this.f41273b;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                y60 y60Var = (y60) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj;
                Integer num3 = (Integer) obj2;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.wp.r1(launchActivity.O).P3(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.e, y60Var, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    y60Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                launchActivity.F0(org.telegram.ui.Components.s4.G(launchActivity, org.telegram.messenger.dd.L0(2131751455, null), org.telegram.messenger.dd.L0(2131748905, null)));
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                y60 y60Var2 = (y60) obj5;
                TLObject tLObject2 = (TLObject) obj7;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj6;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    y60Var2.run();
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                if (tLObject2 != null) {
                    org.telegram.messenger.wp.r1(i11).V3(authorizationform.users, false);
                    launchActivity2.t0(new jl0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            case 2:
                re0 re0Var = (re0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.i iVar = (c5.i) obj5;
                c5.m mVar = (c5.m) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                gf0 gf0Var = re0Var.f41074w;
                vh.d dVar = re0Var.f41068b;
                org.telegram.messenger.f8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.i(org.telegram.messenger.dd.a0(null, null, 2131745984, iVar.f3788a), false, true);
                    if (i11 == 7) {
                        H = org.telegram.messenger.dd.L0(2131745988, null);
                    } else {
                        H = org.telegram.messenger.dd.H(',', "SMSFeePurchaseTextDays", i11);
                    }
                    dVar.g(H, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new bi.c(re0Var, mVar, tL_inputStorePaymentAuthCode, str4, tL_payments_canPurchaseStore, 10));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    re0Var.e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.cc(gf0Var.Z, null).H(2131624011, org.telegram.messenger.dd.a0(null, null, 2131743903, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    re0Var.e = tL_error.text;
                    new org.telegram.ui.Components.cc(gf0Var.Z, null).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                rh.e6 e6Var = (rh.e6) obj8;
                ((boolean[]) obj7)[0] = true;
                e6Var.Z((org.telegram.messenger.kj) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new rh.n4(e6Var, (boolean[]) obj3, this.e, (org.telegram.messenger.r20) obj2, (org.telegram.messenger.r20) obj));
                return;
        }
    }

    public s70(LaunchActivity launchActivity, y60 y60Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f41273b = launchActivity;
        this.f41274c = y60Var;
        this.d = tLObject;
        this.e = i10;
        this.f41275f = authorizationform;
        this.h = getauthorizationform;
        this.f41276n = str;
        this.f41277r = str2;
        this.f41278s = str3;
    }

    public s70(re0 re0Var, TLObject tLObject, TLRPC.TL_error tL_error, c5.i iVar, int i10, c5.m mVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f41273b = re0Var;
        this.d = tLObject;
        this.f41275f = tL_error;
        this.f41274c = iVar;
        this.e = i10;
        this.h = mVar;
        this.f41276n = tL_inputStorePaymentAuthCode;
        this.f41277r = str;
        this.f41278s = tL_payments_canPurchaseStore;
    }

    public s70(rh.e6 e6Var, boolean[] zArr, org.telegram.messenger.kj kjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, org.telegram.messenger.r20 r20Var, org.telegram.messenger.r20 r20Var2) {
        this.f41273b = e6Var;
        this.d = zArr;
        this.f41275f = kjVar;
        this.f41274c = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.f41276n = zArr2;
        this.e = i10;
        this.f41277r = r20Var;
        this.f41278s = r20Var2;
    }
}
