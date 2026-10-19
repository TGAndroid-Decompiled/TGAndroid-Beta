package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uh extends AnimatorListenerAdapter {
    public final pn f41985a;
    public final boolean f41986b;
    public final org.telegram.ui.ActionBar.j5 f41987c;
    public final boolean d;
    public final ai.vd e;
    public final boolean f41988f;
    public final qn h;

    public uh(qn qnVar, pn pnVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, ai.vd vdVar, boolean z12) {
        this.h = qnVar;
        this.f41985a = pnVar;
        this.f41986b = z10;
        this.f41987c = j5Var;
        this.d = z11;
        this.e = vdVar;
        this.f41988f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qn qnVar = this.h;
        if (qnVar.F2.getTag() != null) {
            qnVar.F2.setVisibility(4);
            int L8 = qnVar.L8();
            qnVar.F2.a(Math.min(L8 - 1, Math.max(1, L8 - qnVar.M4[0])), false);
        } else {
            qnVar.F2.setAlpha(1.0f);
        }
        qnVar.F2.setTranslationY(0.0f);
        qnVar.D2[0].setTranslationX(0.0f);
        qnVar.D2[1].setTranslationX(0.0f);
        qnVar.F2.setTranslationX(qnVar.G2 + 0.0f);
        pn pnVar = this.f41985a;
        pnVar.setTranslationY(0.0f);
        boolean z10 = this.f41986b;
        if (!z10) {
            pnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f41987c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.vd vdVar = this.e;
        if (!z11) {
            vdVar.setTranslationY(0.0f);
        }
        qnVar.C2[0].setTranslationX(0.0f);
        qnVar.C2[1].setTranslationX(0.0f);
        qnVar.B2[1].setAlpha(1.0f);
        qnVar.B2[1].setScaleX(1.0f);
        qnVar.B2[1].setScaleY(1.0f);
        qnVar.B2[0].setAlpha(1.0f);
        qnVar.B2[0].setScaleX(1.0f);
        qnVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = qnVar.D2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        ai.vd[] vdVarArr = qnVar.E2;
        ai.vd vdVar2 = vdVarArr[0];
        vdVarArr[1] = vdVar2;
        vdVarArr[0] = vdVar;
        vdVar2.setVisibility(4);
        pn[] pnVarArr = qnVar.C2;
        pn pnVar2 = pnVarArr[0];
        if (pnVar != pnVar2) {
            pnVarArr[1] = pnVar2;
            pnVarArr[0] = pnVar;
            pnVar2.setVisibility(4);
        }
        if (this.f41988f) {
            qnVar.B2[1].setImageBitmap(null);
            qnVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = qnVar.B2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        qnVar.B2[1].setScaleX(1.0f);
        qnVar.B2[1].setScaleY(1.0f);
        qnVar.B2[1].setVisibility(4);
        qnVar.H2[0] = null;
        qnVar.A2 = false;
    }
}
