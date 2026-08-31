package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class v80 implements RequestDelegate {
    public final int f42157a;
    public final LaunchActivity f42158b;
    public final int f42159c;
    public final v10 d;
    public final Object f42160e;
    public final Object f42161f;
    public final Object f42162g;
    public final Object h;
    public final Object f42163i;

    public v80(LaunchActivity launchActivity, v10 v10Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f42157a = 0;
        this.f42158b = launchActivity;
        this.d = v10Var;
        this.f42159c = i10;
        this.f42163i = authorizationform;
        this.f42160e = getauthorizationform;
        this.f42161f = str;
        this.f42162g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f42157a;
        Object obj = this.h;
        Object obj2 = this.f42162g;
        Object obj3 = this.f42161f;
        Object obj4 = this.f42160e;
        Object obj5 = this.f42163i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new mh.s6(this.f42158b, this.d, tLObject, this.f42159c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.f34134y1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f42158b;
                v10 v10Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f42159c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new v80(launchActivity, v10Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new sq(launchActivity, v10Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new mh.s6(this.f42158b, tLObject, (int[]) obj5, this.f42159c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 4));
                return;
        }
    }

    public v80(LaunchActivity launchActivity, int[] iArr, int i10, v10 v10Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f42157a = i11;
        this.f42158b = launchActivity;
        this.f42163i = iArr;
        this.f42159c = i10;
        this.d = v10Var;
        this.f42160e = obj;
        this.f42161f = obj2;
        this.f42162g = obj3;
        this.h = obj4;
    }
}
