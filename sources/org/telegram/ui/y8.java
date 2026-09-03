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
    public final int f40175a;
    public final int f40176b;
    public final Object f40177c;
    public final Object d;
    public final Object e;
    public final Object f40178f;
    public final Object f40179g;
    public final Object h;

    public y8(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.f90 f90Var, String[] strArr) {
        this.f40175a = 0;
        this.f40176b = i10;
        this.f40177c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f40178f = f90Var;
        this.f40179g = g3Var;
        this.h = f6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40175a;
        Object obj = this.h;
        Object obj2 = this.f40179g;
        Object obj3 = this.f40178f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f40177c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.f90 f90Var = (org.telegram.ui.Components.f90) obj3;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                boolean z4 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f40176b;
                if (z4) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new gg.e0(strArr, frameLayout, f90Var, g3Var, f6Var, 3));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f31561x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f40176b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new y8(externalActionActivity, d2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new tq(externalActionActivity, d2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f31561x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.a6((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.d2) obj5, tLObject, this.f40176b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh.s6((yf0) obj6, tLObject, tL_error, (p2.j) obj5, this.f40176b, (p2.n) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj, 5));
                return;
        }
    }

    public y8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f40175a = i11;
        this.f40177c = callback;
        this.d = obj;
        this.f40176b = i10;
        this.e = obj2;
        this.f40178f = tLObject;
        this.f40179g = str;
        this.h = obj3;
    }
}
