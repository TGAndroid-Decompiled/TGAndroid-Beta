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
    public final int f41749a;
    public final Object f41750b;
    public final Object f41751c;
    public final Object d;

    public tr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f41749a = i10;
        this.f41750b = obj;
        this.f41751c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41749a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fn0((yr0) this.f41750b, tLObject, (UserConfig) this.f41751c, (TLRPC.Photo) this.d, 5));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((cx0) this.f41750b, tLObject, (TLRPC.UserFull) this.f41751c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fn0((PrivacySettingsActivity) this.f41750b, (org.telegram.ui.ActionBar.b2) this.f41751c, tLObject, (TL_account.setAccountTTL) this.d, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f41750b, tLObject, (TLRPC.UserFull) this.f41751c, (TL_account.TL_birthday) this.d, tL_error, 29));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f41750b, tLObject, (TLRPC.TL_username) this.f41751c, (bz0) this.d, tL_error, 27));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f41750b, tLObject, (String) this.f41751c, (TLRPC.User) this.d, tL_error, 28));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new fn0((jz0) this.f41750b, tLObject, (UserConfig) this.f41751c, (TLRPC.Photo) this.d, 14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new g01((h61) this.f41750b, tL_error, tLObject, (TwoStepVerificationActivity) this.f41751c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new fn0((SessionsActivity) this.f41750b, (org.telegram.ui.ActionBar.b2) this.f41751c, tL_error, (TLRPC.TL_authorization) this.d, 17));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new fn0((SessionsActivity) this.f41750b, (org.telegram.ui.ActionBar.b2) this.f41751c, tL_error, (TLRPC.TL_webAuthorization) this.d, 16));
                return;
            case 10:
                a91 a91Var = (a91) this.f41750b;
                String str = (String) this.f41751c;
                o91 o91Var = (o91) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        b91 b91Var = a91Var.f43674r;
                        int i10 = b91Var.f35556i;
                        if (b91Var != a91Var.f35311w.f40158w) {
                            z10 = false;
                        }
                        bVar = p91.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(a91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new fn0(a91Var, bVar, str, o91Var, 20));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new fn0((jd1) this.f41750b, tLObject, (String) this.f41751c, (org.telegram.ui.ActionBar.b2) this.d, 22));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41750b;
                byte[] bArr = (byte[]) this.f41751c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new fn0(twoStepVerificationActivity, bArr, tLObject, bArr2, 23));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new k71(17, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
