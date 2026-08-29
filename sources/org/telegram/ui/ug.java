package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class ug implements DialogInterface.OnCancelListener {
    public final int f43256a;
    public final boolean[] f43257b;

    public ug(int i10, boolean[] zArr) {
        this.f43256a = i10;
        this.f43257b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43256a;
        boolean[] zArr = this.f43257b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.f35560x1;
                zArr[0] = true;
                return;
        }
    }
}
