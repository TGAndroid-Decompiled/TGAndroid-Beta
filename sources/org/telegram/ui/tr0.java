package org.telegram.ui;

import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
public final class tr0 implements RequestDelegate {
    public final int f41697a;
    public final Object f41698b;
    public final Object f41699c;
    public final Object d;

    public tr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f41697a = i10;
        this.f41698b = obj;
        this.f41699c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41697a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b30((Object) ((yr0) this.f41698b), tLObject, (Object) ((UserConfig) this.f41699c), (Object) ((TLRPC.Photo) this.d), 22));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((Object) ((gx0) this.f41698b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f41699c), (Object) ((TL_account.TL_birthday) this.d), (Object) tL_error, 23));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b30((Object) ((PrivacySettingsActivity) this.f41698b), (Object) ((org.telegram.ui.ActionBar.d2) this.f41699c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 25));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((Object) ((ProfileActivity) this.f41698b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f41699c), (Object) ((TL_account.TL_birthday) this.d), (Object) tL_error, 27));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((ProfileActivity) this.f41698b, tLObject, (TLRPC.TL_username) this.f41699c, (iz0) this.d, tL_error, 25));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0((ProfileActivity) this.f41698b, tLObject, (String) this.f41699c, (TLRPC.User) this.d, tL_error, 26));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new yx0((qz0) this.f41698b, tLObject, (UserConfig) this.f41699c, (TLRPC.Photo) this.d, false, 1));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new t61((c71) this.f41698b, tL_error, tLObject, (TwoStepVerificationActivity) this.f41699c, (TLRPC.User) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new yx0((SessionsActivity) this.f41698b, (org.telegram.ui.ActionBar.d2) this.f41699c, tL_error, (TLRPC.TL_authorization) this.d, false, 4));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new yx0((SessionsActivity) this.f41698b, (org.telegram.ui.ActionBar.d2) this.f41699c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 3));
                return;
            case 10:
                s91 s91Var = (s91) this.f41698b;
                String str = (String) this.f41699c;
                ga1 ga1Var = (ga1) this.d;
                boolean z4 = true;
                xf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        t91 t91Var = s91Var.f40873r;
                        int i10 = t91Var.f41548i;
                        if (t91Var != s91Var.f41173w.f37445w) {
                            z4 = false;
                        }
                        bVar = ha1.e0(jSONObject, i10, z4);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(s91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new yx0(7, s91Var, bVar, ga1Var, str));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new yx0((Object) ((ee1) this.f41698b), tLObject, (Object) ((String) this.f41699c), (Object) ((org.telegram.ui.ActionBar.d2) this.d), 9));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41698b;
                byte[] bArr = (byte[]) this.f41699c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new yx0(twoStepVerificationActivity, bArr, tLObject, bArr2, 10));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new w01(28, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
