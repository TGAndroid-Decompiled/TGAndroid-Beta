package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class qm extends AnimatorListenerAdapter {
    public final int f36938a;
    public final org.telegram.ui.ActionBar.a0 f36939b;
    public final rm f36940c;

    public qm(rm rmVar, org.telegram.ui.ActionBar.a0 a0Var, int i10) {
        this.f36938a = i10;
        this.f36940c = rmVar;
        this.f36939b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36938a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.o2) this.f36940c.f37265c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                rm rmVar = this.f36940c;
                bo boVar = rmVar.f37265c;
                boVar.f32318i0.f(8);
                this.f36939b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                rmVar.f37264b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36938a) {
            case 0:
                bo boVar = this.f36940c.f37265c;
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                bo.J3(boVar);
                boVar.f32318i0.f(0);
                this.f36939b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                rm rmVar = this.f36940c;
                kVar2 = ((org.telegram.ui.ActionBar.o2) rmVar.f37265c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                rmVar.f37264b = true;
                return;
        }
    }
}
