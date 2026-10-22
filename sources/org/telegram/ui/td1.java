package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class td1 extends s4.b0 {
    public boolean I;
    public final re1 J;

    public td1(re1 re1Var) {
        this.J = re1Var;
    }

    @Override
    public final void b0(qf.e eVar, s4.y0 y0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, y0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(eVar, y0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new qy0(this, 19));
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
    public final int o0(int r19, qf.e r20, s4.y0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.td1.o0(int, qf.e, s4.y0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        if (this.J.f41193x > 0 && i10 == 1) {
            super.v0(recyclerView, y0Var, i10);
            return;
        }
        li.n nVar = new li.n(recyclerView.getContext(), 0);
        nVar.f46061a = i10;
        w0(nVar);
    }
}
