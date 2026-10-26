package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
public final class v80 implements Runnable {
    public final int f44739a;
    public final sz f44740b;

    public v80(sz szVar, int i10) {
        this.f44739a = i10;
        this.f44740b = szVar;
    }

    @Override
    public final void run() {
        int i10 = this.f44739a;
        sz szVar = this.f44740b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    szVar.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    szVar.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    szVar.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
