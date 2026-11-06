package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class vf implements DialogInterface.OnCancelListener {
    public final int f50715a;
    public final Object f50716b;

    public vf(Object obj, int i7) {
        this.f50715a = i7;
        this.f50716b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50715a) {
            case 0:
                an anVar = (an) this.f50716b;
                anVar.f43917p9 = true;
                anVar.f43892n9 = 0;
                anVar.Qb = 0;
                anVar.Z4 = 0;
                anVar.M9();
                anVar.qc(false);
                return;
            case 1:
                pn pnVar = (pn) this.f50716b;
                pnVar.M0 = false;
                pnVar.f48858b = null;
                pnVar.N0 = false;
                return;
            case 2:
                ((so) this.f50716b).f49801n = null;
                return;
            case 3:
                ((p90) this.f50716b).b();
                return;
            default:
                ((CancellationTokenSource) this.f50716b).cancel();
                return;
        }
    }
}
