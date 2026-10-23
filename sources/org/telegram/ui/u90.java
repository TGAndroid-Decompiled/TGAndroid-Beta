package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class u90 implements RequestDelegate {
    public final int f42308a;
    public final LaunchActivity f42309b;

    public u90(LaunchActivity launchActivity, int i10) {
        this.f42308a = i10;
        this.f42309b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f42308a;
        LaunchActivity launchActivity = this.f42309b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.E1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new f80(5, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new f80(1, launchActivity, tLObject));
                return;
        }
    }
}
