package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class tw extends f2.j0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final oy L;
    public final py M;

    public tw(py pyVar, oy oyVar) {
        this.M = pyVar;
        this.L = oyVar;
    }

    @Override
    public final int R0() {
        oy oyVar = this.L;
        if (oyVar.f39829s == 0 && this.M.Z3() && oyVar.v == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(bf.f fVar, f2.j1 j1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(fVar, j1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
                py pyVar = this.M;
                sb.append(pyVar.P1);
                sb.append(" lastUpdateAction=");
                sb.append(pyVar.f40260v3);
                throw new RuntimeException(sb.toString());
            }
        }
        try {
            super.b0(fVar, j1Var);
        } catch (IndexOutOfBoundsException e6) {
            FileLog.e(e6);
            AndroidUtilities.runOnUIThread(new sw(this.L, 0));
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
        oy oyVar = this.L;
        if (oyVar.f39822a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.Q, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bg.a(20, this, oyVar));
            this.K.addListener(new org.telegram.ui.Components.f91(this, 15));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.pr.f30168f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f39822a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, bf.f r24, f2.j1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tw.o0(int, bf.f, f2.j1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, j1Var, i10);
            return;
        }
        xh.o oVar = new xh.o(recyclerView.getContext(), 0);
        oVar.f5805a = i10;
        w0(oVar);
    }
}
