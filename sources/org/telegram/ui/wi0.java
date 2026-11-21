package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wi0 implements View.OnTouchListener {
    public final int f53442a;
    public final hk0 f53443b;

    public wi0(hk0 hk0Var, int i7) {
        this.f53442a = i7;
        this.f53443b = hk0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.f53442a;
        hk0 hk0Var = this.f53443b;
        switch (i7) {
            case 0:
                if (hk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    us usVar = new us(null, false);
                    usVar.f52625r = new aj0(1, hk0Var, view);
                    hk0Var.presentFragment(usVar);
                }
                return true;
            case 1:
                if (hk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131747272, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                    t1Var.S = N0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131747314, null), org.telegram.messenger.gd.N0(2131747375, null)}, new k4(hk0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752577, null), null);
                    hk0Var.showDialog(t1Var);
                }
                return true;
            case 2:
                if (hk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    us usVar2 = new us(null, false);
                    usVar2.f52625r = new xi0(hk0Var, 2);
                    hk0Var.presentFragment(usVar2);
                }
                return true;
            default:
                if (hk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    us usVar3 = new us(null, false);
                    usVar3.f52625r = new xi0(hk0Var, 3);
                    hk0Var.presentFragment(usVar3);
                }
                return true;
        }
    }
}
