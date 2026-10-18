package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class yy implements DialogInterface.OnCancelListener {
    public final int f43491a;
    public final int f43492b;
    public final int[] f43493c;

    public yy(int i10, int i11, int[] iArr) {
        this.f43491a = i11;
        this.f43492b = i10;
        this.f43493c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43491a;
        int[] iArr = this.f43493c;
        int i11 = this.f43492b;
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
