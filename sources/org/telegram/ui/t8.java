package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
public final class t8 implements RequestDelegate {
    public final int f51480a;
    public final int f51481b;
    public final Object f51482c;
    public final Object d;
    public final Object f51483e;
    public final Object f51484f;
    public final Object f51485g;
    public final Object h;

    public t8(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.z70 z70Var, String[] strArr) {
        this.f51480a = 0;
        this.f51481b = i7;
        this.f51482c = inputGroupCall;
        this.d = strArr;
        this.f51483e = frameLayout;
        this.f51484f = z70Var;
        this.f51485g = u2Var;
        this.h = e6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f51480a;
        Object obj = this.h;
        Object obj2 = this.f51485g;
        Object obj3 = this.f51484f;
        Object obj4 = this.f51483e;
        Object obj5 = this.d;
        Object obj6 = this.f51482c;
        switch (i7) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) obj3;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i10 = this.f51481b;
                if (z10) {
                    org.telegram.messenger.np.s1(i10).O3((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new di.k7(strArr, frameLayout, z70Var, u2Var, e6Var, 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f42593y;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f51481b;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new t8(externalActionActivity, t1Var, i11, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                org.telegram.messenger.g0.h3(new tp(externalActionActivity, t1Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f42593y;
                org.telegram.messenger.g0.h3(new org.telegram.messenger.de((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.t1) obj5, tLObject, this.f51481b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                org.telegram.messenger.g0.h3(new di.g8((kd0) obj6, tLObject, tL_error, (f5.i) obj5, this.f51481b, (f5.m) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public t8(KeyEvent.Callback callback, Object obj, int i7, Object obj2, TLObject tLObject, String str, Object obj3, int i10) {
        this.f51480a = i10;
        this.f51482c = callback;
        this.d = obj;
        this.f51481b = i7;
        this.f51483e = obj2;
        this.f51484f = tLObject;
        this.f51485g = str;
        this.h = obj3;
    }
}
