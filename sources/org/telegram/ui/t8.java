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
public final class t8 implements RequestDelegate {
    public final int f41901a;
    public final int f41902b;
    public final Object f41903c;
    public final Object d;
    public final Object f41904e;
    public final Object f41905f;
    public final Object f41906g;
    public final Object h;

    public t8(int i10, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.ea0 ea0Var, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f41901a = 0;
        this.f41902b = i10;
        this.f41903c = inputGroupCall;
        this.d = strArr;
        this.f41904e = frameLayout;
        this.f41905f = ea0Var;
        this.f41906g = f3Var;
        this.h = e6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f41901a;
        Object obj = this.h;
        Object obj2 = this.f41906g;
        Object obj3 = this.f41905f;
        Object obj4 = this.f41904e;
        Object obj5 = this.d;
        Object obj6 = this.f41903c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.ea0 ea0Var = (org.telegram.ui.Components.ea0) obj3;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f41902b;
                if (z10) {
                    MessagesController.getInstance(i11).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new ci.hd(strArr, frameLayout, ea0Var, f3Var, e6Var, 1));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f33749x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f41902b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new t8(externalActionActivity, b2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new vq(externalActionActivity, b2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f33749x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.z5((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.b2) obj5, tLObject, this.f41902b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.lb((fg0) obj6, tLObject, tL_error, (c5.k) obj5, this.f41902b, (c5.o) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public t8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f41901a = i11;
        this.f41903c = callback;
        this.d = obj;
        this.f41902b = i10;
        this.f41904e = obj2;
        this.f41905f = tLObject;
        this.f41906g = str;
        this.h = obj3;
    }
}
