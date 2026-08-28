package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class xy implements DialogInterface.OnCancelListener {
    public final int f44652a;
    public final int f44653b;
    public final int[] f44654c;

    public xy(int i9, int i10, int[] iArr) {
        this.f44652a = i10;
        this.f44653b = i9;
        this.f44654c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i9 = this.f44652a;
        int[] iArr = this.f44654c;
        int i10 = this.f44653b;
        switch (i9) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f35465x;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.f35493x1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
