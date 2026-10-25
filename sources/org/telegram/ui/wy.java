package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class wy implements DialogInterface.OnCancelListener {
    public final int f45583a;
    public final int f45584b;
    public final int[] f45585c;

    public wy(int i10, int i11, int[] iArr) {
        this.f45583a = i11;
        this.f45584b = i10;
        this.f45585c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f45583a;
        int[] iArr = this.f45585c;
        int i11 = this.f45584b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f35495x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
