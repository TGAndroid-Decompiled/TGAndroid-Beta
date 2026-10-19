package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class wy implements DialogInterface.OnCancelListener {
    public final int f42969a;
    public final int f42970b;
    public final int[] f42971c;

    public wy(int i10, int i11, int[] iArr) {
        this.f42969a = i11;
        this.f42970b = i10;
        this.f42971c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f42969a;
        int[] iArr = this.f42971c;
        int i11 = this.f42970b;
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
