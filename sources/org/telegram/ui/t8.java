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
    public final int f41765a;
    public final int f41766b;
    public final Object f41767c;
    public final Object d;
    public final Object e;
    public final Object f41768f;
    public final Object f41769g;
    public final Object h;

    public t8(int i10, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.p80 p80Var, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f41765a = 0;
        this.f41766b = i10;
        this.f41767c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f41768f = p80Var;
        this.f41769g = z2Var;
        this.h = p6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f41765a;
        Object obj = this.h;
        Object obj2 = this.f41769g;
        Object obj3 = this.f41768f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f41767c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) obj3;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj2;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f41766b;
                if (z10) {
                    org.telegram.messenger.vp.r1(i11).L3((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new mg.z(strArr, frameLayout, p80Var, z2Var, p6Var, 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f33321y;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f41766b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new t8(externalActionActivity, x1Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                org.telegram.messenger.i0.g3(new qq(externalActionActivity, x1Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f33321y;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ce((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.x1) obj5, tLObject, this.f41766b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                org.telegram.messenger.i0.g3(new t70((se0) obj6, tLObject, tL_error, (c5.i) obj5, this.f41766b, (c5.m) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public t8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f41765a = i11;
        this.f41767c = callback;
        this.d = obj;
        this.f41766b = i10;
        this.e = obj2;
        this.f41768f = tLObject;
        this.f41769g = str;
        this.h = obj3;
    }
}
