package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class sa1 extends s4.a0 {
    public boolean I;
    public final pb1 J;

    public sa1(pb1 pb1Var) {
        this.J = pb1Var;
    }

    @Override
    public final void b0(hf.e eVar, s4.z0 z0Var) {
        boolean z10 = org.telegram.messenger.v2.f18448a;
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e) {
            org.telegram.messenger.f8.g(e, true);
            org.telegram.messenger.i0.g3(new wv0(this, 23));
        }
    }

    @Override
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.N.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r19, hf.e r20, s4.z0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sa1.o0(int, hf.e, s4.z0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.J.f40613y > 0 && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ci.p pVar = new ci.p(recyclerView.getContext(), 0);
        pVar.f48045a = i10;
        w0(pVar);
    }
}
