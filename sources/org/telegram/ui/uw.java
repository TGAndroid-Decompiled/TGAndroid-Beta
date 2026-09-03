package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class uw extends f2.i0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final py L;
    public final qy M;

    public uw(qy qyVar, py pyVar) {
        this.M = qyVar;
        this.L = pyVar;
    }

    @Override
    public final int R0() {
        py pyVar = this.L;
        if (pyVar.f37252s == 0 && this.M.Z3() && pyVar.v == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(af.h hVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(hVar, i1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
                qy qyVar = this.M;
                sb.append(qyVar.P1);
                sb.append(" lastUpdateAction=");
                sb.append(qyVar.f37631v3);
                throw new RuntimeException(sb.toString());
            }
        }
        try {
            super.b0(hVar, i1Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new tw(this.L, 0));
        }
    }

    @Override
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        py pyVar = this.L;
        if (pyVar.f37246a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.Q, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ag.a(20, this, pyVar));
            this.K.addListener(new org.telegram.ui.Components.f91(this, 15));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f37246a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, af.h r24, f2.i1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.o0(int, af.h, f2.i1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, i1Var, i10);
            return;
        }
        wh.o oVar = new wh.o(recyclerView.getContext(), 0);
        oVar.f5712a = i10;
        w0(oVar);
    }
}
