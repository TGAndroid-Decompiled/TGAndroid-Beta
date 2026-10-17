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
    public final int f42265a;
    public final Object f42266b;
    public final Object f42267c;
    public final Object d;

    public vr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f42265a = i10;
        this.f42266b = obj;
        this.f42267c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42265a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gn0((as0) this.f42266b, tLObject, (UserConfig) this.f42267c, (TLRPC.Photo) this.d, 5));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ex0) this.f42266b, tLObject, (TLRPC.UserFull) this.f42267c, (TL_account.TL_birthday) this.d, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gn0((PrivacySettingsActivity) this.f42266b, (org.telegram.ui.ActionBar.b2) this.f42267c, tLObject, (TL_account.setAccountTTL) this.d, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f42266b, tLObject, (TLRPC.UserFull) this.f42267c, (TL_account.TL_birthday) this.d, tL_error, 29));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f42266b, tLObject, (TLRPC.TL_username) this.f42267c, (dz0) this.d, tL_error, 27));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.f42266b, tLObject, (String) this.f42267c, (TLRPC.User) this.d, tL_error, 28));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gn0((lz0) this.f42266b, tLObject, (UserConfig) this.f42267c, (TLRPC.Photo) this.d, 14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new i01((j61) this.f42266b, tL_error, tLObject, (TwoStepVerificationActivity) this.f42267c, (TLRPC.User) this.d, 2));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gn0((SessionsActivity) this.f42266b, (org.telegram.ui.ActionBar.b2) this.f42267c, tL_error, (TLRPC.TL_authorization) this.d, 17));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new gn0((SessionsActivity) this.f42266b, (org.telegram.ui.ActionBar.b2) this.f42267c, tL_error, (TLRPC.TL_webAuthorization) this.d, 16));
                return;
            case 10:
                c91 c91Var = (c91) this.f42266b;
                String str = (String) this.f42267c;
                q91 q91Var = (q91) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        d91 d91Var = c91Var.f35609r;
                        int i10 = d91Var.f36110i;
                        if (d91Var != c91Var.f35889w.f40665w) {
                            z10 = false;
                        }
                        bVar = r91.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(c91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new gn0(c91Var, bVar, str, q91Var, 20));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gn0((ld1) this.f42266b, tLObject, (String) this.f42267c, (org.telegram.ui.ActionBar.b2) this.d, 22));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f42266b;
                byte[] bArr = (byte[]) this.f42267c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new gn0(twoStepVerificationActivity, bArr, tLObject, bArr2, 23));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new m71(17, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
