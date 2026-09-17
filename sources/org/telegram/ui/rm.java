package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class rm extends AnimatorListenerAdapter {
    public final int f40189a;
    public final org.telegram.ui.ActionBar.z f40190b;
    public final sm f40191c;

    public rm(sm smVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f40189a = i10;
        this.f40191c = smVar;
        this.f40190b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40189a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f40191c.f40474c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                sm smVar = this.f40191c;
                co coVar = smVar.f40474c;
                coVar.f35286i0.f(8);
                this.f40190b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                smVar.f40473b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40189a) {
            case 0:
                co coVar = this.f40191c.f40474c;
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                co.J3(coVar);
                coVar.f35286i0.f(0);
                this.f40190b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                sm smVar = this.f40191c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) smVar.f40474c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                smVar.f40473b = true;
                return;
        }
    }
}
