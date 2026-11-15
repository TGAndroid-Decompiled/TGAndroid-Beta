package org.telegram.ui;

import android.content.DialogInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
public final class tf implements DialogInterface.OnCancelListener {
    public final int f51569a;
    public final Object f51570b;

    public tf(Object obj, int i7) {
        this.f51569a = i7;
        this.f51570b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f51569a) {
            case 0:
                an anVar = (an) this.f51570b;
                anVar.s9 = true;
                anVar.f45335q9 = 0;
                anVar.Tb = 0;
                anVar.f45123a5 = 0;
                anVar.O9();
                anVar.uc(false);
                return;
            case 1:
                qn qnVar = (qn) this.f51570b;
                qnVar.N0 = false;
                qnVar.f50663b = null;
                qnVar.O0 = false;
                return;
            case 2:
                ((to) this.f51570b).f51622n = null;
                return;
            case 3:
                ((q90) this.f51570b).b();
                return;
            default:
                ((CancellationTokenSource) this.f51570b).cancel();
                return;
        }
    }
}
