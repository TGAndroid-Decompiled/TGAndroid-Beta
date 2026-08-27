package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;

public final class v80 implements RequestDelegate {

    public final int f43378a;

    public final Object f43379b;

    public final Object f43380c;

    public v80(int i10, Object obj, Object obj2) {
        this.f43378a = i10;
        this.f43379b = obj;
        this.f43380c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Object obj;
        Object obj2;
        Object obj3;
        long[] jArr;
        int i10 = this.f43378a;
        int i11 = 20;
        int i12 = 7;
        int i13 = 4;
        int i14 = 0;
        int i15 = 1;
        Object obj4 = this.f43380c;
        Object obj5 = this.f43379b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new lq((LaunchActivity) obj5, tLObject, (org.telegram.ui.ActionBar.f6) obj4, 17));
                break;
            case 1:
                Pattern pattern2 = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((org.telegram.ui.ActionBar.b2) obj5, tLObject, (h) obj4, tL_error, 9));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new lq((ob0) obj5, tLObject, (String) obj4, 19));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new lq((lb0) obj5, tLObject, (TLRPC.User) obj4, i11));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((lb0) obj5, tLObject, (HashSet) obj4, tL_error, 11));
                break;
            case 5:
                ig0 ig0Var = (ig0) obj5;
                Bundle bundle = (Bundle) obj4;
                if (tLObject == null || (((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new vc0(ig0Var, 2));
                } else {
                    AndroidUtilities.runOnUIThread(new lq(ig0Var, bundle, tLObject, 24));
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((me0) obj5, tLObject, (String) obj4, tL_error, 14));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new lq((mf0) obj5, tL_error, (TL_account.confirmPhone) obj4, 29));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bf0((KeyEvent.Callback) obj5, tLObject, obj4, i13));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((hg0) obj5, tL_error, tLObject, (String) obj4, 18));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new bf0((KeyEvent.Callback) obj5, tLObject, obj4, i12));
                break;
            case 11:
                am0 am0Var = (am0) obj5;
                am0Var.getClass();
                am0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj4);
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bf0(obj5, (Object) tL_error, obj4, 13));
                break;
            case 13:
                do0 do0Var = (do0) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new ff0(i11, do0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                } else {
                    AndroidUtilities.runOnUIThread(new en0(do0Var, tL_error, tLObject2, i15));
                }
                break;
            case 14:
                do0 do0Var2 = (do0) obj5;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj4;
                if (tLObject == null) {
                    w10 w10Var = do0Var2.f37453a1;
                    if (w10Var == null || !((Boolean) w10Var.run(tL_error)).booleanValue()) {
                        AndroidUtilities.runOnUIThread(new bf0(do0Var2, tL_error, tL_payments_sendPaymentForm, 15));
                    }
                } else if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                    Utilities.Callback callback = do0Var2.Y0;
                    if (callback != null) {
                        callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                    } else {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            TLRPC.Update update = updates.updates.get(i16);
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                            } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                            }
                            do0Var2.getMessagesController().processUpdates(updates, false);
                            AndroidUtilities.runOnUIThread(new ff0(21, do0Var2, messageArr));
                            break;
                        }
                        do0Var2.getMessagesController().processUpdates(updates, false);
                        AndroidUtilities.runOnUIThread(new ff0(21, do0Var2, messageArr));
                    }
                } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                    AndroidUtilities.runOnUIThread(new ym0(do0Var2, tLObject, i15));
                }
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((do0) obj5, tLObject, tL_error, (TL_account.getTmpPassword) obj4, 22));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((qv0) obj5, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj4, 27));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((PrivacyControlActivity) obj5, tL_error, tLObject, (boolean[]) obj4, 28));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new zs0(9, (PrivacySettingsActivity) obj5, (org.telegram.ui.Cells.p8) obj4));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ex0((ProfileActivity) obj5, tLObject, tL_error, (int[]) obj4, 1));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ex0((ProfileActivity) obj5, tLObject, (TLRPC.TL_username) obj4, tL_error, 2));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ex0((ProfileActivity) obj5, tL_error, tLObject, (String) obj4, 4));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new ex0((oz0) obj5, tLObject, (TLRPC.TL_username) obj4, tL_error, 6));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new bf0(obj5, (Object) tL_error, obj4, 27));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new bf0((g71) obj5, tL_error, (TLRPC.TL_authorization) obj4, 28));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ex0((i71) obj5, tLObject, tL_error, (k9) obj4, 9));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new ex0((x71) obj5, tL_error, tLObject, (String) obj4, 10));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new m21(i12, (x71) obj5, (TLRPC.TL_attachMenuBot) obj4));
                break;
            case 28:
                c91 c91Var = (c91) obj5;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) obj4;
                int i17 = c91Var.f37027i;
                Object obj6 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            sf.b bVarE0 = q91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i17, c91Var.f37031m);
                            try {
                                obj6 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                                if (i17 == 4 && (jArr = bVarE0.f47881a) != null && jArr.length > 0) {
                                    long j10 = jArr[jArr.length - 1];
                                    c91Var.f37024e = new sf.e(bVarE0, j10);
                                    c91Var.f37023c = j10;
                                }
                                obj3 = obj6;
                                obj6 = bVarE0;
                            } catch (JSONException e9) {
                                e = e9;
                                obj3 = obj6;
                                obj6 = bVarE0;
                                e.printStackTrace();
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            obj3 = null;
                        }
                    } else {
                        obj3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        c91Var.f37030l = false;
                        c91Var.f37021a = true;
                        c91Var.f37022b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    obj = obj6;
                    obj2 = obj3;
                } else {
                    obj = null;
                    obj2 = null;
                }
                AndroidUtilities.runOnUIThread(new ex0(c91Var, obj, obj2, callback0Return, 12));
                break;
            default:
                AndroidUtilities.runOnUIThread(new pc1((tc1) obj5, (String) obj4, tL_error, i14));
                break;
        }
    }
}
