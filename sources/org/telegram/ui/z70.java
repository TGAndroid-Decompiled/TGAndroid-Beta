package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class z70 implements RequestDelegate {
    public final int f54543a;
    public final LaunchActivity f54544b;

    public z70(LaunchActivity launchActivity, int i7) {
        this.f54543a = i7;
        this.f54544b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f54543a;
        LaunchActivity launchActivity = this.f54544b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new i50(10, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new i50(6, launchActivity, tLObject));
                return;
        }
    }
}
