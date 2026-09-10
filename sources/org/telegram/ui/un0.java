package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class un0 implements OnCompleteListener, org.telegram.ui.ActionBar.c2, au {
    public final int f37299a;
    public final wo0 f37300b;

    public un0(wo0 wo0Var, int i10) {
        this.f37299a = i10;
        this.f37300b = wo0Var;
    }

    @Override
    public void a1(wt wtVar) {
        switch (this.f37299a) {
            case 2:
                wo0 wo0Var = this.f37300b;
                wo0Var.A0 = wtVar;
                wo0Var.f38267f[4].setText(wtVar.f38386a);
                return;
            default:
                wo0 wo0Var2 = this.f37300b;
                wo0Var2.A0 = wtVar;
                wo0Var2.f38267f[4].setText(wtVar.f38386a);
                wo0Var2.B0 = wtVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37299a) {
            case 1:
                wo0 wo0Var = this.f37300b;
                wo0Var.I0(wo0Var.R0[0]);
                return;
            case 2:
            default:
                wo0 wo0Var2 = this.f37300b;
                wo0Var2.D0(true);
                wo0Var2.z0();
                return;
            case 3:
                this.f37300b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        wo0 wo0Var = this.f37300b;
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
