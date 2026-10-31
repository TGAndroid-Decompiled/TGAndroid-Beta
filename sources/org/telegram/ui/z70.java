package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class z70 implements RequestDelegate {
    public final int f44039a;
    public final LaunchActivity f44040b;
    public final int f44041c;
    public final f70 d;
    public final Object e;
    public final Object f44042f;
    public final Object f44043g;
    public final Object h;
    public final Object f44044i;

    public z70(LaunchActivity launchActivity, f70 f70Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f44039a = 0;
        this.f44040b = launchActivity;
        this.d = f70Var;
        this.f44041c = i10;
        this.f44044i = authorizationform;
        this.e = getauthorizationform;
        this.f44042f = str;
        this.f44043g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f44039a;
        Object obj = this.h;
        Object obj2 = this.f44043g;
        Object obj3 = this.f44042f;
        Object obj4 = this.e;
        Object obj5 = this.f44044i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new t70(this.f44040b, this.d, tLObject, this.f44041c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f44040b;
                f70 f70Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f44041c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new z70(launchActivity, f70Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                org.telegram.messenger.i0.g3(new qq(launchActivity, f70Var, tL_error, 15));
                return;
            default:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new t70(this.f44040b, tLObject, (int[]) obj5, this.f44041c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj));
                return;
        }
    }

    public z70(LaunchActivity launchActivity, int[] iArr, int i10, f70 f70Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f44039a = i11;
        this.f44040b = launchActivity;
        this.f44044i = iArr;
        this.f44041c = i10;
        this.d = f70Var;
        this.e = obj;
        this.f44042f = obj2;
        this.f44043g = obj3;
        this.h = obj4;
    }
}
