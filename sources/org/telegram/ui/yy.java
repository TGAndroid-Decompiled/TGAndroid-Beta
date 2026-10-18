package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class yy implements DialogInterface.OnCancelListener {
    public final int f43527a;
    public final int f43528b;
    public final int[] f43529c;

    public yy(int i10, int i11, int[] iArr) {
        this.f43527a = i11;
        this.f43528b = i10;
        this.f43529c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f43527a;
        int[] iArr = this.f43529c;
        int i11 = this.f43528b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33125x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
