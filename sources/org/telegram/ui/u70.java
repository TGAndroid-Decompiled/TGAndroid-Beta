package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
public final class u70 implements Runnable {
    public final int f52462a;
    public final LaunchActivity f52463b;
    public final int f52464c;

    public u70(LaunchActivity launchActivity, int i7, int i10) {
        this.f52462a = i10;
        this.f52463b = launchActivity;
        this.f52464c = i7;
    }

    @Override
    public final void run() {
        File z10;
        int i7 = this.f52462a;
        int i10 = this.f52464c;
        LaunchActivity launchActivity = this.f52463b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(launchActivity.P).cancelRequest(i10, true);
                return;
            default:
                String str2 = LaunchActivity.C1;
                if (org.telegram.messenger.k10.i(launchActivity.P).p()) {
                    try {
                        SharedPreferences g12 = org.telegram.messenger.np.g1();
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.f43121x1 - System.currentTimeMillis()) > 240000) || Math.abs(g12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z10 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z10.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.f43121x1 = System.currentTimeMillis();
                                }
                                g12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.g3(new t60(launchActivity, 2));
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
