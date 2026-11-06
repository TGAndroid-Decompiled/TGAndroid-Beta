package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ri0 implements View.OnTouchListener {
    public final int f49522a;
    public final bk0 f49523b;

    public ri0(bk0 bk0Var, int i7) {
        this.f49522a = i7;
        this.f49523b = bk0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.f49522a;
        bk0 bk0Var = this.f49523b;
        switch (i7) {
            case 0:
                if (bk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qs qsVar = new qs(null, false);
                    qsVar.f49307r = new pu(28, bk0Var, view);
                    bk0Var.presentFragment(qsVar);
                }
                return true;
            case 1:
                if (bk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131747465, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131747507, null), org.telegram.messenger.hd.M0(2131747568, null)}, new k4(bk0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752589, null), null);
                    bk0Var.showDialog(u1Var);
                }
                return true;
            case 2:
                if (bk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qs qsVar2 = new qs(null, false);
                    qsVar2.f49307r = new si0(bk0Var, 2);
                    bk0Var.presentFragment(qsVar2);
                }
                return true;
            default:
                if (bk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qs qsVar3 = new qs(null, false);
                    qsVar3.f49307r = new si0(bk0Var, 3);
                    bk0Var.presentFragment(qsVar3);
                }
                return true;
        }
    }
}
