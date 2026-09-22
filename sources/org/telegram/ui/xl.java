package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class xl extends AnimatorListenerAdapter {
    public final boolean f39634a;
    public final boolean f39635b;
    public final boolean f39636c;
    public final zn d;

    public xl(zn znVar, boolean z10, boolean z11, boolean z12) {
        this.d = znVar;
        this.f39634a = z10;
        this.f39635b = z11;
        this.f39636c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        zn znVar = this.d;
        znVar.M2 = null;
        ImageView imageView = znVar.J2;
        int i12 = 4;
        if (this.f39634a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = znVar.L2;
        if (this.f39635b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = znVar.K2;
        if (this.f39636c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
