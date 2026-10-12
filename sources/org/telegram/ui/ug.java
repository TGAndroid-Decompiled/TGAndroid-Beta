package org.telegram.ui;

import android.content.DialogInterface;
public final class ug implements DialogInterface.OnCancelListener {
    public final int f40675a;
    public final Object f40676b;

    public ug(Object obj, int i10) {
        this.f40675a = i10;
        this.f40676b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40675a) {
            case 0:
                fo foVar = (fo) this.f40676b;
                foVar.f35893b9 = true;
                foVar.Z8 = 0;
                foVar.f36078qb = 0;
                foVar.N4 = 0;
                foVar.w9();
                foVar.Rb(false);
                return;
            case 1:
                zo zoVar = (zo) this.f40676b;
                zoVar.M0 = false;
                zoVar.f42656b = null;
                zoVar.N0 = false;
                return;
            case 2:
                ((aq) this.f40676b).f34296n = null;
                return;
            default:
                ((jc0) this.f40676b).b();
                return;
        }
    }
}
