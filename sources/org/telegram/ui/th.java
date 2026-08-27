package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class th extends AnimatorListenerAdapter {

    public final qn f42941a;

    public final boolean f42942b;

    public final org.telegram.ui.ActionBar.h5 f42943c;
    public final boolean d;

    public final cg.q f42944e;

    public final boolean f42945f;
    public final rn h;

    public th(rn rnVar, qn qnVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, cg.q qVar, boolean z12) {
        this.h = rnVar;
        this.f42941a = qnVar;
        this.f42942b = z10;
        this.f42943c = h5Var;
        this.d = z11;
        this.f42944e = qVar;
        this.f42945f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rn rnVar = this.h;
        if (rnVar.B2.getTag() != null) {
            rnVar.B2.setVisibility(4);
            int iG8 = rnVar.G8();
            rnVar.B2.a(Math.min(iG8 - 1, Math.max(1, iG8 - rnVar.I4[0])), false);
        } else {
            rnVar.B2.setAlpha(1.0f);
        }
        rnVar.B2.setTranslationY(0.0f);
        rnVar.f42292z2[0].setTranslationX(0.0f);
        rnVar.f42292z2[1].setTranslationX(0.0f);
        rnVar.B2.setTranslationX(rnVar.C2 + 0.0f);
        qn qnVar = this.f42941a;
        qnVar.setTranslationY(0.0f);
        boolean z10 = this.f42942b;
        if (!z10) {
            qnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f42943c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        cg.q qVar = this.f42944e;
        if (!z11) {
            qVar.setTranslationY(0.0f);
        }
        rnVar.f42279y2[0].setTranslationX(0.0f);
        rnVar.f42279y2[1].setTranslationX(0.0f);
        rnVar.f42266x2[1].setAlpha(1.0f);
        rnVar.f42266x2[1].setScaleX(1.0f);
        rnVar.f42266x2[1].setScaleY(1.0f);
        rnVar.f42266x2[0].setAlpha(1.0f);
        rnVar.f42266x2[0].setScaleX(1.0f);
        rnVar.f42266x2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = rnVar.f42292z2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        cg.q[] qVarArr = rnVar.A2;
        cg.q qVar2 = qVarArr[0];
        qVarArr[1] = qVar2;
        qVarArr[0] = qVar;
        qVar2.setVisibility(4);
        qn[] qnVarArr = rnVar.f42279y2;
        qn qnVar2 = qnVarArr[0];
        if (qnVar != qnVar2) {
            qnVarArr[1] = qnVar2;
            qnVarArr[0] = qnVar;
            qnVar2.setVisibility(4);
        }
        if (this.f42945f) {
            rnVar.f42266x2[1].setImageBitmap(null);
            rnVar.f42266x2[1].setVisibility(4);
        }
        org.telegram.ui.Components.n9[] n9VarArr = rnVar.f42266x2;
        org.telegram.ui.Components.n9 n9Var = n9VarArr[1];
        org.telegram.ui.Components.n9 n9Var2 = n9VarArr[0];
        n9VarArr[1] = n9Var2;
        n9VarArr[0] = n9Var;
        n9Var2.setAlpha(1.0f);
        rnVar.f42266x2[1].setScaleX(1.0f);
        rnVar.f42266x2[1].setScaleY(1.0f);
        rnVar.f42266x2[1].setVisibility(4);
        rnVar.D2[0] = null;
        rnVar.f42254w2 = false;
    }
}
