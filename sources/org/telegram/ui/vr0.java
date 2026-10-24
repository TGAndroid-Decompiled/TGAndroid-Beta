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
public final class vr0 implements RequestDelegate {
    public final int f42808a;
    public final Object f42809b;
    public final Object f42810c;
    public final Object d;

    public vr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f42808a = i10;
        this.f42809b = obj;
        this.f42810c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42808a) {
            case 0:
                AndroidUtilities.runOnUIThread(new in0((as0) this.f42809b, tLObject, (UserConfig) this.f42810c, (TLRPC.Photo) this.d, 5));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e30((fx0) this.f42809b, tLObject, (TLRPC.UserFull) this.f42810c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new in0((PrivacySettingsActivity) this.f42809b, (org.telegram.ui.ActionBar.c2) this.f42810c, tLObject, (TL_account.setAccountTTL) this.d, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e30((ProfileActivity) this.f42809b, tLObject, (TLRPC.UserFull) this.f42810c, (TL_account.TL_birthday) this.d, tL_error, 29));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e30((ProfileActivity) this.f42809b, tLObject, (TLRPC.TL_username) this.f42810c, (ez0) this.d, tL_error, 27));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e30((ProfileActivity) this.f42809b, tLObject, (String) this.f42810c, (TLRPC.User) this.d, tL_error, 28));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new in0((mz0) this.f42809b, tLObject, (UserConfig) this.f42810c, (TLRPC.Photo) this.d, 14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new j01((k61) this.f42809b, tL_error, tLObject, (TwoStepVerificationActivity) this.f42810c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new in0((SessionsActivity) this.f42809b, (org.telegram.ui.ActionBar.c2) this.f42810c, tL_error, (TLRPC.TL_authorization) this.d, 17));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new in0((SessionsActivity) this.f42809b, (org.telegram.ui.ActionBar.c2) this.f42810c, tL_error, (TLRPC.TL_webAuthorization) this.d, 16));
                return;
            case 10:
                e91 e91Var = (e91) this.f42809b;
                String str = (String) this.f42810c;
                s91 s91Var = (s91) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        f91 f91Var = e91Var.f36544r;
                        int i10 = f91Var.f37248i;
                        if (f91Var != e91Var.f36862w.f41969w) {
                            z10 = false;
                        }
                        bVar = t91.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(e91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new in0(e91Var, bVar, str, s91Var, 20));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new in0((od1) this.f42809b, tLObject, (String) this.f42810c, (org.telegram.ui.ActionBar.c2) this.d, 22));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f42809b;
                byte[] bArr = (byte[]) this.f42810c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new in0(twoStepVerificationActivity, bArr, tLObject, bArr2, 23));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new n71(17, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
