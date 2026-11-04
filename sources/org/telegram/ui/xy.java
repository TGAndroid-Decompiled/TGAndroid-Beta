package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public final class xy implements RequestDelegate {
    public final int f52124a;
    public final Object f52125b;
    public final Object f52126c;

    public xy(int i3, Object obj, Object obj2) {
        this.f52124a = i3;
        this.f52125b = obj;
        this.f52126c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f52124a;
        Object obj = this.f52126c;
        Object obj2 = this.f52125b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new pp((yy) obj2, tL_error, (wy) obj, 8));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ly(1, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((g30) obj2, tL_error, tLObject, (String) obj, 15));
                return;
            case 3:
                c50 c50Var = (c50) obj2;
                if (Objects.equals(c50Var.f44238a.f44565e, (String) obj)) {
                    org.telegram.messenger.g0.h3(new ly(9, c50Var, tLObject));
                    return;
                }
                return;
            case 4:
                o50 o50Var = (o50) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.g0.h3(new pp(o50Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new pp((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, 18));
                return;
            case 6:
                String str3 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((Object) ((org.telegram.ui.ActionBar.s1) obj2), (Object) tLObject, (Object) ((g) obj), tL_error, 19));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new pp((m90) obj2, tLObject, (String) obj, 21));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new pp((j90) obj2, tLObject, (TLRPC.User) obj, 22));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((Object) ((j90) obj2), (Object) tLObject, (Object) ((HashSet) obj), tL_error, 21));
                return;
            case 10:
                xd0 xd0Var = (xd0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.g0.h3(new pp(xd0Var, bundle, tLObject, 27));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new ma0(xd0Var, 2));
                    return;
                }
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((Object) ((fc0) obj2), (Object) tLObject, (Object) ((String) obj), tL_error, 24));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new hc0((dd0) obj2, tL_error, (TL_account.confirmPhone) obj, false, 2));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new hc0((wd0) obj2, tLObject, (HashMap) obj, 7));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60((wd0) obj2, tL_error, tLObject, (String) obj, 28));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new hc0((vg0) obj2, tLObject, (org.telegram.ui.Components.ei) obj, 10));
                return;
            case 16:
                cj0 cj0Var = (cj0) obj2;
                cj0Var.getClass();
                cj0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 17:
                org.telegram.messenger.g0.h3(new hc0((uj0) obj2, tL_error, (TL_account.verifyPhone) obj, false, 16));
                return;
            case 18:
                dl0 dl0Var = (dl0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.h3(new tb0(29, dl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new gk0(dl0Var, tL_error, tLObject2, 1));
                    return;
                }
            case 19:
                dl0 dl0Var2 = (dl0) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                        org.telegram.messenger.u10 u10Var = dl0Var2.f44746d1;
                        if (u10Var != null) {
                            u10Var.a((TLRPC.TL_payments_paymentResult) tLObject);
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
                        dl0Var2.getMessagesController().O3(updates, false);
                        org.telegram.messenger.g0.h3(new hk0(0, dl0Var2, messageArr));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        org.telegram.messenger.g0.h3(new ck0(dl0Var2, tLObject, 1));
                        return;
                    } else {
                        return;
                    }
                }
                h00 h00Var = dl0Var2.f44752f1;
                if (h00Var == null || !((Boolean) h00Var.a(tL_error)).booleanValue()) {
                    org.telegram.messenger.g0.h3(new hc0(dl0Var2, tL_error, tL_payments_sendPaymentForm, false, 18));
                    return;
                }
                return;
            case 20:
                org.telegram.messenger.g0.h3(new ih0((dl0) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, 2));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new ih0((xr0) obj2, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, 7));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new ih0((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, 8));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new hk0(18, (PrivacySettingsActivity) obj2, (org.telegram.ui.Cells.q8) obj));
                return;
            case 24:
                RectF rectF = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new ih0((ProfileActivity) obj2, tLObject, tL_error, (int[]) obj, 11));
                return;
            case 25:
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new ih0((ProfileActivity) obj2, tL_error, tLObject, (String) obj, 14));
                return;
            case 26:
                RectF rectF3 = ProfileActivity.T6;
                org.telegram.messenger.g0.h3(new ih0((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 13));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new ih0((uv0) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, 16));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new wy0((j21) obj2, tL_error, (TLRPC.TL_authorization) obj, 1));
                return;
            default:
                org.telegram.messenger.g0.h3(new wy0((k21) obj2, tL_error, (TLRPC.TL_authorization) obj, 2));
                return;
        }
    }
}
