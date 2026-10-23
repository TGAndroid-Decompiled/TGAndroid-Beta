package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class r80 implements RequestDelegate {
    public final int f41092a;
    public final LaunchActivity f41093b;
    public final int f41094c;
    public final z70 d;
    public final Object e;
    public final Object f41095f;
    public final Object f41096g;
    public final Object h;
    public final Object f41097i;

    public r80(LaunchActivity launchActivity, z70 z70Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f41092a = 0;
        this.f41093b = launchActivity;
        this.d = z70Var;
        this.f41094c = i10;
        this.f41097i = authorizationform;
        this.e = getauthorizationform;
        this.f41095f = str;
        this.f41096g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f41092a;
        Object obj = this.h;
        Object obj2 = this.f41096g;
        Object obj3 = this.f41095f;
        Object obj4 = this.e;
        Object obj5 = this.f41097i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new ai.d9(this.f41093b, this.d, tLObject, this.f41094c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f41093b;
                z70 z70Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f41094c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new r80(launchActivity, z70Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new jq(launchActivity, z70Var, tL_error, 15));
                return;
            default:
                Pattern pattern3 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new ai.d9(this.f41093b, tLObject, (int[]) obj5, this.f41094c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public r80(LaunchActivity launchActivity, int[] iArr, int i10, z70 z70Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f41092a = i11;
        this.f41093b = launchActivity;
        this.f41097i = iArr;
        this.f41094c = i10;
        this.d = z70Var;
        this.e = obj;
        this.f41095f = obj2;
        this.f41096g = obj3;
        this.h = obj4;
    }
}
