package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class wl extends AnimatorListenerAdapter {
    public final boolean f39185a;
    public final boolean f39186b;
    public final boolean f39187c;
    public final zn d;

    public wl(zn znVar, boolean z10, boolean z11, boolean z12) {
        this.d = znVar;
        this.f39185a = z10;
        this.f39186b = z11;
        this.f39187c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        zn znVar = this.d;
        znVar.M2 = null;
        ImageView imageView = znVar.J2;
        int i12 = 4;
        if (this.f39185a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = znVar.L2;
        if (this.f39186b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = znVar.K2;
        if (this.f39187c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
