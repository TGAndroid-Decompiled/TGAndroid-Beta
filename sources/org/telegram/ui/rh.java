package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rh extends AnimatorListenerAdapter {
    public final pn f42426a;
    public final boolean f42427b;
    public final org.telegram.ui.ActionBar.h5 f42428c;
    public final boolean d;
    public final bg.t f42429e;
    public final boolean f42430f;
    public final qn h;

    public rh(qn qnVar, pn pnVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, bg.t tVar, boolean z12) {
        this.h = qnVar;
        this.f42426a = pnVar;
        this.f42427b = z10;
        this.f42428c = h5Var;
        this.d = z11;
        this.f42429e = tVar;
        this.f42430f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qn qnVar = this.h;
        if (qnVar.B2.getTag() != null) {
            qnVar.B2.setVisibility(4);
            int G8 = qnVar.G8();
            qnVar.B2.a(Math.min(G8 - 1, Math.max(1, G8 - qnVar.I4[0])), false);
        } else {
            qnVar.B2.setAlpha(1.0f);
        }
        qnVar.B2.setTranslationY(0.0f);
        qnVar.f42155z2[0].setTranslationX(0.0f);
        qnVar.f42155z2[1].setTranslationX(0.0f);
        qnVar.B2.setTranslationX(qnVar.C2 + 0.0f);
        pn pnVar = this.f42426a;
        pnVar.setTranslationY(0.0f);
        boolean z10 = this.f42427b;
        if (!z10) {
            pnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f42428c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        bg.t tVar = this.f42429e;
        if (!z11) {
            tVar.setTranslationY(0.0f);
        }
        qnVar.f42143y2[0].setTranslationX(0.0f);
        qnVar.f42143y2[1].setTranslationX(0.0f);
        qnVar.f42129x2[1].setAlpha(1.0f);
        qnVar.f42129x2[1].setScaleX(1.0f);
        qnVar.f42129x2[1].setScaleY(1.0f);
        qnVar.f42129x2[0].setAlpha(1.0f);
        qnVar.f42129x2[0].setScaleX(1.0f);
        qnVar.f42129x2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = qnVar.f42155z2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        bg.t[] tVarArr = qnVar.A2;
        bg.t tVar2 = tVarArr[0];
        tVarArr[1] = tVar2;
        tVarArr[0] = tVar;
        tVar2.setVisibility(4);
        pn[] pnVarArr = qnVar.f42143y2;
        pn pnVar2 = pnVarArr[0];
        if (pnVar != pnVar2) {
            pnVarArr[1] = pnVar2;
            pnVarArr[0] = pnVar;
            pnVar2.setVisibility(4);
        }
        if (this.f42430f) {
            qnVar.f42129x2[1].setImageBitmap(null);
            qnVar.f42129x2[1].setVisibility(4);
        }
        org.telegram.ui.Components.o9[] o9VarArr = qnVar.f42129x2;
        org.telegram.ui.Components.o9 o9Var = o9VarArr[1];
        org.telegram.ui.Components.o9 o9Var2 = o9VarArr[0];
        o9VarArr[1] = o9Var2;
        o9VarArr[0] = o9Var;
        o9Var2.setAlpha(1.0f);
        qnVar.f42129x2[1].setScaleX(1.0f);
        qnVar.f42129x2[1].setScaleY(1.0f);
        qnVar.f42129x2[1].setVisibility(4);
        qnVar.D2[0] = null;
        qnVar.f42116w2 = false;
    }
}
