package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class vf implements DialogInterface.OnCancelListener {
    public final int f50659a;
    public final Object f50660b;

    public vf(Object obj, int i7) {
        this.f50659a = i7;
        this.f50660b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50659a) {
            case 0:
                an anVar = (an) this.f50660b;
                anVar.f43923p9 = true;
                anVar.f43898n9 = 0;
                anVar.Qb = 0;
                anVar.Z4 = 0;
                anVar.M9();
                anVar.qc(false);
                return;
            case 1:
                pn pnVar = (pn) this.f50660b;
                pnVar.M0 = false;
                pnVar.f48861b = null;
                pnVar.N0 = false;
                return;
            case 2:
                ((so) this.f50660b).f49792n = null;
                return;
            case 3:
                ((p90) this.f50660b).b();
                return;
            default:
                ((CancellationTokenSource) this.f50660b).cancel();
                return;
        }
    }
}
