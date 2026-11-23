package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class tx implements DialogInterface.OnCancelListener {
    public final int f52372a;
    public final int f52373b;
    public final int[] f52374c;

    public tx(int i7, int i10, int[] iArr) {
        this.f52372a = i10;
        this.f52373b = i7;
        this.f52374c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f52372a;
        int[] iArr = this.f52374c;
        int i10 = this.f52373b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f43048y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
