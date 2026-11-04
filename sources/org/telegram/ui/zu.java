package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class zu extends u4.b0 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final tw L;
    public final uw M;

    public zu(uw uwVar, tw twVar) {
        this.M = uwVar;
        this.L = twVar;
    }

    @Override
    public final int R0() {
        tw twVar = this.L;
        if (twVar.f49904s == 0 && this.M.l4() && twVar.f49905w == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void b0(tf.e eVar, u4.a1 a1Var) {
        boolean z10 = org.telegram.messenger.r2.f25040a;
        try {
            super.b0(eVar, a1Var);
        } catch (IndexOutOfBoundsException e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new yu(this.L, 0));
        }
    }

    @Override
    public final void b1(View view, View view2, int i3, int i10) {
        this.I = true;
        super.b1(view, view2, i3, i10);
        this.I = false;
    }

    @Override
    public final void f0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        tw twVar = this.L;
        if (twVar.f49897a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new ci.uc(22, this, twVar));
            this.K.addListener(new org.telegram.ui.Cells.w9(this, 24));
            this.K.setDuration(200L);
            this.K.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            this.K.start();
        }
    }

    @Override
    public final void h1(int i3, int i10) {
        if (this.I) {
            i10 -= this.L.f49897a.getPaddingTop();
        }
        super.h1(i3, i10);
    }

    @Override
    public final int o0(int r24, tf.e r25, u4.a1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zu.o0(int, tf.e, u4.a1):int");
    }

    @Override
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        if (this.M.l4() && i3 == 1) {
            super.v0(recyclerView, a1Var, i3);
            return;
        }
        ni.m mVar = new ni.m(recyclerView.getContext(), 0);
        mVar.f55704a = i3;
        w0(mVar);
    }
}
