package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class zy implements DialogInterface.OnCancelListener {
    public final int f45351a;
    public final int f45352b;
    public final int[] f45353c;

    public zy(int i10, int i11, int[] iArr) {
        this.f45351a = i11;
        this.f45352b = i10;
        this.f45353c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f45351a;
        int[] iArr = this.f45353c;
        int i11 = this.f45352b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f35532x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.f35560x1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
