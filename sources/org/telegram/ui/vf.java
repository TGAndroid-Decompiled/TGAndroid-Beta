package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class vf implements DialogInterface.OnCancelListener {
    public final int f50669a;
    public final Object f50670b;

    public vf(Object obj, int i7) {
        this.f50669a = i7;
        this.f50670b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50669a) {
            case 0:
                cn cnVar = (cn) this.f50670b;
                cnVar.f44607r9 = true;
                cnVar.f44580p9 = 0;
                cnVar.Sb = 0;
                cnVar.Z4 = 0;
                cnVar.N9();
                cnVar.tc(false);
                return;
            case 1:
                rn rnVar = (rn) this.f50670b;
                rnVar.M0 = false;
                rnVar.f49511b = null;
                rnVar.N0 = false;
                return;
            case 2:
                ((uo) this.f50670b).f50436n = null;
                return;
            case 3:
                ((r90) this.f50670b).b();
                return;
            default:
                ((CancellationTokenSource) this.f50670b).cancel();
                return;
        }
    }
}
