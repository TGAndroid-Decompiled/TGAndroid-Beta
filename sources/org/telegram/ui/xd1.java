package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class xd1 extends f2.m0 {
    public boolean I;
    public final we1 J;

    public xd1(we1 we1Var) {
        this.J = we1Var;
    }

    @Override
    public final void b0(f2.g1 g1Var, f2.n1 n1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(g1Var, n1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(g1Var, n1Var);
        } catch (IndexOutOfBoundsException e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new ky0(this, 20));
        }
    }

    @Override
    public final void b1(View view, View view2, int i9, int i10) {
        this.I = true;
        super.b1(view, view2, i9, i10);
        this.I = false;
    }

    @Override
    public final void h1(int i9, int i10) {
        if (this.I) {
            i10 -= this.J.J.getPaddingTop();
        }
        super.h1(i9, i10);
    }

    @Override
    public final int o0(int r19, f2.g1 r20, f2.n1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xd1.o0(int, f2.g1, f2.n1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        if (this.J.f43781x > 0 && i9 == 1) {
            super.v0(recyclerView, n1Var, i9);
            return;
        }
        rh.n nVar = new rh.n(recyclerView.getContext(), 0);
        nVar.f5443a = i9;
        w0(nVar);
    }
}
