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
public final class vp0 implements RequestDelegate {
    public final int f42784a;
    public final Object f42785b;
    public final Object f42786c;
    public final Object d;

    public vp0(Object obj, Object obj2, Object obj3, int i10) {
        this.f42784a = i10;
        this.f42785b = obj;
        this.f42786c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42784a) {
            case 0:
                org.telegram.messenger.i0.g3(new w50((aq0) this.f42785b, tLObject, (org.telegram.messenger.d20) this.f42786c, (TLRPC.Photo) this.d, 20));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new m90((su0) this.f42785b, tLObject, (TLRPC.UserFull) this.f42786c, (TL_account.TL_birthday) this.d, tL_error, 14));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new w50((PrivacySettingsActivity) this.f42785b, (org.telegram.ui.ActionBar.x1) this.f42786c, tLObject, (TL_account.setAccountTTL) this.d, 23));
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f42785b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f42786c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.R6;
                org.telegram.messenger.i0.g3(new m90(profileActivity, tLObject, userFull, tL_birthday, tL_error, 18));
                return;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f42785b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f42786c;
                uw0 uw0Var = (uw0) this.d;
                RectF rectF2 = ProfileActivity.R6;
                org.telegram.messenger.i0.g3(new m90(profileActivity2, tLObject, tL_username, uw0Var, tL_error, 16));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f42785b;
                String str = (String) this.f42786c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.R6;
                org.telegram.messenger.i0.g3(new m90(profileActivity3, tLObject, str, user, tL_error, 17));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new w50((dx0) this.f42785b, tLObject, (org.telegram.messenger.d20) this.f42786c, (TLRPC.Photo) this.d, 29));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new m90((Object) ((s31) this.f42785b), tL_error, (Object) tLObject, (Object) ((TwoStepVerificationActivity) this.f42786c), (Object) ((TLRPC.User) this.d), 21));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new px0((Object) ((SessionsActivity) this.f42785b), (Object) ((org.telegram.ui.ActionBar.x1) this.f42786c), tL_error, (Object) ((TLRPC.TL_authorization) this.d), 2));
                return;
            case 9:
                org.telegram.messenger.i0.g3(new px0((Object) ((SessionsActivity) this.f42785b), (Object) ((org.telegram.ui.ActionBar.x1) this.f42786c), tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 1));
                return;
            case 10:
                f61 f61Var = (f61) this.f42785b;
                String str2 = (String) this.f42786c;
                t61 t61Var = (t61) this.d;
                boolean z10 = true;
                cg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        g61 g61Var = f61Var.f36964r;
                        int i10 = g61Var.f37438i;
                        if (g61Var != f61Var.f37188x.f42053x) {
                            z10 = false;
                        }
                        bVar = u61.g0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(f61Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.i0.g3(new px0(f61Var, bVar, str2, t61Var, 5));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new px0((ha1) this.f42785b, tLObject, (String) this.f42786c, (org.telegram.ui.ActionBar.x1) this.d, 7));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f42785b;
                byte[] bArr = (byte[]) this.f42786c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.e.c(new px0(twoStepVerificationActivity, bArr, tLObject, bArr2));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new t11(17, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
