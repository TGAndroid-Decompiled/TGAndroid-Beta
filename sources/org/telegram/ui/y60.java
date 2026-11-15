package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y60 implements RequestDelegate {
    public final int f53457a;
    public final LaunchActivity f53458b;
    public final int f53459c;
    public final g50 d;
    public final Object f53460e;
    public final Object f53461f;
    public final Object f53462g;
    public final Object h;
    public final Object f53463i;

    public y60(LaunchActivity launchActivity, g50 g50Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f53457a = 0;
        this.f53458b = launchActivity;
        this.d = g50Var;
        this.f53459c = i7;
        this.f53463i = authorizationform;
        this.f53460e = getauthorizationform;
        this.f53461f = str;
        this.f53462g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f53457a;
        Object obj = this.h;
        Object obj2 = this.f53462g;
        Object obj3 = this.f53461f;
        Object obj4 = this.f53460e;
        Object obj5 = this.f53463i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new di.g8(this.f53458b, this.d, tLObject, this.f53459c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f53458b;
                g50 g50Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f53459c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new y60(launchActivity, g50Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.h3(new tp(launchActivity, g50Var, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new di.g8(this.f53458b, tLObject, (int[]) obj5, this.f53459c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public y60(LaunchActivity launchActivity, int[] iArr, int i7, g50 g50Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f53457a = i10;
        this.f53458b = launchActivity;
        this.f53463i = iArr;
        this.f53459c = i7;
        this.d = g50Var;
        this.f53460e = obj;
        this.f53461f = obj2;
        this.f53462g = obj3;
        this.h = obj4;
    }
}
