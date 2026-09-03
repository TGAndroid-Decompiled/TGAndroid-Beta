package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zh extends AnimatorListenerAdapter {
    public final wn f43961a;
    public final boolean f43962b;
    public final org.telegram.ui.ActionBar.l5 f43963c;
    public final boolean d;
    public final hg.q f43964e;
    public final boolean f43965f;
    public final xn h;

    public zh(xn xnVar, wn wnVar, boolean z4, org.telegram.ui.ActionBar.l5 l5Var, boolean z10, hg.q qVar, boolean z11) {
        this.h = xnVar;
        this.f43961a = wnVar;
        this.f43962b = z4;
        this.f43963c = l5Var;
        this.d = z10;
        this.f43964e = qVar;
        this.f43965f = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xn xnVar = this.h;
        if (xnVar.C2.getTag() != null) {
            xnVar.C2.setVisibility(4);
            int G8 = xnVar.G8();
            xnVar.C2.a(Math.min(G8 - 1, Math.max(1, G8 - xnVar.J4[0])), false);
        } else {
            xnVar.C2.setAlpha(1.0f);
        }
        xnVar.C2.setTranslationY(0.0f);
        xnVar.A2[0].setTranslationX(0.0f);
        xnVar.A2[1].setTranslationX(0.0f);
        xnVar.C2.setTranslationX(xnVar.D2 + 0.0f);
        wn wnVar = this.f43961a;
        wnVar.setTranslationY(0.0f);
        boolean z4 = this.f43962b;
        if (!z4) {
            wnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f43963c;
        if (!z4) {
            l5Var.setTranslationY(0.0f);
        }
        boolean z10 = this.d;
        hg.q qVar = this.f43964e;
        if (!z10) {
            qVar.setTranslationY(0.0f);
        }
        xnVar.f43410z2[0].setTranslationX(0.0f);
        xnVar.f43410z2[1].setTranslationX(0.0f);
        xnVar.f43397y2[1].setAlpha(1.0f);
        xnVar.f43397y2[1].setScaleX(1.0f);
        xnVar.f43397y2[1].setScaleY(1.0f);
        xnVar.f43397y2[0].setAlpha(1.0f);
        xnVar.f43397y2[0].setScaleX(1.0f);
        xnVar.f43397y2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.l5[] l5VarArr = xnVar.A2;
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[0];
        l5VarArr[1] = l5Var2;
        l5VarArr[0] = l5Var;
        l5Var2.setVisibility(4);
        hg.q[] qVarArr = xnVar.B2;
        hg.q qVar2 = qVarArr[0];
        qVarArr[1] = qVar2;
        qVarArr[0] = qVar;
        qVar2.setVisibility(4);
        wn[] wnVarArr = xnVar.f43410z2;
        wn wnVar2 = wnVarArr[0];
        if (wnVar != wnVar2) {
            wnVarArr[1] = wnVar2;
            wnVarArr[0] = wnVar;
            wnVar2.setVisibility(4);
        }
        if (this.f43965f) {
            xnVar.f43397y2[1].setImageBitmap(null);
            xnVar.f43397y2[1].setVisibility(4);
        }
        org.telegram.ui.Components.p9[] p9VarArr = xnVar.f43397y2;
        org.telegram.ui.Components.p9 p9Var = p9VarArr[1];
        org.telegram.ui.Components.p9 p9Var2 = p9VarArr[0];
        p9VarArr[1] = p9Var2;
        p9VarArr[0] = p9Var;
        p9Var2.setAlpha(1.0f);
        xnVar.f43397y2[1].setScaleX(1.0f);
        xnVar.f43397y2[1].setScaleY(1.0f);
        xnVar.f43397y2[1].setVisibility(4);
        xnVar.E2[0] = null;
        xnVar.f43383x2 = false;
    }
}
