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
public final class w8 implements RequestDelegate {
    public final int f42955a;
    public final int f42956b;
    public final Object f42957c;
    public final Object d;
    public final Object e;
    public final Object f42958f;
    public final Object f42959g;
    public final Object h;

    public w8(int i10, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.y90 y90Var, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f42955a = 0;
        this.f42956b = i10;
        this.f42957c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f42958f = y90Var;
        this.f42959g = h3Var;
        this.h = g6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f42955a;
        Object obj = this.h;
        Object obj2 = this.f42959g;
        Object obj3 = this.f42958f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f42957c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.y90 y90Var = (org.telegram.ui.Components.y90) obj3;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f42956b;
                if (z10) {
                    MessagesController.getInstance(i11).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new ai.s9(strArr, frameLayout, y90Var, h3Var, g6Var, 2));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f33432x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f42956b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new w8(externalActionActivity, c2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new lq(externalActionActivity, c2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f33432x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.b6((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.c2) obj5, tLObject, this.f42956b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.d9((rf0) obj6, tLObject, tL_error, (c5.l) obj5, this.f42956b, (c5.p) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj, 4));
                return;
        }
    }

    public w8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f42955a = i11;
        this.f42957c = callback;
        this.d = obj;
        this.f42956b = i10;
        this.e = obj2;
        this.f42958f = tLObject;
        this.f42959g = str;
        this.h = obj3;
    }
}
