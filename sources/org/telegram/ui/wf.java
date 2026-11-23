package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class wf implements DialogInterface.OnCancelListener {
    public final int f53426a;
    public final Object f53427b;

    public wf(Object obj, int i7) {
        this.f53426a = i7;
        this.f53427b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f53426a) {
            case 0:
                bn bnVar = (bn) this.f53427b;
                bnVar.f46206t9 = true;
                bnVar.f46182r9 = 0;
                bnVar.Ub = 0;
                bnVar.f45970b5 = 0;
                bnVar.O9();
                bnVar.uc(false);
                return;
            case 1:
                rn rnVar = (rn) this.f53427b;
                rnVar.N0 = false;
                rnVar.f51645b = null;
                rnVar.O0 = false;
                return;
            case 2:
                ((vo) this.f53427b).f52864n = null;
                return;
            case 3:
                ((s90) this.f53427b).b();
                return;
            default:
                ((CancellationTokenSource) this.f53427b).cancel();
                return;
        }
    }
}
