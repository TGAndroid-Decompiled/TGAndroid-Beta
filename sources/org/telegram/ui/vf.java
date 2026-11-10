package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class vf implements DialogInterface.OnCancelListener {
    public final int f50720a;
    public final Object f50721b;

    public vf(Object obj, int i7) {
        this.f50720a = i7;
        this.f50721b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f50720a) {
            case 0:
                cn cnVar = (cn) this.f50721b;
                cnVar.f44648r9 = true;
                cnVar.f44621p9 = 0;
                cnVar.Sb = 0;
                cnVar.Z4 = 0;
                cnVar.N9();
                cnVar.tc(false);
                return;
            case 1:
                rn rnVar = (rn) this.f50721b;
                rnVar.M0 = false;
                rnVar.f49449b = null;
                rnVar.N0 = false;
                return;
            case 2:
                ((uo) this.f50721b).f50532n = null;
                return;
            case 3:
                ((s90) this.f50721b).b();
                return;
            default:
                ((CancellationTokenSource) this.f50721b).cancel();
                return;
        }
    }
}
