package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class tx implements DialogInterface.OnCancelListener {
    public final int f52404a;
    public final int f52405b;
    public final int[] f52406c;

    public tx(int i7, int i10, int[] iArr) {
        this.f52404a = i10;
        this.f52405b = i7;
        this.f52406c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f52404a;
        int[] iArr = this.f52406c;
        int i10 = this.f52405b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f43079y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
