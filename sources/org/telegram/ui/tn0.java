package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class tn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, yt {
    public final int f42032a;
    public final vo0 f42033b;

    public tn0(vo0 vo0Var, int i10) {
        this.f42032a = i10;
        this.f42033b = vo0Var;
    }

    @Override
    public void U0(ut utVar) {
        switch (this.f42032a) {
            case 2:
                vo0 vo0Var = this.f42033b;
                vo0Var.A0 = utVar;
                vo0Var.f42925f[4].setText(utVar.f42547a);
                return;
            default:
                vo0 vo0Var2 = this.f42033b;
                vo0Var2.A0 = utVar;
                vo0Var2.f42925f[4].setText(utVar.f42547a);
                vo0Var2.B0 = utVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42032a) {
            case 1:
                vo0 vo0Var = this.f42033b;
                vo0Var.I0(vo0Var.R0[0]);
                return;
            case 2:
            default:
                vo0 vo0Var2 = this.f42033b;
                vo0Var2.D0(true);
                vo0Var2.z0();
                return;
            case 3:
                this.f42033b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        vo0 vo0Var = this.f42033b;
        vo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = vo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
