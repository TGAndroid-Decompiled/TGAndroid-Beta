package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t70 implements RequestDelegate {
    public final int f49723a;
    public final LaunchActivity f49724b;

    public t70(LaunchActivity launchActivity, int i3) {
        this.f49723a = i3;
        this.f49724b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f49723a;
        LaunchActivity launchActivity = this.f49724b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new ly(18, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new ly(14, launchActivity, tLObject));
                return;
        }
    }
}
