package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class u60 implements RequestDelegate {
    public final int f49987a;
    public final LaunchActivity f49988b;
    public final int f49989c;
    public final ly d;
    public final Object f49990e;
    public final Object f49991f;
    public final Object f49992g;
    public final Object h;
    public final Object f49993i;

    public u60(LaunchActivity launchActivity, ly lyVar, int i3, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f49987a = 0;
        this.f49988b = launchActivity;
        this.d = lyVar;
        this.f49989c = i3;
        this.f49993i = authorizationform;
        this.f49990e = getauthorizationform;
        this.f49991f = str;
        this.f49992g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f49987a;
        Object obj = this.h;
        Object obj2 = this.f49992g;
        Object obj3 = this.f49991f;
        Object obj4 = this.f49990e;
        Object obj5 = this.f49993i;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new ci.p8(this.f49988b, this.d, tLObject, this.f49989c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.E1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f49988b;
                ly lyVar = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f49989c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new u60(launchActivity, lyVar, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.h3(new pp(launchActivity, lyVar, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new ci.p8(this.f49988b, tLObject, (int[]) obj5, this.f49989c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 1));
                return;
        }
    }

    public u60(LaunchActivity launchActivity, int[] iArr, int i3, ly lyVar, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f49987a = i10;
        this.f49988b = launchActivity;
        this.f49993i = iArr;
        this.f49989c = i3;
        this.d = lyVar;
        this.f49990e = obj;
        this.f49991f = obj2;
        this.f49992g = obj3;
        this.h = obj4;
    }
}
