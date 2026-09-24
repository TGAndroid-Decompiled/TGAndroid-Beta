package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class yr0 extends AnimatorListenerAdapter {
    public final int f40222a;
    public final View f40223b;
    public final PhotoViewer f40224c;

    public yr0(PhotoViewer photoViewer, View view, int i10) {
        this.f40222a = i10;
        this.f40224c = photoViewer;
        this.f40223b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40222a) {
            case 0:
                PhotoViewer photoViewer = this.f40224c;
                photoViewer.B3 = false;
                this.f40223b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31381x3;
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
                PhotoViewer photoViewer2 = this.f40224c;
                photoViewer2.B3 = false;
                photoViewer2.f31248i4.run();
                AndroidUtilities.runOnUIThread(new xi0(21, this, this.f40223b), 100L);
                return;
        }
    }
}
