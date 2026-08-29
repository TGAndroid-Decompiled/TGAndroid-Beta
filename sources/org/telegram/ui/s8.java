package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
public final class s8 implements RequestDelegate {
    public final int f42305a;
    public final int f42306b;
    public final Object f42307c;
    public final Object d;
    public final Object f42308e;
    public final Object f42309f;
    public final Object f42310g;
    public final Object h;

    public s8(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.y80 y80Var, String[] strArr) {
        this.f42305a = 0;
        this.f42306b = i10;
        this.f42307c = inputGroupCall;
        this.d = strArr;
        this.f42308e = frameLayout;
        this.f42309f = y80Var;
        this.f42310g = f3Var;
        this.h = c6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f42305a;
        Object obj = this.h;
        Object obj2 = this.f42310g;
        Object obj3 = this.f42309f;
        Object obj4 = this.f42308e;
        Object obj5 = this.d;
        Object obj6 = this.f42307c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) obj3;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f42306b;
                if (z10) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new eg.f0(strArr, frameLayout, y80Var, f3Var, c6Var, 4));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f35532x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f42306b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new s8(externalActionActivity, c2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new lq(externalActionActivity, c2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f35532x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.z5((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.c2) obj5, tLObject, this.f42306b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jh.r6((of0) obj6, tLObject, tL_error, (p2.i) obj5, this.f42306b, (p2.l) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj, 5));
                return;
        }
    }

    public s8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f42305a = i11;
        this.f42307c = callback;
        this.d = obj;
        this.f42306b = i10;
        this.f42308e = obj2;
        this.f42309f = tLObject;
        this.f42310g = str;
        this.h = obj3;
    }
}
