package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class yr0 extends AnimatorListenerAdapter {
    public final int f40237a;
    public final View f40238b;
    public final PhotoViewer f40239c;

    public yr0(PhotoViewer photoViewer, View view, int i10) {
        this.f40237a = i10;
        this.f40239c = photoViewer;
        this.f40238b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40237a) {
            case 0:
                PhotoViewer photoViewer = this.f40239c;
                photoViewer.B3 = false;
                this.f40238b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31394x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                mu0 mu0Var = photoViewer.E2;
                if (mu0Var != null) {
                    mu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f40239c;
                photoViewer2.B3 = false;
                photoViewer2.f31261i4.run();
                AndroidUtilities.runOnUIThread(new sj0(20, this, this.f40238b), 100L);
                return;
        }
    }
}
