package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class sz implements DialogInterface.OnCancelListener {
    public final int f40250a;
    public final int f40251b;
    public final int[] f40252c;

    public sz(int i10, int i11, int[] iArr) {
        this.f40250a = i11;
        this.f40251b = i10;
        this.f40252c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f40250a;
        int[] iArr = this.f40252c;
        int i11 = this.f40251b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f32078x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
