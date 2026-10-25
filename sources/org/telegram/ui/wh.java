package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wh extends AnimatorListenerAdapter {
    public final tn f45489a;
    public final boolean f45490b;
    public final org.telegram.ui.ActionBar.b6 f45491c;
    public final boolean d;
    public final jn e;
    public final boolean f45492f;
    public final un h;

    public wh(un unVar, tn tnVar, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, boolean z11, jn jnVar, boolean z12) {
        this.h = unVar;
        this.f45489a = tnVar;
        this.f45490b = z10;
        this.f45491c = b6Var;
        this.d = z11;
        this.e = jnVar;
        this.f45492f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        un unVar = this.h;
        if (unVar.R2.getTag() != null) {
            unVar.R2.setVisibility(4);
            int Q8 = unVar.Q8();
            unVar.R2.a(Math.min(Q8 - 1, Math.max(1, Q8 - unVar.Y4[0])), false);
        } else {
            unVar.R2.setAlpha(1.0f);
        }
        unVar.R2.setTranslationY(0.0f);
        unVar.P2[0].setTranslationX(0.0f);
        unVar.P2[1].setTranslationX(0.0f);
        unVar.R2.setTranslationX(unVar.S2 + 0.0f);
        tn tnVar = this.f45489a;
        tnVar.setTranslationY(0.0f);
        boolean z10 = this.f45490b;
        if (!z10) {
            tnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f45491c;
        if (!z10) {
            b6Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        jn jnVar = this.e;
        if (!z11) {
            jnVar.setTranslationY(0.0f);
        }
        unVar.O2[0].setTranslationX(0.0f);
        unVar.O2[1].setTranslationX(0.0f);
        unVar.N2[1].setAlpha(1.0f);
        unVar.N2[1].setScaleX(1.0f);
        unVar.N2[1].setScaleY(1.0f);
        unVar.N2[0].setAlpha(1.0f);
        unVar.N2[0].setScaleX(1.0f);
        unVar.N2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.b6[] b6VarArr = unVar.P2;
        org.telegram.ui.ActionBar.b6 b6Var2 = b6VarArr[0];
        b6VarArr[1] = b6Var2;
        b6VarArr[0] = b6Var;
        b6Var2.setVisibility(4);
        jn[] jnVarArr = unVar.Q2;
        jn jnVar2 = jnVarArr[0];
        jnVarArr[1] = jnVar2;
        jnVarArr[0] = jnVar;
        jnVar2.setVisibility(4);
        tn[] tnVarArr = unVar.O2;
        tn tnVar2 = tnVarArr[0];
        if (tnVar != tnVar2) {
            tnVarArr[1] = tnVar2;
            tnVarArr[0] = tnVar;
            tnVar2.setVisibility(4);
        }
        if (this.f45492f) {
            unVar.N2[1].setImageBitmap(null);
            unVar.N2[1].setVisibility(4);
        }
        org.telegram.ui.Components.y9[] y9VarArr = unVar.N2;
        org.telegram.ui.Components.y9 y9Var = y9VarArr[1];
        org.telegram.ui.Components.y9 y9Var2 = y9VarArr[0];
        y9VarArr[1] = y9Var2;
        y9VarArr[0] = y9Var;
        y9Var2.setAlpha(1.0f);
        unVar.N2[1].setScaleX(1.0f);
        unVar.N2[1].setScaleY(1.0f);
        unVar.N2[1].setVisibility(4);
        unVar.T2[0] = null;
        unVar.M2 = false;
    }
}
