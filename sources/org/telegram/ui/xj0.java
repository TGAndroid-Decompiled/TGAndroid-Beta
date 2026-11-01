package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xj0 implements View.OnTouchListener {
    public final int f43396a;
    public final jl0 f43397b;

    public xj0(jl0 jl0Var, int i10) {
        this.f43396a = i10;
        this.f43397b = jl0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f43396a;
        jl0 jl0Var = this.f43397b;
        switch (i10) {
            case 0:
                if (jl0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar = new qt(null, false);
                    qtVar.f40897r = new qv(27, jl0Var, view);
                    jl0Var.presentFragment(qtVar);
                }
                return true;
            case 1:
                if (jl0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131747482, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.dd.L0(2131747524, null), org.telegram.messenger.dd.L0(2131747585, null)}, new l4(jl0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752589, null), null);
                    jl0Var.showDialog(x1Var);
                }
                return true;
            case 2:
                if (jl0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar2 = new qt(null, false);
                    qtVar2.f40897r = new yj0(jl0Var, 2);
                    jl0Var.presentFragment(qtVar2);
                }
                return true;
            default:
                if (jl0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar3 = new qt(null, false);
                    qtVar3.f40897r = new yj0(jl0Var, 3);
                    jl0Var.presentFragment(qtVar3);
                }
                return true;
        }
    }
}
