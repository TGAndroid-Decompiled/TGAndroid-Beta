package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class wy implements DialogInterface.OnCancelListener {
    public final int f45586a;
    public final int f45587b;
    public final int[] f45588c;

    public wy(int i10, int i11, int[] iArr) {
        this.f45586a = i11;
        this.f45587b = i10;
        this.f45588c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f45586a;
        int[] iArr = this.f45588c;
        int i11 = this.f45587b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f35498x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
