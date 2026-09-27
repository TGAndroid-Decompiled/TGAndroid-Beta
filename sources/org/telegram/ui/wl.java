package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class wl extends AnimatorListenerAdapter {
    public final boolean f39369a;
    public final boolean f39370b;
    public final boolean f39371c;
    public final xn d;

    public wl(xn xnVar, boolean z10, boolean z11, boolean z12) {
        this.d = xnVar;
        this.f39369a = z10;
        this.f39370b = z11;
        this.f39371c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        xn xnVar = this.d;
        xnVar.M2 = null;
        ImageView imageView = xnVar.J2;
        int i12 = 4;
        if (this.f39369a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = xnVar.L2;
        if (this.f39370b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = xnVar.K2;
        if (this.f39371c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
