package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class zl extends AnimatorListenerAdapter {
    public final boolean f44686a;
    public final boolean f44687b;
    public final boolean f44688c;
    public final zn d;

    public zl(zn znVar, boolean z10, boolean z11, boolean z12) {
        this.d = znVar;
        this.f44686a = z10;
        this.f44687b = z11;
        this.f44688c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        zn znVar = this.d;
        znVar.M2 = null;
        ImageView imageView = znVar.J2;
        int i12 = 4;
        if (this.f44686a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = znVar.L2;
        if (this.f44687b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = znVar.K2;
        if (this.f44688c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
