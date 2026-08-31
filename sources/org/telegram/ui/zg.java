package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class zg implements DialogInterface.OnCancelListener {
    public final int f43931a;
    public final boolean[] f43932b;

    public zg(int i10, boolean[] zArr) {
        this.f43931a = i10;
        this.f43932b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43931a;
        boolean[] zArr = this.f43932b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                zArr[0] = true;
                return;
        }
    }
}
