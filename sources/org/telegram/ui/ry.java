package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class ry implements DialogInterface.OnCancelListener {
    public final int f41170a;
    public final int f41171b;
    public final int[] f41172c;

    public ry(int i10, int i11, int[] iArr) {
        this.f41170a = i11;
        this.f41171b = i10;
        this.f41172c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f41170a;
        int[] iArr = this.f41172c;
        int i11 = this.f41171b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33328y;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
