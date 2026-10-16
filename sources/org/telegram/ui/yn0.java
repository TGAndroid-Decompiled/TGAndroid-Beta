package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class yn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, eu {
    public final int f41854a;
    public final ap0 f41855b;

    public yn0(ap0 ap0Var, int i10) {
        this.f41854a = i10;
        this.f41855b = ap0Var;
    }

    @Override
    public void Z0(au auVar) {
        switch (this.f41854a) {
            case 2:
                ap0 ap0Var = this.f41855b;
                ap0Var.A0 = auVar;
                ap0Var.f34020f[4].setText(auVar.f34084a);
                return;
            default:
                ap0 ap0Var2 = this.f41855b;
                ap0Var2.A0 = auVar;
                ap0Var2.f34020f[4].setText(auVar.f34084a);
                ap0Var2.B0 = auVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41854a) {
            case 1:
                ap0 ap0Var = this.f41855b;
                ap0Var.I0(ap0Var.R0[0]);
                return;
            case 2:
            default:
                ap0 ap0Var2 = this.f41855b;
                ap0Var2.D0(true);
                ap0Var2.z0();
                return;
            case 3:
                this.f41855b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ap0 ap0Var = this.f41855b;
        ap0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = ap0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
