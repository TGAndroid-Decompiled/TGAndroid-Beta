package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class sy implements DialogInterface.OnCancelListener {
    public final int f41665a;
    public final int f41666b;
    public final int[] f41667c;

    public sy(int i10, int i11, int[] iArr) {
        this.f41665a = i11;
        this.f41666b = i10;
        this.f41667c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f41665a;
        int[] iArr = this.f41667c;
        int i11 = this.f41666b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33321y;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
