package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class wf implements DialogInterface.OnCancelListener {
    public final int f53428a;
    public final Object f53429b;

    public wf(Object obj, int i7) {
        this.f53428a = i7;
        this.f53429b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f53428a) {
            case 0:
                bn bnVar = (bn) this.f53429b;
                bnVar.f46188t9 = true;
                bnVar.f46164r9 = 0;
                bnVar.Ub = 0;
                bnVar.f45952b5 = 0;
                bnVar.O9();
                bnVar.uc(false);
                return;
            case 1:
                rn rnVar = (rn) this.f53429b;
                rnVar.N0 = false;
                rnVar.f51677b = null;
                rnVar.O0 = false;
                return;
            case 2:
                ((vo) this.f53429b).f52828n = null;
                return;
            case 3:
                ((r90) this.f53429b).b();
                return;
            default:
                ((CancellationTokenSource) this.f53429b).cancel();
                return;
        }
    }
}
