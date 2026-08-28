package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
public final class z70 implements Runnable {
    public final int f45057a;
    public final LaunchActivity f45058b;
    public final int f45059c;

    public z70(LaunchActivity launchActivity, int i9, int i10) {
        this.f45057a = i10;
        this.f45058b = launchActivity;
        this.f45059c = i9;
    }

    @Override
    public final void run() {
        File directory;
        int i9 = this.f45057a;
        int i10 = this.f45059c;
        LaunchActivity launchActivity = this.f45058b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                if (UserConfig.getInstance(launchActivity.K).isClientActivated()) {
                    try {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.f35531s1 - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                            StatFs statFs = new StatFs(directory.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.f35531s1 = System.currentTimeMillis();
                                }
                                globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                AndroidUtilities.runOnUIThread(new l80(launchActivity, 6));
                            } else {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.f35493x1;
                ConnectionsManager.getInstance(launchActivity.K).cancelRequest(i10, true);
                return;
        }
    }
}
