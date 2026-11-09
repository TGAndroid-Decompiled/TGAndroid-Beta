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
    public final int f50120a;
    public final int f50121b;
    public final Object f50122c;
    public final Object d;
    public final Object f50123e;
    public final Object f50124f;
    public final Object f50125g;
    public final Object h;

    public t8(int i7, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.x70 x70Var, org.telegram.ui.ActionBar.v2 v2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f50120a = 0;
        this.f50121b = i7;
        this.f50122c = inputGroupCall;
        this.d = strArr;
        this.f50123e = frameLayout;
        this.f50124f = x70Var;
        this.f50125g = v2Var;
        this.h = g6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f50120a;
        Object obj = this.h;
        Object obj2 = this.f50125g;
        Object obj3 = this.f50124f;
        Object obj4 = this.f50123e;
        Object obj5 = this.d;
        Object obj6 = this.f50122c;
        switch (i7) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) obj3;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                boolean z9 = tLObject instanceof TLRPC.Updates;
                int i10 = this.f50121b;
                if (z9) {
                    org.telegram.messenger.qp.s1(i10).O3((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new bi.r8(strArr, frameLayout, x70Var, v2Var, g6Var, 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f41232y;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f50121b;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new t8(externalActionActivity, u1Var, i11, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                org.telegram.messenger.g0.h3(new tp(externalActionActivity, u1Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f41232y;
                org.telegram.messenger.g0.h3(new org.telegram.messenger.ee((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.u1) obj5, tLObject, this.f50121b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                org.telegram.messenger.g0.h3(new bi.p9((nd0) obj6, tLObject, tL_error, (f5.h) obj5, this.f50121b, (f5.l) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public t8(KeyEvent.Callback callback, Object obj, int i7, Object obj2, TLObject tLObject, String str, Object obj3, int i10) {
        this.f50120a = i10;
        this.f50122c = callback;
        this.d = obj;
        this.f50121b = i7;
        this.f50123e = obj2;
        this.f50124f = tLObject;
        this.f50125g = str;
        this.h = obj3;
    }
}
