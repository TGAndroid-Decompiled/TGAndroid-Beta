package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class yo0 extends s4.r0 {
    public final int f43487a;
    public final ep0 f43488b;

    public yo0(ep0 ep0Var, int i10) {
        this.f43488b = ep0Var;
        this.f43487a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ai.y9 y9Var;
        bh.f fVar;
        ep0 ep0Var = this.f43488b;
        kp0 kp0Var = ep0Var.f36599p0;
        if (i11 != 0) {
            kp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = kp0Var.f38647f0) != null) {
            fVar.f(i10, i11);
        }
        ep0Var.h();
        if (ep0Var.K != null) {
            if (ep0Var.J != null && ep0Var.c()) {
                ep0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f43487a == 1) {
            y9Var = kp0Var.f38642c;
        } else {
            y9Var = kp0Var.f38640b;
        }
        if (y9Var != null && ep0Var.c()) {
            y9Var.a();
        }
    }
}
