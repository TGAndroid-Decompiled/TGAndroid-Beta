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
public final class y8 implements RequestDelegate {
    public final int f45877a;
    public final int f45878b;
    public final Object f45879c;
    public final Object d;
    public final Object e;
    public final Object f45880f;
    public final Object f45881g;
    public final Object h;

    public y8(int i10, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.aa0 aa0Var, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f45877a = 0;
        this.f45878b = i10;
        this.f45879c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f45880f = aa0Var;
        this.f45881g = k3Var;
        this.h = u6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f45877a;
        Object obj = this.h;
        Object obj2 = this.f45881g;
        Object obj3 = this.f45880f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f45879c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.aa0 aa0Var = (org.telegram.ui.Components.aa0) obj3;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f45878b;
                if (z10) {
                    MessagesController.getInstance(i11).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new bi.n9(strArr, frameLayout, aa0Var, k3Var, u6Var, 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f35522x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f45878b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new y8(externalActionActivity, e2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new pq(externalActionActivity, e2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f35522x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.e6((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.e2) obj5, tLObject, this.f45878b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.y8((qf0) obj6, tLObject, tL_error, (d5.l) obj5, this.f45878b, (d5.o) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj, 4));
                return;
        }
    }

    public y8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f45877a = i11;
        this.f45879c = callback;
        this.d = obj;
        this.f45878b = i10;
        this.e = obj2;
        this.f45880f = tLObject;
        this.f45881g = str;
        this.h = obj3;
    }
}
