package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class qx implements DialogInterface.OnCancelListener {
    public final int f50801a;
    public final int f50802b;
    public final int[] f50803c;

    public qx(int i7, int i10, int[] iArr) {
        this.f50801a = i10;
        this.f50802b = i7;
        this.f50803c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f50801a;
        int[] iArr = this.f50803c;
        int i10 = this.f50802b;
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
