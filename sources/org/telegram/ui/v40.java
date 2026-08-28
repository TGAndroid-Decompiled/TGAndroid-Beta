package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class v40 implements RequestDelegate {
    public final int f43377a;
    public final Object f43378b;
    public final Object f43379c;

    public v40(int i9, Object obj, Object obj2) {
        this.f43377a = i9;
        this.f43379c = obj;
        this.f43378b = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f43377a;
        Object obj = this.f43378b;
        Object obj2 = this.f43379c;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((w40) obj2, tL_error, tLObject, (String) obj, 9));
                return;
            case 1:
                v60 v60Var = (v60) obj2;
                if (Objects.equals(v60Var.f43395a.f43683e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new x20(3, v60Var, tLObject));
                    return;
                }
                return;
            case 2:
                i70 i70Var = (i70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new jq(i70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new jq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.e6) obj, 17));
                return;
            case 4:
                Pattern pattern2 = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((org.telegram.ui.ActionBar.c2) obj2, tLObject, (h) obj, tL_error, 13));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new jq((kb0) obj2, tLObject, (String) obj, 19));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new jq((hb0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((hb0) obj2, tLObject, (HashSet) obj, tL_error, 15));
                return;
            case 8:
                fg0 fg0Var = (fg0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new jq(fg0Var, bundle, tLObject, 24));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new rc0(fg0Var, 2));
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((je0) obj2, tLObject, (String) obj, tL_error, 18));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new jq((jf0) obj2, tL_error, (TL_account.confirmPhone) obj, 29));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ye0((KeyEvent.Callback) ((eg0) obj2), tLObject, (Object) ((HashMap) obj), 4));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((eg0) obj2, tL_error, tLObject, (String) obj, 22));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ye0((KeyEvent.Callback) ((nj0) obj2), tLObject, (Object) ((eb0) obj), 7));
                return;
            case 14:
                zl0 zl0Var = (zl0) obj2;
                zl0Var.getClass();
                zl0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ye0((Object) ((sm0) obj2), (Object) tL_error, (Object) ((TL_account.verifyPhone) obj), 13));
                return;
            case 16:
                co0 co0Var = (co0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new cf0(20, co0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new dn0(co0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 17:
                co0 co0Var2 = (co0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        Utilities.Callback callback = co0Var2.Y0;
                        if (callback != null) {
                            callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                            return;
                        }
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.Update update = updates.updates.get(i10);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        co0Var2.getMessagesController().processUpdates(updates, false);
                        AndroidUtilities.runOnUIThread(new cf0(21, co0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new xm0(co0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                t10 t10Var = co0Var2.f37247a1;
                if (t10Var == null || !((Boolean) t10Var.run(tL_error)).booleanValue()) {
                    AndroidUtilities.runOnUIThread(new ye0(co0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                    return;
                }
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0((co0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 26));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) ((pv0) obj2), (Object) tL_error, tLObject, (Object) ((TL_stars.updatePaidMessagesPrice) obj), 1));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) ((PrivacyControlActivity) obj2), (Object) tL_error, tLObject, (Object) ((boolean[]) obj), 2));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new ys0(9, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.t8) obj));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new ir0((Object) ((ProfileActivity) obj2), (Object) tLObject, (Object) tL_error, (Object) ((int[]) obj), 5));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new ir0((Object) ((ProfileActivity) obj2), (Object) tLObject, (Object) ((TLRPC.TL_username) obj), (Object) tL_error, 6));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) ((ProfileActivity) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 8));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new ir0((oz0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 10));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new ye0((Object) ((g71) obj2), (Object) tL_error, (Object) ((TLRPC.TL_authorization) obj), 27));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new ye0((h71) obj2, tL_error, (TLRPC.TL_authorization) obj, 28));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new ir0((j71) obj2, tLObject, tL_error, (j9) obj, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) ((z71) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 14));
                return;
        }
    }
}
