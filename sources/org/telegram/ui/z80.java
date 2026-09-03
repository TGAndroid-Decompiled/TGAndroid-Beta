package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class z80 implements DialogInterface.OnDismissListener {
    public final int f43852a;
    public final LaunchActivity f43853b;

    public z80(LaunchActivity launchActivity, int i10) {
        this.f43852a = i10;
        this.f43853b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f43852a;
        LaunchActivity launchActivity = this.f43853b;
        switch (i10) {
            case 0:
                launchActivity.f34171s1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new y80(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new y80(launchActivity, 10), 30000L);
                return;
        }
    }
}
