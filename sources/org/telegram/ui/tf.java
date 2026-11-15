package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class tf implements DialogInterface.OnCancelListener {
    public final int f51570a;
    public final Object f51571b;

    public tf(Object obj, int i7) {
        this.f51570a = i7;
        this.f51571b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f51570a) {
            case 0:
                an anVar = (an) this.f51571b;
                anVar.s9 = true;
                anVar.f45334q9 = 0;
                anVar.Tb = 0;
                anVar.f45122a5 = 0;
                anVar.O9();
                anVar.uc(false);
                return;
            case 1:
                qn qnVar = (qn) this.f51571b;
                qnVar.N0 = false;
                qnVar.f50662b = null;
                qnVar.O0 = false;
                return;
            case 2:
                ((to) this.f51571b).f51623n = null;
                return;
            case 3:
                ((q90) this.f51571b).b();
                return;
            default:
                ((CancellationTokenSource) this.f51571b).cancel();
                return;
        }
    }
}
