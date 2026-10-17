package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t80 implements RequestDelegate {
    public final int f41618a;
    public final LaunchActivity f41619b;
    public final int f41620c;
    public final b80 d;
    public final Object e;
    public final Object f41621f;
    public final Object f41622g;
    public final Object h;
    public final Object f41623i;

    public t80(LaunchActivity launchActivity, b80 b80Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f41618a = 0;
        this.f41619b = launchActivity;
        this.d = b80Var;
        this.f41620c = i10;
        this.f41623i = authorizationform;
        this.e = getauthorizationform;
        this.f41621f = str;
        this.f41622g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f41618a;
        Object obj = this.h;
        Object obj2 = this.f41622g;
        Object obj3 = this.f41621f;
        Object obj4 = this.e;
        Object obj5 = this.f41623i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new ai.c9(this.f41619b, this.d, tLObject, this.f41620c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f41619b;
                b80 b80Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f41620c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new t80(launchActivity, b80Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new lq(launchActivity, b80Var, tL_error, 15));
                return;
            default:
                Pattern pattern3 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new ai.c9(this.f41619b, tLObject, (int[]) obj5, this.f41620c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public t80(LaunchActivity launchActivity, int[] iArr, int i10, b80 b80Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f41618a = i11;
        this.f41619b = launchActivity;
        this.f41623i = iArr;
        this.f41620c = i10;
        this.d = b80Var;
        this.e = obj;
        this.f41621f = obj2;
        this.f41622g = obj3;
        this.h = obj4;
    }
}
