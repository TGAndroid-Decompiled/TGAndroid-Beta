package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class un0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, zt {
    public final int f38072a;
    public final wo0 f38073b;

    public un0(wo0 wo0Var, int i10) {
        this.f38072a = i10;
        this.f38073b = wo0Var;
    }

    @Override
    public void a1(vt vtVar) {
        switch (this.f38072a) {
            case 2:
                wo0 wo0Var = this.f38073b;
                wo0Var.A0 = vtVar;
                wo0Var.f39315f[4].setText(vtVar.f38616a);
                return;
            default:
                wo0 wo0Var2 = this.f38073b;
                wo0Var2.A0 = vtVar;
                wo0Var2.f39315f[4].setText(vtVar.f38616a);
                wo0Var2.B0 = vtVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38072a) {
            case 1:
                wo0 wo0Var = this.f38073b;
                wo0Var.I0(wo0Var.R0[0]);
                return;
            case 2:
            default:
                wo0 wo0Var2 = this.f38073b;
                wo0Var2.D0(true);
                wo0Var2.z0();
                return;
            case 3:
                this.f38073b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        wo0 wo0Var = this.f38073b;
        wo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = wo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
