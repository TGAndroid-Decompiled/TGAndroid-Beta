package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class y80 implements DialogInterface.OnDismissListener {
    public final int f40447a;
    public final LaunchActivity f40448b;

    public y80(LaunchActivity launchActivity, int i10) {
        this.f40447a = i10;
        this.f40448b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f40447a;
        LaunchActivity launchActivity = this.f40448b;
        switch (i10) {
            case 0:
                launchActivity.f31649s1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new x80(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new x80(launchActivity, 10), 30000L);
                return;
        }
    }
}
