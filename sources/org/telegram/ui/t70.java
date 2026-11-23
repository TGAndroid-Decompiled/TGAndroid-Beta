package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
public final class t70 implements Runnable {
    public final int f52285a;
    public final LaunchActivity f52286b;
    public final int f52287c;

    public t70(LaunchActivity launchActivity, int i7, int i10) {
        this.f52285a = i10;
        this.f52286b = launchActivity;
        this.f52287c = i7;
    }

    @Override
    public final void run() {
        File z10;
        int i7 = this.f52285a;
        int i10 = this.f52287c;
        LaunchActivity launchActivity = this.f52286b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(launchActivity.P).cancelRequest(i10, true);
                return;
            default:
                String str2 = LaunchActivity.C1;
                if (org.telegram.messenger.i10.i(launchActivity.P).p()) {
                    try {
                        SharedPreferences g12 = org.telegram.messenger.mp.g1();
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.f43231x1 - System.currentTimeMillis()) > 240000) || Math.abs(g12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z10 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z10.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.f43231x1 = System.currentTimeMillis();
                                }
                                g12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.g3(new s60(launchActivity, 2));
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
