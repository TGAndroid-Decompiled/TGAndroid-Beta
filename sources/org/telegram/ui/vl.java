package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class vl extends AnimatorListenerAdapter {
    public final boolean f38863a;
    public final boolean f38864b;
    public final boolean f38865c;
    public final wn d;

    public vl(wn wnVar, boolean z10, boolean z11, boolean z12) {
        this.d = wnVar;
        this.f38863a = z10;
        this.f38864b = z11;
        this.f38865c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        wn wnVar = this.d;
        wnVar.M2 = null;
        ImageView imageView = wnVar.J2;
        int i12 = 4;
        if (this.f38863a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = wnVar.L2;
        if (this.f38864b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = wnVar.K2;
        if (this.f38865c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
