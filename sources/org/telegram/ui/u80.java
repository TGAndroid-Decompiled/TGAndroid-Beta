package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class u80 implements RequestDelegate {
    public final int f38876a;
    public final LaunchActivity f38877b;
    public final int f38878c;
    public final g00 d;
    public final Object e;
    public final Object f38879f;
    public final Object f38880g;
    public final Object h;
    public final Object f38881i;

    public u80(LaunchActivity launchActivity, g00 g00Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f38876a = 0;
        this.f38877b = launchActivity;
        this.d = g00Var;
        this.f38878c = i10;
        this.f38881i = authorizationform;
        this.e = getauthorizationform;
        this.f38879f = str;
        this.f38880g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f38876a;
        Object obj = this.h;
        Object obj2 = this.f38880g;
        Object obj3 = this.f38879f;
        Object obj4 = this.e;
        Object obj5 = this.f38881i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new lh.s6(this.f38877b, this.d, tLObject, this.f38878c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.f31612y1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f38877b;
                g00 g00Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f38878c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new u80(launchActivity, g00Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new rq(launchActivity, g00Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new lh.s6(this.f38877b, tLObject, (int[]) obj5, this.f38878c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 4));
                return;
        }
    }

    public u80(LaunchActivity launchActivity, int[] iArr, int i10, g00 g00Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f38876a = i11;
        this.f38877b = launchActivity;
        this.f38881i = iArr;
        this.f38878c = i10;
        this.d = g00Var;
        this.e = obj;
        this.f38879f = obj2;
        this.f38880g = obj3;
        this.h = obj4;
    }
}
