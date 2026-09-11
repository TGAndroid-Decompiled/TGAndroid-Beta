package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class vn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, au {
    public final int f41593a;
    public final xo0 f41594b;

    public vn0(xo0 xo0Var, int i10) {
        this.f41593a = i10;
        this.f41594b = xo0Var;
    }

    @Override
    public void a1(vt vtVar) {
        switch (this.f41593a) {
            case 2:
                xo0 xo0Var = this.f41594b;
                xo0Var.A0 = vtVar;
                xo0Var.f42819f[4].setText(vtVar.f41693a);
                return;
            default:
                xo0 xo0Var2 = this.f41594b;
                xo0Var2.A0 = vtVar;
                xo0Var2.f42819f[4].setText(vtVar.f41693a);
                xo0Var2.B0 = vtVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41593a) {
            case 1:
                xo0 xo0Var = this.f41594b;
                xo0Var.I0(xo0Var.R0[0]);
                return;
            case 2:
            default:
                xo0 xo0Var2 = this.f41594b;
                xo0Var2.D0(true);
                xo0Var2.z0();
                return;
            case 3:
                this.f41594b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        xo0 xo0Var = this.f41594b;
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
