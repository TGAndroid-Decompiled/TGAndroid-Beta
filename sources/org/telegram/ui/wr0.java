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
public final class wr0 implements RequestDelegate {
    public final int f43427a;
    public final Object f43428b;
    public final Object f43429c;
    public final Object d;

    public wr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f43427a = i10;
        this.f43428b = obj;
        this.f43429c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43427a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jn0((bs0) this.f43428b, tLObject, (UserConfig) this.f43429c, (TLRPC.Photo) this.d, 5));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((gx0) this.f43428b, tLObject, (TLRPC.UserFull) this.f43429c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jn0((PrivacySettingsActivity) this.f43428b, (org.telegram.ui.ActionBar.c2) this.f43429c, tLObject, (TL_account.setAccountTTL) this.d, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f43428b, tLObject, (TLRPC.UserFull) this.f43429c, (TL_account.TL_birthday) this.d, tL_error, 29));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f43428b, tLObject, (TLRPC.TL_username) this.f43429c, (fz0) this.d, tL_error, 27));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f43428b, tLObject, (String) this.f43429c, (TLRPC.User) this.d, tL_error, 28));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new jn0((nz0) this.f43428b, tLObject, (UserConfig) this.f43429c, (TLRPC.Photo) this.d, 14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new k01((l61) this.f43428b, tL_error, tLObject, (TwoStepVerificationActivity) this.f43429c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new jn0((SessionsActivity) this.f43428b, (org.telegram.ui.ActionBar.c2) this.f43429c, tL_error, (TLRPC.TL_authorization) this.d, 17));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new jn0((SessionsActivity) this.f43428b, (org.telegram.ui.ActionBar.c2) this.f43429c, tL_error, (TLRPC.TL_webAuthorization) this.d, 16));
                return;
            case 10:
                f91 f91Var = (f91) this.f43428b;
                String str = (String) this.f43429c;
                t91 t91Var = (t91) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        g91 g91Var = f91Var.f36883r;
                        int i10 = g91Var.f37536i;
                        if (g91Var != f91Var.f37260w.f42338w) {
                            z10 = false;
                        }
                        bVar = u91.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(f91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new jn0(f91Var, bVar, str, t91Var, 20));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new jn0((pd1) this.f43428b, tLObject, (String) this.f43429c, (org.telegram.ui.ActionBar.c2) this.d, 22));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f43428b;
                byte[] bArr = (byte[]) this.f43429c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new jn0(twoStepVerificationActivity, bArr, tLObject, bArr2, 23));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new o71(17, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
