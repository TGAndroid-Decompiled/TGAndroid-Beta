package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class sz implements DialogInterface.OnCancelListener {
    public final int f39967a;
    public final int f39968b;
    public final int[] f39969c;

    public sz(int i10, int i11, int[] iArr) {
        this.f39967a = i11;
        this.f39968b = i10;
        this.f39969c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39967a;
        int[] iArr = this.f39969c;
        int i11 = this.f39968b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31780x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
