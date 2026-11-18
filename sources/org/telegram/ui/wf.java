package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class wf implements DialogInterface.OnCancelListener {
    public final int f53379a;
    public final Object f53380b;

    public wf(Object obj, int i7) {
        this.f53379a = i7;
        this.f53380b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f53379a) {
            case 0:
                bn bnVar = (bn) this.f53380b;
                bnVar.f46179t9 = true;
                bnVar.f46155r9 = 0;
                bnVar.Ub = 0;
                bnVar.f45943b5 = 0;
                bnVar.O9();
                bnVar.uc(false);
                return;
            case 1:
                rn rnVar = (rn) this.f53380b;
                rnVar.N0 = false;
                rnVar.f51666b = null;
                rnVar.O0 = false;
                return;
            case 2:
                ((vo) this.f53380b).f52818n = null;
                return;
            case 3:
                ((s90) this.f53380b).b();
                return;
            default:
                ((CancellationTokenSource) this.f53380b).cancel();
                return;
        }
    }
}
