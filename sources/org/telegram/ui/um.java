package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class um extends AnimatorListenerAdapter {
    public final int f40429a;
    public final org.telegram.ui.ActionBar.y f40430b;
    public final vm f40431c;

    public um(vm vmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f40429a = i10;
        this.f40431c = vmVar;
        this.f40430b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40429a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f40431c.f40731c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                vm vmVar = this.f40431c;
                fo foVar = vmVar.f40731c;
                foVar.f35672i0.f(8);
                this.f40430b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                vmVar.f40730b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40429a) {
            case 0:
                fo foVar = this.f40431c.f40731c;
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                fo.S3(foVar);
                foVar.f35672i0.f(0);
                this.f40430b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                vm vmVar = this.f40431c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) vmVar.f40731c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                vmVar.f40730b = true;
                return;
        }
    }
}
