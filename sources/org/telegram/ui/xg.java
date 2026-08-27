package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;

public final class xg implements DialogInterface.OnCancelListener {

    public final int f44442a;

    public final boolean[] f44443b;

    public xg(int i10, boolean[] zArr) {
        this.f44442a = i10;
        this.f44443b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f44442a;
        boolean[] zArr = this.f44443b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                zArr[0] = true;
                break;
        }
    }
}
