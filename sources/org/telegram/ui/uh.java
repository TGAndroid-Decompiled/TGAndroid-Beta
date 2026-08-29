package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uh extends AnimatorListenerAdapter {
    public final sn f43263a;
    public final boolean f43264b;
    public final org.telegram.ui.ActionBar.h5 f43265c;
    public final boolean d;
    public final eg.r f43266e;
    public final boolean f43267f;
    public final tn h;

    public uh(tn tnVar, sn snVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, eg.r rVar, boolean z12) {
        this.h = tnVar;
        this.f43263a = snVar;
        this.f43264b = z10;
        this.f43265c = h5Var;
        this.d = z11;
        this.f43266e = rVar;
        this.f43267f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        tn tnVar = this.h;
        if (tnVar.B2.getTag() != null) {
            tnVar.B2.setVisibility(4);
            int G8 = tnVar.G8();
            tnVar.B2.a(Math.min(G8 - 1, Math.max(1, G8 - tnVar.I4[0])), false);
        } else {
            tnVar.B2.setAlpha(1.0f);
        }
        tnVar.B2.setTranslationY(0.0f);
        tnVar.f43052z2[0].setTranslationX(0.0f);
        tnVar.f43052z2[1].setTranslationX(0.0f);
        tnVar.B2.setTranslationX(tnVar.C2 + 0.0f);
        sn snVar = this.f43263a;
        snVar.setTranslationY(0.0f);
        boolean z10 = this.f43264b;
        if (!z10) {
            snVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f43265c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        eg.r rVar = this.f43266e;
        if (!z11) {
            rVar.setTranslationY(0.0f);
        }
        tnVar.f43040y2[0].setTranslationX(0.0f);
        tnVar.f43040y2[1].setTranslationX(0.0f);
        tnVar.f43029x2[1].setAlpha(1.0f);
        tnVar.f43029x2[1].setScaleX(1.0f);
        tnVar.f43029x2[1].setScaleY(1.0f);
        tnVar.f43029x2[0].setAlpha(1.0f);
        tnVar.f43029x2[0].setScaleX(1.0f);
        tnVar.f43029x2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = tnVar.f43052z2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        eg.r[] rVarArr = tnVar.A2;
        eg.r rVar2 = rVarArr[0];
        rVarArr[1] = rVar2;
        rVarArr[0] = rVar;
        rVar2.setVisibility(4);
        sn[] snVarArr = tnVar.f43040y2;
        sn snVar2 = snVarArr[0];
        if (snVar != snVar2) {
            snVarArr[1] = snVar2;
            snVarArr[0] = snVar;
            snVar2.setVisibility(4);
        }
        if (this.f43267f) {
            tnVar.f43029x2[1].setImageBitmap(null);
            tnVar.f43029x2[1].setVisibility(4);
        }
        org.telegram.ui.Components.t9[] t9VarArr = tnVar.f43029x2;
        org.telegram.ui.Components.t9 t9Var = t9VarArr[1];
        org.telegram.ui.Components.t9 t9Var2 = t9VarArr[0];
        t9VarArr[1] = t9Var2;
        t9VarArr[0] = t9Var;
        t9Var2.setAlpha(1.0f);
        tnVar.f43029x2[1].setScaleX(1.0f);
        tnVar.f43029x2[1].setScaleY(1.0f);
        tnVar.f43029x2[1].setVisibility(4);
        tnVar.D2[0] = null;
        tnVar.f43015w2 = false;
    }
}
