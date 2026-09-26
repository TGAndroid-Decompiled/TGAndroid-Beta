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
    public final int f38341a;
    public final int f38342b;
    public final Object f38343c;
    public final Object d;
    public final Object e;
    public final Object f38344f;
    public final Object f38345g;
    public final Object h;

    public u8(int i10, TLRPC.InputGroupCall inputGroupCall, String[] strArr, FrameLayout frameLayout, org.telegram.ui.Components.o90 o90Var, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f38341a = 0;
        this.f38342b = i10;
        this.f38343c = inputGroupCall;
        this.d = strArr;
        this.e = frameLayout;
        this.f38344f = o90Var;
        this.f38345g = e3Var;
        this.h = d6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f38341a;
        Object obj = this.h;
        Object obj2 = this.f38345g;
        Object obj3 = this.f38344f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f38343c;
        switch (i10) {
            case 0:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                String[] strArr = (String[]) obj5;
                FrameLayout frameLayout = (FrameLayout) obj4;
                org.telegram.ui.Components.o90 o90Var = (org.telegram.ui.Components.o90) obj3;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i11 = this.f38342b;
                if (z10) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                }
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = inputGroupCall;
                ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new ci.hd(strArr, frameLayout, o90Var, e3Var, d6Var, 1));
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                int[] iArr = (int[]) obj5;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj4;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ExternalActionActivity.f31074x;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i12 = this.f38342b;
                    iArr[0] = ConnectionsManager.getInstance(i12).sendRequest(getpassword, new u8(externalActionActivity, a2Var, i12, authorizationform, getauthorizationform, str, str2, 2));
                    return;
                }
                AndroidUtilities.runOnUIThread(new sq(externalActionActivity, a2Var, tL_error, 5));
                return;
            case 2:
                ArrayList arrayList2 = ExternalActionActivity.f31074x;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.y5((ExternalActionActivity) obj6, (org.telegram.ui.ActionBar.a2) obj5, tLObject, this.f38342b, (TL_account.authorizationForm) obj4, (TL_account.getAuthorizationForm) obj3, (String) obj2, (String) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb((zf0) obj6, tLObject, tL_error, (c5.k) obj5, this.f38342b, (c5.o) obj4, (TLRPC.TL_inputStorePaymentAuthCode) obj3, (String) obj2, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
        }
    }

    public u8(KeyEvent.Callback callback, Object obj, int i10, Object obj2, TLObject tLObject, String str, Object obj3, int i11) {
        this.f38341a = i11;
        this.f38343c = callback;
        this.d = obj;
        this.f38342b = i10;
        this.e = obj2;
        this.f38344f = tLObject;
        this.f38345g = str;
        this.h = obj3;
    }
}
