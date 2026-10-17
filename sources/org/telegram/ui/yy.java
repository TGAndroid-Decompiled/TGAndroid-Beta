package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class yy implements DialogInterface.OnCancelListener {
    public final int f43501a;
    public final int f43502b;
    public final int[] f43503c;

    public yy(int i10, int i11, int[] iArr) {
        this.f43501a = i11;
        this.f43502b = i10;
        this.f43503c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43501a;
        int[] iArr = this.f43503c;
        int i11 = this.f43502b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33118x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
