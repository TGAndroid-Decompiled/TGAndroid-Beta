package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class tx implements DialogInterface.OnCancelListener {
    public final int f52408a;
    public final int f52409b;
    public final int[] f52410c;

    public tx(int i7, int i10, int[] iArr) {
        this.f52408a = i10;
        this.f52409b = i7;
        this.f52410c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f52408a;
        int[] iArr = this.f52410c;
        int i10 = this.f52409b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f43083y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
