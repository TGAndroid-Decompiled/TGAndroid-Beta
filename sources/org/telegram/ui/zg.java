package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class zg implements DialogInterface.OnCancelListener {
    public final int f40795a;
    public final boolean[] f40796b;

    public zg(int i10, boolean[] zArr) {
        this.f40795a = i10;
        this.f40796b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f40795a;
        boolean[] zArr = this.f40796b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.f31612y1;
                zArr[0] = true;
                return;
        }
    }
}
