package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.Components.RadialProgressView;
public final class sl extends AnimatorListenerAdapter {
    public final boolean f43532a;
    public final boolean f43533b;
    public final boolean f43534c;
    public final un d;

    public sl(un unVar, boolean z10, boolean z11, boolean z12) {
        this.d = unVar;
        this.f43532a = z10;
        this.f43533b = z11;
        this.f43534c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        un unVar = this.d;
        unVar.Y2 = null;
        ImageView imageView = unVar.V2;
        int i12 = 4;
        if (this.f43532a) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = unVar.X2;
        if (this.f43533b) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView2.setVisibility(i11);
        RadialProgressView radialProgressView = unVar.W2;
        if (this.f43534c) {
            i12 = 0;
        }
        radialProgressView.setVisibility(i12);
    }
}
