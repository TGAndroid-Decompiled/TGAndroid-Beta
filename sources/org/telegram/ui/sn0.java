package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class sn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, xt {
    public final int f41769a;
    public final uo0 f41770b;

    public sn0(uo0 uo0Var, int i10) {
        this.f41769a = i10;
        this.f41770b = uo0Var;
    }

    @Override
    public void U0(tt ttVar) {
        switch (this.f41769a) {
            case 2:
                uo0 uo0Var = this.f41770b;
                uo0Var.A0 = ttVar;
                uo0Var.f42706f[4].setText(ttVar.f42259a);
                return;
            default:
                uo0 uo0Var2 = this.f41770b;
                uo0Var2.A0 = ttVar;
                uo0Var2.f42706f[4].setText(ttVar.f42259a);
                uo0Var2.B0 = ttVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41769a) {
            case 1:
                uo0 uo0Var = this.f41770b;
                uo0Var.I0(uo0Var.R0[0]);
                return;
            case 2:
            default:
                uo0 uo0Var2 = this.f41770b;
                uo0Var2.D0(true);
                uo0Var2.z0();
                return;
            case 3:
                this.f41770b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        uo0 uo0Var = this.f41770b;
        uo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = uo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
