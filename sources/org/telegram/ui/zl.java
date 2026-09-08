package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class zl extends AnimatorListenerAdapter {
    public final boolean f43484a;
    public final boolean f43485b;
    public final boolean f43486c;
    public final co d;

    public zl(co coVar, boolean z10, boolean z11, boolean z12) {
        this.d = coVar;
        this.f43484a = z10;
        this.f43485b = z11;
        this.f43486c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        co coVar = this.d;
        coVar.M2 = null;
        ImageView imageView = coVar.J2;
        int i12 = 4;
        if (this.f43484a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = coVar.L2;
        if (this.f43485b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = coVar.K2;
        if (this.f43486c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
