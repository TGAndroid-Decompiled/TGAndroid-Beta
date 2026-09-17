package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class qz implements DialogInterface.OnCancelListener {
    public final int f37051a;
    public final int f37052b;
    public final int[] f37053c;

    public qz(int i10, int i11, int[] iArr) {
        this.f37051a = i11;
        this.f37052b = i10;
        this.f37053c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37051a;
        int[] iArr = this.f37053c;
        int i11 = this.f37052b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f30803x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
