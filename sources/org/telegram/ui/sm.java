package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class sm extends AnimatorListenerAdapter {
    public final int f36721a;
    public final org.telegram.ui.ActionBar.z f36722b;
    public final tm f36723c;

    public sm(tm tmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f36721a = i10;
        this.f36723c = tmVar;
        this.f36722b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f36721a) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.p2) this.f36723c.f36965c).actionBar;
                lVar.setMenuOffsetSuppressed(false);
                return;
            default:
                tm tmVar = this.f36723c;
                eo eoVar = tmVar.f36965c;
                eoVar.f32354i0.f(8);
                this.f36722b.r(0.0f);
                lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                lVar2.setMenuOffsetSuppressed(false);
                tmVar.f36964b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f36721a) {
            case 0:
                eo eoVar = this.f36723c.f36965c;
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                lVar.setMenuOffsetSuppressed(true);
                eo.J3(eoVar);
                eoVar.f32354i0.f(0);
                this.f36722b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                tm tmVar = this.f36723c;
                lVar2 = ((org.telegram.ui.ActionBar.p2) tmVar.f36965c).actionBar;
                lVar2.setMenuOffsetSuppressed(true);
                tmVar.f36964b = true;
                return;
        }
    }
}
