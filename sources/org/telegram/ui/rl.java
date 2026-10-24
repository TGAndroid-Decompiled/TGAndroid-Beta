package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class rl extends AnimatorListenerAdapter {
    public final boolean f41179a;
    public final boolean f41180b;
    public final boolean f41181c;
    public final sn d;

    public rl(sn snVar, boolean z10, boolean z11, boolean z12) {
        this.d = snVar;
        this.f41179a = z10;
        this.f41180b = z11;
        this.f41181c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        sn snVar = this.d;
        snVar.Y2 = null;
        ImageView imageView = snVar.V2;
        int i12 = 4;
        if (this.f41179a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = snVar.X2;
        if (this.f41180b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = snVar.W2;
        if (this.f41181c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
