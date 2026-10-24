package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class yy implements DialogInterface.OnCancelListener {
    public final int f43973a;
    public final int f43974b;
    public final int[] f43975c;

    public yy(int i10, int i11, int[] iArr) {
        this.f43973a = i11;
        this.f43974b = i10;
        this.f43975c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43973a;
        int[] iArr = this.f43975c;
        int i11 = this.f43974b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33434x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
