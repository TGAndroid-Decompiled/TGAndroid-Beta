package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class sl extends AnimatorListenerAdapter {
    public final boolean f41133a;
    public final boolean f41134b;
    public final boolean f41135c;
    public final sn d;

    public sl(sn snVar, boolean z10, boolean z11, boolean z12) {
        this.d = snVar;
        this.f41133a = z10;
        this.f41134b = z11;
        this.f41135c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        sn snVar = this.d;
        snVar.M2 = null;
        ImageView imageView = snVar.J2;
        int i12 = 4;
        if (this.f41133a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = snVar.L2;
        if (this.f41134b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = snVar.K2;
        if (this.f41135c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
