package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class wf implements DialogInterface.OnCancelListener {
    public final int f53657a;
    public final Object f53658b;

    public wf(Object obj, int i7) {
        this.f53657a = i7;
        this.f53658b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f53657a) {
            case 0:
                bn bnVar = (bn) this.f53658b;
                bnVar.f46374t9 = true;
                bnVar.f46350r9 = 0;
                bnVar.Ub = 0;
                bnVar.f46138b5 = 0;
                bnVar.O9();
                bnVar.uc(false);
                return;
            case 1:
                rn rnVar = (rn) this.f53658b;
                rnVar.N0 = false;
                rnVar.f51766b = null;
                rnVar.O0 = false;
                return;
            case 2:
                ((uo) this.f53658b).f52701n = null;
                return;
            case 3:
                ((r90) this.f53658b).b();
                return;
            default:
                ((CancellationTokenSource) this.f53658b).cancel();
                return;
        }
    }
}
