package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class z81 extends v4.b0 {
    public boolean I;
    public final v91 J;

    public z81(v91 v91Var) {
        this.J = v91Var;
    }

    @Override
    public final void b0(v4.v0 v0Var, v4.a1 a1Var) {
        boolean z9 = org.telegram.messenger.r2.f25191a;
        try {
            super.b0(v0Var, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new ru0(this, 21));
        }
    }

    @Override
    public final void b1(View view, View view2, int i7, int i10) {
        this.I = true;
        super.b1(view, view2, i7, i10);
        this.I = false;
    }

    @Override
    public final void h1(int i7, int i10) {
        if (this.I) {
            i10 -= this.J.N.getPaddingTop();
        }
        super.h1(i7, i10);
    }

    @Override
    public final int o0(int r19, v4.v0 r20, v4.a1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z81.o0(int, v4.v0, v4.a1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        if (this.J.f50676y > 0 && i7 == 1) {
            super.v0(recyclerView, a1Var, i7);
            return;
        }
        mi.m mVar = new mi.m(recyclerView.getContext(), 0);
        mVar.f57121a = i7;
        w0(mVar);
    }
}
