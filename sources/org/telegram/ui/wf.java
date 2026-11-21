package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class wf implements DialogInterface.OnCancelListener {
    public final int f53422a;
    public final Object f53423b;

    public wf(Object obj, int i7) {
        this.f53422a = i7;
        this.f53423b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f53422a) {
            case 0:
                bn bnVar = (bn) this.f53423b;
                bnVar.f46202t9 = true;
                bnVar.f46178r9 = 0;
                bnVar.Ub = 0;
                bnVar.f45966b5 = 0;
                bnVar.O9();
                bnVar.uc(false);
                return;
            case 1:
                rn rnVar = (rn) this.f53423b;
                rnVar.N0 = false;
                rnVar.f51641b = null;
                rnVar.O0 = false;
                return;
            case 2:
                ((vo) this.f53423b).f52860n = null;
                return;
            case 3:
                ((s90) this.f53423b).b();
                return;
            default:
                ((CancellationTokenSource) this.f53423b).cancel();
                return;
        }
    }
}
