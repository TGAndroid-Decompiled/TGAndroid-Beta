package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class t80 implements Runnable {
    public final int f41770a;
    public final LaunchActivity f41771b;
    public final int f41772c;

    public t80(LaunchActivity launchActivity, int i10, int i11) {
        this.f41770a = i11;
        this.f41771b = launchActivity;
        this.f41772c = i10;
    }

    @Override
    public final void run() {
        File z10;
        int i10 = this.f41770a;
        int i11 = this.f41772c;
        LaunchActivity launchActivity = this.f41771b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(launchActivity.O).cancelRequest(i11, true);
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                if (org.telegram.messenger.d20.i(launchActivity.O).p()) {
                    try {
                        SharedPreferences d12 = org.telegram.messenger.vp.d1();
                        if ((((i11 == 2 || i11 == 1) && Math.abs(launchActivity.f33394y1 - System.currentTimeMillis()) > 240000) || Math.abs(d12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z10 = org.telegram.messenger.b8.z(4)) != null) {
                            StatFs statFs = new StatFs(z10.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i11 > 0 || availableBlocksLong < 52428800) {
                                if (i11 > 0) {
                                    launchActivity.f33394y1 = System.currentTimeMillis();
                                }
                                d12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.i0.g3(new q70(launchActivity, 2));
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
        }
    }
}
