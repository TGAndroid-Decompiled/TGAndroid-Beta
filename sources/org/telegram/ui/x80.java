package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class x80 implements Runnable {
    public final int f45626a;
    public final kz f45627b;

    public x80(kz kzVar, int i10) {
        this.f45626a = i10;
        this.f45627b = kzVar;
    }

    @Override
    public final void run() {
        int i10 = this.f45626a;
        kz kzVar = this.f45627b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    kzVar.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    kzVar.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
