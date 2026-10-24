package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class vg implements DialogInterface.OnCancelListener {
    public final int f42735a;
    public final boolean[] f42736b;

    public vg(int i10, boolean[] zArr) {
        this.f42735a = i10;
        this.f42736b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42735a;
        boolean[] zArr = this.f42736b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                zArr[0] = true;
                return;
        }
    }
}
