package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class vf implements DialogInterface.OnCancelListener {
    public final int f50706a;
    public final Object f50707b;

    public vf(Object obj, int i7) {
        this.f50706a = i7;
        this.f50707b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50706a) {
            case 0:
                an anVar = (an) this.f50707b;
                anVar.f43893p9 = true;
                anVar.f43868n9 = 0;
                anVar.Qb = 0;
                anVar.Z4 = 0;
                anVar.M9();
                anVar.qc(false);
                return;
            case 1:
                pn pnVar = (pn) this.f50707b;
                pnVar.M0 = false;
                pnVar.f48864b = null;
                pnVar.N0 = false;
                return;
            case 2:
                ((so) this.f50707b).f49781n = null;
                return;
            case 3:
                ((p90) this.f50707b).b();
                return;
            default:
                ((CancellationTokenSource) this.f50707b).cancel();
                return;
        }
    }
}
