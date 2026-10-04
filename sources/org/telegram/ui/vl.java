package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class vl extends AnimatorListenerAdapter {
    public final boolean f41765a;
    public final boolean f41766b;
    public final boolean f41767c;
    public final yn d;

    public vl(yn ynVar, boolean z10, boolean z11, boolean z12) {
        this.d = ynVar;
        this.f41765a = z10;
        this.f41766b = z11;
        this.f41767c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        yn ynVar = this.d;
        ynVar.K2 = null;
        ImageView imageView = ynVar.H2;
        int i12 = 4;
        if (this.f41765a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = ynVar.J2;
        if (this.f41766b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = ynVar.I2;
        if (this.f41767c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
