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
public final class yr0 implements RequestDelegate {
    public final int f40321a;
    public final Object f40322b;
    public final Object f40323c;
    public final Object d;

    public yr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40321a = i10;
        this.f40322b = obj;
        this.f40323c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40321a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c30((Object) ((ds0) this.f40322b), tLObject, (Object) ((UserConfig) this.f40323c), (Object) ((TLRPC.Photo) this.d), 22));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((lx0) this.f40322b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f40323c), (Object) ((TL_account.TL_birthday) this.d), (Object) tL_error, 23));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new c30((Object) ((PrivacySettingsActivity) this.f40322b), (Object) ((org.telegram.ui.ActionBar.d2) this.f40323c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 25));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((ProfileActivity) this.f40322b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f40323c), (Object) ((TL_account.TL_birthday) this.d), (Object) tL_error, 27));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((ProfileActivity) this.f40322b, tLObject, (TLRPC.TL_username) this.f40323c, (mz0) this.d, tL_error, 25));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((ProfileActivity) this.f40322b, tLObject, (String) this.f40323c, (TLRPC.User) this.d, tL_error, 26));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new dy0((vz0) this.f40322b, tLObject, (UserConfig) this.f40323c, (TLRPC.Photo) this.d, false, 1));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new z61((i71) this.f40322b, tL_error, tLObject, (TwoStepVerificationActivity) this.f40323c, (TLRPC.User) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new dy0((SessionsActivity) this.f40322b, (org.telegram.ui.ActionBar.d2) this.f40323c, tL_error, (TLRPC.TL_authorization) this.d, false, 4));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new dy0((SessionsActivity) this.f40322b, (org.telegram.ui.ActionBar.d2) this.f40323c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 3));
                return;
            case 10:
                z91 z91Var = (z91) this.f40322b;
                String str = (String) this.f40323c;
                na1 na1Var = (na1) this.d;
                boolean z4 = true;
                wf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        aa1 aa1Var = z91Var.f40194r;
                        int i10 = aa1Var.f32531i;
                        if (aa1Var != z91Var.f40430w.f36739w) {
                            z4 = false;
                        }
                        bVar = oa1.e0(jSONObject, i10, z4);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(z91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new dy0((Object) z91Var, (Object) bVar, str, (Object) na1Var, 7));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new dy0((Object) ((je1) this.f40322b), tLObject, (Object) ((String) this.f40323c), (Object) ((org.telegram.ui.ActionBar.d2) this.d), 9));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40322b;
                byte[] bArr = (byte[]) this.f40323c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new dy0(twoStepVerificationActivity, bArr, tLObject, bArr2, 10));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new b11(28, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
