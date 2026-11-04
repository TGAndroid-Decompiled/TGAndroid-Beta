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
    public final int f49727a;
    public final int f49728b;
    public final Object f49729c;
    public final Object d;
    public final Object f49730e;
    public final Object f49731f;
    public final Object f49732g;
    public final Object h;

    public t8(int i3, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.s70 s70Var, String[] strArr) {
        this.f49727a = 0;
        this.f49728b = i3;
        this.f49729c = inputGroupCall;
        this.d = strArr;
        this.f49730e = frameLayout;
        this.f49731f = s70Var;
        this.f49732g = t2Var;
        this.h = e6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f49727a;
        Object obj = this.h;
        Object obj2 = this.f49732g;
        Object obj3 = this.f49731f;
        Object obj4 = this.f49730e;
        Object obj5 = this.d;
        Object obj6 = this.f49729c;
        switch (i3) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.s70 s70Var = (org.telegram.ui.Components.s70) obj3;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i10 = this.f49728b;
                if (z10) {
                    org.telegram.messenger.hp.s1(i10).O3((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new ci.s7(strArr, frameLayout, s70Var, t2Var, e6Var, 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f41254y;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f49728b;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new t8(externalActionActivity, s1Var, i11, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                org.telegram.messenger.g0.h3(new pp(externalActionActivity, s1Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f41254y;
                org.telegram.messenger.g0.h3(new org.telegram.messenger.yd((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.s1) obj5, tLObject, this.f49728b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                org.telegram.messenger.g0.h3(new ci.p8((id0) obj6, tLObject, tL_error, (e5.h) obj5, this.f49728b, (e5.l) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public t8(KeyEvent.Callback callback, Object obj, int i3, Object obj2, TLObject tLObject, String str, Object obj3, int i10) {
        this.f49727a = i10;
        this.f49729c = callback;
        this.d = obj;
        this.f49728b = i3;
        this.f49730e = obj2;
        this.f49731f = tLObject;
        this.f49732g = str;
        this.h = obj3;
    }
}
