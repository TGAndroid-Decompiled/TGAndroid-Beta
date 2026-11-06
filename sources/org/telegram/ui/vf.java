package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class vf implements DialogInterface.OnCancelListener {
    public final int f50716a;
    public final Object f50717b;

    public vf(Object obj, int i7) {
        this.f50716a = i7;
        this.f50717b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50716a) {
            case 0:
                an anVar = (an) this.f50717b;
                anVar.f43918p9 = true;
                anVar.f43893n9 = 0;
                anVar.Qb = 0;
                anVar.Z4 = 0;
                anVar.M9();
                anVar.qc(false);
                return;
            case 1:
                pn pnVar = (pn) this.f50717b;
                pnVar.M0 = false;
                pnVar.f48859b = null;
                pnVar.N0 = false;
                return;
            case 2:
                ((so) this.f50717b).f49802n = null;
                return;
            case 3:
                ((p90) this.f50717b).b();
                return;
            default:
                ((CancellationTokenSource) this.f50717b).cancel();
                return;
        }
    }
}
