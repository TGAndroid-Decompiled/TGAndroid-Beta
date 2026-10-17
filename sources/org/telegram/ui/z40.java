package org.telegram.ui;

import android.os.Bundle;
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
public final class z40 implements RequestDelegate {
    public final int f43559a;
    public final Object f43560b;
    public final Object f43561c;

    public z40(int i10, Object obj, Object obj2) {
        this.f43559a = i10;
        this.f43561c = obj;
        this.f43560b = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f43559a;
        Object obj = this.f43560b;
        Object obj2 = this.f43561c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((a50) obj2), tL_error, tLObject, (Object) ((String) obj), 14));
                return;
            case 1:
                y60 y60Var = (y60) obj2;
                if (Objects.equals(y60Var.f43331a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new nt(26, y60Var, tLObject));
                    return;
                }
                return;
            case 2:
                l70 l70Var = (l70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new lq(l70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new lq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 18));
                return;
            case 4:
                Pattern pattern2 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((org.telegram.ui.ActionBar.b2) obj2), tLObject, (Object) ((h) obj), tL_error, 18));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new lq((kb0) obj2, tLObject, (String) obj, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new lq((hb0) obj2, tLObject, (TLRPC.User) obj, 21));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((hb0) obj2), tLObject, (Object) ((HashSet) obj), tL_error, 20));
                return;
            case 8:
                fg0 fg0Var = (fg0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new lq(fg0Var, bundle, tLObject, 25));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new qc0(fg0Var, 2));
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((ie0) obj2), tLObject, (Object) ((String) obj), tL_error, 23));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new xe0((jf0) obj2, tL_error, (TL_account.confirmPhone) obj, 0));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new xe0((eg0) obj2, tLObject, (HashMap) obj, 5));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((Object) ((eg0) obj2), tL_error, tLObject, (Object) ((String) obj), 27));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new xe0((oj0) obj2, tLObject, (org.telegram.ui.Components.qy) obj, 8));
                return;
            case 14:
                am0 am0Var = (am0) obj2;
                am0Var.getClass();
                am0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new xe0((tm0) obj2, tL_error, (TL_account.verifyPhone) obj, 14));
                return;
            case 16:
                fo0 fo0Var = (fo0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new zg0(16, fo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new en0(fo0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 17:
                fo0 fo0Var2 = (fo0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        Utilities.Callback callback = fo0Var2.f36978c1;
                        if (callback != null) {
                            callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                            return;
                        }
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.Update update = updates.updates.get(i11);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        fo0Var2.getMessagesController().lambda$processUpdates$377(updates, false);
                        AndroidUtilities.runOnUIThread(new zg0(17, fo0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        AndroidUtilities.runOnUIThread(new ym0(fo0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                v10 v10Var = fo0Var2.f36982e1;
                if (v10Var == null || !((Boolean) v10Var.run(tL_error)).booleanValue()) {
                    AndroidUtilities.runOnUIThread(new xe0(fo0Var2, tL_error, tL_payments_sendPaymentForm, 16));
                    return;
                }
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new gn0((fo0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 1));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new gn0((zv0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 6));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new gn0((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 7));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new lv0(5, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.v8) obj));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new gn0((ProfileActivity) obj2, tL_error, tLObject, (String) obj, 13));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new gn0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 10));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new gn0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 11));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new gn0((wz0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 15));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new xe0((e71) obj2, tL_error, (TLRPC.TL_authorization) obj, 28));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new xe0((f71) obj2, tL_error, (TLRPC.TL_authorization) obj, 29));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new gn0((i71) obj2, tLObject, tL_error, (n9) obj, 18));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gn0((z71) obj2, tL_error, tLObject, (String) obj, 19));
                return;
        }
    }
}
