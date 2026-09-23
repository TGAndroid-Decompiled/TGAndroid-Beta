package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class z80 implements RequestDelegate {
    public final int f40071a;
    public final LaunchActivity f40072b;
    public final int f40073c;
    public final ia0 d;
    public final Object e;
    public final Object f40074f;
    public final Object f40075g;
    public final Object h;
    public final Object f40076i;

    public z80(LaunchActivity launchActivity, ia0 ia0Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f40071a = 0;
        this.f40072b = launchActivity;
        this.d = ia0Var;
        this.f40073c = i10;
        this.f40076i = authorizationform;
        this.e = getauthorizationform;
        this.f40074f = str;
        this.f40075g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40071a;
        Object obj = this.h;
        Object obj2 = this.f40075g;
        Object obj3 = this.f40074f;
        Object obj4 = this.e;
        Object obj5 = this.f40076i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f40072b, this.d, tLObject, this.f40073c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f40072b;
                ia0 ia0Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f40073c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new z80(launchActivity, ia0Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new tq(launchActivity, ia0Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f40072b, tLObject, (int[]) obj5, this.f40073c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 3));
                return;
        }
    }

    public z80(LaunchActivity launchActivity, int[] iArr, int i10, ia0 ia0Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f40071a = i11;
        this.f40072b = launchActivity;
        this.f40076i = iArr;
        this.f40073c = i10;
        this.d = ia0Var;
        this.e = obj;
        this.f40074f = obj2;
        this.f40075g = obj3;
        this.h = obj4;
    }
}
