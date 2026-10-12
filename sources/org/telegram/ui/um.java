package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class um extends AnimatorListenerAdapter {
    public final int f40697a;
    public final org.telegram.ui.ActionBar.y f40698b;
    public final vm f40699c;

    public um(vm vmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f40697a = i10;
        this.f40699c = vmVar;
        this.f40698b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40697a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f40699c.f41032c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                vm vmVar = this.f40699c;
                fo foVar = vmVar.f41032c;
                foVar.f35971i0.f(8);
                this.f40698b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                vmVar.f41031b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40697a) {
            case 0:
                fo foVar = this.f40699c.f41032c;
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                fo.S3(foVar);
                foVar.f35971i0.f(0);
                this.f40698b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                vm vmVar = this.f40699c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) vmVar.f41032c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                vmVar.f41031b = true;
                return;
        }
    }
}
