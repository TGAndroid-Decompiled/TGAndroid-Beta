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
    public final int f43688a;
    public final Object f43689b;
    public final Object f43690c;
    public final Object d;

    public yr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f43688a = i10;
        this.f43689b = obj;
        this.f43690c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43688a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b30((Object) ((ds0) this.f43689b), tLObject, (Object) ((UserConfig) this.f43690c), (Object) ((TLRPC.Photo) this.d), 22));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((lx0) this.f43689b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f43690c), (Object) ((TL_account.TL_birthday) this.d), (Object) tL_error, 23));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b30((Object) ((PrivacySettingsActivity) this.f43689b), (Object) ((org.telegram.ui.ActionBar.d2) this.f43690c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 25));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((Object) ((ProfileActivity) this.f43689b), (Object) tLObject, (Object) ((TLRPC.UserFull) this.f43690c), (Object) ((TL_account.TL_birthday) this.d), (Object) tL_error, 27));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((ProfileActivity) this.f43689b, tLObject, (TLRPC.TL_username) this.f43690c, (mz0) this.d, tL_error, 25));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((ProfileActivity) this.f43689b, tLObject, (String) this.f43690c, (TLRPC.User) this.d, tL_error, 26));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new dy0((vz0) this.f43689b, tLObject, (UserConfig) this.f43690c, (TLRPC.Photo) this.d, false, 1));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new y61((h71) this.f43689b, tL_error, tLObject, (TwoStepVerificationActivity) this.f43690c, (TLRPC.User) this.d, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new dy0((SessionsActivity) this.f43689b, (org.telegram.ui.ActionBar.d2) this.f43690c, tL_error, (TLRPC.TL_authorization) this.d, false, 4));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new dy0((SessionsActivity) this.f43689b, (org.telegram.ui.ActionBar.d2) this.f43690c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 3));
                return;
            case 10:
                y91 y91Var = (y91) this.f43689b;
                String str = (String) this.f43690c;
                ma1 ma1Var = (ma1) this.d;
                boolean z4 = true;
                xf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        z91 z91Var = y91Var.f42971r;
                        int i10 = z91Var.f43865i;
                        if (z91Var != y91Var.f43582w.f39277w) {
                            z4 = false;
                        }
                        bVar = na1.e0(jSONObject, i10, z4);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(y91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new dy0(7, y91Var, bVar, ma1Var, str));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new dy0((Object) ((ke1) this.f43689b), tLObject, (Object) ((String) this.f43690c), (Object) ((org.telegram.ui.ActionBar.d2) this.d), 9));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f43689b;
                byte[] bArr = (byte[]) this.f43690c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new dy0(twoStepVerificationActivity, bArr, tLObject, bArr2, 10));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new h21(27, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
