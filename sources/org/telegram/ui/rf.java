package org.telegram.ui;

import android.content.DialogInterface;
public final class rf implements DialogInterface.OnCancelListener {
    public final int f49211a;
    public final Object f49212b;

    public rf(Object obj, int i3) {
        this.f49211a = i3;
        this.f49212b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f49211a) {
            case 0:
                wm wmVar = (wm) this.f49212b;
                wmVar.f51454q9 = true;
                wmVar.f51428o9 = 0;
                wmVar.Rb = 0;
                wmVar.f51242a5 = 0;
                wmVar.M9();
                wmVar.qc(false);
                return;
            case 1:
                ln lnVar = (ln) this.f49212b;
                lnVar.N0 = false;
                lnVar.f47366b = null;
                lnVar.O0 = false;
                return;
            case 2:
                ((qo) this.f49212b).f48925n = null;
                return;
            default:
                ((m90) this.f49212b).b();
                return;
        }
    }
}
