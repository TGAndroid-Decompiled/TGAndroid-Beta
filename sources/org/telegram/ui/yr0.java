package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class yr0 extends AnimatorListenerAdapter {
    public final int f40238a;
    public final View f40239b;
    public final PhotoViewer f40240c;

    public yr0(PhotoViewer photoViewer, View view, int i10) {
        this.f40238a = i10;
        this.f40240c = photoViewer;
        this.f40239b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40238a) {
            case 0:
                PhotoViewer photoViewer = this.f40240c;
                photoViewer.B3 = false;
                this.f40239b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31395x3;
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
                PhotoViewer photoViewer2 = this.f40240c;
                photoViewer2.B3 = false;
                photoViewer2.f31262i4.run();
                AndroidUtilities.runOnUIThread(new sj0(20, this, this.f40239b), 100L);
                return;
        }
    }
}
