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
public final class us0 implements RequestDelegate {
    public final int f40792a;
    public final Object f40793b;
    public final Object f40794c;
    public final Object d;

    public us0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40792a = i10;
        this.f40793b = obj;
        this.f40794c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40792a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ss0((zs0) this.f40793b, tLObject, (UserConfig) this.f40794c, (TLRPC.Photo) this.d, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ey0) this.f40793b), tLObject, (Object) ((TLRPC.UserFull) this.f40794c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 17));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ss0((Object) ((PrivacySettingsActivity) this.f40793b), (Object) ((org.telegram.ui.ActionBar.a2) this.f40794c), tLObject, (Object) ((TL_account.setAccountTTL) this.d), 3));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ProfileActivity) this.f40793b), tLObject, (Object) ((TLRPC.UserFull) this.f40794c), (Object) ((TL_account.TL_birthday) this.d), tL_error, 21));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ProfileActivity) this.f40793b), tLObject, (Object) ((TLRPC.TL_username) this.f40794c), (Object) ((f01) this.d), tL_error, 19));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new l90((Object) ((ProfileActivity) this.f40793b), tLObject, (Object) ((String) this.f40794c), (Object) ((TLRPC.User) this.d), tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ss0((n01) this.f40793b, tLObject, (UserConfig) this.f40794c, (TLRPC.Photo) this.d, 9));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new l90((Object) ((b81) this.f40793b), tL_error, tLObject, (Object) ((TwoStepVerificationActivity) this.f40794c), (Object) ((TLRPC.User) this.d), 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ss0((Object) ((SessionsActivity) this.f40793b), (Object) ((org.telegram.ui.ActionBar.a2) this.f40794c), (Object) tL_error, (Object) ((TLRPC.TL_authorization) this.d), 12));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ss0((Object) ((SessionsActivity) this.f40793b), (Object) ((org.telegram.ui.ActionBar.a2) this.f40794c), (Object) tL_error, (Object) ((TLRPC.TL_webAuthorization) this.d), 11));
                return;
            case 10:
                sa1 sa1Var = (sa1) this.f40793b;
                String str = (String) this.f40794c;
                gb1 gb1Var = (gb1) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ta1 ta1Var = sa1Var.f39723r;
                        int i10 = ta1Var.f40339i;
                        if (ta1Var != sa1Var.f40049w.f36714w) {
                            z10 = false;
                        }
                        bVar = hb1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(sa1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ss0(sa1Var, bVar, str, gb1Var, 15));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ss0((df1) this.f40793b, tLObject, (String) this.f40794c, (org.telegram.ui.ActionBar.a2) this.d, 17));
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40793b;
                byte[] bArr = (byte[]) this.f40794c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error == null) {
                    Utilities.globalQueue.postRunnable(new ss0((Object) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 18));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new je1(6, twoStepVerificationActivity, tL_error));
                    return;
                }
        }
    }
}
