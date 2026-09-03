package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w80 implements RequestDelegate {
    public final int f39303a;
    public final LaunchActivity f39304b;
    public final int f39305c;
    public final w10 d;
    public final Object e;
    public final Object f39306f;
    public final Object f39307g;
    public final Object h;
    public final Object f39308i;

    public w80(LaunchActivity launchActivity, w10 w10Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f39303a = 0;
        this.f39304b = launchActivity;
        this.d = w10Var;
        this.f39305c = i10;
        this.f39308i = authorizationform;
        this.e = getauthorizationform;
        this.f39306f = str;
        this.f39307g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f39303a;
        Object obj = this.h;
        Object obj2 = this.f39307g;
        Object obj3 = this.f39306f;
        Object obj4 = this.e;
        Object obj5 = this.f39308i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new lh.s6(this.f39304b, this.d, tLObject, this.f39305c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.f31586y1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f39304b;
                w10 w10Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f39305c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new w80(launchActivity, w10Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new tq(launchActivity, w10Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new lh.s6(this.f39304b, tLObject, (int[]) obj5, this.f39305c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 4));
                return;
        }
    }

    public w80(LaunchActivity launchActivity, int[] iArr, int i10, w10 w10Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f39303a = i11;
        this.f39304b = launchActivity;
        this.f39308i = iArr;
        this.f39305c = i10;
        this.d = w10Var;
        this.e = obj;
        this.f39306f = obj2;
        this.f39307g = obj3;
        this.h = obj4;
    }
}
