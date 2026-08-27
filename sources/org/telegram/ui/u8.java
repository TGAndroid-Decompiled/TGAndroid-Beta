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

public final class u8 implements RequestDelegate {

    public final int f43159a;

    public final int f43160b;

    public final Object f43161c;
    public final Object d;

    public final Object f43162e;

    public final Object f43163f;

    public final Object f43164g;
    public final Object h;

    public u8(int i10, FrameLayout frameLayout, TLRPC.InputGroupCall inputGroupCall, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.p80 p80Var, String[] strArr) {
        this.f43159a = 0;
        this.f43160b = i10;
        this.f43161c = inputGroupCall;
        this.d = strArr;
        this.f43162e = frameLayout;
        this.f43163f = p80Var;
        this.f43164g = e3Var;
        this.h = c6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f43159a;
        Object obj = this.h;
        Object obj2 = this.f43164g;
        Object obj3 = this.f43163f;
        Object obj4 = this.f43162e;
        Object obj5 = this.d;
        Object obj6 = this.f43161c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) obj3;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f43160b;
                if (z10) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new cg.e0(strArr, frameLayout, p80Var, e3Var, c6Var, 4));
                break;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f35468x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform == null) {
                    AndroidUtilities.runOnUIThread(new lq(externalActionActivity, b2Var, tL_error, 5));
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f43160b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new u8(externalActionActivity, b2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                }
                break;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f35468x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.z5((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.b2) obj5, tLObject, this.f43160b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                break;
            default:
                AndroidUtilities.runOnUIThread(new hh.t6((rf0) obj6, tLObject, tL_error, (n2.i) obj5, this.f43160b, (n2.l) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj, 5));
                break;
        }
    }

    public u8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f43159a = i11;
        this.f43161c = callback;
        this.d = obj;
        this.f43160b = i10;
        this.f43162e = obj2;
        this.f43163f = tLObject;
        this.f43164g = str;
        this.h = obj3;
    }
}
