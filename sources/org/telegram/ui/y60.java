package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y60 implements RequestDelegate {
    public final int f53453a;
    public final LaunchActivity f53454b;
    public final int f53455c;
    public final g50 d;
    public final Object f53456e;
    public final Object f53457f;
    public final Object f53458g;
    public final Object h;
    public final Object f53459i;

    public y60(LaunchActivity launchActivity, g50 g50Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f53453a = 0;
        this.f53454b = launchActivity;
        this.d = g50Var;
        this.f53455c = i7;
        this.f53459i = authorizationform;
        this.f53456e = getauthorizationform;
        this.f53457f = str;
        this.f53458g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f53453a;
        Object obj = this.h;
        Object obj2 = this.f53458g;
        Object obj3 = this.f53457f;
        Object obj4 = this.f53456e;
        Object obj5 = this.f53459i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new di.h8(this.f53454b, this.d, tLObject, this.f53455c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f53454b;
                g50 g50Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f53455c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new y60(launchActivity, g50Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.h3(new tp(launchActivity, g50Var, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new di.h8(this.f53454b, tLObject, (int[]) obj5, this.f53455c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public y60(LaunchActivity launchActivity, int[] iArr, int i7, g50 g50Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f53453a = i10;
        this.f53454b = launchActivity;
        this.f53459i = iArr;
        this.f53455c = i7;
        this.d = g50Var;
        this.f53456e = obj;
        this.f53457f = obj2;
        this.f53458g = obj3;
        this.h = obj4;
    }
}
