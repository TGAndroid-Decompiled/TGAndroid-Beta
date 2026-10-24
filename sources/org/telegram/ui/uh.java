package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uh extends AnimatorListenerAdapter {
    public final rn f42430a;
    public final boolean f42431b;
    public final org.telegram.ui.ActionBar.n5 f42432c;
    public final boolean d;
    public final hn e;
    public final boolean f42433f;
    public final sn h;

    public uh(sn snVar, rn rnVar, boolean z10, org.telegram.ui.ActionBar.n5 n5Var, boolean z11, hn hnVar, boolean z12) {
        this.h = snVar;
        this.f42430a = rnVar;
        this.f42431b = z10;
        this.f42432c = n5Var;
        this.d = z11;
        this.e = hnVar;
        this.f42433f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        sn snVar = this.h;
        if (snVar.R2.getTag() != null) {
            snVar.R2.setVisibility(4);
            int L8 = snVar.L8();
            snVar.R2.a(Math.min(L8 - 1, Math.max(1, L8 - snVar.Y4[0])), false);
        } else {
            snVar.R2.setAlpha(1.0f);
        }
        snVar.R2.setTranslationY(0.0f);
        snVar.P2[0].setTranslationX(0.0f);
        snVar.P2[1].setTranslationX(0.0f);
        snVar.R2.setTranslationX(snVar.S2 + 0.0f);
        rn rnVar = this.f42430a;
        rnVar.setTranslationY(0.0f);
        boolean z10 = this.f42431b;
        if (!z10) {
            rnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f42432c;
        if (!z10) {
            n5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        hn hnVar = this.e;
        if (!z11) {
            hnVar.setTranslationY(0.0f);
        }
        snVar.O2[0].setTranslationX(0.0f);
        snVar.O2[1].setTranslationX(0.0f);
        snVar.N2[1].setAlpha(1.0f);
        snVar.N2[1].setScaleX(1.0f);
        snVar.N2[1].setScaleY(1.0f);
        snVar.N2[0].setAlpha(1.0f);
        snVar.N2[0].setScaleX(1.0f);
        snVar.N2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.n5[] n5VarArr = snVar.P2;
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[0];
        n5VarArr[1] = n5Var2;
        n5VarArr[0] = n5Var;
        n5Var2.setVisibility(4);
        hn[] hnVarArr = snVar.Q2;
        hn hnVar2 = hnVarArr[0];
        hnVarArr[1] = hnVar2;
        hnVarArr[0] = hnVar;
        hnVar2.setVisibility(4);
        rn[] rnVarArr = snVar.O2;
        rn rnVar2 = rnVarArr[0];
        if (rnVar != rnVar2) {
            rnVarArr[1] = rnVar2;
            rnVarArr[0] = rnVar;
            rnVar2.setVisibility(4);
        }
        if (this.f42433f) {
            snVar.N2[1].setImageBitmap(null);
            snVar.N2[1].setVisibility(4);
        }
        org.telegram.ui.Components.u9[] u9VarArr = snVar.N2;
        org.telegram.ui.Components.u9 u9Var = u9VarArr[1];
        org.telegram.ui.Components.u9 u9Var2 = u9VarArr[0];
        u9VarArr[1] = u9Var2;
        u9VarArr[0] = u9Var;
        u9Var2.setAlpha(1.0f);
        snVar.N2[1].setScaleX(1.0f);
        snVar.N2[1].setScaleY(1.0f);
        snVar.N2[1].setVisibility(4);
        snVar.T2[0] = null;
        snVar.M2 = false;
    }
}
