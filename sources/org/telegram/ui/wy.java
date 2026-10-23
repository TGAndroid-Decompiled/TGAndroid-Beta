package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class wy implements DialogInterface.OnCancelListener {
    public final int f42979a;
    public final int f42980b;
    public final int[] f42981c;

    public wy(int i10, int i11, int[] iArr) {
        this.f42979a = i11;
        this.f42980b = i10;
        this.f42981c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42979a;
        int[] iArr = this.f42981c;
        int i11 = this.f42980b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33135x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
