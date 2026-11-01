package org.telegram.ui;

import android.graphics.RectF;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
public final class tp0 implements RequestDelegate {
    public final int f41708a;
    public final Object f41709b;
    public final Object f41710c;
    public final Object d;

    public tp0(Object obj, Object obj2, Object obj3, int i10) {
        this.f41708a = i10;
        this.f41709b = obj;
        this.f41710c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41708a) {
            case 0:
                org.telegram.messenger.i0.g3(new v50((yp0) this.f41709b, tLObject, (org.telegram.messenger.e20) this.f41710c, (TLRPC.Photo) this.d, 20));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new l90((ru0) this.f41709b, tLObject, (TLRPC.UserFull) this.f41710c, (TL_account.TL_birthday) this.d, tL_error, 14));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new v50((PrivacySettingsActivity) this.f41709b, (org.telegram.ui.ActionBar.x1) this.f41710c, tLObject, (TL_account.setAccountTTL) this.d, 23));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f41709b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f41710c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.i0.g3(new l90(profileActivity, tLObject, userFull, tL_birthday, tL_error, 18));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f41709b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f41710c;
                tw0 tw0Var = (tw0) this.d;
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.messenger.i0.g3(new l90(profileActivity2, tLObject, tL_username, tw0Var, tL_error, 16));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f41709b;
                String str = (String) this.f41710c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.S6;
                org.telegram.messenger.i0.g3(new l90(profileActivity3, tLObject, str, user, tL_error, 17));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new v50((cx0) this.f41709b, tLObject, (org.telegram.messenger.e20) this.f41710c, (TLRPC.Photo) this.d, 29));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new l90((Object) ((q31) this.f41709b), tL_error, (Object) tLObject, (Object) ((TwoStepVerificationActivity) this.f41710c), (Object) ((TLRPC.User) this.d), 21));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new ox0((Object) ((SessionsActivity) this.f41709b), (Object) ((org.telegram.ui.ActionBar.x1) this.f41710c), tL_error, (Object) ((TLRPC.TL_authorization) this.d), 2));
                return;
            case 9:
                org.telegram.messenger.i0.g3(new ox0((Object) ((SessionsActivity) this.f41709b), (Object) ((org.telegram.ui.ActionBar.x1) this.f41710c), tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 1));
                return;
            case 10:
                d61 d61Var = (d61) this.f41709b;
                String str2 = (String) this.f41710c;
                r61 r61Var = (r61) this.d;
                boolean z10 = true;
                cg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        e61 e61Var = d61Var.f36210r;
                        int i10 = e61Var.f36753i;
                        if (e61Var != d61Var.f36507x.f41266x) {
                            z10 = false;
                        }
                        bVar = s61.h0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(d61Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.i0.g3(new ox0(d61Var, bVar, str2, r61Var, 5));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new ox0((fa1) this.f41709b, tLObject, (String) this.f41710c, (org.telegram.ui.ActionBar.x1) this.d, 7));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41709b;
                byte[] bArr = (byte[]) this.f41710c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.e.c(new ox0(twoStepVerificationActivity, bArr, tLObject, bArr2));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new y01(18, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
