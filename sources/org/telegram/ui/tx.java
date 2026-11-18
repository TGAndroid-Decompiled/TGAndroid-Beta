package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class tx implements DialogInterface.OnCancelListener {
    public final int f52366a;
    public final int f52367b;
    public final int[] f52368c;

    public tx(int i7, int i10, int[] iArr) {
        this.f52366a = i10;
        this.f52367b = i7;
        this.f52368c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f52366a;
        int[] iArr = this.f52368c;
        int i10 = this.f52367b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f43038y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
