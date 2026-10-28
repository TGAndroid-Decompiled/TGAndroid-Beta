package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class yy implements DialogInterface.OnCancelListener {
    public final int f46100a;
    public final int f46101b;
    public final int[] f46102c;

    public yy(int i10, int i11, int[] iArr) {
        this.f46100a = i11;
        this.f46101b = i10;
        this.f46102c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f46100a;
        int[] iArr = this.f46102c;
        int i11 = this.f46101b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f35522x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
