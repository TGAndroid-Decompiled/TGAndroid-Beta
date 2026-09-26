package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class tw extends s4.c0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final py L;
    public final qy M;

    public tw(qy qyVar, py pyVar) {
        this.M = qyVar;
        this.L = pyVar;
    }

    @Override
    public final int R0() {
        py pyVar = this.L;
        if (pyVar.f36699s == 0 && this.M.Z3() && pyVar.v == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(of.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(eVar, z0Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                StringBuilder sb2 = new StringBuilder("Inconsistency detected. dialogsListIsFrozen=");
                qy qyVar = this.M;
                sb2.append(qyVar.S1);
                sb2.append(" lastUpdateAction=");
                sb2.append(qyVar.y3);
                throw new RuntimeException(sb2.toString());
            }
        }
        try {
            super.b0(eVar, z0Var);
        } catch (IndexOutOfBoundsException e) {
            FileLog.e(e);
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
        py pyVar = this.L;
        if (pyVar.f36693a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.T, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ai.x(21, this, pyVar));
            this.K.addListener(new org.telegram.ui.Components.r81(this, 17));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.sr.f28339f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.L.f36693a.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int r23, of.e r24, s4.z0 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tw.o0(int, of.e, s4.z0):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        if (this.M.Z3() && i10 == 1) {
            super.v0(recyclerView, z0Var, i10);
            return;
        }
        ji.o oVar = new ji.o(recyclerView.getContext(), 0);
        oVar.f43109a = i10;
        w0(oVar);
    }
}
