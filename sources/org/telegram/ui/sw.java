package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class sw extends f2.i0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final ny L;
    public final oy M;

    public sw(oy oyVar, ny nyVar) {
        this.M = oyVar;
        this.L = nyVar;
    }

    @Override
    public final int R0() {
        ny nyVar = this.L;
        if (nyVar.f36747s == 0 && this.M.Z3() && nyVar.v == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(bf.f fVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(fVar, i1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
                oy oyVar = this.M;
                sb.append(oyVar.P1);
                sb.append(" lastUpdateAction=");
                sb.append(oyVar.f37113v3);
                throw new RuntimeException(sb.toString());
            }
        }
        try {
            super.b0(fVar, i1Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new rw(this.L, 0));
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
        ny nyVar = this.L;
        if (nyVar.f36741a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.Q, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ag.a(20, this, nyVar));
            this.K.addListener(new org.telegram.ui.Components.f91(this, 15));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.nr.f27346f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f36741a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, bf.f r24, f2.i1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.o0(int, bf.f, f2.i1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.i1 i1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, i1Var, i10);
            return;
        }
        wh.o oVar = new wh.o(recyclerView.getContext(), 0);
        oVar.f5723a = i10;
        w0(oVar);
    }
}
