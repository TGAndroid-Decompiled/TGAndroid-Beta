package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
public final class r70 implements Runnable {
    public final int f50866a;
    public final LaunchActivity f50867b;
    public final int f50868c;

    public r70(LaunchActivity launchActivity, int i7, int i10) {
        this.f50866a = i10;
        this.f50867b = launchActivity;
        this.f50868c = i7;
    }

    @Override
    public final void run() {
        File z10;
        int i7 = this.f50866a;
        int i10 = this.f50868c;
        LaunchActivity launchActivity = this.f50867b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(launchActivity.P).cancelRequest(i10, true);
                return;
            default:
                String str2 = LaunchActivity.C1;
                if (org.telegram.messenger.m10.i(launchActivity.P).p()) {
                    try {
                        SharedPreferences e12 = org.telegram.messenger.np.e1();
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.f42666x1 - System.currentTimeMillis()) > 240000) || Math.abs(e12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z10 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z10.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.f42666x1 = System.currentTimeMillis();
                                }
                                e12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.h3(new q60(launchActivity, 2));
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
