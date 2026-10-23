package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class vg implements DialogInterface.OnCancelListener {
    public final int f42765a;
    public final boolean[] f42766b;

    public vg(int i10, boolean[] zArr) {
        this.f42765a = i10;
        this.f42766b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42765a;
        boolean[] zArr = this.f42766b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.E1;
                zArr[0] = true;
                return;
        }
    }
}
