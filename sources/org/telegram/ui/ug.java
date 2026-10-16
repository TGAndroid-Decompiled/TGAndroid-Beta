package org.telegram.ui;

import android.content.DialogInterface;
public final class ug implements DialogInterface.OnCancelListener {
    public final int f40393a;
    public final Object f40394b;

    public ug(Object obj, int i10) {
        this.f40393a = i10;
        this.f40394b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40393a) {
            case 0:
                fo foVar = (fo) this.f40394b;
                foVar.f35594b9 = true;
                foVar.Z8 = 0;
                foVar.f35779qb = 0;
                foVar.N4 = 0;
                foVar.w9();
                foVar.Rb(false);
                return;
            case 1:
                zo zoVar = (zo) this.f40394b;
                zoVar.M0 = false;
                zoVar.f42365b = null;
                zoVar.N0 = false;
                return;
            case 2:
                ((aq) this.f40394b).f34052n = null;
                return;
            default:
                ((ic0) this.f40394b).b();
                return;
        }
    }
}
