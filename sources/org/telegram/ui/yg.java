package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class yg implements DialogInterface.OnCancelListener {
    public final int f46064a;
    public final boolean[] f46065b;

    public yg(int i10, boolean[] zArr) {
        this.f46064a = i10;
        this.f46065b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f46064a;
        boolean[] zArr = this.f46065b;
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
