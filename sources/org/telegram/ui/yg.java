package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class yg implements DialogInterface.OnCancelListener {
    public final int f46061a;
    public final boolean[] f46062b;

    public yg(int i10, boolean[] zArr) {
        this.f46061a = i10;
        this.f46062b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f46061a;
        boolean[] zArr = this.f46062b;
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
