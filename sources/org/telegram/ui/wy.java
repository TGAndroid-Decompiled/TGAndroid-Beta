package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class wy implements DialogInterface.OnCancelListener {
    public final int f42978a;
    public final int f42979b;
    public final int[] f42980c;

    public wy(int i10, int i11, int[] iArr) {
        this.f42978a = i11;
        this.f42979b = i10;
        this.f42980c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42978a;
        int[] iArr = this.f42980c;
        int i11 = this.f42979b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33134x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
