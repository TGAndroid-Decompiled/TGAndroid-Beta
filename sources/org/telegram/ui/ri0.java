package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ri0 implements View.OnTouchListener {
    public final int f49500a;
    public final bk0 f49501b;

    public ri0(bk0 bk0Var, int i7) {
        this.f49500a = i7;
        this.f49501b = bk0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7 = this.f49500a;
        bk0 bk0Var = this.f49501b;
        switch (i7) {
            case 0:
                if (bk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qs qsVar = new qs(null, false);
                    qsVar.f49309r = new pu(28, bk0Var, view);
                    bk0Var.presentFragment(qsVar);
                }
                return true;
            case 1:
                if (bk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131747467, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131747509, null), org.telegram.messenger.id.M0(2131747570, null)}, new k4(bk0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752589, null), null);
                    bk0Var.showDialog(u1Var);
                }
                return true;
            case 2:
                if (bk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qs qsVar2 = new qs(null, false);
                    qsVar2.f49309r = new si0(bk0Var, 2);
                    bk0Var.presentFragment(qsVar2);
                }
                return true;
            default:
                if (bk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qs qsVar3 = new qs(null, false);
                    qsVar3.f49309r = new si0(bk0Var, 3);
                    bk0Var.presentFragment(qsVar3);
                }
                return true;
        }
    }
}
