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
public final class x8 implements RequestDelegate {
    public final int f39554a;
    public final int f39555b;
    public final Object f39556c;
    public final Object d;
    public final Object e;
    public final Object f39557f;
    public final Object f39558g;
    public final Object h;

    public x8(int i10, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.p90 p90Var, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f39554a = 0;
        this.f39555b = i10;
        this.f39556c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f39557f = p90Var;
        this.f39558g = g3Var;
        this.h = e6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f39554a;
        Object obj = this.h;
        Object obj2 = this.f39558g;
        Object obj3 = this.f39557f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f39556c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.p90 p90Var = (org.telegram.ui.Components.p90) obj3;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f39555b;
                if (z10) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new ci.gd(strArr, frameLayout, p90Var, g3Var, e6Var, 1));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f31077x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f39555b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new x8(externalActionActivity, c2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new tq(externalActionActivity, c2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f31077x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.y5((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.c2) obj5, tLObject, this.f39555b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb((cg0) obj6, tLObject, tL_error, (c5.k) obj5, this.f39555b, (c5.o) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public x8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f39554a = i11;
        this.f39556c = callback;
        this.d = obj;
        this.f39555b = i10;
        this.e = obj2;
        this.f39557f = tLObject;
        this.f39558g = str;
        this.h = obj3;
    }
}
