package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class vg implements DialogInterface.OnCancelListener {
    public final int f43474a;
    public final boolean[] f43475b;

    public vg(int i9, boolean[] zArr) {
        this.f43474a = i9;
        this.f43475b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i9 = this.f43474a;
        boolean[] zArr = this.f43475b;
        switch (i9) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.f35493x1;
                zArr[0] = true;
                return;
        }
    }
}
