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
    public final int f42372a;
    public final int f42373b;
    public final Object f42374c;
    public final Object d;
    public final Object f42375e;
    public final Object f42376f;
    public final Object f42377g;
    public final Object h;

    public w8(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.g90 g90Var, String[] strArr) {
        this.f42372a = 0;
        this.f42373b = i10;
        this.f42374c = inputGroupCall;
        this.d = strArr;
        this.f42375e = frameLayout;
        this.f42376f = g90Var;
        this.f42377g = h3Var;
        this.h = g6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f42372a;
        Object obj = this.h;
        Object obj2 = this.f42377g;
        Object obj3 = this.f42376f;
        Object obj4 = this.f42375e;
        Object obj5 = this.d;
        Object obj6 = this.f42374c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.g90 g90Var = (org.telegram.ui.Components.g90) obj3;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                boolean z4 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f42373b;
                if (z4) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new hg.e0(strArr, frameLayout, g90Var, h3Var, g6Var, 3));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f34106x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f42373b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new w8(externalActionActivity, d2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new sq(externalActionActivity, d2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f34106x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.a6((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.d2) obj5, tLObject, this.f42373b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new mh.s6((xf0) obj6, tLObject, tL_error, (p2.j) obj5, this.f42373b, (p2.m) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj, 5));
                return;
        }
    }

    public w8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f42372a = i11;
        this.f42374c = callback;
        this.d = obj;
        this.f42373b = i10;
        this.f42375e = obj2;
        this.f42376f = tLObject;
        this.f42377g = str;
        this.h = obj3;
    }
}
