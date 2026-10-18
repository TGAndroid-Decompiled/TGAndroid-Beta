package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class xg implements DialogInterface.OnCancelListener {
    public final int f43116a;
    public final boolean[] f43117b;

    public xg(int i10, boolean[] zArr) {
        this.f43116a = i10;
        this.f43117b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43116a;
        boolean[] zArr = this.f43117b;
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
