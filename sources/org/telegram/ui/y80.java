package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y80 implements RequestDelegate {
    public final int f45882a;
    public final LaunchActivity f45883b;
    public final int f45884c;
    public final kz d;
    public final Object e;
    public final Object f45885f;
    public final Object f45886g;
    public final Object h;
    public final Object f45887i;

    public y80(LaunchActivity launchActivity, kz kzVar, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f45882a = 0;
        this.f45883b = launchActivity;
        this.d = kzVar;
        this.f45884c = i10;
        this.f45887i = authorizationform;
        this.e = getauthorizationform;
        this.f45885f = str;
        this.f45886g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f45882a;
        Object obj = this.h;
        Object obj2 = this.f45886g;
        Object obj3 = this.f45885f;
        Object obj4 = this.e;
        Object obj5 = this.f45887i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new bi.y8(this.f45883b, this.d, tLObject, this.f45884c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.D1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f45883b;
                kz kzVar = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f45884c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new y80(launchActivity, kzVar, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new pq(launchActivity, kzVar, tL_error, 15));
                return;
            default:
                Pattern pattern3 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new bi.y8(this.f45883b, tLObject, (int[]) obj5, this.f45884c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public y80(LaunchActivity launchActivity, int[] iArr, int i10, kz kzVar, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f45882a = i11;
        this.f45883b = launchActivity;
        this.f45887i = iArr;
        this.f45884c = i10;
        this.d = kzVar;
        this.e = obj;
        this.f45885f = obj2;
        this.f45886g = obj3;
        this.h = obj4;
    }
}
