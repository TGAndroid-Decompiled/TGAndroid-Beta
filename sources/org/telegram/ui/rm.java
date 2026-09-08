package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class rm extends AnimatorListenerAdapter {
    public final int f40215a;
    public final org.telegram.ui.ActionBar.z f40216b;
    public final sm f40217c;

    public rm(sm smVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f40215a = i10;
        this.f40217c = smVar;
        this.f40216b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40215a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f40217c.f40500c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                sm smVar = this.f40217c;
                co coVar = smVar.f40500c;
                coVar.f35312i0.f(8);
                this.f40216b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                smVar.f40499b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40215a) {
            case 0:
                co coVar = this.f40217c.f40500c;
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                co.J3(coVar);
                coVar.f35312i0.f(0);
                this.f40216b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                sm smVar = this.f40217c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) smVar.f40500c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                smVar.f40499b = true;
                return;
        }
    }
}
