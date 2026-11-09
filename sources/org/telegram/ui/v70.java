package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
public final class v70 implements Runnable {
    public final int f50594a;
    public final LaunchActivity f50595b;
    public final int f50596c;

    public v70(LaunchActivity launchActivity, int i7, int i10) {
        this.f50594a = i10;
        this.f50595b = launchActivity;
        this.f50596c = i7;
    }

    @Override
    public final void run() {
        File z9;
        int i7 = this.f50594a;
        int i10 = this.f50596c;
        LaunchActivity launchActivity = this.f50595b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(launchActivity.O).cancelRequest(i10, true);
                return;
            default:
                String str2 = LaunchActivity.B1;
                if (org.telegram.messenger.p10.i(launchActivity.O).p()) {
                    try {
                        SharedPreferences e12 = org.telegram.messenger.qp.e1();
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.f41303w1 - System.currentTimeMillis()) > 240000) || Math.abs(e12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z9 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z9.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.f41303w1 = System.currentTimeMillis();
                                }
                                e12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.h3(new u60(launchActivity, 2));
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
