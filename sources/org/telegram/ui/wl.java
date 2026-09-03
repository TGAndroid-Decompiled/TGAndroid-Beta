package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class wl extends AnimatorListenerAdapter {
    public final boolean f42809a;
    public final boolean f42810b;
    public final boolean f42811c;
    public final xn d;

    public wl(xn xnVar, boolean z4, boolean z10, boolean z11) {
        this.d = xnVar;
        this.f42809a = z4;
        this.f42810b = z10;
        this.f42811c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        xn xnVar = this.d;
        xnVar.J2 = null;
        ImageView imageView = xnVar.G2;
        int i12 = 4;
        if (this.f42809a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = xnVar.I2;
        if (this.f42810b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = xnVar.H2;
        if (this.f42811c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
