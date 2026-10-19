package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class wy implements DialogInterface.OnCancelListener {
    public final int f42970a;
    public final int f42971b;
    public final int[] f42972c;

    public wy(int i10, int i11, int[] iArr) {
        this.f42970a = i11;
        this.f42971b = i10;
        this.f42972c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42970a;
        int[] iArr = this.f42972c;
        int i11 = this.f42971b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33124x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
