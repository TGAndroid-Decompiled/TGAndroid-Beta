package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class sx implements DialogInterface.OnCancelListener {
    public final int f52167a;
    public final int f52168b;
    public final int[] f52169c;

    public sx(int i7, int i10, int[] iArr) {
        this.f52167a = i10;
        this.f52168b = i7;
        this.f52169c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f52167a;
        int[] iArr = this.f52169c;
        int i10 = this.f52168b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f43158y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
