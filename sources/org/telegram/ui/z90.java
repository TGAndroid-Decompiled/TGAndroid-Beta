package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class z90 implements RequestDelegate {
    public final int f43857a;
    public final LaunchActivity f43858b;

    public z90(LaunchActivity launchActivity, int i10) {
        this.f43857a = i10;
        this.f43858b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f43857a;
        LaunchActivity launchActivity = this.f43858b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new z10(16, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new z10(12, launchActivity, tLObject));
                return;
        }
    }
}
