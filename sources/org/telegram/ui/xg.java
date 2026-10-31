package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class xg implements DialogInterface.OnCancelListener {
    public final int f43576a;
    public final boolean[] f43577b;

    public xg(int i10, boolean[] zArr) {
        this.f43576a = i10;
        this.f43577b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43576a;
        boolean[] zArr = this.f43577b;
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
