package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class rm extends AnimatorListenerAdapter {
    public final int f40188a;
    public final org.telegram.ui.ActionBar.z f40189b;
    public final sm f40190c;

    public rm(sm smVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f40188a = i10;
        this.f40190c = smVar;
        this.f40189b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40188a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f40190c.f40473c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                sm smVar = this.f40190c;
                co coVar = smVar.f40473c;
                coVar.f35285i0.f(8);
                this.f40189b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                smVar.f40472b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40188a) {
            case 0:
                co coVar = this.f40190c.f40473c;
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                co.J3(coVar);
                coVar.f35285i0.f(0);
                this.f40189b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                sm smVar = this.f40190c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) smVar.f40473c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                smVar.f40472b = true;
                return;
        }
    }
}
