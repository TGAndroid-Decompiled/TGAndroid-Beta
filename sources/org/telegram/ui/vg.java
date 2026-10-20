package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class vg implements DialogInterface.OnCancelListener {
    public final int f42250a;
    public final boolean[] f42251b;

    public vg(int i10, boolean[] zArr) {
        this.f42250a = i10;
        this.f42251b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42250a;
        boolean[] zArr = this.f42251b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                zArr[0] = true;
                return;
        }
    }
}
