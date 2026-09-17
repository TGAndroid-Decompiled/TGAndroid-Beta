package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class yi extends AnimatorListenerAdapter {
    public final int f39922a;
    public final bo f39923b;

    public yi(bo boVar, int i10) {
        this.f39922a = i10;
        this.f39923b = boVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vj vjVar;
        switch (this.f39922a) {
            case 0:
                bo boVar = this.f39923b;
                gl glVar = boVar.f32230b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    boVar.f32230b3.h(true);
                    boVar.f32230b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f39923b;
                boVar2.A9 = AndroidUtilities.dp(30.0f);
                boVar2.o9();
                return;
            case 2:
                bo boVar3 = this.f39923b;
                if (boVar3.fragmentView != null && (vjVar = boVar3.f32502x0) != null) {
                    vjVar.invalidate();
                    boVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f39923b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ej(this, 3), 2000L);
                return;
            case 5:
                bo boVar4 = this.f39923b;
                if (animator.equals(boVar4.f32293g3)) {
                    boVar4.f32293g3 = null;
                    return;
                }
                return;
            case 6:
                bo boVar5 = this.f39923b;
                if (animator.equals(boVar5.f32293g3)) {
                    boVar5.f32293g3 = null;
                    return;
                }
                return;
            case 7:
                bo boVar6 = this.f39923b;
                if (animator.equals(boVar6.f32305h3)) {
                    boVar6.f32317i3 = 1.0f;
                    boVar6.lc();
                    boVar6.f32305h3 = null;
                    return;
                }
                return;
            case 8:
                bo boVar7 = this.f39923b;
                if (animator.equals(boVar7.f32305h3)) {
                    boVar7.f32317i3 = 0.0f;
                    boVar7.lc();
                    boVar7.f32305h3 = null;
                    return;
                }
                return;
            case 9:
                this.f39923b.T4 = null;
                return;
            case 10:
                bo boVar8 = this.f39923b;
                boVar8.Da = 1.0f;
                boVar8.Y.setVisibility(4);
                boVar8.O0.setVisibility(4);
                boVar8.o9();
                return;
            default:
                bo boVar9 = this.f39923b;
                boVar9.Da = 0.0f;
                boVar9.o9();
                return;
        }
    }
}
