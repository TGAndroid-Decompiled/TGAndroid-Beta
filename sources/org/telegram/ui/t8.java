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
    public final int f52200a;
    public final int f52201b;
    public final Object f52202c;
    public final Object d;
    public final Object f52203e;
    public final Object f52204f;
    public final Object f52205g;
    public final Object h;

    public t8(int i7, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.k80 k80Var, String[] strArr) {
        this.f52200a = 0;
        this.f52201b = i7;
        this.f52202c = inputGroupCall;
        this.d = strArr;
        this.f52203e = frameLayout;
        this.f52204f = k80Var;
        this.f52205g = x2Var;
        this.h = i6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f52200a;
        Object obj = this.h;
        Object obj2 = this.f52205g;
        Object obj3 = this.f52204f;
        Object obj4 = this.f52203e;
        Object obj5 = this.d;
        Object obj6 = this.f52202c;
        switch (i7) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) obj3;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i10 = this.f52201b;
                if (z10) {
                    org.telegram.messenger.mp.u1(i10).V3((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new di.m7(strArr, frameLayout, k80Var, x2Var, i6Var, 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f43038y;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f52201b;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new t8(externalActionActivity, u1Var, i11, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                org.telegram.messenger.g0.g3(new up(externalActionActivity, u1Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f43038y;
                org.telegram.messenger.g0.g3(new org.telegram.messenger.ce((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.u1) obj5, tLObject, this.f52201b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                org.telegram.messenger.g0.g3(new di.j8((ld0) obj6, tLObject, tL_error, (f5.i) obj5, this.f52201b, (f5.m) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public t8(KeyEvent.Callback callback, Object obj, int i7, Object obj2, TLObject tLObject, String str, Object obj3, int i10) {
        this.f52200a = i10;
        this.f52202c = callback;
        this.d = obj;
        this.f52201b = i7;
        this.f52203e = obj2;
        this.f52204f = tLObject;
        this.f52205g = str;
        this.h = obj3;
    }
}
