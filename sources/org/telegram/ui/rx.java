package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class rx implements DialogInterface.OnCancelListener {
    public final int f49619a;
    public final int f49620b;
    public final int[] f49621c;

    public rx(int i7, int i10, int[] iArr) {
        this.f49619a = i10;
        this.f49620b = i7;
        this.f49621c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f49619a;
        int[] iArr = this.f49621c;
        int i10 = this.f49620b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f41232y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
