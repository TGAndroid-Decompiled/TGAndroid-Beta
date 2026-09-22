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
public final class v8 implements RequestDelegate {
    public final int f38448a;
    public final int f38449b;
    public final Object f38450c;
    public final Object d;
    public final Object e;
    public final Object f38451f;
    public final Object f38452g;
    public final Object h;

    public v8(int i10, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.n90 n90Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f38448a = 0;
        this.f38449b = i10;
        this.f38450c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f38451f = n90Var;
        this.f38452g = f3Var;
        this.h = f6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f38448a;
        Object obj = this.h;
        Object obj2 = this.f38452g;
        Object obj3 = this.f38451f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f38450c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) obj3;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f38449b;
                if (z10) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new ci.kd(strArr, frameLayout, n90Var, f3Var, f6Var, 1));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f31094x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f38449b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new v8(externalActionActivity, b2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new vq(externalActionActivity, b2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f31094x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.y5((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.b2) obj5, tLObject, this.f38449b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb((hg0) obj6, tLObject, tL_error, (c5.k) obj5, this.f38449b, (c5.n) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public v8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f38448a = i11;
        this.f38450c = callback;
        this.d = obj;
        this.f38449b = i10;
        this.e = obj2;
        this.f38451f = tLObject;
        this.f38452g = str;
        this.h = obj3;
    }
}
