package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t70 implements Runnable {
    public final int f41757a = 0;
    public final Object f41758b;
    public final Object f41759c;
    public final Object d;
    public final int e;
    public final Object f41760f;
    public final Object h;
    public final Object f41761n;
    public final Object f41762r;
    public final Object f41763s;

    public t70(LaunchActivity launchActivity, TLObject tLObject, int[] iArr, int i10, f70 f70Var, Integer num, Integer num2, Long l4, Integer num3) {
        this.f41758b = launchActivity;
        this.d = tLObject;
        this.f41760f = iArr;
        this.e = i10;
        this.f41759c = f70Var;
        this.h = num;
        this.f41761n = num2;
        this.f41763s = l4;
        this.f41762r = num3;
    }

    @Override
    public final void run() {
        String H;
        int i10 = this.f41757a;
        int i11 = this.e;
        Object obj = this.f41763s;
        Object obj2 = this.f41762r;
        Object obj3 = this.f41761n;
        Object obj4 = this.h;
        Object obj5 = this.f41759c;
        Object obj6 = this.f41760f;
        Object obj7 = this.d;
        Object obj8 = this.f41758b;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr = (int[]) obj6;
                f70 f70Var = (f70) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l4 = (Long) obj;
                Integer num3 = (Integer) obj2;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.vp.r1(launchActivity.O).P3(tL_messages_chats.chats, false);
                        iArr[0] = launchActivity.z0(this.e, f70Var, num, num2, l4, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    f70Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                launchActivity.F0(org.telegram.ui.Components.s4.G(launchActivity, org.telegram.messenger.cd.L0(2131751455, null), org.telegram.messenger.cd.L0(2131748905, null)));
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                f70 f70Var2 = (f70) obj5;
                TLObject tLObject2 = (TLObject) obj7;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj6;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    f70Var2.run();
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                if (tLObject2 != null) {
                    org.telegram.messenger.vp.r1(i11).V3(authorizationform.users, false);
                    launchActivity2.t0(new ll0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            case 2:
                se0 se0Var = (se0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                c5.i iVar = (c5.i) obj5;
                c5.m mVar = (c5.m) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                hf0 hf0Var = se0Var.f41491w;
                vh.d dVar = se0Var.f41485b;
                org.telegram.messenger.f8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.i(org.telegram.messenger.cd.a0(null, null, 2131745984, iVar.f3788a), false, true);
                    if (i11 == 7) {
                        H = org.telegram.messenger.cd.L0(2131745988, null);
                    } else {
                        H = org.telegram.messenger.cd.H(',', "SMSFeePurchaseTextDays", i11);
                    }
                    dVar.g(H, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new bi.c(se0Var, mVar, tL_inputStorePaymentAuthCode, str4, tL_payments_canPurchaseStore, 10));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    se0Var.e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.cc(hf0Var.Z, null).H(2131624011, org.telegram.messenger.cd.a0(null, null, 2131743903, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    se0Var.e = tL_error.text;
                    new org.telegram.ui.Components.cc(hf0Var.Z, null).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                rh.e6 e6Var = (rh.e6) obj8;
                ((boolean[]) obj7)[0] = true;
                e6Var.Z((org.telegram.messenger.jj) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new rh.n4(e6Var, (boolean[]) obj3, this.e, (org.telegram.messenger.q20) obj2, (org.telegram.messenger.q20) obj));
                return;
        }
    }

    public t70(LaunchActivity launchActivity, f70 f70Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f41758b = launchActivity;
        this.f41759c = f70Var;
        this.d = tLObject;
        this.e = i10;
        this.f41760f = authorizationform;
        this.h = getauthorizationform;
        this.f41761n = str;
        this.f41762r = str2;
        this.f41763s = str3;
    }

    public t70(se0 se0Var, TLObject tLObject, TLRPC.TL_error tL_error, c5.i iVar, int i10, c5.m mVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f41758b = se0Var;
        this.d = tLObject;
        this.f41760f = tL_error;
        this.f41759c = iVar;
        this.e = i10;
        this.h = mVar;
        this.f41761n = tL_inputStorePaymentAuthCode;
        this.f41762r = str;
        this.f41763s = tL_payments_canPurchaseStore;
    }

    public t70(rh.e6 e6Var, boolean[] zArr, org.telegram.messenger.jj jjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i10, org.telegram.messenger.q20 q20Var, org.telegram.messenger.q20 q20Var2) {
        this.f41758b = e6Var;
        this.d = zArr;
        this.f41760f = jjVar;
        this.f41759c = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.f41761n = zArr2;
        this.e = i10;
        this.f41762r = q20Var;
        this.f41763s = q20Var2;
    }
}
