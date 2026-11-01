package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y70 implements RequestDelegate {
    public final int f43597a;
    public final LaunchActivity f43598b;
    public final int f43599c;
    public final y60 d;
    public final Object e;
    public final Object f43600f;
    public final Object f43601g;
    public final Object h;
    public final Object f43602i;

    public y70(LaunchActivity launchActivity, y60 y60Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f43597a = 0;
        this.f43598b = launchActivity;
        this.d = y60Var;
        this.f43599c = i10;
        this.f43602i = authorizationform;
        this.e = getauthorizationform;
        this.f43600f = str;
        this.f43601g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f43597a;
        Object obj = this.h;
        Object obj2 = this.f43601g;
        Object obj3 = this.f43600f;
        Object obj4 = this.e;
        Object obj5 = this.f43602i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new s70(this.f43598b, this.d, tLObject, this.f43599c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f43598b;
                y60 y60Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f43599c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new y70(launchActivity, y60Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                org.telegram.messenger.i0.g3(new qq(launchActivity, y60Var, tL_error, 15));
                return;
            default:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new s70(this.f43598b, tLObject, (int[]) obj5, this.f43599c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj));
                return;
        }
    }

    public y70(LaunchActivity launchActivity, int[] iArr, int i10, y60 y60Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f43597a = i11;
        this.f43598b = launchActivity;
        this.f43602i = iArr;
        this.f43599c = i10;
        this.d = y60Var;
        this.e = obj;
        this.f43600f = obj2;
        this.f43601g = obj3;
        this.h = obj4;
    }
}
