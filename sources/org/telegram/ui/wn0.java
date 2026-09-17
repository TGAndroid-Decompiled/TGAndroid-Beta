package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class wn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, bu {
    public final int f39080a;
    public final yo0 f39081b;

    public wn0(yo0 yo0Var, int i10) {
        this.f39080a = i10;
        this.f39081b = yo0Var;
    }

    @Override
    public void a1(xt xtVar) {
        switch (this.f39080a) {
            case 2:
                yo0 yo0Var = this.f39081b;
                yo0Var.A0 = xtVar;
                yo0Var.f39957f[4].setText(xtVar.f39695a);
                return;
            default:
                yo0 yo0Var2 = this.f39081b;
                yo0Var2.A0 = xtVar;
                yo0Var2.f39957f[4].setText(xtVar.f39695a);
                yo0Var2.B0 = xtVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39080a) {
            case 1:
                yo0 yo0Var = this.f39081b;
                yo0Var.I0(yo0Var.R0[0]);
                return;
            case 2:
            default:
                yo0 yo0Var2 = this.f39081b;
                yo0Var2.D0(true);
                yo0Var2.z0();
                return;
            case 3:
                this.f39081b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        yo0 yo0Var = this.f39081b;
        yo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = yo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
