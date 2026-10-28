package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class qn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, pt {
    public final int f42754a;
    public final ro0 f42755b;

    public qn0(ro0 ro0Var, int i10) {
        this.f42754a = i10;
        this.f42755b = ro0Var;
    }

    @Override
    public void Y0(lt ltVar) {
        switch (this.f42754a) {
            case 2:
                ro0 ro0Var = this.f42755b;
                ro0Var.A0 = ltVar;
                ro0Var.f43110f[4].setText(ltVar.f41258a);
                return;
            default:
                ro0 ro0Var2 = this.f42755b;
                ro0Var2.A0 = ltVar;
                ro0Var2.f43110f[4].setText(ltVar.f41258a);
                ro0Var2.B0 = ltVar.d;
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f42754a) {
            case 1:
                ro0 ro0Var = this.f42755b;
                ro0Var.J0(ro0Var.R0[0]);
                return;
            case 2:
            default:
                ro0 ro0Var2 = this.f42755b;
                ro0Var2.E0(true);
                ro0Var2.A0();
                return;
            case 3:
                this.f42755b.B0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ro0 ro0Var = this.f42755b;
        ro0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = ro0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
