package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
public final class t70 implements Runnable {
    public final int f49962a;
    public final LaunchActivity f49963b;
    public final int f49964c;

    public t70(LaunchActivity launchActivity, int i7, int i10) {
        this.f49962a = i10;
        this.f49963b = launchActivity;
        this.f49964c = i7;
    }

    @Override
    public final void run() {
        File z9;
        int i7 = this.f49962a;
        int i10 = this.f49964c;
        LaunchActivity launchActivity = this.f49963b;
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
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.f41296w1 - System.currentTimeMillis()) > 240000) || Math.abs(e12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z9 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z9.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.f41296w1 = System.currentTimeMillis();
                                }
                                e12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.h3(new s60(launchActivity, 2));
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
