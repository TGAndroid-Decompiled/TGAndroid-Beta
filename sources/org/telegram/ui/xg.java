package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class xg implements DialogInterface.OnCancelListener {
    public final int f45679a;
    public final boolean[] f45680b;

    public xg(int i10, boolean[] zArr) {
        this.f45679a = i10;
        this.f45680b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f45679a;
        boolean[] zArr = this.f45680b;
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
