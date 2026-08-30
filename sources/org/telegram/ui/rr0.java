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
public final class rr0 implements RequestDelegate {
    public final int f38107a;
    public final Object f38108b;
    public final Object f38109c;
    public final Object d;

    public rr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f38107a = i10;
        this.f38108b = obj;
        this.f38109c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38107a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a30((Object) ((wr0) this.f38108b), tLObject, (Object) ((UserConfig) this.f38109c), (Object) ((TLRPC.Photo) this.d), 22));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((ex0) this.f38108b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f38109c), (Object) ((TL_account.TL_birthday) this.d), (Object) tL_error, 23));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a30((Object) ((PrivacySettingsActivity) this.f38108b), (Object) ((org.telegram.ui.ActionBar.d2) this.f38109c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 25));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((ProfileActivity) this.f38108b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f38109c), (Object) ((TL_account.TL_birthday) this.d), (Object) tL_error, 27));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((ProfileActivity) this.f38108b, tLObject, (TLRPC.TL_username) this.f38109c, (gz0) this.d, tL_error, 25));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((ProfileActivity) this.f38108b, tLObject, (String) this.f38109c, (TLRPC.User) this.d, tL_error, 26));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new wx0((oz0) this.f38108b, tLObject, (UserConfig) this.f38109c, (TLRPC.Photo) this.d, false, 1));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new s61((b71) this.f38108b, tL_error, tLObject, (TwoStepVerificationActivity) this.f38109c, (TLRPC.User) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new wx0((SessionsActivity) this.f38108b, (org.telegram.ui.ActionBar.d2) this.f38109c, tL_error, (TLRPC.TL_authorization) this.d, false, 4));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new wx0((SessionsActivity) this.f38108b, (org.telegram.ui.ActionBar.d2) this.f38109c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 3));
                return;
            case 10:
                r91 r91Var = (r91) this.f38108b;
                String str = (String) this.f38109c;
                fa1 fa1Var = (fa1) this.d;
                boolean z4 = true;
                wf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        s91 s91Var = r91Var.f37684r;
                        int i10 = s91Var.f38234i;
                        if (s91Var != r91Var.f37954w.f34555w) {
                            z4 = false;
                        }
                        bVar = ga1.e0(jSONObject, i10, z4);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(r91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new wx0(7, r91Var, bVar, fa1Var, str));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new wx0((Object) ((be1) this.f38108b), tLObject, (Object) ((String) this.f38109c), (Object) ((org.telegram.ui.ActionBar.d2) this.d), 9));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38108b;
                byte[] bArr = (byte[]) this.f38109c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new wx0(twoStepVerificationActivity, bArr, tLObject, bArr2, 10));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new l01(29, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
