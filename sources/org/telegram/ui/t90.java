package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t90 implements RequestDelegate {
    public final int f43703a;
    public final LaunchActivity f43704b;

    public t90(LaunchActivity launchActivity, int i10) {
        this.f43703a = i10;
        this.f43704b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f43703a;
        LaunchActivity launchActivity = this.f43704b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new sz(22, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new sz(18, launchActivity, tLObject));
                return;
        }
    }
}
