package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class v90 implements RequestDelegate {
    public final int f44214a;
    public final LaunchActivity f44215b;

    public v90(LaunchActivity launchActivity, int i10) {
        this.f44214a = i10;
        this.f44215b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f44214a;
        LaunchActivity launchActivity = this.f44215b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new kz(23, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new kz(19, launchActivity, tLObject));
                return;
        }
    }
}
