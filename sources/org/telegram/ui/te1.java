package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class te1 extends f2.j0 {
    public boolean I;
    public final sf1 J;

    public te1(sf1 sf1Var) {
        this.J = sf1Var;
    }

    @Override
    public final void b0(bf.f fVar, f2.j1 j1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(fVar, j1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(fVar, j1Var);
        } catch (IndexOutOfBoundsException e6) {
            FileLog.e(e6);
            AndroidUtilities.runOnUIThread(new sz0(this, 18));
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
            i11 -= this.J.K.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r19, bf.f r20, f2.j1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.te1.o0(int, bf.f, f2.j1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        if (this.J.f41229x > 0 && i10 == 1) {
            super.v0(recyclerView, j1Var, i10);
            return;
        }
        xh.o oVar = new xh.o(recyclerView.getContext(), 0);
        oVar.f5805a = i10;
        w0(oVar);
    }
}
