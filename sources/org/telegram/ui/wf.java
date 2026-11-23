package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class wf implements DialogInterface.OnCancelListener {
    public final int f53389a;
    public final Object f53390b;

    public wf(Object obj, int i7) {
        this.f53389a = i7;
        this.f53390b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f53389a) {
            case 0:
                bn bnVar = (bn) this.f53390b;
                bnVar.f46159t9 = true;
                bnVar.f46135r9 = 0;
                bnVar.Ub = 0;
                bnVar.f45923b5 = 0;
                bnVar.O9();
                bnVar.uc(false);
                return;
            case 1:
                rn rnVar = (rn) this.f53390b;
                rnVar.N0 = false;
                rnVar.f51677b = null;
                rnVar.O0 = false;
                return;
            case 2:
                ((uo) this.f53390b).f52602n = null;
                return;
            case 3:
                ((s90) this.f53390b).b();
                return;
            default:
                ((CancellationTokenSource) this.f53390b).cancel();
                return;
        }
    }
}
