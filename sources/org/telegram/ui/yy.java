package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class yy implements DialogInterface.OnCancelListener {
    public final int f44007a;
    public final int f44008b;
    public final int[] f44009c;

    public yy(int i10, int i11, int[] iArr) {
        this.f44007a = i11;
        this.f44008b = i10;
        this.f44009c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f44007a;
        int[] iArr = this.f44009c;
        int i11 = this.f44008b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33432x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.E1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
