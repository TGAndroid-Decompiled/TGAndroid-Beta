package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class qz implements DialogInterface.OnCancelListener {
    public final int f37056a;
    public final int f37057b;
    public final int[] f37058c;

    public qz(int i10, int i11, int[] iArr) {
        this.f37056a = i11;
        this.f37057b = i10;
        this.f37058c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37056a;
        int[] iArr = this.f37058c;
        int i11 = this.f37057b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f30806x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
