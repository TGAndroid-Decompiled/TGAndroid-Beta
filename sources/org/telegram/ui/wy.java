package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class wy implements DialogInterface.OnCancelListener {
    public final int f42975a;
    public final int f42976b;
    public final int[] f42977c;

    public wy(int i10, int i11, int[] iArr) {
        this.f42975a = i11;
        this.f42976b = i10;
        this.f42977c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42975a;
        int[] iArr = this.f42977c;
        int i11 = this.f42976b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33131x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
