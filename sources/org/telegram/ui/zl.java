package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class zl extends AnimatorListenerAdapter {
    public final boolean f40266a;
    public final boolean f40267b;
    public final boolean f40268c;
    public final bo d;

    public zl(bo boVar, boolean z10, boolean z11, boolean z12) {
        this.d = boVar;
        this.f40266a = z10;
        this.f40267b = z11;
        this.f40268c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        bo boVar = this.d;
        boVar.M2 = null;
        ImageView imageView = boVar.J2;
        int i12 = 4;
        if (this.f40266a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = boVar.L2;
        if (this.f40267b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = boVar.K2;
        if (this.f40268c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
