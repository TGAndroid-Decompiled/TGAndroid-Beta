package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wh extends AnimatorListenerAdapter {
    public final rn f42854a;
    public final boolean f42855b;
    public final org.telegram.ui.ActionBar.j5 f42856c;
    public final boolean d;
    public final ai.ud e;
    public final boolean f42857f;
    public final sn h;

    public wh(sn snVar, rn rnVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, ai.ud udVar, boolean z12) {
        this.h = snVar;
        this.f42854a = rnVar;
        this.f42855b = z10;
        this.f42856c = j5Var;
        this.d = z11;
        this.e = udVar;
        this.f42857f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        sn snVar = this.h;
        if (snVar.F2.getTag() != null) {
            snVar.F2.setVisibility(4);
            int L8 = snVar.L8();
            snVar.F2.a(Math.min(L8 - 1, Math.max(1, L8 - snVar.M4[0])), false);
        } else {
            snVar.F2.setAlpha(1.0f);
        }
        snVar.F2.setTranslationY(0.0f);
        snVar.D2[0].setTranslationX(0.0f);
        snVar.D2[1].setTranslationX(0.0f);
        snVar.F2.setTranslationX(snVar.G2 + 0.0f);
        rn rnVar = this.f42854a;
        rnVar.setTranslationY(0.0f);
        boolean z10 = this.f42855b;
        if (!z10) {
            rnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f42856c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.ud udVar = this.e;
        if (!z11) {
            udVar.setTranslationY(0.0f);
        }
        snVar.C2[0].setTranslationX(0.0f);
        snVar.C2[1].setTranslationX(0.0f);
        snVar.B2[1].setAlpha(1.0f);
        snVar.B2[1].setScaleX(1.0f);
        snVar.B2[1].setScaleY(1.0f);
        snVar.B2[0].setAlpha(1.0f);
        snVar.B2[0].setScaleX(1.0f);
        snVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = snVar.D2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        ai.ud[] udVarArr = snVar.E2;
        ai.ud udVar2 = udVarArr[0];
        udVarArr[1] = udVar2;
        udVarArr[0] = udVar;
        udVar2.setVisibility(4);
        rn[] rnVarArr = snVar.C2;
        rn rnVar2 = rnVarArr[0];
        if (rnVar != rnVar2) {
            rnVarArr[1] = rnVar2;
            rnVarArr[0] = rnVar;
            rnVar2.setVisibility(4);
        }
        if (this.f42857f) {
            snVar.B2[1].setImageBitmap(null);
            snVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = snVar.B2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        snVar.B2[1].setScaleX(1.0f);
        snVar.B2[1].setScaleY(1.0f);
        snVar.B2[1].setVisibility(4);
        snVar.H2[0] = null;
        snVar.A2 = false;
    }
}
