package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class qz implements DialogInterface.OnCancelListener {
    public final int f36156a;
    public final int f36157b;
    public final int[] f36158c;

    public qz(int i10, int i11, int[] iArr) {
        this.f36156a = i11;
        this.f36157b = i10;
        this.f36158c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36156a;
        int[] iArr = this.f36158c;
        int i11 = this.f36157b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f29902x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
