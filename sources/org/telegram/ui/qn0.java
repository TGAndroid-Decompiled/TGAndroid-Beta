package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class qn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, yt {
    public final int f39762a;
    public final so0 f39763b;

    public qn0(so0 so0Var, int i10) {
        this.f39762a = i10;
        this.f39763b = so0Var;
    }

    @Override
    public void b1(ut utVar) {
        switch (this.f39762a) {
            case 2:
                so0 so0Var = this.f39763b;
                so0Var.A0 = utVar;
                so0Var.f40560f[4].setText(utVar.f41305a);
                return;
            default:
                so0 so0Var2 = this.f39763b;
                so0Var2.A0 = utVar;
                so0Var2.f40560f[4].setText(utVar.f41305a);
                so0Var2.B0 = utVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39762a) {
            case 1:
                so0 so0Var = this.f39763b;
                so0Var.I0(so0Var.R0[0]);
                return;
            case 2:
            default:
                so0 so0Var2 = this.f39763b;
                so0Var2.D0(true);
                so0Var2.z0();
                return;
            case 3:
                this.f39763b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        so0 so0Var = this.f39763b;
        so0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = so0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
