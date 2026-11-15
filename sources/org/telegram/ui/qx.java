package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class qx implements DialogInterface.OnCancelListener {
    public final int f50800a;
    public final int f50801b;
    public final int[] f50802c;

    public qx(int i7, int i10, int[] iArr) {
        this.f50800a = i10;
        this.f50801b = i7;
        this.f50802c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f50800a;
        int[] iArr = this.f50802c;
        int i10 = this.f50801b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f42593y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
