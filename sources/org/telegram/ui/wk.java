package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class wk extends AnimatorListenerAdapter {
    public final boolean f51190a;
    public final boolean f51191b;
    public final boolean f51192c;
    public final wm d;

    public wk(wm wmVar, boolean z10, boolean z11, boolean z12) {
        this.d = wmVar;
        this.f51190a = z10;
        this.f51191b = z11;
        this.f51192c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        int i10;
        wm wmVar = this.d;
        wmVar.f51254b3 = null;
        ImageView imageView = wmVar.Y2;
        int i11 = 4;
        if (this.f51190a) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        imageView.setVisibility(i3);
        ImageView imageView2 = wmVar.f51240a3;
        if (this.f51191b) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView2.setVisibility(i10);
        RadialProgressView radialProgressView = wmVar.Z2;
        if (this.f51192c) {
            i11 = 0;
        }
        radialProgressView.setVisibility(i11);
    }
}
