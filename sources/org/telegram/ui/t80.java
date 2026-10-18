package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t80 implements RequestDelegate {
    public final int f41609a;
    public final LaunchActivity f41610b;
    public final int f41611c;
    public final b80 d;
    public final Object e;
    public final Object f41612f;
    public final Object f41613g;
    public final Object h;
    public final Object f41614i;

    public t80(LaunchActivity launchActivity, b80 b80Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f41609a = 0;
        this.f41610b = launchActivity;
        this.d = b80Var;
        this.f41611c = i10;
        this.f41614i = authorizationform;
        this.e = getauthorizationform;
        this.f41612f = str;
        this.f41613g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f41609a;
        Object obj = this.h;
        Object obj2 = this.f41613g;
        Object obj3 = this.f41612f;
        Object obj4 = this.e;
        Object obj5 = this.f41614i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new ai.c9(this.f41610b, this.d, tLObject, this.f41611c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f41610b;
                b80 b80Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f41611c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new t80(launchActivity, b80Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new lq(launchActivity, b80Var, tL_error, 15));
                return;
            default:
                Pattern pattern3 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new ai.c9(this.f41610b, tLObject, (int[]) obj5, this.f41611c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public t80(LaunchActivity launchActivity, int[] iArr, int i10, b80 b80Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f41609a = i11;
        this.f41610b = launchActivity;
        this.f41614i = iArr;
        this.f41611c = i10;
        this.d = b80Var;
        this.e = obj;
        this.f41612f = obj2;
        this.f41613g = obj3;
        this.h = obj4;
    }
}
