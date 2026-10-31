package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zj0 implements View.OnTouchListener {
    public final int f44174a;
    public final ll0 f44175b;

    public zj0(ll0 ll0Var, int i10) {
        this.f44174a = i10;
        this.f44175b = ll0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f44174a;
        ll0 ll0Var = this.f44175b;
        switch (i10) {
            case 0:
                if (ll0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    rt rtVar = new rt(null, false);
                    rtVar.f41285r = new rv(27, ll0Var, view);
                    ll0Var.presentFragment(rtVar);
                }
                return true;
            case 1:
                if (ll0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131747482, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.cd.L0(2131747524, null), org.telegram.messenger.cd.L0(2131747585, null)}, new l4(ll0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752589, null), null);
                    ll0Var.showDialog(x1Var);
                }
                return true;
            case 2:
                if (ll0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    rt rtVar2 = new rt(null, false);
                    rtVar2.f41285r = new ak0(ll0Var, 2);
                    ll0Var.presentFragment(rtVar2);
                }
                return true;
            default:
                if (ll0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    rt rtVar3 = new rt(null, false);
                    rtVar3.f41285r = new ak0(ll0Var, 3);
                    ll0Var.presentFragment(rtVar3);
                }
                return true;
        }
    }
}
