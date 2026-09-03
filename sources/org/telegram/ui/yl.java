package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class yl extends AnimatorListenerAdapter {
    public final boolean f40297a;
    public final boolean f40298b;
    public final boolean f40299c;
    public final zn d;

    public yl(zn znVar, boolean z4, boolean z10, boolean z11) {
        this.d = znVar;
        this.f40297a = z4;
        this.f40298b = z10;
        this.f40299c = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        zn znVar = this.d;
        znVar.J2 = null;
        ImageView imageView = znVar.G2;
        int i12 = 4;
        if (this.f40297a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = znVar.I2;
        if (this.f40298b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = znVar.H2;
        if (this.f40299c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
