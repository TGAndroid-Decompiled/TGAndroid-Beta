package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class xg implements DialogInterface.OnCancelListener {
    public final int f43132a;
    public final boolean[] f43133b;

    public xg(int i10, boolean[] zArr) {
        this.f43132a = i10;
        this.f43133b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43132a;
        boolean[] zArr = this.f43133b;
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
