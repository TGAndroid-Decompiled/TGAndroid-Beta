package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class zd1 extends f2.j0 {
    public boolean I;
    public final ze1 J;

    public zd1(ze1 ze1Var) {
        this.J = ze1Var;
    }

    @Override
    public final void b0(f2.d1 d1Var, f2.k1 k1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(d1Var, k1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(d1Var, k1Var);
        } catch (IndexOutOfBoundsException e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new ky0(this, 20));
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
            i11 -= this.J.J.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r19, f2.d1 r20, f2.k1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zd1.o0(int, f2.d1, f2.k1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        if (this.J.f45195x > 0 && i10 == 1) {
            super.v0(recyclerView, k1Var, i10);
            return;
        }
        uh.n nVar = new uh.n(recyclerView.getContext(), 0);
        nVar.f6373a = i10;
        w0(nVar);
    }
}
