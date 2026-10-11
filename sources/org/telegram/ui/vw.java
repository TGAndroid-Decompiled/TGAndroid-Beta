package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class vw extends s4.d0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final ry L;
    public final sy M;

    public vw(sy syVar, ry ryVar) {
        this.M = syVar;
        this.L = ryVar;
    }

    @Override
    public final int R0() {
        ry ryVar = this.L;
        if (ryVar.f41571s == 0 && this.M.W3() && ryVar.v == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(pf.e eVar, s4.a1 a1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, a1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
                sy syVar = this.M;
                sb2.append(syVar.S1);
                sb2.append(" lastUpdateAction=");
                sb2.append(syVar.y3);
                throw new RuntimeException(sb2.toString());
            }
        }
        try {
            super.b0(eVar, a1Var);
        } catch (IndexOutOfBoundsException e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new uw(this.L, 0));
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
        ry ryVar = this.L;
        if (ryVar.f41564a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ai.x(21, this, ryVar));
            this.K.addListener(new org.telegram.ui.Components.j91(this, 17));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.is.f27500f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f41564a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, pf.e r24, s4.a1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw.o0(int, pf.e, s4.a1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        if (this.M.W3() && i10 == 1) {
            super.v0(recyclerView, a1Var, i10);
            return;
        }
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.f47951a = i10;
        w0(oVar);
    }
}
