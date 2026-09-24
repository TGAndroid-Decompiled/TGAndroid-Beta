package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y80 implements RequestDelegate {
    public final int f40066a;
    public final LaunchActivity f40067b;
    public final int f40068c;
    public final m80 d;
    public final Object e;
    public final Object f40069f;
    public final Object f40070g;
    public final Object h;
    public final Object f40071i;

    public y80(LaunchActivity launchActivity, m80 m80Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f40066a = 0;
        this.f40067b = launchActivity;
        this.d = m80Var;
        this.f40068c = i10;
        this.f40071i = authorizationform;
        this.e = getauthorizationform;
        this.f40069f = str;
        this.f40070g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40066a;
        Object obj = this.h;
        Object obj2 = this.f40070g;
        Object obj3 = this.f40069f;
        Object obj4 = this.e;
        Object obj5 = this.f40071i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f40067b, this.d, tLObject, this.f40068c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f40067b;
                m80 m80Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f40068c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new y80(launchActivity, m80Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new sq(launchActivity, m80Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f40067b, tLObject, (int[]) obj5, this.f40068c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 3));
                return;
        }
    }

    public y80(LaunchActivity launchActivity, int[] iArr, int i10, m80 m80Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f40066a = i11;
        this.f40067b = launchActivity;
        this.f40071i = iArr;
        this.f40068c = i10;
        this.d = m80Var;
        this.e = obj;
        this.f40069f = obj2;
        this.f40070g = obj3;
        this.h = obj4;
    }
}
