package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class z80 implements RequestDelegate {
    public final int f43847a;
    public final LaunchActivity f43848b;

    public z80(LaunchActivity launchActivity, int i10) {
        this.f43847a = i10;
        this.f43848b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f43847a;
        LaunchActivity launchActivity = this.f43848b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new y60(7, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new y60(3, launchActivity, tLObject));
                return;
        }
    }
}
