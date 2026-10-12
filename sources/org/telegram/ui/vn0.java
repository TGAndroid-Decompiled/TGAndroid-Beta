package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class vn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, bu {
    public final int f42816a;
    public final xo0 f42817b;

    public vn0(xo0 xo0Var, int i10) {
        this.f42816a = i10;
        this.f42817b = xo0Var;
    }

    @Override
    public void V0(xt xtVar) {
        switch (this.f42816a) {
            case 2:
                xo0 xo0Var = this.f42817b;
                xo0Var.A0 = xtVar;
                xo0Var.f44099f[4].setText(xtVar.f44156a);
                return;
            default:
                xo0 xo0Var2 = this.f42817b;
                xo0Var2.A0 = xtVar;
                xo0Var2.f44099f[4].setText(xtVar.f44156a);
                xo0Var2.B0 = xtVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42816a) {
            case 1:
                xo0 xo0Var = this.f42817b;
                xo0Var.I0(xo0Var.R0[0]);
                return;
            case 2:
            default:
                xo0 xo0Var2 = this.f42817b;
                xo0Var2.D0(true);
                xo0Var2.z0();
                return;
            case 3:
                this.f42817b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        xo0 xo0Var = this.f42817b;
        xo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = xo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
