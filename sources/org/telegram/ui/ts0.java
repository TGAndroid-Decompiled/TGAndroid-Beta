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
public final class ts0 implements RequestDelegate {
    public final int f40204a;
    public final Object f40205b;
    public final Object f40206c;
    public final Object d;

    public ts0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40204a = i10;
        this.f40205b = obj;
        this.f40206c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40204a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0((Object) ((ys0) this.f40205b), tLObject, (Object) ((UserConfig) this.f40206c), (TLObject) ((TLRPC.Photo) this.d), 29));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ey0) this.f40205b), tLObject, (Object) ((TLRPC.UserFull) this.f40206c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yw0((PrivacySettingsActivity) this.f40205b, (org.telegram.ui.ActionBar.a2) this.f40206c, tLObject, (TL_account.setAccountTTL) this.d, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ProfileActivity) this.f40205b), tLObject, (Object) ((TLRPC.UserFull) this.f40206c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ProfileActivity) this.f40205b), tLObject, (Object) ((TLRPC.TL_username) this.f40206c), (Object) ((e01) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ProfileActivity) this.f40205b), tLObject, (Object) ((String) this.f40206c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new yw0((m01) this.f40205b, tLObject, (UserConfig) this.f40206c, (TLRPC.Photo) this.d, false, 8));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new l90((Object) ((b81) this.f40205b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f40206c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new yw0((SessionsActivity) this.f40205b, (org.telegram.ui.ActionBar.a2) this.f40206c, tL_error, (TLRPC.TL_authorization) this.d, false, 11));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new yw0((SessionsActivity) this.f40205b, (org.telegram.ui.ActionBar.a2) this.f40206c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 10));
                return;
            case 10:
                sa1 sa1Var = (sa1) this.f40205b;
                String str = (String) this.f40206c;
                gb1 gb1Var = (gb1) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ta1 ta1Var = sa1Var.f39442r;
                        int i10 = ta1Var.f40054i;
                        if (ta1Var != sa1Var.f39749w.f36503w) {
                            z10 = false;
                        }
                        bVar = hb1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(sa1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new yw0(sa1Var, bVar, str, gb1Var, 14));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new yw0((cf1) this.f40205b, tLObject, (String) this.f40206c, (org.telegram.ui.ActionBar.a2) this.d, false, 16));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40205b;
                byte[] bArr = (byte[]) this.f40206c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new yw0(twoStepVerificationActivity, bArr, tLObject, bArr2, 17));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new wg1(1, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
