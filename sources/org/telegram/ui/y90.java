package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y90 implements RequestDelegate {
    public final int f40452a;
    public final LaunchActivity f40453b;

    public y90(LaunchActivity launchActivity, int i10) {
        this.f40452a = i10;
        this.f40453b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40452a;
        LaunchActivity launchActivity = this.f40453b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new g00(18, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new g00(14, launchActivity, tLObject));
                return;
        }
    }
}
