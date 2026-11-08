package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class z70 implements RequestDelegate {
    public final int f52476a;
    public final LaunchActivity f52477b;

    public z70(LaunchActivity launchActivity, int i7) {
        this.f52476a = i7;
        this.f52477b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f52476a;
        LaunchActivity launchActivity = this.f52477b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new q10(13, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new q10(9, launchActivity, tLObject));
                return;
        }
    }
}
