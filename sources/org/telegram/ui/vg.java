package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class vg implements DialogInterface.OnCancelListener {
    public final int f42245a;
    public final boolean[] f42246b;

    public vg(int i10, boolean[] zArr) {
        this.f42245a = i10;
        this.f42246b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42245a;
        boolean[] zArr = this.f42246b;
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
