package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class sx implements DialogInterface.OnCancelListener {
    public final int f49976a;
    public final int f49977b;
    public final int[] f49978c;

    public sx(int i7, int i10, int[] iArr) {
        this.f49976a = i10;
        this.f49977b = i7;
        this.f49978c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f49976a;
        int[] iArr = this.f49978c;
        int i10 = this.f49977b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f41223y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
