package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.SharedConfig;
public final class ty0 implements DialogInterface.OnClickListener {
    public final int f43938a;
    public final int f43939b;

    public ty0(int i10, int i11) {
        this.f43938a = i11;
        this.f43939b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43938a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 == this.f43939b) {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    return;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(i11);
                    return;
                }
            default:
                int i12 = 2 - i10;
                if (i12 == this.f43939b) {
                    SharedConfig.overrideDevicePerformanceClass(-1);
                    return;
                } else {
                    SharedConfig.overrideDevicePerformanceClass(i12);
                    return;
                }
        }
    }
}
