package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class sl0 implements OnCompleteListener, org.telegram.ui.ActionBar.u1, qt {
    public final int f41539a;
    public final sm0 f41540b;

    public sl0(sm0 sm0Var, int i10) {
        this.f41539a = i10;
        this.f41540b = sm0Var;
    }

    @Override
    public void c(nt ntVar) {
        switch (this.f41539a) {
            case 2:
                sm0 sm0Var = this.f41540b;
                sm0Var.A0 = ntVar;
                sm0Var.f41559f[4].setText(ntVar.f40047a);
                return;
            default:
                sm0 sm0Var2 = this.f41540b;
                sm0Var2.A0 = ntVar;
                sm0Var2.f41559f[4].setText(ntVar.f40047a);
                sm0Var2.B0 = ntVar.d;
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f41539a) {
            case 1:
                sm0 sm0Var = this.f41540b;
                sm0Var.N0(sm0Var.R0[0]);
                return;
            case 2:
            default:
                sm0 sm0Var2 = this.f41540b;
                sm0Var2.I0(true);
                sm0Var2.E0();
                return;
            case 3:
                this.f41540b.F0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f41540b.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.f8.e("isReadyToPay failed", task.getException());
    }
}
