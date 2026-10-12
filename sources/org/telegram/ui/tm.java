package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class tm extends AnimatorListenerAdapter {
    public final int f42238a;
    public final org.telegram.ui.ActionBar.y f42239b;
    public final um f42240c;

    public tm(um umVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f42238a = i10;
        this.f42240c = umVar;
        this.f42239b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f42238a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f42240c.f42538c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                um umVar = this.f42240c;
                eo eoVar = umVar.f42538c;
                eoVar.f37294i0.f(8);
                this.f42239b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                umVar.f42537b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f42238a) {
            case 0:
                eo eoVar = this.f42240c.f42538c;
                kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                eo.S3(eoVar);
                eoVar.f37294i0.f(0);
                this.f42239b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                um umVar = this.f42240c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) umVar.f42538c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                umVar.f42537b = true;
                return;
        }
    }
}
